package com.evolution.repository.livro.filter;

public class CodigoCESTFilter {

	private Long id;
	private String codigo;
	private String codigoNCM;

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

	public String getCodigoNCM() {
		return codigoNCM;
	}

	public void setCodigoNCM(String codigoNCM) {
		this.codigoNCM = codigoNCM;
	}

	@Override
	public String toString() {
		return "CodigoCESTFilter [id=" + id + ", codigo=" + codigo + ", codigoNCM=" + codigoNCM + "]";
	}

}
