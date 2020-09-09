package com.evolution.repository.tesouraria.filter;

import java.util.Date;

public class TituloFilter {

	private Long id;
	private Long empresa;
	private String documento;
	private Date dataDe;
	private Date dataAte;
	private String cliente;

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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
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

	@Override
	public String toString() {
		return "TituloFilter [id=" + id + ", empresa=" + empresa + ", documento=" + documento + ", dataDe=" + dataDe
				+ ", dataAte=" + dataAte + ", cliente=" + cliente + "]";
	}
}
