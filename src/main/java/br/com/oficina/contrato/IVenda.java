package br.com.oficina.contrato;

import java.util.List;

import br.com.oficina.model.Venda;

public interface IVenda {
	
	void saveOrUpdate(Venda venda);
	void delete (Venda venda);
	List<Venda> getAll();

}
