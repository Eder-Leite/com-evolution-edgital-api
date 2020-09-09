package com.evolution.repository.livro.projection;

import com.evolution.model.livro.enumerador.MovimentoFinanceiro;
import com.evolution.model.livro.enumerador.Status;
import com.evolution.model.livro.enumerador.TipoVenda;

public class ComplementoNaturezaResumo {

	private Long id;
	private Long empresa;
	private String cfop;
	private Long numero;
	private String descricao;
	private MovimentoFinanceiro movimentoFinanceiro;
	private TipoVenda prazoVista;
	private Status status;

	public ComplementoNaturezaResumo() {
		super();
	}

	public ComplementoNaturezaResumo(Long id, Long empresa, String cfop, Long numero, String descricao,
			MovimentoFinanceiro movimentoFinanceiro, TipoVenda prazoVista, Status status) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.cfop = cfop;
		this.numero = numero;
		this.descricao = descricao;
		this.movimentoFinanceiro = movimentoFinanceiro;
		this.prazoVista = prazoVista;
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

	public String getCfop() {
		return cfop;
	}

	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public MovimentoFinanceiro getMovimentoFinanceiro() {
		return movimentoFinanceiro;
	}

	public void setMovimentoFinanceiro(MovimentoFinanceiro movimentoFinanceiro) {
		this.movimentoFinanceiro = movimentoFinanceiro;
	}

	public TipoVenda getPrazoVista() {
		return prazoVista;
	}

	public void setPrazoVista(TipoVenda prazoVista) {
		this.prazoVista = prazoVista;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
