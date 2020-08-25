package br.com.oficina.service;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.Calendar;

import org.junit.Ignore;
import org.junit.Test;

import br.com.oficina.model.Veiculo;

public class VeiculoServiceTeste {

	VeiculoService service = new VeiculoService();
	
	@Test
	public void inserirVeiculo() throws NegocioException {
		Veiculo veiculo = new Veiculo();
		veiculo.setCor("Vermelho");
		veiculo.setDataCadastro(Calendar.getInstance());
		veiculo.getFabricante().setId(1L);
		veiculo.setModelo("Corolla");
		veiculo.setPlaca("ABC-1234");
		
		this.service.save(veiculo);
	}
	
	@Test
	@Ignore
	public void alterarVeiculo() throws NegocioException {
		Veiculo veiculo = this.service.findById(1L);
		veiculo.setCor("Verde");
		
		this.service.save(veiculo);
	}
	
	@Test
	public void encontrarVeiculoPelaPlaca() throws NegocioException, Exception {
		Veiculo v = new Veiculo();
		v = this.service.findByPlaca("ABC-1234");
		assertThat(v, notNullValue());
	}
	
}
