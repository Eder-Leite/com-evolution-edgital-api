package com.evolution.repository.adm.filter;

public class CategoriaProdutoFilter {

	private Long id;
	private Long empresa;
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
		return "CategoriaProdutoFilter [id=" + id + ", empresa=" + empresa + ", codigo=" + codigo + ", descricao="
				+ descricao + "]";
	}

}
