package com.evolution.repository.adm.projection;

public class AlmoxarifadoResumo {

	private Long id;
	private Long empresa;
	private String nomeEmpresa;
	private Long filial;
	private String nomeFilial;
	private String codigo;
	private String descricao;

	public AlmoxarifadoResumo() {
		super();
	}

	public AlmoxarifadoResumo(Long id, Long empresa, String nomeEmpresa, Long filial, String nomeFilial, String codigo,
			String descricao) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.nomeEmpresa = nomeEmpresa;
		this.filial = filial;
		this.nomeFilial = nomeFilial;
		this.codigo = codigo;
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

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
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

	@Override
	public String toString() {
		return "AlmoxarifadoResumo [id=" + id + ", empresa=" + empresa + ", nomeEmpresa=" + nomeEmpresa + ", filial="
				+ filial + ", nomeFilial=" + nomeFilial + ", codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
