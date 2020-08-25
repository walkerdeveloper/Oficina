package br.com.oficina.contrato;

import java.util.List;

import br.com.oficina.model.Cliente;
import br.com.oficina.service.NegocioException;

public interface ICliente {

	void saveOrUpdate(Cliente cliente) throws NegocioException;
	void delete(Cliente cliente);
	List<Cliente> getAll();
	Cliente findById(Long id);
}
