package com.evolution.repository.livro.filter;

import java.util.Date;

public class MovimentoFilter {

	private Long id;
	private Long empresa;
	private Long filial;
	private String nome;
	private Long numero;
	private Date dataDe;
	private Date dataAte;

	public MovimentoFilter() {
		super();

	}

	public MovimentoFilter(Long id, Long empresa, Long filial, String nome, Long numero, Date dataDe, Date dataAte) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.filial = filial;
		this.nome = nome;
		this.numero = numero;
		this.dataDe = dataDe;
		this.dataAte = dataAte;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Date getDataDe() {
		return dataDe;
	}

	public void setDataDe(Date dataDe) {
		this.dataDe = dataDe;
	}

	public Date getDataAte() {
		return dataAte;
	}

	public void setDataAte(Date dataAte) {
		this.dataAte = dataAte;
	}

}
