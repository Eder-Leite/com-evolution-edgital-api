package com.evolution.model.cadastro;

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
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.NotBlank;

import com.evolution.model.cadastro.enumerador.Proprietario;
import com.evolution.model.cadastro.enumerador.Status;
import com.evolution.model.cadastro.enumerador.TipoCarroceria;
import com.evolution.model.cadastro.enumerador.TipoRodo;
import com.evolution.model.cadastro.enumerador.TipoVeiculo;

@Entity
@Table(name = "CADVEICU")
@SuppressWarnings("deprecation")
public class Veiculo {

	@Id
	@Column(name = "NCODIVEICU", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAD_SCADVEICU")
	@SequenceGenerator(sequenceName = "CAD_SCADVEICU", allocationSize = 1, name = "CAD_SCADVEICU")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_CADVEICU_CADGERAL")
	@JoinColumn(name = "NCODIGERAL", nullable = false)
	private Cadastro cadastro;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCVEICU", nullable = false, length = 255)
	private String descricao;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CPROPVEICU", nullable = false, length = 25)
	private Proprietario proprietario = Proprietario.PRÓPRIO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CTIPOVEICU", nullable = false, length = 25)
	private TipoVeiculo tipoVeiculo = TipoVeiculo.VEÍCULO;

	@NotNull(message = "é obrigatório")
	@Column(name = "CTPROVEICU", nullable = false, length = 25)
	private String tipoRodo = TipoRodo.SEIS.getCodigo();

	@NotNull(message = "é obrigatório")
	@Column(name = "CTPCAVEICU", nullable = false, length = 25)
	private String tipoCarroceria = TipoCarroceria.ZERO.getCodigo();

	@NotBlank(message = "é obrigatório")
	@Column(name = "CPLACVEICU", nullable = false, length = 10)
	private String placa;

	@Column(name = "CANTTVEICU", length = 255)
	private String codigoANTT;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTARAVEICU", nullable = false)
	private Long tara = Long.valueOf(0);

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSTATVEICU", nullable = false, length = 15)
	private Status status = Status.ATIVO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getTipoRodo() {
		return tipoRodo;
	}

	public void setTipoRodo(String tipoRodo) {
		this.tipoRodo = tipoRodo;
	}

	public String getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCodigoANTT() {
		return codigoANTT;
	}

	public void setCodigoANTT(String codigoANTT) {
		this.codigoANTT = codigoANTT;
	}

	public Long getTara() {
		return tara;
	}

	public void setTara(Long tara) {
		this.tara = tara;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", cadastro=" + cadastro + ", descricao=" + descricao + ", proprietario="
				+ proprietario + ", tipoVeiculo=" + tipoVeiculo + ", tipoRodo=" + tipoRodo + ", tipoCarroceria="
				+ tipoCarroceria + ", placa=" + placa + ", codigoANTT=" + codigoANTT + ", tara=" + tara + ", status="
				+ status + "]";
	}

}
