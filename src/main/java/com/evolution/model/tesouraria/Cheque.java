package com.evolution.model.tesouraria;

import java.math.BigDecimal;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;

import com.evolution.model.tesouraria.enumerador.SituacaoCheque;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TESCHEQU")
@SuppressWarnings("deprecation")
public class Cheque {

	@Id
	@Column(name = "NCODICHEQU", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESCHEQU")
	@SequenceGenerator(sequenceName = "TES_STESCHEQU", allocationSize = 1, name = "TES_STESCHEQU")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESCHEQU_TESTALAO")
	@JoinColumn(name = "NCODITALAO", nullable = false)
	private TalaoCheque talaoCheque;

	@NotNull(message = "é obrigatório")
	@Column(name = "NNUMECHEQU", nullable = false)
	private Long numero;

	@Column(name = "NVALOCHEQU", precision = 19, scale = 2)
	private BigDecimal valor;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name = "DDATECHEQU")
	private Date dataEmissao;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name = "DDATMCHEQU")
	private Date dataMovimento;

	@Column(name = "CNOMICHEQU", length = 255)
	private String nominal;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSITUCHEQU", nullable = false, length = 15)
	private SituacaoCheque situacao = SituacaoCheque.ATIVO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TalaoCheque getTalaoCheque() {
		return talaoCheque;
	}

	public void setTalaoCheque(TalaoCheque talaoCheque) {
		this.talaoCheque = talaoCheque;
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

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Date getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	public String getNominal() {
		return nominal;
	}

	public void setNominal(String nominal) {
		this.nominal = nominal;
	}

	public SituacaoCheque getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoCheque situacao) {
		this.situacao = situacao;
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
		Cheque other = (Cheque) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cheque [id=" + id + ", talaoCheque=" + talaoCheque + ", numero=" + numero + ", valor=" + valor
				+ ", dataEmissao=" + dataEmissao + ", dataMovimento=" + dataMovimento + ", nominal=" + nominal
				+ ", situacao=" + situacao + "]";
	}

}
