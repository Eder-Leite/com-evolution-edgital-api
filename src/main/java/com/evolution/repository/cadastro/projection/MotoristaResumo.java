package com.evolution.repository.cadastro.projection;

public class MotoristaResumo {

	private Long id;
	private Long cadastro;
	private String nomeRazao;
	private String nome;
	private String cpf;

	public MotoristaResumo() {
		super();
	}

	public MotoristaResumo(Long id, Long cadastro, String nomeRazao, String nome, String cpf) {
		super();
		this.id = id;
		this.cadastro = cadastro;
		this.nomeRazao = nomeRazao;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
}
