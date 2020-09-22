package com.evolution.model.cadastro;

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
@Table(name = "CAD_PAIS")
public class Pais {

	@Id
	@Column(name = "NCODI_PAIS", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAD_SCAD_PAIS")
	@SequenceGenerator(sequenceName = "CAD_SCAD_PAIS", allocationSize = 1, name = "CAD_SCAD_PAIS")
	private Long id;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CCODI_PAIS", nullable = false, length = 10)
	private String codigo;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CNOME_PAIS", nullable = false, length = 255)
	private String nome;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CSIGL_PAIS", nullable = false, length = 10)
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		Pais other = (Pais) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", sigla=" + sigla + "]";
	}

}
