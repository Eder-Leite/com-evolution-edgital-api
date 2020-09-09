package com.evolution.repository.adm.filter;

import java.util.Date;

import com.evolution.model.adm.enumerador.SituacaoPedido;

public class PedidoFilter {

	private Long id;
	private Long empresa;
	private Long filial;
	private Date dataDe;
	private Date dataAte;
	private String cliente;
	private SituacaoPedido situacao;

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

	public Date getDataDe() {
		return dataDe;
	}

	public void setDataDe(Date dataDe) {
		this.dataDe = dataDe;
	}

	public Date getDataAte() {
		return dataAte;
	}

	public void setDataAte(Date dataAte) {
		this.dataAte = dataAte;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public SituacaoPedido getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoPedido situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "PedidoFilter [id=" + id + ", empresa=" + empresa + ", filial=" + filial + ", dataDe=" + dataDe
				+ ", dataAte=" + dataAte + ", cliente=" + cliente + ", situacao=" + situacao + "]";
	}
}
