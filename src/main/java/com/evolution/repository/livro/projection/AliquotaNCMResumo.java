package com.evolution.repository.livro.projection;

public class AliquotaNCMResumo {

	private Long id;
	private String codigo;
	private String descricao;

	public AliquotaNCMResumo() {
		super();
	}

	public AliquotaNCMResumo(Long id, String codigo, String descricao) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "AliquotaNCMResumo [id=" + id + ", codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
