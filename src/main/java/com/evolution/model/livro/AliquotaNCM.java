package com.evolution.model.livro;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "LIVALNCM")
public class AliquotaNCM {

	@Id
	@Column(name = "NCODIALNCM", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVALNCM")
	@SequenceGenerator(sequenceName = "LIV_SLIVALNCM", allocationSize = 1, name = "LIV_SLIVALNCM")
	private Long id;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CCODIALNCM", nullable = false, length = 10)
	private String codigo;

	@JsonIgnore
	@Column(name = "NEX__ALNCM")
	private Long exterior;

	@JsonIgnore
	@NotNull(message = "é obrigatório")
	@Column(name = "NTIPOALNCM")
	private Long tipo;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCALNCM", nullable = false, length = 4000)
	private String descricao;

	@JsonIgnore
	@NotNull(message = "é obrigatório")
	@Column(name = "NNACFALNCM")
	private Long nacional;

	@NotNull(message = "é obrigatório")
	@Column(name = "NIMPFALNCM")
	private Long importado;

	@JsonIgnore
	@NotNull(message = "é obrigatório")
	@Column(name = "NESTAALNCM")
	private Long estadual;

	@JsonIgnore
	@NotNull(message = "é obrigatório")
	@Column(name = "NMUNIALNCM")
	private Long NMUNIALNCM;

	@JsonIgnore
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDTINALNCM")
	private Date dataInicial;

	@JsonIgnore
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDTFIALNCM")
	private Date dataFinal;

	@JsonIgnore
	@NotBlank(message = "é obrigatório")
	@Column(name = "CCHAVALNCM", nullable = false, length = 25)
	private String chave;

	@JsonIgnore
	@NotBlank(message = "é obrigatório")
	@Column(name = "CVERSALNCM", nullable = false, length = 25)
	private String versao;

	@JsonIgnore
	@NotBlank(message = "é obrigatório")
	@Column(name = "CFONTALNCM", nullable = false, length = 255)
	private String fonte;

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

	public Long getExterior() {
		return exterior;
	}

	public void setExterior(Long exterior) {
		this.exterior = exterior;
	}

	public Long getTipo() {
		return tipo;
	}

	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getNacional() {
		return nacional;
	}

	public void setNacional(Long nacional) {
		this.nacional = nacional;
	}

	public Long getImportado() {
		return importado;
	}

	public void setImportado(Long importado) {
		this.importado = importado;
	}

	public Long getEstadual() {
		return estadual;
	}

	public void setEstadual(Long estadual) {
		this.estadual = estadual;
	}

	public Long getNMUNIALNCM() {
		return NMUNIALNCM;
	}

	public void setNMUNIALNCM(Long nMUNIALNCM) {
		NMUNIALNCM = nMUNIALNCM;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
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
		AliquotaNCM other = (AliquotaNCM) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AliquotaNCM [id=" + id + ", codigo=" + codigo + ", exterior=" + exterior + ", tipo=" + tipo
				+ ", descricao=" + descricao + ", nacional=" + nacional + ", importado=" + importado + ", estadual="
				+ estadual + ", NMUNIALNCM=" + NMUNIALNCM + ", dataInicial=" + dataInicial + ", dataFinal=" + dataFinal
				+ ", chave=" + chave + ", versao=" + versao + ", fonte=" + fonte + "]";
	}

}
