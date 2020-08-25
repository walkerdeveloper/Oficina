package br.com.oficina.service;

import java.util.List;

import br.com.oficina.contrato.ICliente;
import br.com.oficina.dao.ClienteDao;
import br.com.oficina.model.Cliente;

public class ClienteService implements ICliente {

	private ClienteDao dao = new ClienteDao();
	
	@Override
	public void saveOrUpdate(Cliente cliente) throws NegocioException {
		if (cliente == null) {
			throw new NegocioException("É necessário informar um cliente.");
		}
		
		if (cliente.getNomeCompleto().equals("") || cliente.getNomeCompleto().trim().equalsIgnoreCase("")) {
			throw new NegocioException("O nome do cliente não pode estar vazio");
		}
		
		this.dao.saveOrUpdate(cliente);
	}

	@Override
	public void delete(Cliente cliente) {
		this.dao.delete(cliente);
		
	}

	@Override
	public List<Cliente> getAll() {
		return this.dao.getAll();
	}

	@Override
	public Cliente findById(Long id) {
		return this.dao.findById(id);
	}

}
