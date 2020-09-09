package com.evolution.model.livro.enumerador;

public enum ModalidadeFrete {
	
	ZERO("0", "Contratação do Frete por conta do Remetente (CIF)"),
	UM("1", "Contratação do Frete por conta do Destinatário (FOB)"),
	DOIS("2","Contratação do Frete por conta de Terceiros"),
	TRÊS("3","Transporte Próprio por conta do Remetente"),
	QUATRO("4","Transporte Próprio por conta do Destinatário"),
	NOVE("9","Sem Ocorrência de Transporte");

	private String codigo;
	private String descricao;

	private ModalidadeFrete(String codigo, String descricao) {
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
