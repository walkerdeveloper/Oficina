package br.com.oficina.service;

import org.junit.Test;

import br.com.oficina.model.Usuario;

public class UsuarioServiceTeste {
	
	private UsuarioService service = new UsuarioService();

	@Test
	public void cadastarUsuario() {
		Usuario usuario = new Usuario();
		usuario.setLogin("gabriel.dias");
		usuario.setNome("Dias Gabriel");
		usuario.setSenha("1234");
		
		this.service.saveOrUpdate(usuario);
	}
}
