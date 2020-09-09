package com.evolution.repository.adm.projection;

import com.evolution.model.adm.enumerador.Status;

public class ProdutoResumo {

	private Long id;
	private Long categoria;
	private String descricaoCategoria;
	private Long subCategoria;
	private String descricaoSubCategoria;
	private String codigo;
	private String descricao;
	private String siglaUnidade;
	private String codigoBarra;
	private String foto;
	private Status status;

	public ProdutoResumo() {
		super();
	}

	public ProdutoResumo(Long id, Long categoria, String descricaoCategoria, Long subCategoria,
			String descricaoSubCategoria, String codigo, String descricao, String siglaUnidade, String codigoBarra,
			String foto, Status status) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.descricaoCategoria = descricaoCategoria;
		this.subCategoria = subCategoria;
		this.descricaoSubCategoria = descricaoSubCategoria;
		this.codigo = codigo;
		this.descricao = descricao;
		this.siglaUnidade = siglaUnidade;
		this.codigoBarra = codigoBarra;
		this.foto = foto;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCategoria() {
		return categoria;
	}

	public void setCategoria(Long categoria) {
		this.categoria = categoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	public Long getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(Long subCategoria) {
		this.subCategoria = subCategoria;
	}

	public String getDescricaoSubCategoria() {
		return descricaoSubCategoria;
	}

	public void setDescricaoSubCategoria(String descricaoSubCategoria) {
		this.descricaoSubCategoria = descricaoSubCategoria;
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

	public String getSiglaUnidade() {
		return siglaUnidade;
	}

	public void setSiglaUnidade(String siglaUnidade) {
		this.siglaUnidade = siglaUnidade;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProdutoResumo [id=" + id + ", categoria=" + categoria + ", descricaoCategoria=" + descricaoCategoria
				+ ", subCategoria=" + subCategoria + ", descricaoSubCategoria=" + descricaoSubCategoria + ", codigo="
				+ codigo + ", descricao=" + descricao + ", siglaUnidade=" + siglaUnidade + ", codigoBarra="
				+ codigoBarra + ", foto=" + foto + ", status=" + status + "]";
	}

}
