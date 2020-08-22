package br.com.oficina.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import br.com.oficina.model.Fabricante;

public class EstudoTestes {
	
	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	// Caso haja mais de um erro, todas as falhas serão informadas
		@Test
		public void testeRules() {
			int cinco = 5;
			
			error.checkThat(cinco, is(6));
			error.checkThat(cinco, is(equalTo(4)));
			error.checkThat(cinco, is(not((5))));
		}
	
	// Assertivas
	@Test
	public void testeAssertivas() {
		assertEquals(10.0, 10.0, 0.1);
		
		int i = 1;
		int j = 1;
		
		assertTrue(i == j);
		assertEquals("bola", "bola");
		
		String nome = "Gabriel";
		String gabriel = new String();
		gabriel = "Gabriel";
		
		assertEquals(nome, gabriel);
		
		Fabricante renault = new Fabricante();
		Fabricante ford = new Fabricante();
		Fabricante ponteiro = ford;
		
		renault.setId(1L);
		renault.setDescricao("Renaul");
		
		ford.setId(2L);
		ford.setDescricao("Ford");
		
		assertNotSame(renault, ford);
		assertSame(ford, ponteiro);
		
	}
	
	// AssertThat + CoreMatchers
	@Test
	public void testeAssertThat() {
		int cinco = 5;
		
		assertThat(cinco, is(5));
		assertThat(cinco, is(equalTo(5)));
		assertThat(cinco, is(not((4))));
	}

}
