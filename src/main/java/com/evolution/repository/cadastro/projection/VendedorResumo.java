package com.evolution.repository.cadastro.projection;

import com.evolution.model.cadastro.enumerador.Status;

public class VendedorResumo {

	private Long id;
	private Long empresa;
	private String nome;
	private String cpf;
	private Status status;

	public VendedorResumo() {
		super();
	}

	public VendedorResumo(Long id, Long empresa, String nome, String cpf, Status status) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.nome = nome;
		this.cpf = cpf;
		this.status = status;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		return "VendedorResumo [id=" + id + ", empresa=" + empresa + ", nome=" + nome + ", cpf=" + cpf + ", status="
				+ status + "]";
	}
}
