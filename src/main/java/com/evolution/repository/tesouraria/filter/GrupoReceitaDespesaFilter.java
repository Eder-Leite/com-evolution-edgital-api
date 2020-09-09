package com.evolution.repository.tesouraria.filter;

import com.evolution.model.tesouraria.enumerador.TipoCarteira;

public class GrupoReceitaDespesaFilter {

	private Long id;
	private Long empresa;
	private Long carteira;
	private TipoCarteira tipoCarteira;
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

	public Long getCarteira() {
		return carteira;
	}

	public void setCarteira(Long carteira) {
		this.carteira = carteira;
	}

	public TipoCarteira getTipoCarteira() {
		return tipoCarteira;
	}

	public void setTipoCarteira(TipoCarteira tipoCarteira) {
		this.tipoCarteira = tipoCarteira;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "GrupoReceitaDespesaFilter [id=" + id + ", empresa=" + empresa + ", carteira=" + carteira
				+ ", tipoCarteira=" + tipoCarteira + ", descricao=" + descricao + "]";
	}

}
