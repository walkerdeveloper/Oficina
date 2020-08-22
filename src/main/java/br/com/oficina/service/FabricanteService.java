package br.com.oficina.service;

import java.io.Serializable;
import java.util.List;

import br.com.oficina.contrato.IFabricante;
import br.com.oficina.dao.FabricanteDao;
import br.com.oficina.model.Fabricante;

public class FabricanteService implements Serializable, IFabricante {

	private static final long serialVersionUID = 1L;

	private FabricanteDao dao = new FabricanteDao();

	@SuppressWarnings("unused")
	@Override
	public void save(Fabricante fabricante) throws NegocioException {
		if (fabricante.getDescricao() == null || fabricante.getDescricao().trim().equals("")) {
			throw new NegocioException("O nome do fabricante é obrigatório");
		}

		if (fabricante == null) {
			throw new NegocioException("Não foi passado nenhum fabricante");
		}

		this.dao.save(fabricante);
	}

	@SuppressWarnings("unused")
	@Override
	public void update(Fabricante fabricante) throws NegocioException {
		if (fabricante.getDescricao() == null || fabricante.getDescricao().trim().equals("")) {
			throw new NegocioException("O nome do fabricante é obrigatório");
		}

		if (fabricante == null) {
			throw new NegocioException("Não foi passado nenhum fabricante");
		}

		this.dao.save(fabricante);
	}

	@Override
	public void delete(Fabricante fabricante) {
		this.dao.delete(fabricante);
	}

	@Override
	public List<Fabricante> getAll() {
		return this.dao.getAll();
	}

	@Override
	public Fabricante findById(Long id) {
		return this.dao.findById(id);
	}

}
