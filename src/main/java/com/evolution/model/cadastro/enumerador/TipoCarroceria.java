package com.evolution.model.cadastro.enumerador;

public enum TipoCarroceria {

	ZERO("00", "Não aplicável"),
	UM("01","Aberta"),
	DOIS("02","Fechada/Baú"),
	TRÊS("03","Granelera"),
	QUATRO("04","Porta Container"),
	CINCO("05","Sider");
	
	private final String codigo;
	private final String descricao;

	private TipoCarroceria(String codigo, String descricao) {
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
