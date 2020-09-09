package com.evolution.repository.adm.filter;

import com.evolution.model.adm.enumerador.Status;

public class ProdutoFilter {

	private Long id;
	private Long empresa;
	private Long categoria;
	private Long subCategoria;
	private String codigo;
	private String descricao;
	private String codigoBarra;
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

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProdutoFilter [id=" + id + ", empresa=" + empresa + ", categoria=" + categoria + ", subCategoria="
				+ subCategoria + ", codigo=" + codigo + ", descricao=" + descricao + ", codigoBarra=" + codigoBarra
				+ ", status=" + status + "]";
	}
}
