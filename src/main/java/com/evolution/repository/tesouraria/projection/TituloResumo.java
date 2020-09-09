package com.evolution.repository.tesouraria.projection;

import java.math.BigDecimal;
import java.util.Date;

public class TituloResumo {

	private Long id;
	private Long empresa;
	private String cliente;
	private Long parcela;
	private String documento;
	private BigDecimal valor;
	private Date emissao;
	private Date vencimento;
	private Date liquidacao;

	public TituloResumo() {
		super();
	}

	public TituloResumo(Long id, Long empresa, String cliente, Long parcela, String documento, BigDecimal valor,
			Date emissao, Date vencimento, Date liquidacao) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.cliente = cliente;
		this.parcela = parcela;
		this.documento = documento;
		this.valor = valor;
		this.emissao = emissao;
		this.vencimento = vencimento;
		this.liquidacao = liquidacao;
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

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Long getParcela() {
		return parcela;
	}

	public void setParcela(Long parcela) {
		this.parcela = parcela;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getEmissao() {
		return emissao;
	}

	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Date getLiquidacao() {
		return liquidacao;
	}

	public void setLiquidacao(Date liquidacao) {
		this.liquidacao = liquidacao;
	}

	@Override
	public String toString() {
		return "TituloResumo [id=" + id + ", empresa=" + empresa + ", cliente=" + cliente + ", parcela=" + parcela
				+ ", documento=" + documento + ", valor=" + valor + ", emissao=" + emissao + ", vencimento="
				+ vencimento + ", liquidacao=" + liquidacao + "]";
	}
}
