package com.evolution.repository.livro.filter;

import com.evolution.model.livro.enumerador.TipoMovimento;

public class CodigoCFOPFilter {

	private Long id;
	private String codigo;
	private TipoMovimento tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public TipoMovimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimento tipo) {
		this.tipo = tipo;
	}

}
