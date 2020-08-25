package br.com.oficina.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import br.com.oficina.model.Servico;

public class ServicoServiceTeste {

	ServicoService service = new ServicoService();
	
	@Test
	public void criarServico() throws Exception {
		Servico servico = new Servico();
		servico.setDescricao("Troca de pneu");
		servico.setDtCadastro(new Date());
		
		this.service.saveOrUpdate(servico);
	}
	
	@Test
	public void listarTodosOsServicos() {
		List<Servico> servicos = this.service.getAll();
		for (Servico s : servicos) {
			System.out.println(s.toString());
		}
	}
}
