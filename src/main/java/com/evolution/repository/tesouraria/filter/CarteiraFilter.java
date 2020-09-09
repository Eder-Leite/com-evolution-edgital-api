package com.evolution.repository.tesouraria.filter;

import com.evolution.model.tesouraria.enumerador.TipoCarteira;

public class CarteiraFilter {

	private Long id;
	private Long empresa;
	private String descricao;
	private TipoCarteira tipo;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoCarteira getTipo() {
		return tipo;
	}

	public void setTipo(TipoCarteira tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "CarteiraFilter [id=" + id + ", empresa=" + empresa + ", descricao=" + descricao + ", tipo=" + tipo
				+ "]";
	}

}
