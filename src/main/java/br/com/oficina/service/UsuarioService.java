package br.com.oficina.service;

import java.util.List;

import br.com.oficina.contrato.IUsuario;
import br.com.oficina.dao.UsuarioDao;
import br.com.oficina.model.Usuario;

public class UsuarioService implements IUsuario {

	private UsuarioDao dao = new UsuarioDao();
	
	@Override
	public void saveOrUpdate(Usuario usuario) {
		this.dao.saveOrUpdate(usuario);
	}

	@Override
	public void delete(Usuario usuario) {
		this.dao.delete(usuario);
	}

	@Override
	public Usuario findById(Long id) {
		return this.dao.findById(id);
	}

	@Override
	public List<Usuario> getAll() {
		return this.dao.getAll();
	}

}
