package npi.contatos.controller;

import javax.inject.Inject;

import npi.contatos.model.Contato;
import npi.contatos.service.ContatoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContatoController {
	
	@Inject
	private ContatoService contatoService;
	
	@RequestMapping(value = "/")
	public String index() {
		return "redirect:/listar";
	}
	
	@RequestMapping(value = "/listar")
	public String listar(Model model) {
		model.addAttribute("contatos", contatoService.findAll());
		return "listar";
	}
	
	@RequestMapping(value = "/listarTable", method = RequestMethod.GET)
	public String listarTable(Model model) {
//		model.addAttribute("contatos", contatoService.findAll());
		return "listarTable";
	}
	@RequestMapping(value = "/adicionar", method = RequestMethod.GET)
	public String adicionarForm(Model model) {
		model.addAttribute("contato", new Contato());
		return "adicionar";
	}
	
	@RequestMapping(value = "/adicionar", method = RequestMethod.POST)
	public String adicionar(@ModelAttribute("contato") Contato contato) {
		contatoService.salvar(contato);
		return "redirect:/listar";
	}
	
	@RequestMapping(value = "/remover/{id}", method = RequestMethod.GET)
	public String remover(@PathVariable("id") Integer id) {
		contatoService.remover(id);
		return "redirect:/listar";
	}
	
	@RequestMapping(value="/detalheContato/{id}", method= RequestMethod.GET)
	public String detalheContato(@PathVariable("id") Integer id, Model model){
		model.addAttribute("contato", contatoService.detalheContato(id));		
		return "detalhe";
	}
	
	@RequestMapping(value="/editar/{id}",method=RequestMethod.GET)
	public String editarForm(@PathVariable("id") Integer id, Model model){
		model.addAttribute("contato", contatoService.detalheContato(id));
		return "editar";
	}
	@RequestMapping(value="/editar/{id}",method=RequestMethod.POST)
	public String editar(@ModelAttribute("contato") Contato contato, @PathVariable("id") Integer id){
		contatoService.editar(contato, id);
		return "redirect:/listar";
	}
}
