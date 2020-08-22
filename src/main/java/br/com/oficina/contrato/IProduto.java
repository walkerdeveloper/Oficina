package br.com.oficina.contrato;

import java.util.List;

import br.com.oficina.model.Produto;

public interface IProduto {

	void saverOrUpdate(Produto produto);
	void delete(Produto produto);
	List<Produto> getAll();
}
