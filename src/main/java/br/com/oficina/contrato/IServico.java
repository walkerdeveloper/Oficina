package br.com.oficina.contrato;

import java.util.List;

import br.com.oficina.model.Servico;

public interface IServico {

	void saveOrUpdate(Servico servico) throws Exception;
	void delete (Servico servico);
	Servico findById(Long id);
	List<Servico> getAll();
}
