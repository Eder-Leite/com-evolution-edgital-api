package com.evolution.repository.livro.filter;

import com.evolution.model.livro.enumerador.Status;

public class ComentarioFiscalFilter {

	private Long id;
	private String descricao1;
	private String descricao2;
	private Status status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao1() {
		return descricao1;
	}

	public void setDescricao1(String descricao1) {
		this.descricao1 = descricao1;
	}

	public String getDescricao2() {
		return descricao2;
	}

	public void setDescricao2(String descricao2) {
		this.descricao2 = descricao2;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ComentarioFiscalFilter [id=" + id + ", descricao1=" + descricao1 + ", descricao2=" + descricao2
				+ ", status=" + status + "]";
	}

}
