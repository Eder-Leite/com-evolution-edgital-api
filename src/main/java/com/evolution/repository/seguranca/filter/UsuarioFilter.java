package com.evolution.repository.seguranca.filter;

import com.evolution.model.seguranca.enumerador.Status;

public class UsuarioFilter {

	private Long id;
	private Long empresa;
	private Long filial;
	private String email;
	private String cpf;
	private String nome;
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

	public Long getFilial() {
		return filial;
	}

	public void setFilial(Long filial) {
		this.filial = filial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UsuarioFilter [id=" + id + ", empresa=" + empresa + ", filial=" + filial + ", email=" + email + ", cpf="
				+ cpf + ", nome=" + nome + ", status=" + status + "]";
	}

}
