package br.com.oficina.service;

import java.util.Calendar;

import org.junit.Ignore;
import org.junit.Test;

import br.com.oficina.model.Cliente;
import br.com.oficina.model.Veiculo;

public class ClienteServiceTeste {

	private ClienteService service = new ClienteService();
	
	@Test
	@Ignore
	public void criarCliente() throws NegocioException {
		Cliente cliente = new Cliente();
		Calendar date = Calendar.getInstance();
		date.set(1995, 10, 28);
		
		cliente.setBairro("Boa Viagem");
		cliente.setCidade("Recife");
		cliente.setDtCadastro(Calendar.getInstance());
		cliente.setDtNascimento(date);
		cliente.setNomeCompleto("Gabriel Dias");
		cliente.setNrCep("98452632");
		cliente.setRua("Av. Boa Viagem");
		cliente.setUf("PE");
		
		service.saveOrUpdate(cliente);
	}
	
	@Test
	public void listarVeiculosDeCliente() {
		for (Cliente c : this.service.getAll()) {
			for (Veiculo v : c.getVeiculos()) {
				System.out.println(v.toString());
			}
		}
	}
}
