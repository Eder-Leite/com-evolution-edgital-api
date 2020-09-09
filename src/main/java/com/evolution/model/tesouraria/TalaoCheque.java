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

import com.evolution.model.cadastro.Filial;
import com.evolution.model.tesouraria.enumerador.Status;

@Entity
@Table(name = "TESTALAO")
@SuppressWarnings("deprecation")
public class TalaoCheque {

	@Id
	@Column(name = "NCODITALAO", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESTALAO")
	@SequenceGenerator(sequenceName = "TES_STESTALAO", allocationSize = 1, name = "TES_STESTALAO")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESTALAO_TESCTFIN")
	@JoinColumn(name = "NCODICTFIN", nullable = false)
	private Conta conta;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESTALAO_CADFILIA")
	@JoinColumn(name = "NCODIFILIA", nullable = false)
	private Filial filial;

	@NotNull(message = "é obrigatório")
	@Column(name = "NNUMITALAO", nullable = false)
	private Long numeroInicial;

	@NotNull(message = "é obrigatório")
	@Column(name = "NNUMFTALAO", nullable = false)
	private Long numeroFinal;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSTATTALAO", nullable = false, length = 15)
	private Status status = Status.ATIVO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public Long getNumeroInicial() {
		return numeroInicial;
	}

	public void setNumeroInicial(Long numeroInicial) {
		this.numeroInicial = numeroInicial;
	}

	public Long getNumeroFinal() {
		return numeroFinal;
	}

	public void setNumeroFinal(Long numeroFinal) {
		this.numeroFinal = numeroFinal;
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
		TalaoCheque other = (TalaoCheque) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TalaoCheque [id=" + id + ", conta=" + conta + ", filial=" + filial + ", numeroInicial=" + numeroInicial
				+ ", numeroFinal=" + numeroFinal + ", status=" + status + "]";
	}

}
