package com.evolution.model.adm;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "ADMPAPED")
@SuppressWarnings("deprecation")
public class ParcelaPedido {

	@Id
	@Column(name = "NCODIPAPED", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADM_SADMPAPED")
	@SequenceGenerator(sequenceName = "ADM_SADMPAPED", allocationSize = 1, name = "ADM_SADMPAPED")
	private Long id;

	@ManyToOne
	@JsonBackReference
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMPAPED_ADMPEDID")
	@JoinColumn(name = "NCODIPEDID", nullable = false)
	private PedidoAdm pedido;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVALOPAPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valor = BigDecimal.ZERO;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@NotNull(message = "é obrigatório")
	@Column(name = "DVENCPAPED", nullable = false)
	private Date vencimento = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PedidoAdm getPedido() {
		return pedido;
	}

	public void setPedido(PedidoAdm pedido) {
		this.pedido = pedido;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
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
		ParcelaPedido other = (ParcelaPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ParcelaPedido [id=" + id + ", pedido=" + pedido + ", valor=" + valor + ", vencimento=" + vencimento
				+ "]";
	}
}
