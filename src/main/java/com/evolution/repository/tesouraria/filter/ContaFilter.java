package com.evolution.repository.tesouraria.filter;

import com.evolution.model.tesouraria.enumerador.Status;
import com.evolution.model.tesouraria.enumerador.TipoConta;

public class ContaFilter {

	private Long id;
	private Long banco;
	private Long agencia;
	private Long empresa;
	private String conta;
	private String descricao;
	private TipoConta tipo;
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

	public Long getAgencia() {
		return agencia;
	}

	public void setAgencia(Long agencia) {
		this.agencia = agencia;
	}

	public Long getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Long empresa) {
		this.empresa = empresa;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ContaFilter [id=" + id + ", banco=" + banco + ", agencia=" + agencia + ", empresa=" + empresa
				+ ", conta=" + conta + ", descricao=" + descricao + ", tipo=" + tipo + ", status=" + status + "]";
	}

}
