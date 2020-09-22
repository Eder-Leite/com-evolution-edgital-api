package com.evolution.repository.livro.projection;

import com.evolution.model.livro.enumerador.Status;

public class AliquotaUFResumo {

	private Long id;
	private String regiao;
	private String estado;
	private String finalidade;
	private String CFOP;
	private String categoria;
	private String subCategoria;
	private String produto;
	private Status status;

	public AliquotaUFResumo() {
		super();
	}

	public AliquotaUFResumo(Long id, String regiao, String estado, String finalidade, String CFOP, String categoria,
			String subCategoria, String produto, Status status) {
		super();
		this.id = id;
		this.regiao = regiao;
		this.estado = estado;
		this.finalidade = finalidade;
		this.CFOP = CFOP;
		this.categoria = categoria;
		this.subCategoria = subCategoria;
		this.produto = produto;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getCFOP() {
		return CFOP;
	}

	public void setCFOP(String CFOP) {
		this.CFOP = CFOP;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
