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

import com.evolution.model.livro.enumerador.Check;
import com.evolution.model.livro.enumerador.Status;

@Entity
@Table(name = "LIVCOMEN")
public class ComentarioFiscal {

	@Id
	@Column(name = "NCODICOMEN", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVCOMEN")
	@SequenceGenerator(sequenceName = "LIV_SLIVCOMEN", allocationSize = 1, name = "LIV_SLIVCOMEN")
	private Long id;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDES1COMEN", nullable = false, length = 255)
	private String descricao1;

	@Column(name = "CDES2COMEN", nullable = true, length = 255)
	private String descricao2;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CDIFECOMEN", nullable = false)
	private Check diferimento = Check.NÃO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSUSPCOMEN", nullable = false)
	private Check suspenso = Check.NÃO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CISENCOMEN", nullable = false)
	private Check isento = Check.NÃO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CBCRZCOMEN", nullable = false)
	private Check baseCalculoReduzida = Check.NÃO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CCIPICOMEN", nullable = false)
	private Check ipi = Check.NÃO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CFISCCOMEN", nullable = false)
	private Check fiscal = Check.SIM;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSTATCOMEN", nullable = false)
	private Status status = Status.ATIVO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao1() {
		return descricao1;
	}

	public void setDescricao1(String descricao1) {
		this.descricao1 = descricao1;
	}

	public String getDescricao2() {
		return descricao2;
	}

	public void setDescricao2(String descricao2) {
		this.descricao2 = descricao2;
	}

	public Check getDiferimento() {
		return diferimento;
	}

	public void setDiferimento(Check diferimento) {
		this.diferimento = diferimento;
	}

	public Check getSuspenso() {
		return suspenso;
	}

	public void setSuspenso(Check suspenso) {
		this.suspenso = suspenso;
	}

	public Check getIsento() {
		return isento;
	}

	public void setIsento(Check isento) {
		this.isento = isento;
	}

	public Check getBaseCalculoReduzida() {
		return baseCalculoReduzida;
	}

	public void setBaseCalculoReduzida(Check baseCalculoReduzida) {
		this.baseCalculoReduzida = baseCalculoReduzida;
	}

	public Check getIpi() {
		return ipi;
	}

	public void setIpi(Check ipi) {
		this.ipi = ipi;
	}

	public Check getFiscal() {
		return fiscal;
	}

	public void setFiscal(Check fiscal) {
		this.fiscal = fiscal;
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
		ComentarioFiscal other = (ComentarioFiscal) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
