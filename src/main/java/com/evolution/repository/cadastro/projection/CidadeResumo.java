package com.evolution.repository.cadastro.projection;

public class CidadeResumo {

	private Long id;
	private Long pais;
	private String nomePais;
	private Long estado;
	private String nomeEstado;
	private String siglaEstado;
	private String nomeCidade;
	private String codigo;

	public CidadeResumo() {
		super();
	}

	public CidadeResumo(Long id, Long pais, String nomePais, Long estado, String nomeEstado, String siglaEstado,
			String nomeCidade, String codigo) {
		super();
		this.id = id;
		this.pais = pais;
		this.nomePais = nomePais;
		this.estado = estado;
		this.nomeEstado = nomeEstado;
		this.siglaEstado = siglaEstado;
		this.nomeCidade = nomeCidade;
		this.codigo = codigo;
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

	public Long getEstado() {
		return estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "CidadeFilter [id=" + id + ", pais=" + pais + ", nomePais=" + nomePais + ", estado=" + estado
				+ ", nomeEstado=" + nomeEstado + ", siglaEstado=" + siglaEstado + ", nomeCidade=" + nomeCidade
				+ ", codigo=" + codigo + "]";
	}

}
