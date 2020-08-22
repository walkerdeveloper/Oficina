package br.com.oficina.dao;

import java.util.List;

import br.com.oficina.contrato.IVenda;
import br.com.oficina.model.Venda;

public class VendaDao extends GenericDAO<Venda> implements IVenda {

	@Override
	public void saveOrUpdate(Venda venda) {
		super.save(venda);
	}

	@Override
	public void delete(Venda venda) {
		super.delete(venda);

	}

	@Override
	public List<Venda> getAll() {
		return super.getAll();
	}

}
