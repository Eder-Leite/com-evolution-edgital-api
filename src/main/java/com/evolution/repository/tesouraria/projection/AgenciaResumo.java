package com.evolution.repository.tesouraria.projection;

import com.evolution.model.tesouraria.enumerador.Status;

public class AgenciaResumo {

	private Long id;
	private Long banco;
	private String nomeBanco;
	private String codigo;
	private String descricao;
	private Status status;

	public AgenciaResumo() {
		super();
	}

	public AgenciaResumo(Long id, Long banco, String nomeBanco, String codigo, String descricao, Status status) {
		super();
		this.id = id;
		this.banco = banco;
		this.nomeBanco = nomeBanco;
		this.codigo = codigo;
		this.descricao = descricao;
		this.status = status;
	}

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

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
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
		return "AgenciaResumo [id=" + id + ", banco=" + banco + ", nomeBanco=" + nomeBanco + ", codigo=" + codigo
				+ ", descricao=" + descricao + ", status=" + status + "]";
	}

}
