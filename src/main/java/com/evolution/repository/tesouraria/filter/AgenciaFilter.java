package com.evolution.repository.tesouraria.filter;

import com.evolution.model.tesouraria.enumerador.Status;

public class AgenciaFilter {

	private Long id;
	private Long banco;
	private String codigo;
	private String descricao;
	private Status status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBanco() {
		return banco;
	}

	public void setBanco(Long banco) {
		this.banco = banco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AgenciaFilter [id=" + id + ", banco=" + banco + ", codigo=" + codigo + ", descricao=" + descricao
				+ ", status=" + status + "]";
	}

}
