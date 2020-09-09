package com.evolution.model.cadastro;

import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.NotBlank;

import com.evolution.model.cadastro.enumerador.Status;
import com.evolution.model.cadastro.enumerador.TipoEndereco;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CADENDER")
@SuppressWarnings("deprecation")
public class Endereco {

	@Id
	@Column(name = "NCODIENDER", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAD_SCADENDER")
	@SequenceGenerator(sequenceName = "CAD_SCADENDER", allocationSize = 1, name = "CAD_SCADENDER")
	private Long id;

	@ManyToOne
	@JsonBackReference
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_CADENDER_CADGERAL")
	@JoinColumn(name = "NCODIGERAL", nullable = false)
	private Cadastro cadastro;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_CADENDER_CADCIDAD")
	@JoinColumn(name = "NCODICIDAD", nullable = false)
	private Cidade cidade;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCENDER", nullable = false, length = 255)
	private String descricao;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CNCEPENDER", nullable = false, length = 10)
	private String cep;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CLOGRENDER", nullable = false, length = 255)
	private String logradouro;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CBAIRENDER", nullable = false, length = 255)
	private String bairro;

	@Column(name = "CCOMPENDER", length = 255)
	private String complemento;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CNUMEENDER", nullable = false, length = 20)
	private String numero;

	@Column(name = "CCNPJENDER", length = 18)
	private String cnpj;

	@Column(name = "CINSEENDER", length = 20)
	private String inscricaoEstadual;

	@Column(name = "CIDIEENDER", length = 1)
	private String indicadorIE;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CTIPOENDER", nullable = false, length = 15)
	private TipoEndereco tipo = TipoEndereco.PRINCIPAL;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DDATAENDER")
	private Date dataCadastro = new Date();

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSTATENDER", nullable = false, length = 15)
	private Status status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getIndicadorIE() {
		return indicadorIE;
	}

	@JsonIgnore
	public void setIndicadorIE(String indicadorIE) {
		this.indicadorIE = indicadorIE;
	}

	public TipoEndereco getTipo() {
		return tipo;
	}

	public void setTipo(TipoEndereco tipo) {
		this.tipo = tipo;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	@JsonIgnore
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
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
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
