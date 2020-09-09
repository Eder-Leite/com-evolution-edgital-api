package com.evolution.model.livro.enumerador;

public enum IndicadorConsumidor {

	ZERO("0", "Normal"),
	UM("1","Consumidor final");

	private String codigo;
	private String descricao;

	private IndicadorConsumidor(String codigo, String descricao) {
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
