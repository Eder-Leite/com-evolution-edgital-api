package com.evolution.repository.cadastro.filter;

public class EstadoFilter {

	private Long id;
	private Long pais;
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPais() {
		return pais;
	}

	public void setPais(Long pais) {
		this.pais = pais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "EstadoFilter [id=" + id + ", pais=" + pais + ", nome=" + nome + "]";
	}

}
