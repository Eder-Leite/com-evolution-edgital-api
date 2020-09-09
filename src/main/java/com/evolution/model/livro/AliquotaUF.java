package com.evolution.model.livro;

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

import com.evolution.model.adm.CategoriaProduto;
import com.evolution.model.adm.Produto;
import com.evolution.model.adm.SubCategoriaProduto;
import com.evolution.model.cadastro.Empresa;
import com.evolution.model.cadastro.Estado;
import com.evolution.model.cadastro.Filial;
import com.evolution.model.cadastro.Regiao;
import com.evolution.model.livro.enumerador.Status;
import com.evolution.model.seguranca.Usuario;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "LIVALIUF")
@SuppressWarnings("deprecation")
public class AliquotaUF {

	@Id
	@Column(name = "NCODIALIUF", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVALIUF")
	@SequenceGenerator(sequenceName = "LIV_SLIVALIUF", allocationSize = 1, name = "LIV_SLIVALIUF")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVALIUF_SEGUSUAR")
	@JoinColumn(name = "NCODIUSUAR", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVALIUF_CADEMPRE")
	@JoinColumn(name = "NCODIEMPRE", nullable = false)
	private Empresa empresa;

	@ManyToOne
	@ForeignKey(name = "FK_LIVALIUF_CADFILIA")
	@JoinColumn(name = "NCODIFILIA", nullable = true)
	private Filial filial;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVALIUF_LIVFINAL")
	@JoinColumn(name = "NCODIFINAL", nullable = false)
	private Finalidade finalidade;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVALIUF_LIV_CFOP")
	@JoinColumn(name = "NCODI_CFOP", nullable = false)
	private CodigoCFOP codigoCFOP;

	@ManyToOne
	@ForeignKey(name = "FK_LIVALIUF_LIVCOMPN")
	@JoinColumn(name = "NCODICOMPN", nullable = true)
	private ComplementoNatureza complementoNatureza;

	@ManyToOne
	@ForeignKey(name = "FK_LIVALIUF_CADREGIA")
	@JoinColumn(name = "NCODIREGIA", nullable = true)
	private Regiao regiao;

	@ManyToOne
	@ForeignKey(name = "FK_LIVALIUF_CADESTAD")
	@JoinColumn(name = "NCODIESTAD", nullable = true)
	private Estado estado;

	@ManyToOne
	@ForeignKey(name = "FK_LIVALIUF_ADMCATEG")
	@JoinColumn(name = "NCODICATEG", nullable = true)
	private CategoriaProduto categoria;

	@ManyToOne
	@ForeignKey(name = "FK_LIVALIUF_ADMSBCAT")
	@JoinColumn(name = "NCODISBCAT", nullable = true)
	private SubCategoriaProduto subCategoriaProduto;

	@ManyToOne
	@ForeignKey(name = "FK_LIVALIU_ADMPRODU")
	@JoinColumn(name = "NCODIPRODU", nullable = true)
	private Produto produto;

	@ManyToOne
	@ForeignKey(name = "FK_LIVALIUF_LIV_CFOP2")
	@JoinColumn(name = "NCFOPALIUF", nullable = true)
	private CodigoCFOP codigoCfopDestino;

	@ManyToOne
	@ForeignKey(name = "FK_LIVALIUF_LIVCOMPN2")
	@JoinColumn(name = "NNUMECOMPN", nullable = true)
	private ComplementoNatureza complementoNaturezaDestino;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVALIUF_LIVICOF")
	@JoinColumn(name = "NNUMESTCOF", nullable = false)
	private CodigoPisCofins codigoCofins;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVALIUF_LIVICOF2")
	@JoinColumn(name = "NNUMESTPIS", nullable = false)
	private CodigoPisCofins codigoPis;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSTATALIUF", nullable = false, length = 15)
	private Status status;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDATAALIUF")
	private Date dataCadastro = new Date();

	@JsonManagedReference
	@OneToMany(mappedBy = "aliquotaUF", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<ItemAliquotaUF> itens = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public Finalidade getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(Finalidade finalidade) {
		this.finalidade = finalidade;
	}

	public CodigoCFOP getCodigoCFOP() {
		return codigoCFOP;
	}

	public void setCodigoCFOP(CodigoCFOP codigoCFOP) {
		this.codigoCFOP = codigoCFOP;
	}

	public ComplementoNatureza getComplementoNatureza() {
		return complementoNatureza;
	}

	public void setComplementoNatureza(ComplementoNatureza complementoNatureza) {
		this.complementoNatureza = complementoNatureza;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public CategoriaProduto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProduto categoria) {
		this.categoria = categoria;
	}

	public SubCategoriaProduto getSubCategoriaProduto() {
		return subCategoriaProduto;
	}

	public void setSubCategoriaProduto(SubCategoriaProduto subCategoriaProduto) {
		this.subCategoriaProduto = subCategoriaProduto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public CodigoCFOP getCodigoCfopDestino() {
		return codigoCfopDestino;
	}

	public void setCodigoCfopDestino(CodigoCFOP codigoCfopDestino) {
		this.codigoCfopDestino = codigoCfopDestino;
	}

	public ComplementoNatureza getComplementoNaturezaDestino() {
		return complementoNaturezaDestino;
	}

	public void setComplementoNaturezaDestino(ComplementoNatureza complementoNaturezaDestino) {
		this.complementoNaturezaDestino = complementoNaturezaDestino;
	}

	public CodigoPisCofins getCodigoCofins() {
		return codigoCofins;
	}

	public void setCodigoCofins(CodigoPisCofins codigoCofins) {
		this.codigoCofins = codigoCofins;
	}

	public CodigoPisCofins getCodigoPis() {
		return codigoPis;
	}

	public void setCodigoPis(CodigoPisCofins codigoPis) {
		this.codigoPis = codigoPis;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<ItemAliquotaUF> getItens() {
		return itens;
	}

	public void setItens(List<ItemAliquotaUF> itens) {
		this.itens = itens;
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
		AliquotaUF other = (AliquotaUF) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AliquotaUF [id=" + id + ", usuario=" + usuario + ", empresa=" + empresa + ", filial=" + filial
				+ ", finalidade=" + finalidade + ", codigoCFOP=" + codigoCFOP + ", complementoNatureza="
				+ complementoNatureza + ", regiao=" + regiao + ", estado=" + estado + ", categoria=" + categoria
				+ ", subCategoriaProduto=" + subCategoriaProduto + ", produto=" + produto + ", codigoCfopDestino="
				+ codigoCfopDestino + ", complementoNaturezaDestino=" + complementoNaturezaDestino + ", codigoCofins="
				+ codigoCofins + ", codigoPis=" + codigoPis + ", status=" + status + ", dataCadastro=" + dataCadastro
				+ ", itens=" + itens + "]";
	}
}
