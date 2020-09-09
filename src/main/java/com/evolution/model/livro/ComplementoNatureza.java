package com.evolution.model.livro;

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

import com.evolution.model.cadastro.Empresa;
import com.evolution.model.livro.enumerador.MovimentoFinanceiro;
import com.evolution.model.livro.enumerador.Status;
import com.evolution.model.livro.enumerador.TipoVenda;

@Entity
@Table(name = "LIVCOMPN")
@SuppressWarnings("deprecation")
public class ComplementoNatureza {

	@Id
	@Column(name = "NCODICOMPN", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVCOMPN")
	@SequenceGenerator(sequenceName = "LIV_SLIVCOMPN", allocationSize = 1, name = "LIV_SLIVCOMPN")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVCOMPN_CADEMPRE")
	@JoinColumn(name = "NCODIEMPRE", nullable = false)
	private Empresa empresa;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVCOMPN_LIV_CFOP")
	@JoinColumn(name = "NCODI_CFOP", nullable = false)
	private CodigoCFOP codigoCFOP;

	@NotNull(message = "é obrigatório")
	@Column(name = "NNUMECOMPN", nullable = false)
	private Long numero;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCCOMPN", nullable = false, length = 255)
	private String descricao;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CMOVFCOMPN", nullable = false, length = 10)
	private MovimentoFinanceiro movimentoFinanceiro = MovimentoFinanceiro.SIM;

	@Enumerated(EnumType.STRING)
	@Column(name = "CPRVICOMPN", length = 15)
	private TipoVenda prazoVista;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSTATCOMPN", nullable = false, length = 15)
	private Status status = Status.ATIVO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public CodigoCFOP getCodigoCFOP() {
		return codigoCFOP;
	}

	public void setCodigoCFOP(CodigoCFOP codigoCFOP) {
		this.codigoCFOP = codigoCFOP;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public MovimentoFinanceiro getMovimentoFinanceiro() {
		return movimentoFinanceiro;
	}

	public void setMovimentoFinanceiro(MovimentoFinanceiro movimentoFinanceiro) {
		this.movimentoFinanceiro = movimentoFinanceiro;
	}

	public TipoVenda getPrazoVista() {
		return prazoVista;
	}

	public void setPrazoVista(TipoVenda prazoVista) {
		this.prazoVista = prazoVista;
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
		ComplementoNatureza other = (ComplementoNatureza) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
