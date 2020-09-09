package com.evolution.repository.cadastro.projection;

import com.evolution.model.cadastro.enumerador.Status;
import com.evolution.model.cadastro.enumerador.TipoCadastro;
import com.evolution.model.cadastro.enumerador.TipoPessoa;

public class CadastroResumo {

	private Long id;
	private Long empresa;
	private String nomeEmpresa;
	private TipoCadastro tipo;
	private TipoPessoa tipoPessoa;
	private String nomeRazao;
	private String nomeFantasia;
	private String cnpjCpf;
	private String inscricaoEstadualRG;
	private Status status;

	public CadastroResumo() {
		super();
	}

	public CadastroResumo(Long id, Long empresa, String nomeEmpresa, TipoCadastro tipo, TipoPessoa tipoPessoa,
			String nomeRazao, String nomeFantasia, String cnpjCpf, String inscricaoEstadualRG, Status status) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.nomeEmpresa = nomeEmpresa;
		this.tipo = tipo;
		this.tipoPessoa = tipoPessoa;
		this.nomeRazao = nomeRazao;
		this.nomeFantasia = nomeFantasia;
		this.cnpjCpf = cnpjCpf;
		this.inscricaoEstadualRG = inscricaoEstadualRG;
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

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public TipoCadastro getTipo() {
		return tipo;
	}

	public void setTipo(TipoCadastro tipo) {
		this.tipo = tipo;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getNomeRazao() {
		return nomeRazao;
	}

	public void setNomeRazao(String nomeRazao) {
		this.nomeRazao = nomeRazao;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpfCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public String getInscricaoEstadualRG() {
		return inscricaoEstadualRG;
	}

	public void setInscricaoEstadualRG(String inscricaoEstadualRG) {
		this.inscricaoEstadualRG = inscricaoEstadualRG;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CadastroResumo [id=" + id + ", empresa=" + empresa + ", nomeEmpresa=" + nomeEmpresa + ", tipo=" + tipo
				+ ", tipoPessoa=" + tipoPessoa + ", nomeRazao=" + nomeRazao + ", nomeFantasia=" + nomeFantasia
				+ ", cnpjCpf=" + cnpjCpf + ", inscricaoEstadualRG=" + inscricaoEstadualRG + ", status=" + status + "]";
	}

}
