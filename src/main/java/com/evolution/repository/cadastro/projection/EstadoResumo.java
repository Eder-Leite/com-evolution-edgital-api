package com.evolution.repository.cadastro.projection;

public class EstadoResumo {

	private Long id;
	private Long pais;
	private String nomePais;
	private String nomeEstado;
	private String sigla;

	public EstadoResumo() {
		super();
	}

	public EstadoResumo(Long id, Long pais, String nomePais, String nomeEstado, String sigla) {
		super();
		this.id = id;
		this.pais = pais;
		this.nomePais = nomePais;
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}

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

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return "EstadoResumo [id=" + id + ", pais=" + pais + ", nomePais=" + nomePais + ", nomeEstado=" + nomeEstado
				+ ", sigla=" + sigla + "]";
	}

}
