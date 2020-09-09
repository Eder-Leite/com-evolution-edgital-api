package com.evolution.repository.cadastro.filter;

import com.evolution.model.cadastro.enumerador.Status;

public class VendedorFilter {

	private Long id;
	private Long empresa;
	private String cpf;
	private Status status;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "VendedorFilter [id=" + id + ", empresa=" + empresa + ", cpf=" + cpf + ", status=" + status + "]";
	}

}
