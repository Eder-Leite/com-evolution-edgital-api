package com.evolution.repository.cadastro.filter;

import com.evolution.model.cadastro.enumerador.Status;

public class CadastroFilter {

	private Long id;
	private Long empresa;
	private String nome;
	private String cnpjCpf;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CadastroFilter [id=" + id + ", nome=" + nome + ", cnpjCpf=" + cnpjCpf + ", status=" + status + "]";
	}

}
