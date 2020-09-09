package com.evolution.repository.tesouraria.projection;

import java.math.BigDecimal;
import java.util.Date;

import com.evolution.model.tesouraria.enumerador.SituacaoBaixa;

public class BaixaResumo {

	private Long id;
	private Long empresa;
	private Long filial;
	private Date data;
	private String cliente;
	private BigDecimal valorDebitos;
	private BigDecimal valorCreditos;
	private BigDecimal totalBaixa;
	private SituacaoBaixa situacao;

	public BaixaResumo() {
		super();
	}

	public BaixaResumo(Long id, Long empresa, Long filial, Date data, String cliente, BigDecimal valorDebitos,
			BigDecimal valorCreditos, BigDecimal totalBaixa, SituacaoBaixa situacao) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.filial = filial;
		this.data = data;
		this.cliente = cliente;
		this.valorDebitos = valorDebitos;
		this.valorCreditos = valorCreditos;
		this.totalBaixa = totalBaixa;
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getValorDebitos() {
		return valorDebitos;
	}

	public void setValorDebitos(BigDecimal valorDebitos) {
		this.valorDebitos = valorDebitos;
	}

	public BigDecimal getValorCreditos() {
		return valorCreditos;
	}

	public void setValorCreditos(BigDecimal valorCreditos) {
		this.valorCreditos = valorCreditos;
	}

	public BigDecimal getTotalBaixa() {
		return totalBaixa;
	}

	public void setTotalBaixa(BigDecimal totalBaixa) {
		this.totalBaixa = totalBaixa;
	}

	public SituacaoBaixa getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoBaixa situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "BaixaResumo [id=" + id + ", empresa=" + empresa + ", filial=" + filial + ", data=" + data + ", cliente="
				+ cliente + ", valorDebitos=" + valorDebitos + ", valorCreditos=" + valorCreditos + ", totalBaixa="
				+ totalBaixa + ", situacao=" + situacao + "]";
	}

}
