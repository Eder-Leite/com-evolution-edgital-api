package com.evolution.repository.tesouraria.projection;

import java.math.BigDecimal;
import java.util.Date;

import com.evolution.model.tesouraria.enumerador.Check;
import com.evolution.model.tesouraria.enumerador.TipoMovimento;

public class MovimentoResumo {

	private Long id;
	private Long empresa;
	private Long filial;
	private String historico;
	private Date data;
	private String banco;
	private String agencia;
	private String conta;
	private String documento;
	private String descricao;
	private BigDecimal valor;
	private Check conciliado;
	private TipoMovimento tipoMovimento;

	public MovimentoResumo() {
		super();
	}

	public MovimentoResumo(Long id, Long empresa, Long filial, String historico, Date data, String banco,
			String agencia, String conta, String documento, String descricao, BigDecimal valor, Check conciliado,
			TipoMovimento tipoMovimento) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.filial = filial;
		this.historico = historico;
		this.data = data;
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		this.documento = documento;
		this.descricao = descricao;
		this.valor = valor;
		this.conciliado = conciliado;
		this.tipoMovimento = tipoMovimento;
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

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Check getConciliado() {
		return conciliado;
	}

	public void setConciliado(Check conciliado) {
		this.conciliado = conciliado;
	}

	public TipoMovimento getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(TipoMovimento tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	@Override
	public String toString() {
		return "MovimentoResumo [id=" + id + ", empresa=" + empresa + ", filial=" + filial + ", historico=" + historico
				+ ", data=" + data + ", banco=" + banco + ", agencia=" + agencia + ", conta=" + conta + ", documento="
				+ documento + ", descricao=" + descricao + ", valor=" + valor + ", conciliado=" + conciliado
				+ ", tipoMovimento=" + tipoMovimento + "]";
	}
}
