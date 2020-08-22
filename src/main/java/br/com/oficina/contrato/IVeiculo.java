package br.com.oficina.contrato;

import java.util.List;

import br.com.oficina.model.Veiculo;

public interface IVeiculo {

	void save(Veiculo veiculo) throws Exception;
	void update(Veiculo veiculo);
	void delete(Veiculo veiculo);
	List<Veiculo> getAll();
	Veiculo findById(Long id);
	Veiculo findByPlaca(String placa) throws Exception;
}
