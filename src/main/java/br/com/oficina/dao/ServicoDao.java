package br.com.oficina.dao;

import java.util.List;

import br.com.oficina.contrato.IServico;
import br.com.oficina.model.Servico;

public class ServicoDao extends GenericDAO<Servico> implements IServico{

	@Override
	public void saveOrUpdate(Servico servico) {
		super.save(servico);
	}

	@Override
	public void delete(Servico servico) {
		super.delete(servico);
	}

	@Override
	public Servico findById(Long id) {
		return (Servico) super.findById(id);
	}

	@Override
	public List<Servico> getAll() {
		return super.getAll();
	}

}
