package com.evolution.model.livro;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "LIVALIPI")
public class AliquotaIPI {

	@Id
	@Column(name = "NCODIALIPI", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVALIPI")
	@SequenceGenerator(sequenceName = "LIV_SLIVALIPI", allocationSize = 1, name = "LIV_SLIVALIPI")
	private Long id;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCALIPI", nullable = false, length = 255)
	private String descricao;

	@NotNull(message = "é obrigatório")
	@Column(name = "NPERCALIPI", precision = 5, scale = 2)
	private BigDecimal percentual;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVALOALIPI", precision = 7, scale = 4)
	private BigDecimal valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		AliquotaIPI other = (AliquotaIPI) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AliquotaIPI [id=" + id + ", descricao=" + descricao + ", percentual=" + percentual + ", valor=" + valor
				+ "]";
	}

}
