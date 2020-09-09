package com.evolution.repository.tesouraria.projection;

import com.evolution.model.tesouraria.enumerador.Status;
import com.evolution.model.tesouraria.enumerador.TipoBanco;

public class BancoResumo {

	private Long id;
	private String codigo;
	private String descricao;
	private TipoBanco tipo;
	private Status status;

	public BancoResumo() {
		super();
	}

	public BancoResumo(Long id, String codigo, String descricao, TipoBanco tipo, Status status) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
		this.tipo = tipo;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public TipoBanco getTipo() {
		return tipo;
	}

	public void setTipo(TipoBanco tipo) {
		this.tipo = tipo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BancoResumo [id=" + id + ", codigo=" + codigo + ", descricao=" + descricao + ", tipo=" + tipo
				+ ", status=" + status + "]";
	}

}
