package npi.contatos.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Criteria;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;

import flexjson.JSONDeserializer;
import npi.contatos.model.Contato;
import npi.contatos.model.DataTableRequest;
import npi.contatos.model.DataTableResponse;
import npi.contatos.respository.ContatoRepository;

@Named
public class ContatoServiceImpl implements ContatoService {
	
	@Inject
	private ContatoRepository contatoRepository;

	@Override
	public List<Contato> findAll() {
		return contatoRepository.findAll();
	}

	@Override
	public void salvar(Contato contato) {
		contatoRepository.salvar(contato);
	}

	@Override
	public void remover(Integer id) {
		Contato contato = contatoRepository.findById(id);
		contatoRepository.remover(contato);
	}

	@Override
	public Contato detalheContato(Integer id) {
		return contatoRepository.findById(id);
	}
	
	@Override
	public void editar(Contato contato, Integer id){
		contatoRepository.editar(contato, id);
	}

	@Override
	public DataTableResponse<Contato> desenharTabela(String json) {
		List<Contato> data = new ArrayList<Contato>();
        DataTableRequest<Contato> dataTablesRequest = new JSONDeserializer<DataTableRequest<Contato>>()
        		.use("searchObj", Contato.class)
//        		.use("extraData", FindBookBean.class)
        		.use(null, DataTableRequest.class)
        		.deserialize(json);
        
        /* 
         * Default order by datePublished desc. 
         */
        if(dataTablesRequest.aiSortCol == null){
        	dataTablesRequest.aiSortCol = new ArrayList<Integer>();
        	dataTablesRequest.aiSortCol.add(new Integer(0));
        	dataTablesRequest.amDataProp.set(0,"datePublished");
        	dataTablesRequest.asSortDir = new ArrayList<String>();
        	dataTablesRequest.asSortDir.add("desc");
        }
        
        data = contatoRepository.findAll();
        
        Long totalRecords =(long) contatoRepository.findAll().size();
        
        DataTableResponse<Contato> result = new DataTableResponse<Contato>(""+dataTablesRequest.sEcho, 
        		totalRecords.intValue(), 
        		totalRecords.intValue(), 
        		data, 
        		dataTablesRequest.sColumns);

	    return result;
	}
}
