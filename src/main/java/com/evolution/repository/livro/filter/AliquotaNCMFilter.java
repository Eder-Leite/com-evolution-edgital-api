package com.evolution.repository.livro.filter;

public class AliquotaNCMFilter {

	private Long id;
	private String codigo;

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

	@Override
	public String toString() {
		return "AliquotaNCMFilter [id=" + id + ", codigo=" + codigo + "]";
	}

}
