package com.evolution.repository.cadastro.projection;

import com.evolution.model.cadastro.enumerador.Status;
import com.evolution.model.cadastro.enumerador.TipoVeiculo;

public class VeiculoResumo {

	private Long id;
	private Long cadastro;
	private String nomeRazao;
	private TipoVeiculo tipo;
	private String descricao;
	private String placa;
	private Status status;

	public VeiculoResumo() {
		super();
	}

	public VeiculoResumo(Long id, Long cadastro, String nomeRazao, TipoVeiculo tipo, String descricao, String placa,
			Status status) {
		super();
		this.id = id;
		this.cadastro = cadastro;
		this.nomeRazao = nomeRazao;
		this.tipo = tipo;
		this.descricao = descricao;
		this.placa = placa;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCadastro() {
		return cadastro;
	}

	public void setCadastro(Long cadastro) {
		this.cadastro = cadastro;
	}

	public String getNomeRazao() {
		return nomeRazao;
	}

	public void setNomeRazao(String nomeRazao) {
		this.nomeRazao = nomeRazao;
	}

	public TipoVeiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
