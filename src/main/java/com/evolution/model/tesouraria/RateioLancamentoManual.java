package com.evolution.model.tesouraria;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;

import com.evolution.model.tesouraria.enumerador.Check;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TESPLLAN")
@SuppressWarnings("deprecation")
@JsonIgnoreProperties(value = { "total" })
public class RateioLancamentoManual {

	@Id
	@Column(name = "NCODIPLLAN", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESPLLAN")
	@SequenceGenerator(sequenceName = "TES_STESPLLAN", allocationSize = 1, name = "TES_STESPLLAN")
	private Long id;

	@ManyToOne
	@JsonBackReference
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESPLLAN_TESLANCM")
	@JoinColumn(name = "NCODILANCM", nullable = false)
	private LancamentoManual lancamentoManual;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESPLLAN_TESPLLAN")
	@JoinColumn(name = "NCODIPREDE", nullable = false)
	private PlanoReceitaDespesa planoReceitaDespesa;

	@NotNull(message = "é obrigatório")
	@Column(name = "NPERCPLLAN", nullable = false, precision = 19, scale = 10)
	private BigDecimal percentual = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVALOPLLAN", nullable = false, precision = 19, scale = 2)
	private BigDecimal valor = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CPRINPLLAN", nullable = false)
	private Check principal = Check.SIM;

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

	public PlanoReceitaDespesa getPlanoReceitaDespesa() {
		return planoReceitaDespesa;
	}

	public void setPlanoReceitaDespesa(PlanoReceitaDespesa planoReceitaDespesa) {
		this.planoReceitaDespesa = planoReceitaDespesa;
	}

	public BigDecimal getPercentual() {
		return percentual;
	}

	public void setPercentual(BigDecimal percentual) {
		this.percentual = percentual;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Check getPrincipal() {
		return principal;
	}

	public void setPrincipal(Check principal) {
		this.principal = principal;
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
		RateioLancamentoManual other = (RateioLancamentoManual) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
