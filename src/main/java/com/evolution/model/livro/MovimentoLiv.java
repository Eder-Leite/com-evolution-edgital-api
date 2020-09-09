package com.evolution.model.livro;

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
import com.evolution.model.cadastro.Endereco;
import com.evolution.model.cadastro.Filial;
import com.evolution.model.livro.enumerador.Check;
import com.evolution.model.livro.enumerador.IndicadorConsumidor;
import com.evolution.model.livro.enumerador.IndicadorPresenca;
import com.evolution.model.livro.enumerador.SituacaoMovimento;
import com.evolution.model.seguranca.Usuario;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "LIVMOVIM")
@SuppressWarnings("deprecation")
public class MovimentoLiv {

	@Id
	@Column(name = "NCODIMOVIM", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIV_SLIVMOVIM")
	@SequenceGenerator(sequenceName = "LIV_SLIVMOVIM", allocationSize = 1, name = "LIV_SLIVMOVIM")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVMOVIM_SEGUSUAR")
	@JoinColumn(name = "NCODIUSUAR", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVMOVIM_CADFILIA")
	@JoinColumn(name = "NCODIFILIA", nullable = false)
	private Filial filial;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVMOVIM_CADGERAL")
	@JoinColumn(name = "NCODIGERAL", nullable = false)
	private Cadastro cadastro;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVMOVIM_CADENDER")
	@JoinColumn(name = "NCODIENDER", nullable = false)
	private Endereco endereco;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVMOVIM_LIVFINAL")
	@JoinColumn(name = "NCODIFINAL", nullable = false)
	private Finalidade finalidade;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVMOVIM_LIVMODEL")
	@JoinColumn(name = "NCODMODEL", nullable = false)
	private Modelo modelo;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_LIVMOVIM_LIVSERIE")
	@JoinColumn(name = "NCODISERIE", nullable = false)
	private Serie serie;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "NINDPMOVIM", nullable = false)
	private IndicadorPresenca indicadorPresenca;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "NCONFMOVIM", nullable = false)
	private IndicadorConsumidor indicadorConsumidor;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCMOVIM", nullable = false, length = 120)
	private String descricao;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CMANUMOVIM", nullable = false)
	private Check movimentoManual = Check.NÃO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CEMIPMOVIM", nullable = false)
	private Check emissaoPropria = Check.NÃO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NDOCUMOVIM", nullable = false)
	private Long numero;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSITUMOVIM", nullable = false)
	private SituacaoMovimento situacao = SituacaoMovimento.ABERTO;

	@Column(name = "CHAVEMOVIM", length = 44)
	private String chave;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDATAMOVIM")
	private Date dataMovimento;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DENSAMOVIM")
	private Date dataEntradaSaida;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDTCAMOVIM")
	private Date dataCadastro = new Date();

	@NotNull(message = "é obrigatório")
	@Column(name = "NVBCIMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal baseIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVICMMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVICDMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal icmsDesonerado = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NFCPIMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal icmsFcpDestino = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NICMIMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal icmsInterestadualDestino = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NICMRMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal icmsInterestadualRemetente = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVFCPMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal icmsFcp = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVBSTMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal baseIcmsSt = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVLSTMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal IcmsSt = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NFCPSMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal icmsFcpSt = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NFCPRMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal icmsAnteriormenteFcpSt = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVTOPMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalProdutoServico = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVFREMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalFrete = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVSEGMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalSeguro = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVDESMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalDesconto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVLIIMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalImpostoImportados = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVIPIMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalIpi = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NIPIDMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalIpiDevolvido = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVPISMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalPis = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVCOFMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalCofins = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVOUTMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalOutras = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NIRRFMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalIrrf = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NINSSMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalInss = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVISSMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalIss = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NCSLLMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalCsll = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTOTAMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalMovimento = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTTRIMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalTributosIss = BigDecimal.ZERO;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CFISCMOVIM", length = 2000)
	private String informacaoFisco;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CICOMMOVIM", length = 4000)
	private String informacaoComplementares;

	@NotBlank(message = "é obrigatório")
	@Column(name = "COBSEMOVIM", length = 4000)
	private String observacao;

