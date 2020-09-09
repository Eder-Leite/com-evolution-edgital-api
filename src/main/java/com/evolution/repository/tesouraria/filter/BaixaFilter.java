package com.evolution.repository.tesouraria.filter;

import java.util.Date;

import com.evolution.model.tesouraria.enumerador.SituacaoBaixa;

public class BaixaFilter {

	private Long id;
	private Long empresa;
	private Long filial;
	private String cliente;
	private Date dataDe;
	private Date dataAte;
	private SituacaoBaixa situacao;

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

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
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

	public SituacaoBaixa getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoBaixa situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "BaixaFilter [id=" + id + ", empresa=" + empresa + ", filial=" + filial + ", cliente=" + cliente
				+ ", dataDe=" + dataDe + ", dataAte=" + dataAte + ", situacao=" + situacao + "]";
	}
}
