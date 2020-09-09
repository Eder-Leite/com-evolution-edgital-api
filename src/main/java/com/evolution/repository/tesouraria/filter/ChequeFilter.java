package com.evolution.repository.tesouraria.filter;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.evolution.model.tesouraria.enumerador.SituacaoCheque;

public class ChequeFilter {

	private Long id;
	private Long talao;
	private Long conta;
	private Long numero;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataMovimentoDe;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataMovimentoAte;
	private SituacaoCheque situacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTalao() {
		return talao;
	}

	public void setTalao(Long talao) {
		this.talao = talao;
	}

	public Long getConta() {
		return conta;
	}

	public void setConta(Long conta) {
		this.conta = conta;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Date getDataMovimentoDe() {
		return dataMovimentoDe;
	}

	public void setDataMovimentoDe(Date dataMovimentoDe) {
		this.dataMovimentoDe = dataMovimentoDe;
	}

	public Date getDataMovimentoAte() {
		return dataMovimentoAte;
	}

	public void setDataMovimentoAte(Date dataMovimentoAte) {
		this.dataMovimentoAte = dataMovimentoAte;
	}

	public SituacaoCheque getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoCheque situacao) {
		this.situacao = situacao;
	}

}
