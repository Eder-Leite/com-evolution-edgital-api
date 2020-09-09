package com.evolution.model.livro.enumerador;

public enum FinalidadeEmissao {
		
	UM("1", "NF-e normal"),
	DOIS("2","NF-e complementar"),
	TRÊS("3","NF-e de ajuste"),
	QUATRO("4","Devolução de mercadoria");

	private String codigo;
	private String descricao;

	private FinalidadeEmissao(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
