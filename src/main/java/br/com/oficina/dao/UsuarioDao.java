package br.com.oficina.dao;

import java.util.List;

import br.com.oficina.contrato.IUsuario;
import br.com.oficina.model.Usuario;

public class UsuarioDao extends GenericDAO<Usuario> implements IUsuario{

	@Override
	public void saveOrUpdate(Usuario usuario) {
		super.save(usuario);
	}

	@Override
	public void delete(Usuario usuario) {
		super.delete(usuario);
	}

	@Override
	public Usuario findById(Long id) {
		return (Usuario) super.findById(id);
	}

	@Override
	public List<Usuario> getAll() {
		return super.getAll();
	}

}
