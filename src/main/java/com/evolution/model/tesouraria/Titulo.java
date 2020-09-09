package com.evolution.model.tesouraria;

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
import org.hibernate.validator.constraints.NotBlank;

import com.evolution.model.cadastro.Cadastro;
import com.evolution.model.cadastro.Empresa;
import com.evolution.model.seguranca.Usuario;
import com.evolution.model.tesouraria.enumerador.TipoLancamento;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TESTITUL")
@SuppressWarnings("deprecation")
public class Titulo {

	@Id
	@Column(name = "NCODITITUL", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESTITUL")
	@SequenceGenerator(sequenceName = "TES_STESTITUL", allocationSize = 1, name = "TES_STESTITUL")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESTITUL_CADEMPRE")
	@JoinColumn(name = "NCODIEMPRE", nullable = false)
	private Empresa empresa;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESTITUL_CADGERAL")
	@JoinColumn(name = "NCODIGERAL", nullable = false)
	private Cadastro cadastro;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESTITUL_SEGUSUAR")
	@JoinColumn(name = "NCODIUSUAR", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@ForeignKey(name = "FK_TESTITUL_TESPREDE")
	@JoinColumn(name = "NCODIPREDE", nullable = true)
	private PlanoReceitaDespesa planoReceitaDespesa;

	@ManyToOne
	@ForeignKey(name = "FK_TESTITUL_FATPEDID")
	@JoinColumn(name = "NFAT_PEDID", nullable = true)
	private com.evolution.model.faturamento.PedidoFat pedidoFat;

	@ManyToOne
	@ForeignKey(name = "FK_TESTITUL_ADMPEDID")
	@JoinColumn(name = "NADM_PEDID", nullable = true)
	private com.evolution.model.adm.PedidoAdm pedidoAdm;

	@ManyToOne
	@ForeignKey(name = "FK_TESTITUL_TESLANCM")
	@JoinColumn(name = "NCODILANCM", nullable = true)
	private LancamentoManual lancamentoManual;

	@ManyToOne
	@ForeignKey(name = "FK_TESTITUL_TESTITUL")
	@JoinColumn(name = "NTITPTITUL", nullable = true)
	private Titulo tituloPai;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CTIPOTITUL", nullable = false, length = 15)
	private TipoLancamento tipo;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDEMITITUL", nullable = false)
	private Date emissao;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDVENTITUL", nullable = false)
	private Date vencimento = new Date();

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDATATITUL", nullable = false)
	private Date dataCadastro = new Date();

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name = "DDLIQTITUL", nullable = true)
	private Date liquidacao;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDOCUTITUL", nullable = false, length = 25)
	private String documento;

	@NotNull(message = "é obrigatório")
	@Column(name = "NPARCTITUL", nullable = false)
	private Long parcela;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVALOTITUL", nullable = false, precision = 19, scale = 2)
	private BigDecimal valor = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVPAGTITUL", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorPago = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVDESTITUL", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorDesconto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVJURTITUL", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorJuros = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTXJUTITUL", nullable = false, precision = 5, scale = 2)
	private BigDecimal taxaJuros = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTXDETITUL", nullable = false, precision = 5, scale = 2)
	private BigDecimal taxaDescontos = BigDecimal.ZERO;

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

	public PlanoReceitaDespesa getPlanoReceitaDespesa() {
		return planoReceitaDespesa;
	}

	public void setPlanoReceitaDespesa(PlanoReceitaDespesa planoReceitaDespesa) {
		this.planoReceitaDespesa = planoReceitaDespesa;
	}

	public com.evolution.model.faturamento.PedidoFat getPedidoFat() {
		return pedidoFat;
	}

	public void setPedidoFat(com.evolution.model.faturamento.PedidoFat pedidoFat) {
		this.pedidoFat = pedidoFat;
	}

	public com.evolution.model.adm.PedidoAdm getPedidoAdm() {
		return pedidoAdm;
	}

	public void setPedidoAdm(com.evolution.model.adm.PedidoAdm pedidoAdm) {
		this.pedidoAdm = pedidoAdm;
	}

	public LancamentoManual getLancamentoManual() {
		return lancamentoManual;
	}

	public void setLancamentoManual(LancamentoManual lancamentoManual) {
		this.lancamentoManual = lancamentoManual;
	}

	public Titulo getTituloPai() {
		return tituloPai;
	}

	public void setTituloPai(Titulo tituloPai) {
		this.tituloPai = tituloPai;
	}

	public TipoLancamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}

	public Date getEmissao() {
		return emissao;
	}

	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getLiquidacao() {
		return liquidacao;
	}

	public void setLiquidacao(Date liquidacao) {
		this.liquidacao = liquidacao;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Long getParcela() {
		return parcela;
	}

	public void setParcela(Long parcela) {
		this.parcela = parcela;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorJuros() {
		return valorJuros;
	}

	public void setValorJuros(BigDecimal valorJuros) {
		this.valorJuros = valorJuros;
	}

	public BigDecimal getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(BigDecimal taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public BigDecimal getTaxaDescontos() {
		return taxaDescontos;
	}

	public void setTaxaDescontos(BigDecimal taxaDescontos) {
		this.taxaDescontos = taxaDescontos;
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
		Titulo other = (Titulo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Titulo [id=" + id + ", empresa=" + empresa + ", cadastro=" + cadastro + ", usuario=" + usuario
				+ ", planoReceitaDespesa=" + planoReceitaDespesa + ", pedidoFat=" + pedidoFat + ", pedidoAdm="
				+ pedidoAdm + ", lancamentoManual=" + lancamentoManual + ", tituloPai=" + tituloPai + ", tipo=" + tipo
				+ ", emissao=" + emissao + ", vencimento=" + vencimento + ", dataCadastro=" + dataCadastro
				+ ", liquidacao=" + liquidacao + ", documento=" + documento + ", parcela=" + parcela + ", valor="
				+ valor + ", valorPago=" + valorPago + ", valorDesconto=" + valorDesconto + ", valorJuros=" + valorJuros
				+ ", taxaJuros=" + taxaJuros + ", taxaDescontos=" + taxaDescontos + "]";
	}
}
