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

import com.evolution.model.cadastro.Cadastro;
import com.evolution.model.cadastro.Filial;
import com.evolution.model.seguranca.Usuario;
import com.evolution.model.tesouraria.enumerador.SituacaoBaixa;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "TESBAIXA")
@SuppressWarnings("deprecation")
public class Baixa {

	@Id
	@Column(name = "NCODIBAIXA", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESBAIXA")
	@SequenceGenerator(sequenceName = "TES_STESBAIXA", allocationSize = 1, name = "TES_STESBAIXA")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESBAIXA_CADFILIA")
	@JoinColumn(name = "NCODIFILIA", nullable = false)
	private Filial filial;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESBAIXA_CADGERAL")
	@JoinColumn(name = "NCODIGERAL", nullable = false)
	private Cadastro cadastro;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESBAIXA_TESTPBAI")
	@JoinColumn(name = "NCODITPBAI", nullable = false)
	private TipoBaixa tipoBaixa;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESBAIXA_SEGUSUAR")
	@JoinColumn(name = "NCODIUSUAR", nullable = false)
	private Usuario usuario;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DCALCBAIXA", nullable = false)
	private Date dataCalculo;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DMOVIBAIXA", nullable = false)
	private Date data;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDATABAIXA", nullable = false)
	private Date dataCadastro = new Date();

	@NotNull(message = "é obrigatório")
	@Column(name = "NVDEBBAIXA", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorDebitos = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVCREBAIXA", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorCreditos = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVTOTBAIXA", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalBaixa = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSITUBAIXA", nullable = false, length = 15)
	private SituacaoBaixa situacao = SituacaoBaixa.ABERTO;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DPROCBAIXA", nullable = false)
	private Date dataProcessamento;

	@JsonManagedReference
	@OneToMany(mappedBy = "baixa", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<ItemBaixa> itens = new ArrayList<>();

	@JsonManagedReference
	@OneToMany(mappedBy = "baixa", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<ParcelaBaixa> parcelas = new ArrayList<>();

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

	public TipoBaixa getTipoBaixa() {
		return tipoBaixa;
	}

	public void setTipoBaixa(TipoBaixa tipoBaixa) {
		this.tipoBaixa = tipoBaixa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDataCalculo() {
		return dataCalculo;
	}

	public void setDataCalculo(Date dataCalculo) {
		this.dataCalculo = dataCalculo;
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

	public BigDecimal getValorDebitos() {
		return valorDebitos;
	}

	public void setValorDebitos(BigDecimal valorDebitos) {
		this.valorDebitos = valorDebitos;
	}

	public BigDecimal getValorCreditos() {
		return valorCreditos;
	}

	public void setValorCreditos(BigDecimal valorCreditos) {
		this.valorCreditos = valorCreditos;
	}

	public BigDecimal getTotalBaixa() {
		return totalBaixa;
	}

	public void setTotalBaixa(BigDecimal totalBaixa) {
		this.totalBaixa = totalBaixa;
	}

	public SituacaoBaixa getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoBaixa situacao) {
		this.situacao = situacao;
	}

	public Date getDataProcessamento() {
		return dataProcessamento;
	}

	public void setDataProcessamento(Date dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}

	public List<ItemBaixa> getItens() {
		return itens;
	}

	public void setItens(List<ItemBaixa> itens) {
		this.itens = itens;
	}

	public List<ParcelaBaixa> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<ParcelaBaixa> parcelas) {
		this.parcelas = parcelas;
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
		Baixa other = (Baixa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Baixa [id=" + id + ", filial=" + filial + ", cadastro=" + cadastro + ", tipoBaixa=" + tipoBaixa
				+ ", usuario=" + usuario + ", dataCalculo=" + dataCalculo + ", data=" + data + ", dataCadastro="
				+ dataCadastro + ", valorDebitos=" + valorDebitos + ", valorCreditos=" + valorCreditos + ", totalBaixa="
				+ totalBaixa + ", situacao=" + situacao + ", dataProcessamento=" + dataProcessamento + ", itens="
				+ itens + ", parcelas=" + parcelas + "]";
	}
}
