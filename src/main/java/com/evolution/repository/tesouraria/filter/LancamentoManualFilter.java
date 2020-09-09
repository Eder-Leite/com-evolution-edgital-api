package com.evolution.repository.tesouraria.filter;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.evolution.model.tesouraria.enumerador.SituacaoLancamento;
import com.evolution.model.tesouraria.enumerador.TipoLancamento;

public class LancamentoManualFilter {

	private Long id;
	private Long empresa;
	private Long filial;
	private TipoLancamento tipoLancamento;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataDe;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataAte;
	private String documento;
	private String cliente;
	private SituacaoLancamento situacao;

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

	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public SituacaoLancamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoLancamento situacao) {
		this.situacao = situacao;
	}

}