	@JsonManagedReference
	@OneToMany(mappedBy = "movimento", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<ItemMovimento> itens = new ArrayList<>();

	@JsonManagedReference
	@OneToMany(mappedBy = "movimento", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<ParcelaMovimento> parcelas = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Finalidade getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(Finalidade finalidade) {
		this.finalidade = finalidade;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public IndicadorPresenca getIndicadorPresenca() {
		return indicadorPresenca;
	}

	public void setIndicadorPresenca(IndicadorPresenca indicadorPresenca) {
		this.indicadorPresenca = indicadorPresenca;
	}

	public IndicadorConsumidor getIndicadorConsumidor() {
		return indicadorConsumidor;
	}

	public void setIndicadorConsumidor(IndicadorConsumidor indicadorConsumidor) {
		this.indicadorConsumidor = indicadorConsumidor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Check getMovimentoManual() {
		return movimentoManual;
	}

	public void setMovimentoManual(Check movimentoManual) {
		this.movimentoManual = movimentoManual;
	}

	public Check getEmissaoPropria() {
		return emissaoPropria;
	}

	public void setEmissaoPropria(Check emissaoPropria) {
		this.emissaoPropria = emissaoPropria;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public SituacaoMovimento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoMovimento situacao) {
		this.situacao = situacao;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public Date getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	public Date getDataEntradaSaida() {
		return dataEntradaSaida;
	}

	public void setDataEntradaSaida(Date dataEntradaSaida) {
		this.dataEntradaSaida = dataEntradaSaida;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
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

	public BigDecimal getIcmsDesonerado() {
		return icmsDesonerado;
	}

	public void setIcmsDesonerado(BigDecimal icmsDesonerado) {
		this.icmsDesonerado = icmsDesonerado;
	}

	public BigDecimal getIcmsFcpDestino() {
		return icmsFcpDestino;
	}

	public void setIcmsFcpDestino(BigDecimal icmsFcpDestino) {
		this.icmsFcpDestino = icmsFcpDestino;
	}

	public BigDecimal getIcmsInterestadualDestino() {
		return icmsInterestadualDestino;
	}

	public void setIcmsInterestadualDestino(BigDecimal icmsInterestadualDestino) {
		this.icmsInterestadualDestino = icmsInterestadualDestino;
	}

	public BigDecimal getIcmsInterestadualRemetente() {
		return icmsInterestadualRemetente;
	}

	public void setIcmsInterestadualRemetente(BigDecimal icmsInterestadualRemetente) {
		this.icmsInterestadualRemetente = icmsInterestadualRemetente;
	}

	public BigDecimal getIcmsFcp() {
		return icmsFcp;
	}

	public void setIcmsFcp(BigDecimal icmsFcp) {
		this.icmsFcp = icmsFcp;
	}

	public BigDecimal getBaseIcmsSt() {
		return baseIcmsSt;
	}

	public void setBaseIcmsSt(BigDecimal baseIcmsSt) {
		this.baseIcmsSt = baseIcmsSt;
	}

	public BigDecimal getIcmsSt() {
		return IcmsSt;
	}

	public void setIcmsSt(BigDecimal icmsSt) {
		IcmsSt = icmsSt;
	}

	public BigDecimal getIcmsFcpSt() {
		return icmsFcpSt;
	}

	public void setIcmsFcpSt(BigDecimal icmsFcpSt) {
		this.icmsFcpSt = icmsFcpSt;
	}

	public BigDecimal getIcmsAnteriormenteFcpSt() {
		return icmsAnteriormenteFcpSt;
	}

	public void setIcmsAnteriormenteFcpSt(BigDecimal icmsAnteriormenteFcpSt) {
		this.icmsAnteriormenteFcpSt = icmsAnteriormenteFcpSt;
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

	public BigDecimal getTotalImpostoImportados() {
		return totalImpostoImportados;
	}

	public void setTotalImpostoImportados(BigDecimal totalImpostoImportados) {
		this.totalImpostoImportados = totalImpostoImportados;
	}

	public BigDecimal getTotalIpi() {
		return totalIpi;
	}

	public void setTotalIpi(BigDecimal totalIpi) {
		this.totalIpi = totalIpi;
	}

	public BigDecimal getTotalIpiDevolvido() {
		return totalIpiDevolvido;
	}

	public void setTotalIpiDevolvido(BigDecimal totalIpiDevolvido) {
		this.totalIpiDevolvido = totalIpiDevolvido;
	}

	public BigDecimal getTotalPis() {
		return totalPis;
	}

	public void setTotalPis(BigDecimal totalPis) {
		this.totalPis = totalPis;
	}

	public BigDecimal getTotalCofins() {
		return totalCofins;
	}

	public void setTotalCofins(BigDecimal totalCofins) {
		this.totalCofins = totalCofins;
	}

	public BigDecimal getTotalOutras() {
		return totalOutras;
	}

	public void setTotalOutras(BigDecimal totalOutras) {
		this.totalOutras = totalOutras;
	}

	public BigDecimal getTotalIrrf() {
		return totalIrrf;
	}

	public void setTotalIrrf(BigDecimal totalIrrf) {
		this.totalIrrf = totalIrrf;
	}

	public BigDecimal getTotalInss() {
		return totalInss;
	}

	public void setTotalInss(BigDecimal totalInss) {
		this.totalInss = totalInss;
	}

	public BigDecimal getTotalIss() {
		return totalIss;
	}

	public void setTotalIss(BigDecimal totalIss) {
		this.totalIss = totalIss;
	}

	public BigDecimal getTotalCsll() {
		return totalCsll;
	}

	public void setTotalCsll(BigDecimal totalCsll) {
		this.totalCsll = totalCsll;
	}

	public BigDecimal getTotalMovimento() {
		return totalMovimento;
	}

	public void setTotalMovimento(BigDecimal totalMovimento) {
		this.totalMovimento = totalMovimento;
	}

	public BigDecimal getTotalTributosIss() {
		return totalTributosIss;
	}

	public void setTotalTributosIss(BigDecimal totalTributosIss) {
		this.totalTributosIss = totalTributosIss;
	}

	public String getInformacaoFisco() {
		return informacaoFisco;
	}

	public void setInformacaoFisco(String informacaoFisco) {
		this.informacaoFisco = informacaoFisco;
	}

	public String getInformacaoComplementares() {
		return informacaoComplementares;
	}

	public void setInformacaoComplementares(String informacaoComplementares) {
		this.informacaoComplementares = informacaoComplementares;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<ItemMovimento> getItens() {
		return itens;
	}

	public void setItens(List<ItemMovimento> itens) {
		this.itens = itens;
	}

	public List<ParcelaMovimento> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<ParcelaMovimento> parcelas) {
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
		MovimentoLiv other = (MovimentoLiv) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Movimento [id=" + id + ", usuario=" + usuario + ", filial=" + filial + ", cadastro=" + cadastro
				+ ", endereco=" + endereco + ", finalidade=" + finalidade + ", modelo=" + modelo + ", serie=" + serie
				+ ", indicadorPresenca=" + indicadorPresenca + ", indicadorConsumidor=" + indicadorConsumidor
				+ ", descricao=" + descricao + ", movimentoManual=" + movimentoManual + ", emissaoPropria="
				+ emissaoPropria + ", numero=" + numero + ", situacao=" + situacao + ", chave=" + chave
				+ ", dataMovimento=" + dataMovimento + ", dataEntradaSaida=" + dataEntradaSaida + ", dataCadastro="
				+ dataCadastro + ", baseIcms=" + baseIcms + ", valorIcms=" + valorIcms + ", icmsDesonerado="
				+ icmsDesonerado + ", icmsFcpDestino=" + icmsFcpDestino + ", icmsInterestadualDestino="
				+ icmsInterestadualDestino + ", icmsInterestadualRemetente=" + icmsInterestadualRemetente + ", icmsFcp="
				+ icmsFcp + ", baseIcmsSt=" + baseIcmsSt + ", IcmsSt=" + IcmsSt + ", icmsFcpSt=" + icmsFcpSt
				+ ", icmsAnteriormenteFcpSt=" + icmsAnteriormenteFcpSt + ", totalProdutoServico=" + totalProdutoServico
				+ ", totalFrete=" + totalFrete + ", totalSeguro=" + totalSeguro + ", totalDesconto=" + totalDesconto
				+ ", totalImpostoImportados=" + totalImpostoImportados + ", totalIpi=" + totalIpi
				+ ", totalIpiDevolvido=" + totalIpiDevolvido + ", totalPis=" + totalPis + ", totalCofins=" + totalCofins
				+ ", totalOutras=" + totalOutras + ", totalIrrf=" + totalIrrf + ", totalInss=" + totalInss
				+ ", totalIss=" + totalIss + ", totalCsll=" + totalCsll + ", totalMovimento=" + totalMovimento
				+ ", totalTributosIss=" + totalTributosIss + ", informacaoFisco=" + informacaoFisco
				+ ", informacaoComplementares=" + informacaoComplementares + ", observacao=" + observacao + ", itens="
				+ itens + ", parcelas=" + parcelas + "]";
	}
}
