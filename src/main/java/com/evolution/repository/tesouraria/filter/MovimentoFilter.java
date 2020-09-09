package com.evolution.repository.tesouraria.filter;

import java.util.Date;

import com.evolution.model.tesouraria.enumerador.Check;
import com.evolution.model.tesouraria.enumerador.TipoMovimento;

public class MovimentoFilter {

	private Long id;
	private Long empresa;
	private Long filial;
	private Date dataDe;
	private Date dataAte;
	private String conta;
	private Check conciliado;
	private TipoMovimento tipoMovimento;

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

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public Check getConciliado() {
		return conciliado;
	}

	public void setConciliado(Check conciliado) {
		this.conciliado = conciliado;
	}

	public TipoMovimento getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(TipoMovimento tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	@Override
	public String toString() {
		return "MovimentoFilter [id=" + id + ", empresa=" + empresa + ", filial=" + filial + ", dataDe=" + dataDe
				+ ", dataAte=" + dataAte + ", conta=" + conta + ", conciliado=" + conciliado + ", tipoMovimento="
				+ tipoMovimento + "]";
	}
}
