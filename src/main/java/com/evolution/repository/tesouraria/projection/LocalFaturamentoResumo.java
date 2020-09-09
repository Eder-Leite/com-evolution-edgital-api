package com.evolution.repository.tesouraria.projection;

public class LocalFaturamentoResumo {

	private Long id;
	private Long empresa;
	private Long filial;
	private String nomeFilial;
	private Long conta;
	private String descricaoConta;
	private String descricao;

	public LocalFaturamentoResumo() {
		super();
	}

	public LocalFaturamentoResumo(Long id, Long empresa, Long filial, String nomeFilial, Long conta,
			String descricaoConta, String descricao) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.filial = filial;
		this.nomeFilial = nomeFilial;
		this.conta = conta;
		this.descricaoConta = descricaoConta;
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

	public Long getFilial() {
		return filial;
	}

	public void setFilial(Long filial) {
		this.filial = filial;
	}

	public String getNomeFilial() {
		return nomeFilial;
	}

	public void setNomeFilial(String nomeFilial) {
		this.nomeFilial = nomeFilial;
	}

	public Long getConta() {
		return conta;
	}

	public void setConta(Long conta) {
		this.conta = conta;
	}

	public String getDescricaoConta() {
		return descricaoConta;
	}

	public void setDescricaoConta(String descricaoConta) {
		this.descricaoConta = descricaoConta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
