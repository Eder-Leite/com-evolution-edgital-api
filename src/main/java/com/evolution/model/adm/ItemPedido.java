package com.evolution.model.adm;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ADMITPED")
@SuppressWarnings("deprecation")
public class ItemPedido {

	@Id
	@Column(name = "NCODIITPED", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADM_SADMITPED")
	@SequenceGenerator(sequenceName = "ADM_SADMITPED", allocationSize = 1, name = "ADM_SADMITPED")
	private Long id;

	@ManyToOne
	@JsonBackReference
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMITPED_ADMPEDID")
	@JoinColumn(name = "NCODIPEDID", nullable = false)
	private PedidoAdm pedido;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMITPED_ADMPRODU")
	@JoinColumn(name = "NCODIPRODU", nullable = true)
	private Produto produto;

	@Column(name = "CDESCITPED", nullable = true, length = 255)
	private String descricao;

	@NotNull(message = "é obrigatório")
	@Column(name = "NQUANITPED", nullable = false, precision = 19, scale = 6)
	private BigDecimal quantidade = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NUNITITPED", nullable = false, precision = 19, scale = 6)
	private BigDecimal valorUnitario = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NDESCITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorDesconto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NOUTRITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorOutras = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NPRODITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalProdutoServico = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTOTAITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal total = BigDecimal.ZERO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PedidoAdm getPedido() {
		return pedido;
	}

	public void setPedido(PedidoAdm pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorOutras() {
		return valorOutras;
	}

	public void setValorOutras(BigDecimal valorOutras) {
		this.valorOutras = valorOutras;
	}

	public BigDecimal getTotalProdutoServico() {
		return totalProdutoServico;
	}

	public void setTotalProdutoServico(BigDecimal totalProdutoServico) {
		this.totalProdutoServico = totalProdutoServico;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ItemPedido other = (ItemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemPedido [id=" + id + ", pedido=" + pedido + ", produto=" + produto + ", descricao=" + descricao
				+ ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario + ", valorDesconto=" + valorDesconto
				+ ", valorOutras=" + valorOutras + ", totalProdutoServico=" + totalProdutoServico + ", total=" + total
				+ "]";
	}
}
