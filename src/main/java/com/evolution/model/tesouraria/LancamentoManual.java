package com.evolution.model.tesouraria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.NotBlank;

import com.evolution.model.cadastro.Cadastro;
import com.evolution.model.cadastro.Filial;
import com.evolution.model.livro.Modelo;
import com.evolution.model.seguranca.Usuario;
import com.evolution.model.tesouraria.enumerador.SituacaoLancamento;
import com.evolution.model.tesouraria.enumerador.TipoLancamento;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "TESLANCM")
@SuppressWarnings("deprecation")
@JsonIgnoreProperties(value = { "dataCadastro" })
public class LancamentoManual {

	@Id
	@Column(name = "NCODILANCM", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESLANCM")
	@SequenceGenerator(sequenceName = "TES_STESLANCM", allocationSize = 1, name = "TES_STESLANCM")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESLANCM_CADFILIA")
	@JoinColumn(name = "NCODIFILIA", nullable = false)
	private Filial filial;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESTITUL_CADGERAL")
	@JoinColumn(name = "NCODIGERAL", nullable = false)
	private Cadastro cadastro;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESLANCM_SEGUSUAR")
	@JoinColumn(name = "NCODIUSUAR", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESLANCM_LIVMODEL")
	@JoinColumn(name = "NCODIMODEL", nullable = false)
	private Modelo modelo;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSITULANCM", nullable = false)
	private SituacaoLancamento situacao = SituacaoLancamento.ABERTO;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDOCULANCM", nullable = false, length = 25)
	private String documento;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@NotNull(message = "é obrigatório")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DDATMLANCM")
	private Date data;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DDATALANCM")
	private Date dataCadastro = new Date();

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCLANCM", nullable = false, length = 255)
	private String descricao;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CTIPOLANCM", nullable = false)
	private TipoLancamento tipoLancamento = TipoLancamento.DÉBITO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVALOLANCM", nullable = false, precision = 19, scale = 2)
	private BigDecimal valor = BigDecimal.ZERO;

	@OneToMany(mappedBy = "lancamentoManual", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<ParcelaLancamentoManual> parcelas = new ArrayList<>();

	@OneToMany(mappedBy = "lancamentoManual", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<RateioLancamentoManual> rateios = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public SituacaoLancamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoLancamento situacao) {
		this.situacao = situacao;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public List<ParcelaLancamentoManual> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<ParcelaLancamentoManual> parcelas) {
		this.parcelas = parcelas;
	}

	public List<RateioLancamentoManual> getRateios() {
		return rateios;
	}

	public void setRateios(List<RateioLancamentoManual> rateios) {
		this.rateios = rateios;
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
		LancamentoManual other = (LancamentoManual) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
