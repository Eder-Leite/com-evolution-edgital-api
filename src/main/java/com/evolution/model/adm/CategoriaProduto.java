package com.evolution.model.adm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.NotBlank;

import com.evolution.model.cadastro.Empresa;
import com.evolution.model.tesouraria.PlanoReceitaDespesa;

@Entity
@Table(name = "ADMCATEG")
@SuppressWarnings("deprecation")
public class CategoriaProduto {

	@Id
	@Column(name = "NCODICATEG", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADM_SADMCATEG")
	@SequenceGenerator(sequenceName = "ADM_SADMCATEG", allocationSize = 1, name = "ADM_SADMCATEG")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMCATEG_CADEMPRE")
	@JoinColumn(name = "NCODIEMPRE", nullable = false)
	private Empresa empresa;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CCODICATEG", nullable = false, length = 4)
	private String codigo;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCCATEG", nullable = false, length = 255)
	private String descricao;

	@ManyToOne
	@ForeignKey(name = "FK_ADMCATEG_TESPREDE1")
	@JoinColumn(name = "NPRVECATEG")
	private PlanoReceitaDespesa planoReceitaDespesaVenda;

	@ManyToOne
	@ForeignKey(name = "FK_ADMCATEG_TESPREDE2")
	@JoinColumn(name = "NPRDVCATEG")
	private PlanoReceitaDespesa planoReceitaDespesaDevolucaoVenda;

	@ManyToOne
	@ForeignKey(name = "FK_ADMCATEG_TESPREDE3")
	@JoinColumn(name = "NPDCOCATEG")
	private PlanoReceitaDespesa planoReceitaDespesaCompra;

	@ManyToOne
	@ForeignKey(name = "FK_ADMCATEG_TESPREDE4")
	@JoinColumn(name = "NPDDCCATEG")
	private PlanoReceitaDespesa planoReceitaDespesaDevolucaoCompra;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
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

	public PlanoReceitaDespesa getPlanoReceitaDespesaVenda() {
		return planoReceitaDespesaVenda;
	}

	public void setPlanoReceitaDespesaVenda(PlanoReceitaDespesa planoReceitaDespesaVenda) {
		this.planoReceitaDespesaVenda = planoReceitaDespesaVenda;
	}

	public PlanoReceitaDespesa getPlanoReceitaDespesaDevolucaoVenda() {
		return planoReceitaDespesaDevolucaoVenda;
	}

	public void setPlanoReceitaDespesaDevolucaoVenda(PlanoReceitaDespesa planoReceitaDespesaDevolucaoVenda) {
		this.planoReceitaDespesaDevolucaoVenda = planoReceitaDespesaDevolucaoVenda;
	}

	public PlanoReceitaDespesa getPlanoReceitaDespesaCompra() {
		return planoReceitaDespesaCompra;
	}

	public void setPlanoReceitaDespesaCompra(PlanoReceitaDespesa planoReceitaDespesaCompra) {
		this.planoReceitaDespesaCompra = planoReceitaDespesaCompra;
	}

	public PlanoReceitaDespesa getPlanoReceitaDespesaDevolucaoCompra() {
		return planoReceitaDespesaDevolucaoCompra;
	}

	public void setPlanoReceitaDespesaDevolucaoCompra(PlanoReceitaDespesa planoReceitaDespesaDevolucaoCompra) {
		this.planoReceitaDespesaDevolucaoCompra = planoReceitaDespesaDevolucaoCompra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaProduto other = (CategoriaProduto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", empresa=" + empresa + ", codigo=" + codigo + ", descricao=" + descricao
				+ ", planoReceitaDespesaVenda=" + planoReceitaDespesaVenda + ", planoReceitaDespesaDevolucaoVenda="
				+ planoReceitaDespesaDevolucaoVenda + ", planoReceitaDespesaCompra=" + planoReceitaDespesaCompra
				+ ", planoReceitaDespesaDevolucaoCompra=" + planoReceitaDespesaDevolucaoCompra + "]";
	}

}
