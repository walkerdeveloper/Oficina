package br.com.oficina.contrato;

import java.util.List;

import br.com.oficina.model.Usuario;

public interface IUsuario {

	void saveOrUpdate(Usuario usuario);
	void delete(Usuario usuario);
	Usuario findById(Long id);
	List<Usuario> getAll();
}
