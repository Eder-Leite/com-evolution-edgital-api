package com.evolution.model.tesouraria;

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
import org.hibernate.validator.constraints.NotBlank;

import com.evolution.model.tesouraria.enumerador.Status;

@Entity
@Table(name = "TESAGENC")
@SuppressWarnings("deprecation")
public class Agencia {

	@Id
	@Column(name = "NCODIAGENC", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESAGENC")
	@SequenceGenerator(sequenceName = "TES_STESAGENC", allocationSize = 1, name = "TES_STESAGENC")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESAGENC_TESBANCO")
	@JoinColumn(name = "NCODIBANCO", nullable = false)
	private Banco banco;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CCODIAGENC", nullable = false, length = 10)
	private String codigo;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDIGIAGENC", nullable = false, length = 2)
	private String digito;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCAGENC", nullable = false, length = 255)
	private String descricao;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CCIDAAGENC", nullable = false, length = 255)
	private String cidade;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSTATAGENC", nullable = false, length = 15)
	private Status status = Status.ATIVO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
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
		Agencia other = (Agencia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Agencia [id=" + id + ", banco=" + banco + ", codigo=" + codigo + ", digito=" + digito + ", descricao="
				+ descricao + ", cidade=" + cidade + ", status=" + status + "]";
	}

}
