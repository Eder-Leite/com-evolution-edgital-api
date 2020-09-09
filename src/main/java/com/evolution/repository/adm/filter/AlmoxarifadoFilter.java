package com.evolution.repository.adm.filter;

public class AlmoxarifadoFilter {

	private Long id;
	private Long filial;
	private String codigo;
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFilial() {
		return filial;
	}

	public void setFilial(Long filial) {
		this.filial = filial;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "AlmoxarifadoFilter [id=" + id + ", filial=" + filial + ", codigo=" + codigo + ", descricao=" + descricao
				+ "]";
	}

}
