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
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "TESPREDE")
@SuppressWarnings("deprecation")
public class PlanoReceitaDespesa {

	@Id
	@Column(name = "NCODIPREDE", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESPREDE")
	@SequenceGenerator(sequenceName = "TES_STESPREDE", allocationSize = 1, name = "TES_STESPREDE")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESPREDE_TESGREDE")
	@JoinColumn(name = "NCODIGREDE", nullable = false)
	private GrupoReceitaDespesa grupoReceitaDespesa;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCPREDE", nullable = false, length = 255)
	private String descricao;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVLIDPREDE", nullable = false, precision = 5, scale = 2)
	private BigDecimal taxaDesconto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVLIJPREDE", nullable = false, precision = 5, scale = 2)
	private BigDecimal taxaJuros = BigDecimal.ZERO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GrupoReceitaDespesa getGrupoReceitaDespesa() {
		return grupoReceitaDespesa;
	}

	public void setGrupoReceitaDespesa(GrupoReceitaDespesa grupoReceitaDespesa) {
		this.grupoReceitaDespesa = grupoReceitaDespesa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getTaxaDesconto() {
		return taxaDesconto;
	}

	public void setTaxaDesconto(BigDecimal taxaDesconto) {
		this.taxaDesconto = taxaDesconto;
	}

	public BigDecimal getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(BigDecimal taxaJuros) {
		this.taxaJuros = taxaJuros;
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
		PlanoReceitaDespesa other = (PlanoReceitaDespesa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
