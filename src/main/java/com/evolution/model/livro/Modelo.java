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
@Table(name = "LIVMODEL")
public class Modelo {

	@Id
	@Column(name = "NCODIMODEL", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVMODEL")
	@SequenceGenerator(sequenceName = "LIV_SLIVMODEL", allocationSize = 1, name = "LIV_SLIVMODEL")
	private Long id;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CCODIMODEL", nullable = false, length = 4)
	private String codigo;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCMODEL", nullable = false, length = 255)
	private String descricao;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CSIGLMODEL", nullable = false, length = 15)
	private String sigla;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
		Modelo other = (Modelo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Modelo [id=" + id + ", codigo=" + codigo + ", descricao=" + descricao + ", sigla=" + sigla + "]";
	}
}
