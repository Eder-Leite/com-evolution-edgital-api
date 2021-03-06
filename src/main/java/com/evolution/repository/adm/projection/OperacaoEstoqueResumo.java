package com.evolution.repository.adm.projection;

import com.evolution.model.adm.enumerador.Check;
import com.evolution.model.adm.enumerador.Status;
import com.evolution.model.adm.enumerador.TipoMovimento;

public class OperacaoEstoqueResumo {

	private Long id;
	private Long empresa;
	private String descricao;
	private TipoMovimento tipo;
	private Check movimentaEstoque;
	private Status status;

	public OperacaoEstoqueResumo() {
		super();
	}

	public OperacaoEstoqueResumo(Long id, Long empresa, String descricao, TipoMovimento tipo, Check movimentaEstoque,
			Status status) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.descricao = descricao;
		this.tipo = tipo;
		this.movimentaEstoque = movimentaEstoque;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoMovimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimento tipo) {
		this.tipo = tipo;
	}

	public Check getMovimentaEstoque() {
		return movimentaEstoque;
	}

	public void setMovimentaEstoque(Check movimentaEstoque) {
		this.movimentaEstoque = movimentaEstoque;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
