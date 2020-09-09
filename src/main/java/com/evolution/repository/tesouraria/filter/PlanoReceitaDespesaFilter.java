package com.evolution.repository.tesouraria.filter;

import com.evolution.model.tesouraria.enumerador.TipoCarteira;

public class PlanoReceitaDespesaFilter {

	private Long id;
	private Long empresa;
	private TipoCarteira tipoCarteira;
	private Long grupoReceitaDespesa;
	private String descricao;

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

	public TipoCarteira getTipoCarteira() {
		return tipoCarteira;
	}

	public void setTipoCarteira(TipoCarteira tipoCarteira) {
		this.tipoCarteira = tipoCarteira;
	}

	public Long getGrupoReceitaDespesa() {
		return grupoReceitaDespesa;
	}

	public void setGrupoReceitaDespesa(Long grupoReceitaDespesa) {
		this.grupoReceitaDespesa = grupoReceitaDespesa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
