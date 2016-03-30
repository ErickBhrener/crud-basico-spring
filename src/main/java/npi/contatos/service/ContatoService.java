package npi.contatos.service;

import java.util.List;

import npi.contatos.model.Contato;
import npi.contatos.model.DataTableResponse;

public interface ContatoService {
	
	List<Contato> findAll();
	
	void salvar(Contato contato);
	
	void remover(Integer id);
	
	Contato detalheContato(Integer id);

	void editar(Contato contato, Integer id);
	
}
