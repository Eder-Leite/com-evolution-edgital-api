package com.evolution.repository.adm.projection;

import java.math.BigDecimal;
import java.util.Date;

import com.evolution.model.adm.enumerador.SituacaoPedido;

public class PedidoResumo {

	private Long id;
	private Long empresa;
	private Long filial;
	private Date data;
	private String cliente;
	private BigDecimal totalPedido;
	private SituacaoPedido situacao;

	public PedidoResumo() {
		super();
	}

	public PedidoResumo(Long id, Long empresa, Long filial, Date data, String cliente, BigDecimal totalPedido,
			SituacaoPedido situacao) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.filial = filial;
		this.data = data;
		this.cliente = cliente;
		this.totalPedido = totalPedido;
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

	public BigDecimal getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(BigDecimal totalPedido) {
		this.totalPedido = totalPedido;
	}

	public SituacaoPedido getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoPedido situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "PedidoResumo [id=" + id + ", empresa=" + empresa + ", filial=" + filial + ", data=" + data
				+ ", cliente=" + cliente + ", totalPedido=" + totalPedido + ", situacao=" + situacao + "]";
	}

}
