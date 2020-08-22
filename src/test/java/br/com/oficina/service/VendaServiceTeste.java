package br.com.oficina.service;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import br.com.oficina.dao.ProdutoDao;
import br.com.oficina.model.Venda;

public class VendaServiceTeste {

	VendaService service = new VendaService();
	
	@Test
	public void cadastrarVenda() {
		Venda venda = new Venda();
		ProdutoDao dao = new  ProdutoDao();
		
		venda.setDhVenda(new Date());
		venda.setDtVenda(Calendar.getInstance());
		venda.setProdutos(dao.getAll());
		venda.setValorTotalDaCompra(new BigDecimal(200));
		
		service.saveOrUpdate(venda);
	}
	
	@Test
	public void selecionarTodasAsVendas() {
		List<Venda> vendas = this.service.getAll();
		for (Venda venda : vendas) {
			venda.toString();
		}
	}
}
