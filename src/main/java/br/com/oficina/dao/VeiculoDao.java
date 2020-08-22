package br.com.oficina.dao;

import java.util.List;

import br.com.oficina.contrato.IVeiculo;
import br.com.oficina.model.Veiculo;

public class VeiculoDao extends GenericDAO<Veiculo> implements IVeiculo {

	@Override
	public void update(Veiculo veiculo) {
		super.save(veiculo);
	}

	@Override
	public Veiculo findById(Long id) {
		return (Veiculo) super.findById(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Veiculo findByPlaca(String placa) throws Exception {
		Veiculo retorno = null;

		try {
			List<Veiculo> lista = (List<Veiculo>) super.getManager().createQuery("from Veiculo v where v.placa = '" + placa + "'").getResultList();
			
			if(!lista.isEmpty()) {
				retorno = lista.get(0);
			}
			
			if(lista.size() > 1) {
				throw new Exception("A consulta retornou mais de um veículo para a mesma placa");
			}
		} catch (Exception e) {
			throw new Exception("Ocorreu o seguinte erro durante a busca da placa: " + e.getMessage());
		}

		return retorno;
	}

	@Override
	public void save(Veiculo veiculo) {
		super.save(veiculo);
	}

	@Override
	public void delete(Veiculo veiculo) {
		super.delete(veiculo);
	}

	@Override
	public List<Veiculo> getAll() {
		return super.getAll();
	}

}
