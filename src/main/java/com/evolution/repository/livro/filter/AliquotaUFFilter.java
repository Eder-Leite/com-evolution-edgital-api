package com.evolution.repository.livro.filter;

import com.evolution.model.livro.enumerador.Status;

public class AliquotaUFFilter {

	private Long id;
	private Long empresa;
	private Long finalidade;
	private Long CFOP;
	private Long categoria;
	private Long subCategoria;
	private String codigoProduto;
	private Status status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Long empresa) {
		this.empresa = empresa;
	}

	public Long getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(Long finalidade) {
		this.finalidade = finalidade;
	}

	public Long getCFOP() {
		return CFOP;
	}

	public void setCFOP(Long cFOP) {
		CFOP = cFOP;
	}

	public Long getCategoria() {
		return categoria;
	}

	public void setCategoria(Long categoria) {
		this.categoria = categoria;
	}

	public Long getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(Long subCategoria) {
		this.subCategoria = subCategoria;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AliquotaUFilter [id=" + id + ", empresa=" + empresa + ", finalidade=" + finalidade + ", CFOP=" + CFOP
				+ ", categoria=" + categoria + ", subCategoria=" + subCategoria + ", codigoProduto=" + codigoProduto
				+ ", status=" + status + "]";
	}

}
