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

import com.evolution.model.adm.OperacaoEstoque;
import com.evolution.model.cadastro.Empresa;
import com.evolution.model.livro.enumerador.Status;

@Entity
@Table(name = "LIVFINAL")
@SuppressWarnings("deprecation")
public class Finalidade {

	@Id
	@Column(name = "NCODIFINAL", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVFINAL")
	@SequenceGenerator(sequenceName = "LIV_SLIVFINAL", allocationSize = 1, name = "LIV_SLIVFINAL")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVFINAL_CADEMPRE")
	@JoinColumn(name = "NCODIEMPRE", nullable = false)
	private Empresa empresa;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVFINAL_ADMOPERA")
	@JoinColumn(name = "NCODIOPERA", nullable = false)
	private OperacaoEstoque operacaoEstoque;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCFINAL", nullable = false, length = 255)
	private String descricao;

	@NotNull(message = "é obrigatório")
	@Column(name = "NINDPFINAL", nullable = false)
	private String indicadorPresenca;

	@NotNull(message = "é obrigatório")
	@Column(name = "NFNFEFINAL", nullable = false)
	private String finalidadeEmissao;

	@NotNull(message = "é obrigatório")
	@Column(name = "NFRETFINAL", nullable = false)
	private String modalidadeFrete;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSTATFINAL", nullable = false, length = 15)
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

	public OperacaoEstoque getOperacaoEstoque() {
		return operacaoEstoque;
	}

	public void setOperacaoEstoque(OperacaoEstoque operacaoEstoque) {
		this.operacaoEstoque = operacaoEstoque;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIndicadorPresenca() {
		return indicadorPresenca;
	}

	public void setIndicadorPresenca(String indicadorPresenca) {
		this.indicadorPresenca = indicadorPresenca;
	}

	public String getFinalidadeEmissao() {
		return finalidadeEmissao;
	}

	public void setFinalidadeEmissao(String finalidadeEmissao) {
		this.finalidadeEmissao = finalidadeEmissao;
	}

	public String getModalidadeFrete() {
		return modalidadeFrete;
	}

	public void setModalidadeFrete(String modalidadeFrete) {
		this.modalidadeFrete = modalidadeFrete;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Finalidade other = (Finalidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
