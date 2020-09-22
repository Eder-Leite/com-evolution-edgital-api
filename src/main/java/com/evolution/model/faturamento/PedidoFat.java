package com.evolution.model.faturamento;

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

import com.evolution.model.adm.Almoxarifado;
import com.evolution.model.cadastro.Cadastro;
import com.evolution.model.cadastro.Endereco;
import com.evolution.model.cadastro.Motorista;
import com.evolution.model.cadastro.Veiculo;
import com.evolution.model.cadastro.Vendedor;
import com.evolution.model.faturamento.enumerador.SituacaoPedido;
import com.evolution.model.livro.Finalidade;
import com.evolution.model.livro.enumerador.IndicadorConsumidor;
import com.evolution.model.livro.enumerador.IndicadorPresenca;
import com.evolution.model.livro.enumerador.ModalidadeFrete;
import com.evolution.model.seguranca.Usuario;
import com.evolution.model.tesouraria.LocalFaturamento;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "FATPEDID")
@SuppressWarnings("deprecation")
public class PedidoFat {

	@Id
	@Column(name = "NCODIPEDID", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAT_SFATPEDID")
	@SequenceGenerator(sequenceName = "FAT_SFATPEDID", allocationSize = 1, name = "FAT_SFATPEDID")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATPEDID_TESLOCAL")
	@JoinColumn(name = "NCODILOCAL", nullable = false)
	private LocalFaturamento localFaturamento;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATPEDID_SEGUSUAR")
	@JoinColumn(name = "NCODIUSUAR", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATPEDID_FATPEDID")
	@JoinColumn(name = "NCPAIPEDID", nullable = true)
	private PedidoFat pedidoPai;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATPEDID_ADMALMOX")
	@JoinColumn(name = "NCODIALMOX", nullable = false)
	private Almoxarifado almoxarifado;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATPEDID_CADGERAL")
	@JoinColumn(name = "NCODIGERAL", nullable = false)
	private Cadastro cadastro;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATPEDID_CADENDER")
	@JoinColumn(name = "NCODIENDER", nullable = false)
	private Endereco endereco;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATPEDID_CADVENDE")
	@JoinColumn(name = "NCODIVENDE", nullable = false)
	private Vendedor vendedor;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATPEDID_LIVFINAL")
	@JoinColumn(name = "NCODIFINAL", nullable = false)
	private Finalidade finalidade;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATPEDID_CADGERAL1")
	@JoinColumn(name = "NTRANPEDID", nullable = true)
	private Cadastro transportador;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATPEDID_CADVEICU")
	@JoinColumn(name = "NCODOVEICU", nullable = true)
	private Veiculo veiculo;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATPEDID_CADMOTOR")
	@JoinColumn(name = "NCODIMOTOR", nullable = true)
	private Motorista motorista;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "NINDCPEDID", nullable = false)
	private IndicadorConsumidor indicadorConsumidor;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "NINDPPEDID", nullable = false)
	private IndicadorPresenca indicadorPresenca;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "NTIPFPEDID", nullable = false)
	private ModalidadeFrete modalidadeFrete;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVOLUPEDID", nullable = false)
	private Long numeroVolume = 1l;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CESPEPEDID", nullable = false, length = 60)
	private String especieVolume = "UNIDADE";

	@NotNull(message = "é obrigatório")
	@Column(name = "NPESBPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal pesoBruto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NPESLPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal pesoLiquido = BigDecimal.ZERO;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDOCUPEDID", nullable = false, length = 25)
	private String documento;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDATAPEDID", nullable = false)
	private Date data = new Date();

	@Column(name = "CDESCPEDID", nullable = true, length = 255)
	private String descricao;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSITUPEDID", nullable = false)
	private SituacaoPedido situacao = SituacaoPedido.ABERTO;

	@Column(name = "NNOMEPEDID", nullable = true, length = 255)
	private String nomeConsumidor;

	@Column(name = "NCNPJPEDID", nullable = true, length = 14)
	private String cnpjCpfConsumidor;

	@Column(name = "NPLACPEDID", nullable = false, length = 7)
	private String placaConsumidor = "AAA0000";

	@Column(name = "NNUKMPEDID", nullable = false)
	private Long kmConsumidor;

	@NotNull(message = "é obrigatório")
	@Column(name = "NPRODPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalProduto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NDESCPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalDesconto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NICMSPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTIPIPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalIpi = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NFRETPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalFrete = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NSEGUPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalSeguro = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NOUTRPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalOutras = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NINSSPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalInss = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTISSPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalIss = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NIRRFPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalIrrf = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NCSSLPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totaCssl = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTPISPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalPis = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NCOFIPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalCofins = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTOTAPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal total = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVDINPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalDinheiro = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVCHEPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totaCheque = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVCARPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalCartao = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVCFRPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalCartaFrete = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVTROPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorTroco = BigDecimal.ZERO;

	@Column(name = "COBSVPEDID", nullable = true, length = 2000)
	private String observacao;

	@JsonManagedReference
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<ItemPedidoFat> itens = new ArrayList<>();

	@JsonManagedReference
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<ParcelaPedidoFat> parcelas = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalFaturamento getLocalFaturamento() {
		return localFaturamento;
	}

	public void setLocalFaturamento(LocalFaturamento localFaturamento) {
		this.localFaturamento = localFaturamento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public PedidoFat getPedidoPai() {
		return pedidoPai;
	}

	public void setPedidoPai(PedidoFat pedidoPai) {
		this.pedidoPai = pedidoPai;
	}

	public Almoxarifado getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(Almoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
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

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Finalidade getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(Finalidade finalidade) {
		this.finalidade = finalidade;
	}

	public Cadastro getTransportador() {
		return transportador;
	}

	public void setTransportador(Cadastro transportador) {
		this.transportador = transportador;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public IndicadorConsumidor getIndicadorConsumidor() {
		return indicadorConsumidor;
	}

	public void setIndicadorConsumidor(IndicadorConsumidor indicadorConsumidor) {
		this.indicadorConsumidor = indicadorConsumidor;
	}

	public IndicadorPresenca getIndicadorPresenca() {
		return indicadorPresenca;
	}

	public void setIndicadorPresenca(IndicadorPresenca indicadorPresenca) {
		this.indicadorPresenca = indicadorPresenca;
	}

	public ModalidadeFrete getModalidadeFrete() {
		return modalidadeFrete;
	}

	public void setModalidadeFrete(ModalidadeFrete modalidadeFrete) {
		this.modalidadeFrete = modalidadeFrete;
	}

	public Long getNumeroVolume() {
		return numeroVolume;
	}

	public void setNumeroVolume(Long numeroVolume) {
		this.numeroVolume = numeroVolume;
	}

	public String getEspecieVolume() {
		return especieVolume;
	}

	public void setEspecieVolume(String especieVolume) {
		this.especieVolume = especieVolume;
	}

	public BigDecimal getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(BigDecimal pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public BigDecimal getPesoLiquido() {
		return pesoLiquido;
	}

	public void setPesoLiquido(BigDecimal pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public SituacaoPedido getSituacaoPedido() {
		return situacao;
	}

	public void setSituacaoPedido(SituacaoPedido situacao) {
		this.situacao = situacao;
	}

	public String getNomeConsumidor() {
		return nomeConsumidor;
	}

	public void setNomeConsumidor(String nomeConsumidor) {
		this.nomeConsumidor = nomeConsumidor;
	}

	public String getCnpjCpfConsumidor() {
		return cnpjCpfConsumidor;
	}

	public void setCnpjCpfConsumidor(String cnpjCpfConsumidor) {
		this.cnpjCpfConsumidor = cnpjCpfConsumidor;
	}

	public String getPlacaConsumidor() {
		return placaConsumidor;
	}

	public void setPlacaConsumidor(String placaConsumidor) {
		this.placaConsumidor = placaConsumidor;
	}

	public Long getKmConsumidor() {
		return kmConsumidor;
	}

	public void setKmConsumidor(Long kmConsumidor) {
		this.kmConsumidor = kmConsumidor;
	}

	public BigDecimal getTotalProduto() {
		return totalProduto;
	}

	public void setTotalProduto(BigDecimal totalProduto) {
		this.totalProduto = totalProduto;
	}

	public BigDecimal getTotalDesconto() {
		return totalDesconto;
	}

	public void setTotalDesconto(BigDecimal totalDesconto) {
		this.totalDesconto = totalDesconto;
	}

	public BigDecimal getTotalIcms() {
		return totalIcms;
	}

	public void setTotalIcms(BigDecimal totalIcms) {
		this.totalIcms = totalIcms;
	}

	public BigDecimal getTotalIpi() {
		return totalIpi;
	}

	public void setTotalIpi(BigDecimal totalIpi) {
		this.totalIpi = totalIpi;
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

	public BigDecimal getTotalOutras() {
		return totalOutras;
	}

	public void setTotalOutras(BigDecimal totalOutras) {
		this.totalOutras = totalOutras;
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

	public BigDecimal getTotalIrrf() {
		return totalIrrf;
	}

	public void setTotalIrrf(BigDecimal totalIrrf) {
		this.totalIrrf = totalIrrf;
	}

	public BigDecimal getTotaCssl() {
		return totaCssl;
	}

	public void setTotaCssl(BigDecimal totaCssl) {
		this.totaCssl = totaCssl;
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

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getTotalDinheiro() {
		return totalDinheiro;
	}

	public void setTotalDinheiro(BigDecimal totalDinheiro) {
		this.totalDinheiro = totalDinheiro;
	}

	public BigDecimal getTotaCheque() {
		return totaCheque;
	}

	public void setTotaCheque(BigDecimal totaCheque) {
		this.totaCheque = totaCheque;
	}

	public BigDecimal getTotalCartao() {
		return totalCartao;
	}

	public void setTotalCartao(BigDecimal totalCartao) {
		this.totalCartao = totalCartao;
	}

	public BigDecimal getTotalCartaFrete() {
		return totalCartaFrete;
	}

	public void setTotalCartaFrete(BigDecimal totalCartaFrete) {
		this.totalCartaFrete = totalCartaFrete;
	}

	public BigDecimal getValorTroco() {
		return valorTroco;
	}

	public void setValorTroco(BigDecimal valorTroco) {
		this.valorTroco = valorTroco;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<ItemPedidoFat> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedidoFat> itens) {
		this.itens = itens;
	}

	public List<ParcelaPedidoFat> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<ParcelaPedidoFat> parcelas) {
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
		PedidoFat other = (PedidoFat) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", localFaturamento=" + localFaturamento + ", usuario=" + usuario + ", pedidoPai="
				+ pedidoPai + ", almoxarifado=" + almoxarifado + ", cadastro=" + cadastro + ", endereco=" + endereco
				+ ", vendedor=" + vendedor + ", finalidade=" + finalidade + ", transportador=" + transportador
				+ ", veiculo=" + veiculo + ", motorista=" + motorista + ", indicadorConsumidor=" + indicadorConsumidor
				+ ", indicadorPresenca=" + indicadorPresenca + ", modalidadeFrete=" + modalidadeFrete
				+ ", numeroVolume=" + numeroVolume + ", especieVolume=" + especieVolume + ", pesoBruto=" + pesoBruto
				+ ", pesoLiquido=" + pesoLiquido + ", documento=" + documento + ", data=" + data + ", descricao="
				+ descricao + ", situacao=" + situacao + ", nomeConsumidor=" + nomeConsumidor + ", cnpjCpfConsumidor="
				+ cnpjCpfConsumidor + ", placaConsumidor=" + placaConsumidor + ", kmConsumidor=" + kmConsumidor
				+ ", totalProduto=" + totalProduto + ", totalDesconto=" + totalDesconto + ", totalIcms=" + totalIcms
				+ ", totalIpi=" + totalIpi + ", totalFrete=" + totalFrete + ", totalSeguro=" + totalSeguro
				+ ", totalOutras=" + totalOutras + ", totalInss=" + totalInss + ", totalIss=" + totalIss
				+ ", totalIrrf=" + totalIrrf + ", totaCssl=" + totaCssl + ", totalPis=" + totalPis + ", totalCofins="
				+ totalCofins + ", total=" + total + ", totalDinheiro=" + totalDinheiro + ", totaCheque=" + totaCheque
				+ ", totalCartao=" + totalCartao + ", totalCartaFrete=" + totalCartaFrete + ", valorTroco=" + valorTroco
				+ ", observacao=" + observacao + ", itens=" + itens + ", parcelas=" + parcelas + "]";
	}
}
