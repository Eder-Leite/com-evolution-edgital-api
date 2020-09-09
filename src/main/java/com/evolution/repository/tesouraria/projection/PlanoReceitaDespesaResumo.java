package com.evolution.repository.tesouraria.projection;

import java.math.BigDecimal;

import com.evolution.model.tesouraria.enumerador.TipoCarteira;

public class PlanoReceitaDespesaResumo {

	private Long id;
	private Long empresa;
	private Long grupoReceitaDespesa;
	private TipoCarteira tipoCarteira;
	private String descricaoCarteira;
	private String descricaoGrupoReceitaDespesa;
	private String descricao;
	private BigDecimal taxaDesconto;
	private BigDecimal taxaJuros;

	public PlanoReceitaDespesaResumo() {
		super();
	}

	public PlanoReceitaDespesaResumo(Long id, Long empresa, Long grupoReceitaDespesa, TipoCarteira tipoCarteira,
			String descricaoCarteira, String descricaoGrupoReceitaDespesa, String descricao, BigDecimal taxaDesconto,
			BigDecimal taxaJuros) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.grupoReceitaDespesa = grupoReceitaDespesa;
		this.tipoCarteira = tipoCarteira;
		this.descricaoCarteira = descricaoCarteira;
		this.descricaoGrupoReceitaDespesa = descricaoGrupoReceitaDespesa;
		this.descricao = descricao;
		this.taxaDesconto = taxaDesconto;
		this.taxaJuros = taxaJuros;
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

	public Long getGrupoReceitaDespesa() {
		return grupoReceitaDespesa;
	}

	public void setGrupoReceitaDespesa(Long grupoReceitaDespesa) {
		this.grupoReceitaDespesa = grupoReceitaDespesa;
	}

	public TipoCarteira getTipoCarteira() {
		return tipoCarteira;
	}

	public void setTipoCarteira(TipoCarteira tipoCarteira) {
		this.tipoCarteira = tipoCarteira;
	}

	public String getDescricaoCarteira() {
		return descricaoCarteira;
	}

	public void setDescricaoCarteira(String descricaoCarteira) {
		this.descricaoCarteira = descricaoCarteira;
	}

	public String getDescricaoGrupoReceitaDespesa() {
		return descricaoGrupoReceitaDespesa;
	}

	public void setDescricaoGrupoReceitaDespesa(String descricaoGrupoReceitaDespesa) {
		this.descricaoGrupoReceitaDespesa = descricaoGrupoReceitaDespesa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getTaxaDesconto() {
		return taxaDesconto;
	}

	public void setTaxaDesconto(BigDecimal taxaDesconto) {
		this.taxaDesconto = taxaDesconto;
	}

	public BigDecimal getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(BigDecimal taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

}
