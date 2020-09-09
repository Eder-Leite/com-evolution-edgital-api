package com.evolution.repository.tesouraria.projection;

import java.math.BigDecimal;
import java.util.Date;

import com.evolution.model.tesouraria.enumerador.SituacaoLancamento;
import com.evolution.model.tesouraria.enumerador.TipoLancamento;

public class LancamentoManualResumo {

	private Long id;
	private Long empresa;
	private Long filial;
	private TipoLancamento tipoLancamento;
	private Date data;
	private String documento;
	private String cliente;
	private BigDecimal total;
	private SituacaoLancamento situacao;

	public LancamentoManualResumo() {
		super();
	}

	public LancamentoManualResumo(Long id, Long empresa, Long filial, TipoLancamento tipoLancamento, Date data,
			String documento, String cliente, BigDecimal total, SituacaoLancamento situacao) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.filial = filial;
		this.tipoLancamento = tipoLancamento;
		this.data = data;
		this.documento = documento;
		this.cliente = cliente;
		this.total = total;
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

	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public SituacaoLancamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoLancamento situacao) {
		this.situacao = situacao;
	}
}
