package npi.contatos.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import npi.contatos.model.Contato;
import npi.contatos.model.JtableResponse;
import npi.contatos.service.ContatoService;

@Controller
@RequestMapping(value = "/api")
public class JTableController {
	
	@Inject
	private ContatoService contatoService;
	
	@RequestMapping(value = "/all", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public JtableResponse getContatos() {
		String response = "OK";
		List<Contato> contatoList = contatoService.findAll();
		System.out.println(contatoList.size());
		return new JtableResponse<>(response,contatoList,contatoList.size());
	}
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public JtableResponse insert(@ModelAttribute Contato contato, BindingResult result) {
	    JtableResponse jsonJtableResponse = new JtableResponse();
	    if (result.hasErrors()) {
	        jsonJtableResponse.setResult("ERROR");
	    }
	    try {
	        contatoService.salvar(contato);
	        //jsonJtableResponse.setRole(newRole);
	    } catch (Exception e) {
	        jsonJtableResponse.setResult(e.getMessage());
	    }
	    return jsonJtableResponse;
	}

	@RequestMapping(value = "/editar", method = RequestMethod.POST)
	@ResponseBody
	public JtableResponse update(@ModelAttribute Contato contato, BindingResult result) {
	    JtableResponse jsonJtableResponse = new JtableResponse();
	    if (result.hasErrors()) {
	        jsonJtableResponse.setResult("Error");
	        return jsonJtableResponse;
	    }
	    try {
	        contatoService.editar(contato, contato.getId());
	        jsonJtableResponse.setResult("OK");
	    } catch (Exception e) {
	        jsonJtableResponse.setResult(e.getMessage());          
	    }
	    return jsonJtableResponse;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JtableResponse delete(@RequestParam Integer id) {
	    JtableResponse jsonJtableResponse = new JtableResponse();
	    try {
	        contatoService.remover(id);
	        jsonJtableResponse.setResult("OK");
	    } catch (Exception e) {
	        jsonJtableResponse.setResult(e.getMessage());            
	    }
	    return jsonJtableResponse;
	}

}
