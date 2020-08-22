package br.com.oficina.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venda implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Temporal(TemporalType.DATE)
	private Calendar dtVenda;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dhVenda;
	
	@ManyToMany
	private List<Produto> produtos;
	
	private BigDecimal valorTotalDaCompra;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Calendar getDtVenda() {
		return dtVenda;
	}
	
	public void setDtVenda(Calendar dtVenda) {
		this.dtVenda = dtVenda;
	}
	
	public Date getDhVenda() {
		return dhVenda;
	}
	
	public void setDhVenda(Date dhVenda) {
		this.dhVenda = dhVenda;
	}
	
	public BigDecimal getValorTotalDaCompra() {
		return valorTotalDaCompra;
	}
	
	public void setValorTotalDaCompra(BigDecimal valorTotalDaCompra) {
		this.valorTotalDaCompra = valorTotalDaCompra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Código: " + this.getId() + "\nData: " + this.getDhVenda();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
