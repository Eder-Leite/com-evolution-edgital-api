package com.evolution.model.livro;

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

import com.evolution.model.livro.enumerador.TipoMovimento;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "LIV_CFOP")
public class CodigoCFOP {

	@Id
	@Column(name = "NCODI_CFOP", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIV_CFOP")
	@SequenceGenerator(sequenceName = "LIV_SLIV_CFOP", allocationSize = 1, name = "LIV_SLIV_CFOP")
	private Long id;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CCODI_CFOP", nullable = false, length = 4)
	private String codigo;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESC_CFOP", nullable = false, length = 4000)
	private String descricao;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "é obrigatório")
	@Column(name = "CTIPO_CFOP", nullable = false, length = 15)
	private TipoMovimento tipo;

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

	public TipoMovimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimento tipo) {
		this.tipo = tipo;
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
		CodigoCFOP other = (CodigoCFOP) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CodigoCFOP [id=" + id + ", codigo=" + codigo + ", descricao=" + descricao + ", tipo=" + tipo + "]";
	}

}
