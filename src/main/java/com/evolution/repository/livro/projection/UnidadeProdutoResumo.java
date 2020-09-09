package com.evolution.repository.livro.projection;

public class UnidadeProdutoResumo {

	private Long id;
	private String descricao;
	private String sigla;

	public UnidadeProdutoResumo() {
		super();
	}

	public UnidadeProdutoResumo(Long id, String descricao, String sigla) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.sigla = sigla;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return "UnidadeProdutoResumo [id=" + id + ", descricao=" + descricao + ", sigla=" + sigla + "]";
	}

}
