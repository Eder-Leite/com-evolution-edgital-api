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

import com.evolution.model.tesouraria.PlanoReceitaDespesa;

@Entity
@Table(name = "ADMSBCAT")
@SuppressWarnings("deprecation")
public class SubCategoriaProduto {

	@Id
	@Column(name = "NCODISBCAT", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADM_SADMSBCAT")
	@SequenceGenerator(sequenceName = "ADM_SADMSBCAT", allocationSize = 1, name = "ADM_SADMSBCAT")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMSBCAT_ADMCATEG")
	@JoinColumn(name = "NCODICATEG", nullable = false)
	private CategoriaProduto categoria;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CCODISBCAT", nullable = false, length = 4)
	private String codigo;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCSBCAT", nullable = false, length = 255)
	private String descricao;

	@ManyToOne
	@ForeignKey(name = "FK_ADMSBCAT_TESPREDE1")
	@JoinColumn(name = "NPRVESBCAT")
	private PlanoReceitaDespesa planoReceitaDespesaVenda;

	@ManyToOne
	@ForeignKey(name = "FK_ADMSBCAT_TESPREDE2")
	@JoinColumn(name = "NPRDVSBCAT")
	private PlanoReceitaDespesa planoReceitaDespesaDevolucaoVenda;

	@ManyToOne
	@ForeignKey(name = "FK_ADMSBCAT_TESPREDE3")
	@JoinColumn(name = "NPDCOSBCAT")
	private PlanoReceitaDespesa planoReceitaDespesaCompra;

	@ManyToOne
	@ForeignKey(name = "FK_ADMSBCAT_TESPREDE4")
	@JoinColumn(name = "NPDDCSBCAT")
	private PlanoReceitaDespesa planoReceitaDespesaDevolucaoCompra;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CategoriaProduto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProduto categoria) {
		this.categoria = categoria;
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
		SubCategoriaProduto other = (SubCategoriaProduto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubCategoria [id=" + id + ", categoria=" + categoria + ", codigo=" + codigo + ", descricao=" + descricao
				+ ", planoReceitaDespesaVenda=" + planoReceitaDespesaVenda + ", planoReceitaDespesaDevolucaoVenda="
				+ planoReceitaDespesaDevolucaoVenda + ", planoReceitaDespesaCompra=" + planoReceitaDespesaCompra
				+ ", planoReceitaDespesaDevolucaoCompra=" + planoReceitaDespesaDevolucaoCompra + "]";
	}

}
