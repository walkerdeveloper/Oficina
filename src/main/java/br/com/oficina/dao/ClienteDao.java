package br.com.oficina.dao;

import java.util.List;

import br.com.oficina.contrato.ICliente;
import br.com.oficina.model.Cliente;

public class ClienteDao extends GenericDAO<Cliente> implements ICliente{

	@Override
	public void saveOrUpdate(Cliente cliente) {
		super.save(cliente);
		
	}

	@Override
	public void delete(Cliente cliente) {
		super.delete(cliente);
		
	}

	@Override
	public List<Cliente> getAll() {
		return super.getAll();
	}

}
