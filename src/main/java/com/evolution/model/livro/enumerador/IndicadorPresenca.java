package com.evolution.model.livro.enumerador;

public enum IndicadorPresenca {
	
	ZERO("0", "Não se aplica (por exemplo, Nota Fiscal complementar ou de ajuste)"),
	UM("1", "Operação presencial"),
	DOIS("2", "Operação não presencial, pela Internet"),
	TRÊS("3", "Operação não presencial, Teleatendimento"),
	QUATRO("4", "NFC-e em operação com entrega a domicílio"),
	NOVE("9", "Operação não presencial, outros");

	private String codigo;
	private String descricao;

	private IndicadorPresenca(String codigo, String descricao) {
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
