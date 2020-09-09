package com.evolution.repository.tesouraria.projection;

import com.evolution.model.tesouraria.enumerador.TipoCarteira;

public class CarteiraResumo {

	private Long id;
	private Long empresa;
	private String nomeEmpresa;
	private String descricao;
	private TipoCarteira tipo;

	public CarteiraResumo() {
		super();
	}

	public CarteiraResumo(Long id, Long empresa, String nomeEmpresa, String descricao, TipoCarteira tipo) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.nomeEmpresa = nomeEmpresa;
		this.descricao = descricao;
		this.tipo = tipo;
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

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
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
		return "CarteiraResumo [id=" + id + ", empresa=" + empresa + ", nomeEmpresa=" + nomeEmpresa + ", descricao="
				+ descricao + ", tipo=" + tipo + "]";
	}

}
