package com.evolution.repository.cadastro.projection;

import com.evolution.model.cadastro.enumerador.Status;

public class FilialResumo {

	private Long id;
	private Long empresa;
	private String nomeEmpresa;
	private String codigo;
	private String nome;
	private Long cadastro;
	private String nomeRazao;
	private Status status;

	public FilialResumo() {
		super();
	}

	public FilialResumo(Long id, Long empresa, String nomeEmpresa, String codigo, String nome, Long cadastro,
			String nomeRazao, Status status) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.nomeEmpresa = nomeEmpresa;
		this.codigo = codigo;
		this.nome = nome;
		this.cadastro = cadastro;
		this.nomeRazao = nomeRazao;
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

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCadastro() {
		return cadastro;
	}

	public void setCadastro(Long cadastro) {
		this.cadastro = cadastro;
	}

	public String getNomeRazao() {
		return nomeRazao;
	}

	public void setNomeRazao(String nomeRazao) {
		this.nomeRazao = nomeRazao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FilialResumo [id=" + id + ", empresa=" + empresa + ", nomeEmpresa=" + nomeEmpresa + ", codigo=" + codigo
				+ ", nome=" + nome + ", cadastro=" + cadastro + ", nomeRazao=" + nomeRazao + ", status=" + status + "]";
	}

}
