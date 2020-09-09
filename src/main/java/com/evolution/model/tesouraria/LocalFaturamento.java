package com.evolution.model.tesouraria;

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

import com.evolution.model.cadastro.Filial;

@Entity
@Table(name = "TESLOCAL")
@SuppressWarnings("deprecation")
public class LocalFaturamento {

	@Id
	@Column(name = "NCODILOCAL", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESLOCAL")
	@SequenceGenerator(sequenceName = "TES_STESLOCAL", allocationSize = 1, name = "TES_STESLOCAL")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESLOCAL_CADFILIA")
	@JoinColumn(name = "NCODIFILIA", nullable = false)
	private Filial filial;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESLOCAL_TESCTFIN")
	@JoinColumn(name = "NCODICTFIN", nullable = false)
	private Conta conta;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCRICAO", nullable = false, length = 255)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
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
		LocalFaturamento other = (LocalFaturamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LocalFaturamento [id=" + id + ", filial=" + filial + ", conta=" + conta + ", descricao=" + descricao
				+ "]";
	}
}
