package br.com.oficina.contrato;

import java.util.List;

import br.com.oficina.model.Fabricante;

public interface IFabricante {
	
	void save(Fabricante fabricante) throws Exception; 
	void update(Fabricante fabricante) throws Exception;
	void delete(Fabricante fabricante);
	List<Fabricante> getAll();
	Fabricante findById(Long id);
	
}
