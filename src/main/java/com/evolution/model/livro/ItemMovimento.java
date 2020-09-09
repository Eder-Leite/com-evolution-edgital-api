package com.evolution.model.livro;

import java.math.BigDecimal;

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

import com.evolution.model.adm.Produto;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "LIVITMOV")
@SuppressWarnings("deprecation")
public class ItemMovimento {

	@Id
	@Column(name = "NCODIITMOV", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVITMOV")
	@SequenceGenerator(sequenceName = "LIV_SLIVITMOV", allocationSize = 1, name = "LIV_SLIVITMOV")
	private Long id;

	@ManyToOne
	@JsonBackReference
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVITMOV_LIVMOVIM")
	@JoinColumn(name = "NCODIMOVIM", nullable = false)
	private MovimentoLiv movimento;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVITMOV_ADMPRODU")
	@JoinColumn(name = "NCODIPRODU", nullable = false)
	private Produto produto;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVITMOV_LIV_CFOP")
	@JoinColumn(name = "NCODI_CFOP", nullable = false)
	private CodigoCFOP codigoCFOP;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVITMOV_LIVCOMPN")
	@JoinColumn(name = "NCODICOMPN", nullable = false)
	private ComplementoNatureza complementoNatureza;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVITMOV_LIVORIGE")
	@JoinColumn(name = "NCODIORIGE", nullable = false)
	private Origem origem;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVITMOV_LIVTRIBU")
	@JoinColumn(name = "NCODITRIBU", nullable = false)
	private Tributacao tribitacao;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVITMOV_LIVUNIDA")
	@JoinColumn(name = "NCODIUNIDA", nullable = false)
	private UnidadeProduto unidadeProduto;

	@Column(name = "CCPROITMOV", length = 60)
	private String codigo;

	@Column(name = "CDPROITMOV", length = 120)
	private String descricao;

	@Column(name = "CCESTMOVIM", length = 10)
	private String codigoCest;

	@Column(name = "CNCM_MOVIM", length = 10)
	private String codigoNcn;

	@Column(name = "CANP_MOVIM", length = 12)
	private String codigoAnp;

	@Column(name = "CAJUSMOVIM", length = 10)
	private String codigoAjusteIcms;

	@NotNull(message = "é obrigatório")
	@Column(name = "NQUATITMOV", nullable = false, precision = 19, scale = 3)
	private BigDecimal quantidade = BigDecimal.ONE;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVLRUITMOV", nullable = false, precision = 19, scale = 10)
	private BigDecimal valorUnitario = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVLRCITMOV", nullable = false, precision = 19, scale = 10)
	private BigDecimal valorCusto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NAICMITMOV", nullable = false, precision = 7, scale = 4)
	private BigDecimal aliquotaIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NRICMITMOV", nullable = false, precision = 7, scale = 4)
	private BigDecimal aliquotaReducaoIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVBCIITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal baseIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVICMITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVICDITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorDesoneradoIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NFCPIITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal IcmsFcpDestino = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NICMIITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal IcmsInterestadualDestino = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NICMRITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal IcmsInterestadualRemetente = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVFCPITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorFcp = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NAISTITMOV", nullable = false, precision = 7, scale = 4)
	private BigDecimal aliquotaICMSST = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NRISTITMOV", nullable = false, precision = 7, scale = 4)
	private BigDecimal aliquotaReducaoIcmsSt = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVBSTITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal baseIcmsSt = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVLSTITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorIcmsSt = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NFCPSITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorFcpSt = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NFCPRITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorFcpStAnteriormente = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NBISAITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal baseIcmsStAnteriormente = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVISAITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorICMSSTAnteriormente = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVTOPITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalProdutoServico = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVFREITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalFrete = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVSEGITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalSeguro = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVDESITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalDesconto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVLIIITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorImpostoImportados = BigDecimal.ZERO;

	@ManyToOne
	@ForeignKey(name = "FK_LIVITMOV_LIV_CIPI")
	@JoinColumn(name = "NCODI_CIPI", nullable = true)
	private CodigoIPI codigoIPI;

	@ManyToOne
	@ForeignKey(name = "FK_LIVITMOV_LIVALIPI")
	@JoinColumn(name = "NCODIALIPI", nullable = true)
	private CodigoIPI codigoAliquotaIPI;

	@NotNull(message = "é obrigatório")
	@Column(name = "NAIPIITMOV", nullable = false, precision = 7, scale = 4)
	private BigDecimal aliquotaIpi = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NRIPIITMOV", nullable = false, precision = 7, scale = 4)
	private BigDecimal aliquotaReducaoIpi = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NBIPIITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal baseIpi = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVIPIITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorIpi = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NIPIDITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorIpiDevolvido = BigDecimal.ZERO;

	@ManyToOne
	@ForeignKey(name = "FK_LIVITMOV_LIVCSPIS")
	@JoinColumn(name = "NCODICSPIS", nullable = true)
	private CodigoPisCofins codigoPis;

	@NotNull(message = "é obrigatório")
	@Column(name = "NAPISITMOV", nullable = false, precision = 7, scale = 4)
	private BigDecimal aliquotaPis = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NRPISITMOV", nullable = false, precision = 7, scale = 4)
	private BigDecimal aliquotaReducaoPis = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NBPISITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal basePis = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVPISITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorPis = BigDecimal.ZERO;

	@ManyToOne
	@ForeignKey(name = "FK_LIVITMOV_LIVCSPIS2")
	@JoinColumn(name = "NCODICSCOF", nullable = true)
	private CodigoPisCofins codigoCofins;

	@NotNull(message = "é obrigatório")
	@Column(name = "NACOFITMOV", nullable = false, precision = 7, scale = 4)
	private BigDecimal aliquotaCofins = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NRCOFITMOV", nullable = false, precision = 7, scale = 4)
	private BigDecimal aliquotaReducaoCofins = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NBCOFITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal baseCofins = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVCOFITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorCofins = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVOUTITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorOutras = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NAIRRITMOV", nullable = false, precision = 7, scale = 7)
	private BigDecimal aliquotaIrrf = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NBIRRITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal baseIrrf = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NIRRFITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorIrrf = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NAINSITMOV", nullable = false, precision = 7, scale = 7)
	private BigDecimal aliquotaInss = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NBINSITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal baseInss = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NINSSITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorInss = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NAISSITMOV", nullable = false, precision = 7, scale = 7)
	private BigDecimal aliquotaIss = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NBISSITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal baseIss = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVISSITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorIss = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NACSLITMOV", nullable = false, precision = 7, scale = 7)
	private BigDecimal aliquotaCsll = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NBCSLITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal baseCsll = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NCSLLITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorCsll = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTTRIITMOV", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalTributos = BigDecimal.ZERO;

	@Column(name = "CINFAITMOV", nullable = true, length = 500)
	private String informacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MovimentoLiv getMovimento() {
		return movimento;
	}

	public void setMovimento(MovimentoLiv movimento) {
		this.movimento = movimento;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public CodigoCFOP getCodigoCFOP() {
		return codigoCFOP;
	}

	public void setCodigoCFOP(CodigoCFOP codigoCFOP) {
		this.codigoCFOP = codigoCFOP;
	}

	public ComplementoNatureza getComplementoNatureza() {
		return complementoNatureza;
	}

	public void setComplementoNatureza(ComplementoNatureza complementoNatureza) {
		this.complementoNatureza = complementoNatureza;
	}

	public Origem getOrigem() {
		return origem;
	}

	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

	public Tributacao getTribitacao() {
		return tribitacao;
	}

	public void setTribitacao(Tributacao tribitacao) {
		this.tribitacao = tribitacao;
	}

	public UnidadeProduto getUnidadeProduto() {
		return unidadeProduto;
	}

	public void setUnidadeProduto(UnidadeProduto unidadeProduto) {
		this.unidadeProduto = unidadeProduto;
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

	public String getCodigoCest() {
		return codigoCest;
	}

	public void setCodigoCest(String codigoCest) {
		this.codigoCest = codigoCest;
	}

	public String getCodigoNcn() {
		return codigoNcn;
	}

	public void setCodigoNcn(String codigoNcn) {
		this.codigoNcn = codigoNcn;
	}

	public String getCodigoAnp() {
		return codigoAnp;
	}

	public void setCodigoAnp(String codigoAnp) {
		this.codigoAnp = codigoAnp;
	}

	public String getCodigoAjusteIcms() {
		return codigoAjusteIcms;
	}

	public void setCodigoAjusteIcms(String codigoAjusteIcms) {
		this.codigoAjusteIcms = codigoAjusteIcms;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public BigDecimal getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(BigDecimal valorCusto) {
		this.valorCusto = valorCusto;
	}

	public BigDecimal getAliquotaIcms() {
		return aliquotaIcms;
	}

	public void setAliquotaIcms(BigDecimal aliquotaIcms) {
		this.aliquotaIcms = aliquotaIcms;
	}

	public BigDecimal getAliquotaReducaoIcms() {
		return aliquotaReducaoIcms;
	}

	public void setAliquotaReducaoIcms(BigDecimal aliquotaReducaoIcms) {
		this.aliquotaReducaoIcms = aliquotaReducaoIcms;
	}

	public BigDecimal getBaseIcms() {
		return baseIcms;
	}

	public void setBaseIcms(BigDecimal baseIcms) {
		this.baseIcms = baseIcms;
	}

	public BigDecimal getValorIcms() {
		return valorIcms;
	}

	public void setValorIcms(BigDecimal valorIcms) {
		this.valorIcms = valorIcms;
	}

	public BigDecimal getValorDesoneradoIcms() {
		return valorDesoneradoIcms;
	}

	public void setValorDesoneradoIcms(BigDecimal valorDesoneradoIcms) {
		this.valorDesoneradoIcms = valorDesoneradoIcms;
	}

	public BigDecimal getIcmsFcpDestino() {
		return IcmsFcpDestino;
	}

	public void setIcmsFcpDestino(BigDecimal icmsFcpDestino) {
		IcmsFcpDestino = icmsFcpDestino;
	}

	public BigDecimal getIcmsInterestadualDestino() {
		return IcmsInterestadualDestino;
	}

	public void setIcmsInterestadualDestino(BigDecimal icmsInterestadualDestino) {
		IcmsInterestadualDestino = icmsInterestadualDestino;
	}

	public BigDecimal getIcmsInterestadualRemetente() {
		return IcmsInterestadualRemetente;
	}

	public void setIcmsInterestadualRemetente(BigDecimal icmsInterestadualRemetente) {
		IcmsInterestadualRemetente = icmsInterestadualRemetente;
	}

	public BigDecimal getValorFcp() {
		return valorFcp;
	}

	public void setValorFcp(BigDecimal valorFcp) {
		this.valorFcp = valorFcp;
	}

	public BigDecimal getAliquotaICMSST() {
		return aliquotaICMSST;
	}

	public void setAliquotaICMSST(BigDecimal aliquotaICMSST) {
		this.aliquotaICMSST = aliquotaICMSST;
	}

	public BigDecimal getAliquotaReducaoIcmsSt() {
		return aliquotaReducaoIcmsSt;
	}

	public void setAliquotaReducaoIcmsSt(BigDecimal aliquotaReducaoIcmsSt) {
		this.aliquotaReducaoIcmsSt = aliquotaReducaoIcmsSt;
	}

	public BigDecimal getBaseIcmsSt() {
		return baseIcmsSt;
	}

	public void setBaseIcmsSt(BigDecimal baseIcmsSt) {
		this.baseIcmsSt = baseIcmsSt;
	}

	public BigDecimal getValorIcmsSt() {
		return valorIcmsSt;
	}

	public void setValorIcmsSt(BigDecimal valorIcmsSt) {
		this.valorIcmsSt = valorIcmsSt;
	}

	public BigDecimal getValorFcpSt() {
		return valorFcpSt;
	}

	public void setValorFcpSt(BigDecimal valorFcpSt) {
		this.valorFcpSt = valorFcpSt;
	}

	public BigDecimal getValorFcpStAnteriormente() {
		return valorFcpStAnteriormente;
	}

	public void setValorFcpStAnteriormente(BigDecimal valorFcpStAnteriormente) {
		this.valorFcpStAnteriormente = valorFcpStAnteriormente;
	}

	public BigDecimal getBaseIcmsStAnteriormente() {
		return baseIcmsStAnteriormente;
	}

	public void setBaseIcmsStAnteriormente(BigDecimal baseIcmsStAnteriormente) {
		this.baseIcmsStAnteriormente = baseIcmsStAnteriormente;
	}

	public BigDecimal getValorICMSSTAnteriormente() {
		return valorICMSSTAnteriormente;
	}

	public void setValorICMSSTAnteriormente(BigDecimal valorICMSSTAnteriormente) {
		this.valorICMSSTAnteriormente = valorICMSSTAnteriormente;
	}

	public BigDecimal getTotalProdutoServico() {
		return totalProdutoServico;
	}

	public void setTotalProdutoServico(BigDecimal totalProdutoServico) {
		this.totalProdutoServico = totalProdutoServico;
	}

	public BigDecimal getTotalFrete() {
		return totalFrete;
	}

	public void setTotalFrete(BigDecimal totalFrete) {
		this.totalFrete = totalFrete;
	}

	public BigDecimal getTotalSeguro() {
		return totalSeguro;
	}

	public void setTotalSeguro(BigDecimal totalSeguro) {
		this.totalSeguro = totalSeguro;
	}

	public BigDecimal getTotalDesconto() {
		return totalDesconto;
	}

	public void setTotalDesconto(BigDecimal totalDesconto) {
		this.totalDesconto = totalDesconto;
	}

	public BigDecimal getValorImpostoImportados() {
		return valorImpostoImportados;
	}

	public void setValorImpostoImportados(BigDecimal valorImpostoImportados) {
		this.valorImpostoImportados = valorImpostoImportados;
	}

	public CodigoIPI getCodigoIPI() {
		return codigoIPI;
	}

	public void setCodigoIPI(CodigoIPI codigoIPI) {
		this.codigoIPI = codigoIPI;
	}

	public CodigoIPI getCodigoAliquotaIPI() {
		return codigoAliquotaIPI;
	}

	public void setCodigoAliquotaIPI(CodigoIPI codigoAliquotaIPI) {
		this.codigoAliquotaIPI = codigoAliquotaIPI;
	}

	public BigDecimal getAliquotaIpi() {
		return aliquotaIpi;
	}

	public void setAliquotaIpi(BigDecimal aliquotaIpi) {
		this.aliquotaIpi = aliquotaIpi;
	}

	public BigDecimal getAliquotaReducaoIpi() {
		return aliquotaReducaoIpi;
	}

	public void setAliquotaReducaoIpi(BigDecimal aliquotaReducaoIpi) {
		this.aliquotaReducaoIpi = aliquotaReducaoIpi;
	}

	public BigDecimal getBaseIpi() {
		return baseIpi;
	}

	public void setBaseIpi(BigDecimal baseIpi) {
		this.baseIpi = baseIpi;
	}

	public BigDecimal getValorIpi() {
		return valorIpi;
	}

	public void setValorIpi(BigDecimal valorIpi) {
		this.valorIpi = valorIpi;
	}

	public BigDecimal getValorIpiDevolvido() {
		return valorIpiDevolvido;
	}

	public void setValorIpiDevolvido(BigDecimal valorIpiDevolvido) {
		this.valorIpiDevolvido = valorIpiDevolvido;
	}

	public CodigoPisCofins getCodigoPis() {
		return codigoPis;
	}

	public void setCodigoPis(CodigoPisCofins codigoPis) {
		this.codigoPis = codigoPis;
	}

	public BigDecimal getAliquotaPis() {
		return aliquotaPis;
	}

	public void setAliquotaPis(BigDecimal aliquotaPis) {
		this.aliquotaPis = aliquotaPis;
	}

	public BigDecimal getAliquotaReducaoPis() {
		return aliquotaReducaoPis;
	}

	public void setAliquotaReducaoPis(BigDecimal aliquotaReducaoPis) {
		this.aliquotaReducaoPis = aliquotaReducaoPis;
	}

	public BigDecimal getBasePis() {
		return basePis;
	}

	public void setBasePis(BigDecimal basePis) {
		this.basePis = basePis;
	}

	public BigDecimal getValorPis() {
		return valorPis;
	}

	public void setValorPis(BigDecimal valorPis) {
		this.valorPis = valorPis;
	}

	public CodigoPisCofins getCodigoCofins() {
		return codigoCofins;
	}

	public void setCodigoCofins(CodigoPisCofins codigoCofins) {
		this.codigoCofins = codigoCofins;
	}

	public BigDecimal getAliquotaCofins() {
		return aliquotaCofins;
	}

	public void setAliquotaCofins(BigDecimal aliquotaCofins) {
		this.aliquotaCofins = aliquotaCofins;
	}

	public BigDecimal getAliquotaReducaoCofins() {
		return aliquotaReducaoCofins;
	}

	public void setAliquotaReducaoCofins(BigDecimal aliquotaReducaoCofins) {
		this.aliquotaReducaoCofins = aliquotaReducaoCofins;
	}

	public BigDecimal getBaseCofins() {
		return baseCofins;
	}

	public void setBaseCofins(BigDecimal baseCofins) {
		this.baseCofins = baseCofins;
	}

	public BigDecimal getValorCofins() {
		return valorCofins;
	}

	public void setValorCofins(BigDecimal valorCofins) {
		this.valorCofins = valorCofins;
	}

	public BigDecimal getValorOutras() {
		return valorOutras;
	}

	public void setValorOutras(BigDecimal valorOutras) {
		this.valorOutras = valorOutras;
	}

	public BigDecimal getAliquotaIrrf() {
		return aliquotaIrrf;
	}

	public void setAliquotaIrrf(BigDecimal aliquotaIrrf) {
		this.aliquotaIrrf = aliquotaIrrf;
	}

	public BigDecimal getBaseIrrf() {
		return baseIrrf;
	}

	public void setBaseIrrf(BigDecimal baseIrrf) {
		this.baseIrrf = baseIrrf;
	}

	public BigDecimal getValorIrrf() {
		return valorIrrf;
	}

	public void setValorIrrf(BigDecimal valorIrrf) {
		this.valorIrrf = valorIrrf;
	}

	public BigDecimal getAliquotaInss() {
		return aliquotaInss;
	}

	public void setAliquotaInss(BigDecimal aliquotaInss) {
		this.aliquotaInss = aliquotaInss;
	}

	public BigDecimal getBaseInss() {
		return baseInss;
	}

	public void setBaseInss(BigDecimal baseInss) {
		this.baseInss = baseInss;
	}

	public BigDecimal getValorInss() {
		return valorInss;
	}

	public void setValorInss(BigDecimal valorInss) {
		this.valorInss = valorInss;
	}

	public BigDecimal getAliquotaIss() {
		return aliquotaIss;
	}

	public void setAliquotaIss(BigDecimal aliquotaIss) {
		this.aliquotaIss = aliquotaIss;
	}

	public BigDecimal getBaseIss() {
		return baseIss;
	}

	public void setBaseIss(BigDecimal baseIss) {
		this.baseIss = baseIss;
	}

	public BigDecimal getValorIss() {
		return valorIss;
	}

	public void setValorIss(BigDecimal valorIss) {
		this.valorIss = valorIss;
	}

	public BigDecimal getAliquotaCsll() {
		return aliquotaCsll;
	}

	public void setAliquotaCsll(BigDecimal aliquotaCsll) {
		this.aliquotaCsll = aliquotaCsll;
	}

	public BigDecimal getBaseCsll() {
		return baseCsll;
	}

	public void setBaseCsll(BigDecimal baseCsll) {
		this.baseCsll = baseCsll;
	}

	public BigDecimal getValorCsll() {
		return valorCsll;
	}

	public void setValorCsll(BigDecimal valorCsll) {
		this.valorCsll = valorCsll;
	}

	public BigDecimal getTotalTributos() {
		return totalTributos;
	}

	public void setTotalTributos(BigDecimal totalTributos) {
		this.totalTributos = totalTributos;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
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
		ItemMovimento other = (ItemMovimento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemMovimento [id=" + id + ", movimento=" + movimento + ", produto=" + produto + ", codigoCFOP="
				+ codigoCFOP + ", complementoNatureza=" + complementoNatureza + ", origem=" + origem + ", tribitacao="
				+ tribitacao + ", unidadeProduto=" + unidadeProduto + ", codigo=" + codigo + ", descricao=" + descricao
				+ ", codigoCest=" + codigoCest + ", codigoNcn=" + codigoNcn + ", codigoAnp=" + codigoAnp
				+ ", codigoAjusteIcms=" + codigoAjusteIcms + ", quantidade=" + quantidade + ", valorUnitario="
				+ valorUnitario + ", valorCusto=" + valorCusto + ", aliquotaIcms=" + aliquotaIcms
				+ ", aliquotaReducaoIcms=" + aliquotaReducaoIcms + ", baseIcms=" + baseIcms + ", valorIcms=" + valorIcms
				+ ", valorDesoneradoIcms=" + valorDesoneradoIcms + ", IcmsFcpDestino=" + IcmsFcpDestino
				+ ", IcmsInterestadualDestino=" + IcmsInterestadualDestino + ", IcmsInterestadualRemetente="
				+ IcmsInterestadualRemetente + ", valorFcp=" + valorFcp + ", aliquotaICMSST=" + aliquotaICMSST
				+ ", aliquotaReducaoIcmsSt=" + aliquotaReducaoIcmsSt + ", baseIcmsSt=" + baseIcmsSt + ", valorIcmsSt="
				+ valorIcmsSt + ", valorFcpSt=" + valorFcpSt + ", valorFcpStAnteriormente=" + valorFcpStAnteriormente
				+ ", baseIcmsStAnteriormente=" + baseIcmsStAnteriormente + ", valorICMSSTAnteriormente="
				+ valorICMSSTAnteriormente + ", totalProdutoServico=" + totalProdutoServico + ", totalFrete="
				+ totalFrete + ", totalSeguro=" + totalSeguro + ", totalDesconto=" + totalDesconto
				+ ", valorImpostoImportados=" + valorImpostoImportados + ", codigoIPI=" + codigoIPI
				+ ", codigoAliquotaIPI=" + codigoAliquotaIPI + ", aliquotaIpi=" + aliquotaIpi + ", aliquotaReducaoIpi="
				+ aliquotaReducaoIpi + ", baseIpi=" + baseIpi + ", valorIpi=" + valorIpi + ", valorIpiDevolvido="
				+ valorIpiDevolvido + ", codigoPis=" + codigoPis + ", aliquotaPis=" + aliquotaPis
				+ ", aliquotaReducaoPis=" + aliquotaReducaoPis + ", basePis=" + basePis + ", valorPis=" + valorPis
				+ ", codigoCofins=" + codigoCofins + ", aliquotaCofins=" + aliquotaCofins + ", aliquotaReducaoCofins="
				+ aliquotaReducaoCofins + ", baseCofins=" + baseCofins + ", valorCofins=" + valorCofins
				+ ", valorOutras=" + valorOutras + ", aliquotaIrrf=" + aliquotaIrrf + ", baseIrrf=" + baseIrrf
				+ ", valorIrrf=" + valorIrrf + ", aliquotaInss=" + aliquotaInss + ", baseInss=" + baseInss
				+ ", valorInss=" + valorInss + ", aliquotaIss=" + aliquotaIss + ", baseIss=" + baseIss + ", valorIss="
				+ valorIss + ", aliquotaCsll=" + aliquotaCsll + ", baseCsll=" + baseCsll + ", valorCsll=" + valorCsll
				+ ", totalTributos=" + totalTributos + ", informacao=" + informacao + "]";
	}

}
