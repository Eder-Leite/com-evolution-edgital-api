package com.evolution.model.livro;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "LIVPAMOV")
@SuppressWarnings("deprecation")
public class ParcelaMovimento {

	@Id
	@Column(name = "NCODIPAMOV", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVPAMOV")
	@SequenceGenerator(sequenceName = "LIV_SLIVPAMOV", allocationSize = 1, name = "LIV_SLIVPAMOV")
	private Long id;

	@ManyToOne
	@JsonBackReference
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVPAMOV_LIVMOVIM")
	@JoinColumn(name = "NCODIMOVIM", nullable = false)
	private MovimentoLiv movimento;

	@NotNull(message = "é obrigatório")
	@Column(name = "NNUMEPAMOV", nullable = false)
	private Long numero;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVALOPAMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valor = BigDecimal.ZERO;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDVENPAMOV")
	private Date dataVencimento;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDATAPAMOV")
	private Date dataCadastro = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MovimentoLiv getMovimento() {
		return movimento;
	}

	public void setMovimento(MovimentoLiv movimento) {
		this.movimento = movimento;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
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
		ParcelaMovimento other = (ParcelaMovimento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ParcelaMovimento [id=" + id + ", movimento=" + movimento + ", numero=" + numero + ", valor=" + valor
				+ ", dataVencimento=" + dataVencimento + ", dataCadastro=" + dataCadastro + "]";
	}
}
