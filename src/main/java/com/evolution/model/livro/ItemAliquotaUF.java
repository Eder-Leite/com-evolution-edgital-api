package com.evolution.model.livro;

import java.math.BigDecimal;
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

import com.evolution.model.livro.enumerador.Check;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "LIVITALI")
@SuppressWarnings("deprecation")
public class ItemAliquotaUF {

	@Id
	@Column(name = "NCODIITALI", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVITALI")
	@SequenceGenerator(sequenceName = "LIV_SLIVITALI", allocationSize = 1, name = "LIV_SLIVITALI")
	private Long id;

	@ManyToOne
	@JsonBackReference
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVITALI_LIVALIUF")
	@JoinColumn(name = "NCODIALIUF", nullable = false)
	private AliquotaUF aliquotaUF;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDATAITALI")
	private Date data;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVITALI_LIVTRIBU")
	@JoinColumn(name = "NCODITRIBU", nullable = false)
	private Tributacao tributacao;

	@ManyToOne
	@ForeignKey(name = "FK_LIVITALI_LIVCOMEN")
	@JoinColumn(name = "NCODICOMEN", nullable = true)
	private ComentarioFiscal comentarioFiscal;

	@ManyToOne
	@ForeignKey(name = "FK_LIVITALI_LIVCOMEN1")
	@JoinColumn(name = "NPICOITALI", nullable = true)
	private ComentarioFiscal comentarioPisCofins;

	@ManyToOne
	@ForeignKey(name = "FK_LIVITALI_LIVAJUICM")
	@JoinColumn(name = "NCODIAJICM", nullable = true)
	private CodigoAjusteICMS codigoAjusteICMS;

	@NotNull(message = "é obrigatório")
	@Column(name = "NALIQITALI", nullable = false, precision = 7, scale = 4)
	private BigDecimal aliquotaIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NREDAITALI", nullable = false, precision = 7, scale = 4)
	private BigDecimal percentualReducaoIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NRBASITALI", nullable = false, precision = 7, scale = 4)
	private BigDecimal reducaoBaseIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CPAUTITALI", nullable = false)
	private Check pauta = Check.NÃO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVPAUITALI", nullable = false, precision = 7, scale = 4)
	private BigDecimal valorPauta = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NALITITALI", nullable = false, precision = 7, scale = 4)
	private BigDecimal aliquotaIcmsTransferencia = BigDecimal.ZERO;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DCADAITALI")
	private Date dataCadastro = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AliquotaUF getAliquotaUF() {
		return aliquotaUF;
	}

	public void setAliquotaUF(AliquotaUF aliquotaUF) {
		this.aliquotaUF = aliquotaUF;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Tributacao getTributacao() {
		return tributacao;
	}

	public void setTributacao(Tributacao tributacao) {
		this.tributacao = tributacao;
	}

	public ComentarioFiscal getComentarioFiscal() {
		return comentarioFiscal;
	}

	public void setComentarioFiscal(ComentarioFiscal comentarioFiscal) {
		this.comentarioFiscal = comentarioFiscal;
	}

	public ComentarioFiscal getComentarioPisCofins() {
		return comentarioPisCofins;
	}

	public void setComentarioPisCofins(ComentarioFiscal comentarioPisCofins) {
		this.comentarioPisCofins = comentarioPisCofins;
	}

	public CodigoAjusteICMS getCodigoAjusteICMS() {
		return codigoAjusteICMS;
	}

	public void setCodigoAjusteICMS(CodigoAjusteICMS codigoAjusteICMS) {
		this.codigoAjusteICMS = codigoAjusteICMS;
	}

	public BigDecimal getAliquotaIcms() {
		return aliquotaIcms;
	}

	public void setAliquotaIcms(BigDecimal aliquotaIcms) {
		this.aliquotaIcms = aliquotaIcms;
	}

	public BigDecimal getPercentualReducaoIcms() {
		return percentualReducaoIcms;
	}

	public void setPercentualReducaoIcms(BigDecimal percentualReducaoIcms) {
		this.percentualReducaoIcms = percentualReducaoIcms;
	}

	public BigDecimal getReducaoBaseIcms() {
		return reducaoBaseIcms;
	}

	public void setReducaoBaseIcms(BigDecimal reducaoBaseIcms) {
		this.reducaoBaseIcms = reducaoBaseIcms;
	}

	public Check getPauta() {
		return pauta;
	}

	public void setPauta(Check pauta) {
		this.pauta = pauta;
	}

	public BigDecimal getValorPauta() {
		return valorPauta;
	}

	public void setValorPauta(BigDecimal valorPauta) {
		this.valorPauta = valorPauta;
	}

	public BigDecimal getAliquotaIcmsTransferencia() {
		return aliquotaIcmsTransferencia;
	}

	public void setAliquotaIcmsTransferencia(BigDecimal aliquotaIcmsTransferencia) {
		this.aliquotaIcmsTransferencia = aliquotaIcmsTransferencia;
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
		ItemAliquotaUF other = (ItemAliquotaUF) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemAliquotaUF [id=" + id + ", aliquotaUF=" + aliquotaUF + ", data=" + data + ", tributacao="
				+ tributacao + ", comentarioFiscal=" + comentarioFiscal + ", comentarioPisCofins=" + comentarioPisCofins
				+ ", codigoAjusteICMS=" + codigoAjusteICMS + ", aliquotaIcms=" + aliquotaIcms
				+ ", percentualReducaoIcms=" + percentualReducaoIcms + ", reducaoBaseIcms=" + reducaoBaseIcms
				+ ", pauta=" + pauta + ", valorPauta=" + valorPauta + ", aliquotaIcmsTransferencia="
				+ aliquotaIcmsTransferencia + ", dataCadastro=" + dataCadastro + "]";
	}
}
