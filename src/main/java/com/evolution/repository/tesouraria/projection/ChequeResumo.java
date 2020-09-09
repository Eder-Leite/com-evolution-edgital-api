package com.evolution.repository.tesouraria.projection;

import java.math.BigDecimal;
import java.util.Date;

import com.evolution.model.tesouraria.enumerador.SituacaoCheque;

public class ChequeResumo {

	private Long id;
	private Long empresa;
	private Long filial;
	private Long talao;
	private Long banco;
	private String codigoBanco;
	private Long agencia;
	private String codigoAgencia;
	private Long conta;
	private String numeroConta;
	private String digitoConta;
	private String descricaoConta;
	private Long numero;
	private BigDecimal valor;
	private String nominal;
	private Date dataEmissao;
	private Date dataMovimento;
	private SituacaoCheque situacao;

	public ChequeResumo() {
		super();
	}

	public ChequeResumo(Long id, Long empresa, Long filial, Long talao, Long banco, String codigoBanco, Long agencia,
			String codigoAgencia, Long conta, String numeroConta, String digitoConta, String descricaoConta,
			Long numero, BigDecimal valor, String nominal, Date dataEmissao, Date dataMovimento,
			SituacaoCheque situacao) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.filial = filial;
		this.talao = talao;
		this.banco = banco;
		this.codigoBanco = codigoBanco;
		this.agencia = agencia;
		this.codigoAgencia = codigoAgencia;
		this.conta = conta;
		this.numeroConta = numeroConta;
		this.digitoConta = digitoConta;
		this.descricaoConta = descricaoConta;
		this.numero = numero;
		this.valor = valor;
		this.nominal = nominal;
		this.dataEmissao = dataEmissao;
		this.dataMovimento = dataMovimento;
		this.situacao = situacao;
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

	public Long getTalao() {
		return talao;
	}

	public void setTalao(Long talao) {
		this.talao = talao;
	}

	public Long getBanco() {
		return banco;
	}

	public void setBanco(Long banco) {
		this.banco = banco;
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

	public Long getConta() {
		return conta;
	}

	public void setConta(Long conta) {
		this.conta = conta;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getDigitoConta() {
		return digitoConta;
	}

	public void setDigitoConta(String digitoConta) {
		this.digitoConta = digitoConta;
	}

	public String getDescricaoConta() {
		return descricaoConta;
	}

	public void setDescricaoConta(String descricaoConta) {
		this.descricaoConta = descricaoConta;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getNominal() {
		return nominal;
	}

	public void setNominal(String nominal) {
		this.nominal = nominal;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Date getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	public SituacaoCheque getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoCheque situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "ChequeResumo [id=" + id + ", empresa=" + empresa + ", filial=" + filial + ", talao=" + talao
				+ ", banco=" + banco + ", codigoBanco=" + codigoBanco + ", agencia=" + agencia + ", codigoAgencia="
				+ codigoAgencia + ", conta=" + conta + ", numeroConta=" + numeroConta + ", digitoConta=" + digitoConta
				+ ", descricaoConta=" + descricaoConta + ", numero=" + numero + ", valor=" + valor + ", nominal="
				+ nominal + ", dataEmissao=" + dataEmissao + ", dataMovimento=" + dataMovimento + ", situacao="
				+ situacao + "]";
	}

}
