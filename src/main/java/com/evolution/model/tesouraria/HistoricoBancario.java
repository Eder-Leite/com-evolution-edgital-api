package com.evolution.model.tesouraria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.evolution.model.tesouraria.enumerador.Status;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "TESHISTB")
public class HistoricoBancario {

	@Id
	@Column(name = "NCODIHISTB", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESHISTB")
	@SequenceGenerator(sequenceName = "TES_STESHISTB", allocationSize = 1, name = "TES_STESHISTB")
	private Long id;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCHISTB", nullable = false, length = 255)
	private String descricao;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSTATHISTB", nullable = false, length = 15)
	private Status status = Status.ATIVO;

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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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
		HistoricoBancario other = (HistoricoBancario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HistoricoBancario [id=" + id + ", descricao=" + descricao + ", status=" + status + "]";
	}
}
