package br.com.oficina.service;

import java.util.List;

import br.com.oficina.contrato.IServico;
import br.com.oficina.dao.ServicoDao;
import br.com.oficina.model.Servico;

public class ServicoService implements IServico{
	
	private ServicoDao dao = new ServicoDao();

	@Override
	public void saveOrUpdate(Servico servico) throws Exception {
		if (servico == null) {
			throw new NegocioException("É necessário informar um serviço");
		}
		
		if (servico.getDescricao().equals("") || servico.getDescricao().trim().equals("")) {
			throw new NegocioException("É necessário informar uma descrição para o serviço");
		}
		
		this.dao.saveOrUpdate(servico);
	}

	@Override
	public void delete(Servico servico) {
		this.dao.delete(servico);
	}

	@Override
	public Servico findById(Long id) {
		return this.dao.findById(id);
	}

	@Override
	public List<Servico> getAll() {
		return this.dao.getAll();
	}

}
