package br.com.oficina.service;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import br.com.oficina.contrato.IVeiculo;
import br.com.oficina.dao.VeiculoDao;
import br.com.oficina.model.Veiculo;

public class VeiculoService implements Serializable, IVeiculo{

	private static final long serialVersionUID = 1L;
	
	private VeiculoDao dao = new VeiculoDao();

	@Override
	public void save(Veiculo veiculo) throws NegocioException {
		
		if (veiculo.getCor() == null || veiculo.getCor().trim().equals("")) {
			throw new NegocioException("É necessário informar a cor do veículo");
		}
		
		if (veiculo.getModelo() == null || veiculo.getModelo().trim().equals("")) {
			throw new NegocioException("É necessário informar o modelo do veículo");
		}
		
		if (veiculo.getPlaca() == null || veiculo.getPlaca().trim().equals("")) {
			throw new NegocioException("É necessário informar a placa do veículo");
		}
		
		veiculo.setDataCadastro(Calendar.getInstance());
		this.dao.save(veiculo);
	}

	@Override
	public void update(Veiculo veiculo) {
		
	}

	@Override
	public void delete(Veiculo veiculo) {
		this.dao.delete(veiculo);
	}

	@Override
	public List<Veiculo> getAll() {
		return this.dao.getAll();
	}

	@Override
	public Veiculo findById(Long id) {
		return this.dao.findById(id);
	}

	@Override
	public Veiculo findByPlaca(String placa) throws Exception, NegocioException {
		
		Veiculo veiculo = new Veiculo();
		
		try {
			veiculo = this.dao.findByPlaca(placa);
			if (veiculo == null) {
				throw new NegocioException("A consulta não retornou dados, por favor, tente novamente");
			}
		} catch (Exception e) {
			throw e;
		}
		
		return veiculo;
	}

}
