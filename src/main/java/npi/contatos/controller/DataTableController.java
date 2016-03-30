package npi.contatos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import npi.contatos.model.Contato;
import npi.contatos.model.DataTableResponse;
import npi.contatos.service.ContatoService;

@Controller
@RequestMapping(value = "/dtable")
public class DataTableController {
	
	@Inject
	private ContatoService contatoService;
	
	@RequestMapping(method={RequestMethod.GET,RequestMethod.POST} ,value="/data",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String findAllForTableView(@RequestParam String sSearch){
		System.out.println(sSearch);
		DataTableResponse<Contato> dtr = new DataTableResponse<>();
		List<Contato> contatos = contatoService.findAll();
		dtr.setiTotalDisplayRecords(contatos.size());
		dtr.setiTotalRecords(contatos.size());
		dtr.setsEcho("1");
		dtr.setAaData(findBySearchString(sSearch, contatos));
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(dtr);
    }
	
	private List<Contato> findBySearchString(String search, List<Contato> contatos){
		List<Contato> result = new ArrayList<>();
		for(Contato c : contatos){
			if(c.getId().toString().contains(search) || c.getNome().toUpperCase().contains(search.toUpperCase())){
				result.add(c);
			}
		}
		System.out.println(result.size());
		return result;
	}
}
