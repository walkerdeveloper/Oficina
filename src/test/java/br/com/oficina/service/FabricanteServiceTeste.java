package br.com.oficina.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.oficina.model.Fabricante;
import jdk.nashorn.internal.ir.annotations.Ignore;

public class FabricanteServiceTeste {

	FabricanteService service = new FabricanteService();

	@Test
	public void criarFabricante() throws NegocioException {
		Fabricante fabricante = new Fabricante();
		fabricante.setDescricao("Toyota");
		this.service.save(fabricante);

	}

	@Test
	@Ignore
	public void alterarFabricante() throws NegocioException {
		Fabricante f = this.service.findById(1L);
		f.setDescricao("Alterou o nome");
		this.service.update(f);
	}

	@Test
	public void deletarFabricante() {
		Fabricante f = this.service.findById(8L);
		this.service.delete(f);

		assertThat(f, is(nullValue()));

	}

	@Test
	public void consultarTodosOsFabricantes() {
		List<Fabricante> fabricantes = new ArrayList<>();
		fabricantes = this.service.getAll();

		assertThat(fabricantes, is(notNullValue()));
	}

	@Test
	public void consultarPorId() {
		Fabricante fabricante = this.service.findById(1L);
		assertThat(fabricante, is(notNullValue()));
	}
}
