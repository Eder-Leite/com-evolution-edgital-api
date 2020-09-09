package com.evolution.repository.livro.projection;

import com.evolution.model.adm.enumerador.TipoMovimento;
import com.evolution.model.livro.enumerador.Status;

public class FinalidadeResumo {

	private Long id;
	private Long empresa;
	private TipoMovimento tipo;
	private String descricao;
	private String indicadorPresenca;
	private String finalidadeEmissao;
	private String modalidadeFrete;
	private Status status;

	public FinalidadeResumo() {
		super();
	}

	public FinalidadeResumo(Long id, Long empresa, TipoMovimento tipo, String descricao, String indicadorPresenca,
			String finalidadeEmissao, String modalidadeFrete, Status status) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.tipo = tipo;
		this.descricao = descricao;
		this.indicadorPresenca = indicadorPresenca;
		this.finalidadeEmissao = finalidadeEmissao;
		this.modalidadeFrete = modalidadeFrete;
		this.status = status;
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

	public TipoMovimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimento tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIndicadorPresenca() {
		return indicadorPresenca;
	}

	public void setIndicadorPresenca(String indicadorPresenca) {
		this.indicadorPresenca = indicadorPresenca;
	}

	public String getFinalidadeEmissao() {
		return finalidadeEmissao;
	}

	public void setFinalidadeEmissao(String finalidadeEmissao) {
		this.finalidadeEmissao = finalidadeEmissao;
	}

	public String getModalidadeFrete() {
		return modalidadeFrete;
	}

	public void setModalidadeFrete(String modalidadeFrete) {
		this.modalidadeFrete = modalidadeFrete;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
