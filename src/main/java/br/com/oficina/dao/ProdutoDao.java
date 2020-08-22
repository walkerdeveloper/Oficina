package br.com.oficina.dao;

import java.util.List;

import br.com.oficina.contrato.IProduto;
import br.com.oficina.model.Produto;

public class ProdutoDao extends GenericDAO<Produto> implements IProduto {

	@Override
	public void saverOrUpdate(Produto produto) {
		super.save(produto);
		
	}

	@Override
	public void delete(Produto produto) {
		super.delete(produto);
		
	}

	@Override
	public List<Produto> getAll() {
		return super.getAll();
	}

}
