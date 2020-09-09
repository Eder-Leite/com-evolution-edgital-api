package com.evolution.model.livro.enumerador;

public enum IndicadorDeIE {

	UM("1", "Contribuinte ICMS (informar a IE do destinatário)"),
	DOIS("2","Contribuinte isento de Inscrição no cadastro de Contribuintes do ICMS"),
	NOVE("9","Não Contribuinte, que pode ou não possuir Inscrição Estadual no Cadastro de Contribuintes do ICMS");

	private String codigo;
	private String descricao;

	private IndicadorDeIE(String codigo, String descricao) {
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
