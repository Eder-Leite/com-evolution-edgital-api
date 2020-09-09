package com.evolution.model.livro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "LIVCOANP")
public class CodigoANP {

	@Id
	@Column(name = "NCODICOANP", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVCOANP")
	@SequenceGenerator(sequenceName = "LIV_SLIVCOANP", allocationSize = 1, name = "LIV_SLIVCOANP")
	private Long id;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CCODICOANP", nullable = false, length = 12)
	private String codigo;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCCOANP", nullable = false, length = 4000)
	private String descricao;

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
		CodigoANP other = (CodigoANP) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CodigoANP [id=" + id + ", codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
