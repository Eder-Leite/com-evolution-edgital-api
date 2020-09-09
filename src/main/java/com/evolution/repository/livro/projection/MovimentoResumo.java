package com.evolution.repository.livro.projection;

import java.math.BigDecimal;
import java.util.Date;

public class MovimentoResumo {

	private Long id;
	private Long empresa;
	private Long filial;
	private String nome;
	private Long numero;
	private String modelo;
	private Date dataMovimento;
	private BigDecimal total;

	public MovimentoResumo() {
		super();

	}

	public MovimentoResumo(Long id, Long empresa, Long filial, String nome, Long numero, String modelo,
			Date dataMovimento, BigDecimal total) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.filial = filial;
		this.nome = nome;
		this.numero = numero;
		this.modelo = modelo;
		this.dataMovimento = dataMovimento;
		this.total = total;
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
