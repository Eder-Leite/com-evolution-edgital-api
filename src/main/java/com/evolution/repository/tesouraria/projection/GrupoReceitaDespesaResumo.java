package com.evolution.repository.tesouraria.projection;

import com.evolution.model.tesouraria.enumerador.TipoCarteira;

public class GrupoReceitaDespesaResumo {

	private Long id;
	private Long empresa;
	private Long carteira;
	private String descricaoCarteira;
	private TipoCarteira tipoCarteira;
	private String descricao;

	public GrupoReceitaDespesaResumo() {
		super();
	}

	public GrupoReceitaDespesaResumo(Long id, Long empresa, Long carteira, String descricaoCarteira,
			TipoCarteira tipoCarteira, String descricao) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.carteira = carteira;
		this.descricaoCarteira = descricaoCarteira;
		this.tipoCarteira = tipoCarteira;
		this.descricao = descricao;
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

	public Long getCarteira() {
		return carteira;
	}

	public void setCarteira(Long carteira) {
		this.carteira = carteira;
	}

	public String getDescricaoCarteira() {
		return descricaoCarteira;
	}

	public void setDescricaoCarteira(String descricaoCarteira) {
		this.descricaoCarteira = descricaoCarteira;
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
		return "GrupoReceitaDespesaResumo [id=" + id + ", empresa=" + empresa + ", carteira=" + carteira
				+ ", descricaoCarteira=" + descricaoCarteira + ", tipoCarteira=" + tipoCarteira + ", descricao="
				+ descricao + "]";
	}

}
