package com.evolution.repository.tesouraria.projection;

import com.evolution.model.tesouraria.enumerador.Status;
import com.evolution.model.tesouraria.enumerador.TipoConta;

public class ContaResumo {

	private Long id;
	private Long banco;
	private String nomeBanco;
	private String codigoBanco;
	private Long agencia;
	private String codigoAgencia;
	private Long empresa;
	private String conta;
	private String digito;
	private String descricao;
	private TipoConta tipo;
	private Status status;

	public ContaResumo() {
		super();
	}

	public ContaResumo(Long id, Long banco, String nomeBanco, String codigoBanco, Long agencia, String codigoAgencia,
			Long empresa, String conta, String digito, String descricao, TipoConta tipo, Status status) {
		super();
		this.id = id;
		this.banco = banco;
		this.nomeBanco = nomeBanco;
		this.codigoBanco = codigoBanco;
		this.agencia = agencia;
		this.codigoAgencia = codigoAgencia;
		this.empresa = empresa;
		this.conta = conta;
		this.digito = digito;
		this.descricao = descricao;
		this.tipo = tipo;
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

	public String getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(String codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public Long getAgencia() {
		return agencia;
	}

	public void setAgencia(Long agencia) {
		this.agencia = agencia;
	}

	public String getCodigoAgencia() {
		return codigoAgencia;
	}

	public void setCodigoAgencia(String codigoAgencia) {
		this.codigoAgencia = codigoAgencia;
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

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
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
		return "ContaResumo [id=" + id + ", banco=" + banco + ", nomeBanco=" + nomeBanco + ", codigoBanco="
				+ codigoBanco + ", agencia=" + agencia + ", codigoAgencia=" + codigoAgencia + ", empresa=" + empresa
				+ ", conta=" + conta + ", digito=" + digito + ", descricao=" + descricao + ", tipo=" + tipo
				+ ", status=" + status + "]";
	}
}
