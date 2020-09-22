package com.evolution.model.livro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "LIVUNIDA")
public class UnidadeProduto {

	@Id
	@Column(name = "NCODIUNIDA", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVUNIDA")
	@SequenceGenerator(sequenceName = "LIV_SLIVUNIDA", allocationSize = 1, name = "LIV_SLIVUNIDA")
	private Long id;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCUNIDA", nullable = false, length = 255)
	private String descricao;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CSIGLUNIDA", nullable = false, length = 10)
	private String sigla;

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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
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
		UnidadeProduto other = (UnidadeProduto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UnidadeProduto [id=" + id + ", descricao=" + descricao + ", sigla=" + sigla + "]";
	}

}
