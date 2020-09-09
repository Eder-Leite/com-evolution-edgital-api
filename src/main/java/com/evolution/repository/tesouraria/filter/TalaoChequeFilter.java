package com.evolution.repository.tesouraria.filter;

import com.evolution.model.tesouraria.enumerador.Status;

public class TalaoChequeFilter {

	private Long id;
	private Long conta;
	private Long empresa;
	private Long filial;
	private Status status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getConta() {
		return conta;
	}

	public void setConta(Long conta) {
		this.conta = conta;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TalaoChequeFilter [id=" + id + ", conta=" + conta + ", empresa=" + empresa + ", filial=" + filial
				+ ", status=" + status + "]";
	}

}
