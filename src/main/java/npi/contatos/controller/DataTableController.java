package npi.contatos.controller;

import javax.inject.Inject;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import flexjson.JSONSerializer;
import npi.contatos.model.Contato;
import npi.contatos.model.DataTableResponse;
import npi.contatos.service.ContatoService;

@Controller
@RequestMapping(value = "/dtable")
public class DataTableController {
	
	@Inject
	private ContatoService contatoService;
	
	@RequestMapping(value = "/all",params = "data", method = RequestMethod.POST, headers = "Accept=application/json")//produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> getData(@RequestBody String json){
		HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        
        try{
        	DataTableResponse<Contato> result = contatoService.desenharTabela(json);
        	
        	return  new ResponseEntity<String>(new JSONSerializer()
			        	.include("aaData.id")
			        	.include("aaData.nome")
			        	.include("aaData.telefone")
			        	.include("aaData.email")
			        	.include("aaData.endereco")
			        	.exclude("aaData.*")
		        		.exclude("*.class")
		//        		.transform(new IterableTransformer(), Collection.class) 
		        		.deepSerialize(result), headers, HttpStatus.OK);
        } catch (Exception ex) {
        	ex.printStackTrace();
        	return new ResponseEntity<String>(ex.toString(), headers, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
