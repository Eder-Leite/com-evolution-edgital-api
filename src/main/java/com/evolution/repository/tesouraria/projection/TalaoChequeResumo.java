package com.evolution.repository.tesouraria.projection;

import com.evolution.model.tesouraria.enumerador.Status;

public class TalaoChequeResumo {

	private Long id;
	private Long empresa;
	private Long filial;
	private String nomeFilial;
	private Long banco;
	private String nomeBanco;
	private Long agencia;
	private String nomeAgencia;
	private Long conta;
	private String descricaoConta;
	private Status status;

	public TalaoChequeResumo() {
		super();
	}

	public TalaoChequeResumo(Long id, Long empresa, Long filial, String nomeFilial, Long banco, String nomeBanco,
			Long agencia, String nomeAgencia, Long conta, String descricaoConta, Status status) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.filial = filial;
		this.nomeFilial = nomeFilial;
		this.banco = banco;
		this.nomeBanco = nomeBanco;
		this.agencia = agencia;
		this.nomeAgencia = nomeAgencia;
		this.conta = conta;
		this.descricaoConta = descricaoConta;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Long empresa) {
		this.empresa = empresa;
	}

	public Long getFilial() {
		return filial;
	}

	public void setFilial(Long filial) {
		this.filial = filial;
	}

	public String getNomeFilial() {
		return nomeFilial;
	}

	public void setNomeFilial(String nomeFilial) {
		this.nomeFilial = nomeFilial;
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

	public Long getAgencia() {
		return agencia;
	}

	public void setAgencia(Long agencia) {
		this.agencia = agencia;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public Long getConta() {
		return conta;
	}

	public void setConta(Long conta) {
		this.conta = conta;
	}

	public String getDescricaoConta() {
		return descricaoConta;
	}

	public void setDescricaoConta(String descricaoConta) {
		this.descricaoConta = descricaoConta;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TalaoChequeResumo [id=" + id + ", empresa=" + empresa + ", filial=" + filial + ", nomeFilial="
				+ nomeFilial + ", banco=" + banco + ", nomeBanco=" + nomeBanco + ", agencia=" + agencia
				+ ", nomeAgencia=" + nomeAgencia + ", conta=" + conta + ", descricaoConta=" + descricaoConta
				+ ", status=" + status + "]";
	}

}
