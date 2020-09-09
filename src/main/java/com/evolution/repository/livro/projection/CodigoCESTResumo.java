package com.evolution.repository.livro.projection;

public class CodigoCESTResumo {

	private Long id;
	private String codigo;
	private String codigoNCM;
	private String descricao;

	public CodigoCESTResumo() {
		super();
	}

	public CodigoCESTResumo(Long id, String codigo, String codigoNCM, String descricao) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.codigoNCM = codigoNCM;
		this.descricao = descricao;
	}

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "CodigoCESTResumo [id=" + id + ", codigo=" + codigo + ", codigoNCM=" + codigoNCM + ", descricao="
				+ descricao + "]";
	}

}
