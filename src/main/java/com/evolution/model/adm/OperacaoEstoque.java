package com.evolution.model.adm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.NotBlank;

import com.evolution.model.adm.enumerador.Check;
import com.evolution.model.adm.enumerador.Status;
import com.evolution.model.adm.enumerador.TipoMovimento;
import com.evolution.model.cadastro.Empresa;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ADMOPERA")
@SuppressWarnings("deprecation")
public class OperacaoEstoque {

	@Id
	@Column(name = "NCODIOPERA", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADM_SADMOPERA")
	@SequenceGenerator(sequenceName = "ADM_SADMOPERA", allocationSize = 1, name = "ADM_SADMOPERA")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMOPERA_CADEMPRE")
	@JoinColumn(name = "NCODIEMPRE", nullable = false)
	private Empresa empresa;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCOPERA", nullable = false, length = 255)
	private String descricao;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "é obrigatório")
	@Column(name = "CTIPOOPERA", nullable = false, length = 15)
	private TipoMovimento tipo = TipoMovimento.SAÍDA;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "é obrigatório")
	@Column(name = "CMOVEOPERA", nullable = false, length = 10)
	private Check movimentaEstoque = Check.SIM;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "é obrigatório")
	@Column(name = "CSTATOPERA", nullable = false, length = 15)
	private Status status = Status.ATIVO;

	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Column(name = "DDATAOPERA")
	private Date dataCadastro = new Date();

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoMovimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimento tipo) {
		this.tipo = tipo;
	}

	public Check getMovimentaEstoque() {
		return movimentaEstoque;
	}

	public void setMovimentaEstoque(Check movimentaEstoque) {
		this.movimentaEstoque = movimentaEstoque;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
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
		OperacaoEstoque other = (OperacaoEstoque) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OperacaoEstoque [id=" + id + ", empresa=" + empresa + ", descricao=" + descricao + ", tipo=" + tipo
				+ ", movimentaEstoque=" + movimentaEstoque + ", status=" + status + ", dataCadastro=" + dataCadastro
				+ "]";
	}
}
