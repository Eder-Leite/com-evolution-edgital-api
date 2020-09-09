package com.evolution.model.cadastro.enumerador;

public enum TipoRodo {
	
	UM("01", "Truck"),
	DOIS("02","Toco"),
	TRÊS("03","Cavalo Mecânico"),
	QUATRO("04","Van"),
	CINCO("05","Utilitários"),
	SEIS("06","Outros");
	
	private String codigo;
	private String descricao;

	private TipoRodo(String codigo, String descricao) {
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

