package com.evolution.model.cadastro;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.NotBlank;

import com.evolution.model.cadastro.enumerador.Status;
import com.evolution.model.cadastro.enumerador.TipoCadastro;
import com.evolution.model.cadastro.enumerador.TipoPessoa;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "CADGERAL")
@SuppressWarnings("deprecation")
public class Cadastro {

	@Id
	@Column(name = "NCODIGERAL", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAD_SCADGERAL")
	@SequenceGenerator(sequenceName = "CAD_SCADGERAL", allocationSize = 1, name = "CAD_SCADGERAL")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_CADGERAL_CADEMPRE")
	@JoinColumn(name = "NCODIEMPRE", nullable = false)
	private Empresa empresa;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CTIPOGERAL", nullable = false, length = 50)
	private TipoCadastro tipo = TipoCadastro.CLIENTE;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CTPPEGERAL", nullable = false, length = 15)
	private TipoPessoa tipoPessoa = TipoPessoa.FÍSICA;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CNMRZGERAL", nullable = false, length = 255)
	private String nomeRazao;

	@Column(name = "CNMFAGERAL", length = 255)
	private String nomeFantasia;

	@Column(name = "CNUCCGERAL", nullable = false, length = 18)
	private String cnpjCpf;

	@Column(name = "CIERGGERAL", length = 18)
	private String inscricaoEstadualRG;

	@Column(name = "CTEL1GERAL", length = 14)
	private String telefone01;

	@Column(name = "CTEL2GERAL", length = 14)
	private String telefone02;

	@Column(name = "CCEL1GERAL", length = 14)
	private String celular01;

	@Column(name = "CCEL2GERAL", length = 14)
	private String celular02;

	@Column(name = "CEMAIGERAL", length = 4000)
	private String email;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CEXMLGERAL", nullable = false, length = 4000)
	private String emailXml;

	@Column(name = "CFOTOGERAL")
	private String foto;

	@Column(name = "CIDIEGERAL", nullable = false, length = 1)
	private String indicadorIE;

	@NotNull(message = "é obrigatório")
	@Column(name = "NLIMCGERAL", nullable = false, precision = 19, scale = 2)
	private BigDecimal limite = BigDecimal.ZERO;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DDATAGERAL")
	private Date dataCadastro = new Date();

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSTATGERAL", nullable = false, length = 15)
	private Status status;

	@JsonManagedReference
	@OneToMany(mappedBy = "cadastro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Endereco> enderecos = new ArrayList<>();

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

	public TipoCadastro getTipo() {
		return tipo;
	}

	public void setTipo(TipoCadastro tipo) {
		this.tipo = tipo;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getNomeRazao() {
		return nomeRazao;
	}

	public void setNomeRazao(String nomeRazao) {
		this.nomeRazao = nomeRazao;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public String getInscricaoEstadualRG() {
		return inscricaoEstadualRG;
	}

	public void setInscricaoEstadualRG(String inscricaoEstadualRG) {
		this.inscricaoEstadualRG = inscricaoEstadualRG;
	}

	public String getTelefone01() {
		return telefone01;
	}

	public void setTelefone01(String telefone01) {
		this.telefone01 = telefone01;
	}

	public String getTelefone02() {
		return telefone02;
	}

	public void setTelefone02(String telefone02) {
		this.telefone02 = telefone02;
	}

	public String getCelular01() {
		return celular01;
	}

	public void setCelular01(String celular01) {
		this.celular01 = celular01;
	}

	public String getCelular02() {
		return celular02;
	}

	public void setCelular02(String celular02) {
		this.celular02 = celular02;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailXml() {
		return emailXml;
	}

	public void setEmailXml(String emailXml) {
		this.emailXml = emailXml;
	}

	public String getFoto() {
		return foto;
	}

	@JsonIgnore
	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getIndicadorIE() {
		return indicadorIE;
	}

	@JsonIgnore
	public void setIndicadorIE(String indicadorIE) {
		this.indicadorIE = indicadorIE;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	@JsonIgnore
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public BigDecimal getLimite() {
		return limite;
	}

	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
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
		Cadastro other = (Cadastro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
