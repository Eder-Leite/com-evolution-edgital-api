package com.evolution.model.tesouraria;

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
@Table(name = "TESITBAI")
@SuppressWarnings("deprecation")
public class ItemBaixa {

	@Id
	@Column(name = "NCODIITBAI", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESITBAI")
	@SequenceGenerator(sequenceName = "TES_STESITBAI", allocationSize = 1, name = "TES_STESITBAI")
	private Long id;

	@ManyToOne
	@JsonBackReference
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESITBAI_TESBAIXA")
	@JoinColumn(name = "NCODIBAIXA", nullable = false)
	private Baixa baixa;

	@ManyToOne
	@JsonBackReference
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESITBAI_TESTITUL")
	@JoinColumn(name = "NCODITITUL", nullable = false)
	private Titulo titulo;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVABEITBAI", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorAberto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVJURITBAI", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorJuro = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVDESITBAI", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorDesconto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NSALDITBAI", nullable = false, precision = 19, scale = 2)
	private BigDecimal saldo = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVALOITBAI", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorBaixa = BigDecimal.ZERO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Baixa getBaixa() {
		return baixa;
	}

	public void setBaixa(Baixa baixa) {
		this.baixa = baixa;
	}

	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}

	public BigDecimal getValorAberto() {
		return valorAberto;
	}

	public void setValorAberto(BigDecimal valorAberto) {
		this.valorAberto = valorAberto;
	}

	public BigDecimal getValorJuro() {
		return valorJuro;
	}

	public void setValorJuro(BigDecimal valorJuro) {
		this.valorJuro = valorJuro;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public BigDecimal getValorBaixa() {
		return valorBaixa;
	}

	public void setValorBaixa(BigDecimal valorBaixa) {
		this.valorBaixa = valorBaixa;
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
		ItemBaixa other = (ItemBaixa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemBaixa [id=" + id + ", baixa=" + baixa + ", titulo=" + titulo + ", valorAberto=" + valorAberto
				+ ", valorJuro=" + valorJuro + ", valorDesconto=" + valorDesconto + ", saldo=" + saldo + ", valorBaixa="
				+ valorBaixa + "]";
	}
}
