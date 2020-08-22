package br.com.oficina.service;

import java.util.List;

import br.com.oficina.contrato.IVenda;
import br.com.oficina.dao.VendaDao;
import br.com.oficina.model.Venda;

public class VendaService implements IVenda {

	private VendaDao dao = new VendaDao();

	@Override
	public void saveOrUpdate(Venda venda) {
		this.dao.saveOrUpdate(venda);

	}

	@Override
	public void delete(Venda venda) {
		this.dao.delete(venda);

	}

	@Override
	public List<Venda> getAll() {
		return this.dao.getAll();
	}

}
