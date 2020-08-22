package br.com.oficina.dao;

import java.util.List;

import br.com.oficina.contrato.IFabricante;
import br.com.oficina.model.Fabricante;

public class FabricanteDao extends GenericDAO<Fabricante> implements IFabricante {

	@Override
	public void save(Fabricante fabricante) {
		super.save(fabricante);
	}

	@Override
	public void update(Fabricante fabricante) {
		super.save(fabricante);
	}

	@Override
	public void delete(Fabricante fabricante) {
		super.delete(fabricante);
	}

	@Override
	public List<Fabricante> getAll() {
		return super.getAll();
	}

	@Override
	public Fabricante findById(Long id) {
		return (Fabricante) super.findById(id);
	}
}
