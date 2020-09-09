package com.evolution.repository.adm.projection;

public class SubCategoriaProdutoResumo {

	private Long id;
	private Long categoria;
	private String descricaoCategoria;
	private String codigoCategoria;
	private String codigo;
	private String descricao;

	public SubCategoriaProdutoResumo() {
		super();
	}

	public SubCategoriaProdutoResumo(Long id, Long categoria, String descricaoCategoria, String codigoCategoria,
			String codigo, String descricao) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.descricaoCategoria = descricaoCategoria;
		this.codigoCategoria = codigoCategoria;
		this.codigo = codigo;
		this.descricao = descricao;
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
		return "SubCategoriaProdutoResumo [id=" + id + ", categoria=" + categoria + ", descricaoCategoria="
				+ descricaoCategoria + ", codigoCategoria=" + codigoCategoria + ", codigo=" + codigo + ", descricao="
				+ descricao + "]";
	}

}
