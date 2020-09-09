package com.evolution.repository.cadastro.filter;

public class CidadeFilter {

	private Long id;
	private Long estado;
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEstado() {
		return estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "CidadeFilter [id=" + id + ", estado=" + estado + ", nome=" + nome + "]";
	}

}
