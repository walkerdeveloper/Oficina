package br.com.oficina.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venda implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_venda")
	private long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_venda")
	private Calendar dtVenda;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dh_venda")
	private Date dhVenda;
	
	@ManyToMany
	@JoinTable( name = "venda_produto"
			   ,joinColumns= { @JoinColumn(name="cd_produto") }
			   ,inverseJoinColumns = { @JoinColumn(name = "cd_venda")}
			  )
	private List<Produto> produtos;
	
	@ManyToMany
	@JoinTable( name = "venda_servico"
			   ,joinColumns = {@JoinColumn(name = "cd_servico")}
			   ,inverseJoinColumns = {@JoinColumn(name = "cd_venda")}
			  )
	private List<Servico> servicos;
	
	@ManyToOne
	@JoinColumn(name = "cd_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "cd_usuario")
	private Usuario usuario;
	
	@Column(name = "vl_venda")
	private BigDecimal valorTotalDaVenda;
	
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public BigDecimal getValorTotalDaVenda() {
		return valorTotalDaVenda;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	public void setValorTotalDaVenda(BigDecimal valorTotalDaVenda) {
		this.valorTotalDaVenda = valorTotalDaVenda;
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
