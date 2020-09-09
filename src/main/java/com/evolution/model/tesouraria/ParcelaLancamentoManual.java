package com.evolution.model.tesouraria;

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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TESPALAN")
@SuppressWarnings("deprecation")
@JsonIgnoreProperties(value = { "total" })
public class ParcelaLancamentoManual {

	@Id
	@Column(name = "NCODIPALAN", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESPALAN")
	@SequenceGenerator(sequenceName = "TES_STESPALAN", allocationSize = 1, name = "TES_STESPALAN")
	private Long id;

	@ManyToOne
	@JsonBackReference
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESPALAN_TESLANCM")
	@JoinColumn(name = "NCODILANCM", nullable = false)
	private LancamentoManual lancamentoManual;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVALOPALAN", nullable = false, precision = 19, scale = 2)
	private BigDecimal valor = BigDecimal.ZERO;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDVENPALAN", nullable = false)
	private Date vencimento = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LancamentoManual getLancamentoManual() {
		return lancamentoManual;
	}

	public void setLancamentoManual(LancamentoManual lancamentoManual) {
		this.lancamentoManual = lancamentoManual;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
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
		ParcelaLancamentoManual other = (ParcelaLancamentoManual) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
