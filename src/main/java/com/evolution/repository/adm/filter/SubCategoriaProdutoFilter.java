package com.evolution.repository.adm.filter;

public class SubCategoriaProdutoFilter {

	private Long id;
	private Long empresa;
	private Long categoria;
	private String codigoCategoria;
	private String codigo;
	private String descricao;

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

	public String getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(String codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
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

	@Override
	public String toString() {
		return "SubCategoriaProdutoFilter [id=" + id + ", categoria=" + categoria + ", codigoCategoria="
				+ codigoCategoria + ", codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
