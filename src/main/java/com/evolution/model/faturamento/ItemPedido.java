package com.evolution.model.faturamento;

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
import com.evolution.model.livro.ComplementoNatureza;
import com.evolution.model.livro.ItemAliquotaUF;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "FATITPED")
@SuppressWarnings("deprecation")
public class ItemPedido {

	@Id
	@Column(name = "NCODIITPED", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAT_SFATITPED")
	@SequenceGenerator(sequenceName = "FAT_SFATITPED", allocationSize = 1, name = "FAT_SFATITPED")
	private Long id;

	@ManyToOne
	@JsonBackReference
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATITPED_FATPEDID")
	@JoinColumn(name = "NCODIPEDID", nullable = false)
	private PedidoFat pedido;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATITPED_ADMPRODU")
	@JoinColumn(name = "NCODIPRODU", nullable = false)
	private Produto produto;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATITPED_LIVCOMPN")
	@JoinColumn(name = "NCODICOMPN", nullable = false)
	private ComplementoNatureza complementoNatureza;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_FATITPED_LIVITALI")
	@JoinColumn(name = "NCODIITALI", nullable = false)
	private ItemAliquotaUF itemAliquotaUF;

	@NotNull(message = "é obrigatório")
	@Column(name = "NQTDEITPED", nullable = false, precision = 19, scale = 3)
	private BigDecimal quantidade = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVUNIITPED", nullable = false, precision = 19, scale = 6)
	private BigDecimal valorUnitario = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NCUSTITPED", nullable = false, precision = 19, scale = 6)
	private BigDecimal valorCusto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NPRODITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalProdutoServico = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NDESCITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorDesconto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NOUTRITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorOutras = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NFRETITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorFrete = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NSEGUITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorSeguro = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NINSSITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorInss = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTISSITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorIss = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NIRRFITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorIrrf = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NCSSLITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorCssl = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTPISITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorPis = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NCOFIITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorCofins = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NPIPIITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal percentualIpi = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTIPIITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorIpi = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NBICMITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal baseIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NRICMITPED", nullable = false, precision = 19, scale = 6)
	private BigDecimal aliquotaReducaoIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NAICMITPED", nullable = false, precision = 19, scale = 6)
	private BigDecimal aliquotaIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NDICMITPED", nullable = false, precision = 19, scale = 6)
	private BigDecimal aliquotaDiferimentoIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NICMSITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valorIcms = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTOTAITPED", nullable = false, precision = 19, scale = 2)
	private BigDecimal valortotal = BigDecimal.ZERO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PedidoFat getPedido() {
		return pedido;
	}

	public void setPedido(PedidoFat pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public ComplementoNatureza getComplementoNatureza() {
		return complementoNatureza;
	}

	public void setComplementoNatureza(ComplementoNatureza complementoNatureza) {
		this.complementoNatureza = complementoNatureza;
	}

	public ItemAliquotaUF getItemAliquotaUF() {
		return itemAliquotaUF;
	}

	public void setItemAliquotaUF(ItemAliquotaUF itemAliquotaUF) {
		this.itemAliquotaUF = itemAliquotaUF;
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

	public BigDecimal getTotalProdutoServico() {
		return totalProdutoServico;
	}

	public void setTotalProdutoServico(BigDecimal totalProdutoServico) {
		this.totalProdutoServico = totalProdutoServico;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorOutras() {
		return valorOutras;
	}

	public void setValorOutras(BigDecimal valorOutras) {
		this.valorOutras = valorOutras;
	}

	public BigDecimal getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(BigDecimal valorFrete) {
		this.valorFrete = valorFrete;
	}

	public BigDecimal getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(BigDecimal valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public BigDecimal getValorInss() {
		return valorInss;
	}

	public void setValorInss(BigDecimal valorInss) {
		this.valorInss = valorInss;
	}

	public BigDecimal getValorIss() {
		return valorIss;
	}

	public void setValorIss(BigDecimal valorIss) {
		this.valorIss = valorIss;
	}

	public BigDecimal getValorIrrf() {
		return valorIrrf;
	}

	public void setValorIrrf(BigDecimal valorIrrf) {
		this.valorIrrf = valorIrrf;
	}

	public BigDecimal getValorCssl() {
		return valorCssl;
	}

	public void setValorCssl(BigDecimal valorCssl) {
		this.valorCssl = valorCssl;
	}

	public BigDecimal getValorPis() {
		return valorPis;
	}

	public void setValorPis(BigDecimal valorPis) {
		this.valorPis = valorPis;
	}

	public BigDecimal getValorCofins() {
		return valorCofins;
	}

	public void setValorCofins(BigDecimal valorCofins) {
		this.valorCofins = valorCofins;
	}

	public BigDecimal getPercentualIpi() {
		return percentualIpi;
	}

	public void setPercentualIpi(BigDecimal percentualIpi) {
		this.percentualIpi = percentualIpi;
	}

	public BigDecimal getValorIpi() {
		return valorIpi;
	}

	public void setValorIpi(BigDecimal valorIpi) {
		this.valorIpi = valorIpi;
	}

	public BigDecimal getBaseIcms() {
		return baseIcms;
	}

	public void setBaseIcms(BigDecimal baseIcms) {
		this.baseIcms = baseIcms;
	}

	public BigDecimal getAliquotaReducaoIcms() {
		return aliquotaReducaoIcms;
	}

	public void setAliquotaReducaoIcms(BigDecimal aliquotaReducaoIcms) {
		this.aliquotaReducaoIcms = aliquotaReducaoIcms;
	}

	public BigDecimal getAliquotaIcms() {
		return aliquotaIcms;
	}

	public void setAliquotaIcms(BigDecimal aliquotaIcms) {
		this.aliquotaIcms = aliquotaIcms;
	}

	public BigDecimal getAliquotaDiferimentoIcms() {
		return aliquotaDiferimentoIcms;
	}

	public void setAliquotaDiferimentoIcms(BigDecimal aliquotaDiferimentoIcms) {
		this.aliquotaDiferimentoIcms = aliquotaDiferimentoIcms;
	}

	public BigDecimal getValorIcms() {
		return valorIcms;
	}

	public void setValorIcms(BigDecimal valorIcms) {
		this.valorIcms = valorIcms;
	}

	public BigDecimal getValortotal() {
		return valortotal;
	}

	public void setValortotal(BigDecimal valortotal) {
		this.valortotal = valortotal;
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
		ItemPedido other = (ItemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemPedido [id=" + id + ", pedido=" + pedido + ", produto=" + produto + ", complementoNatureza="
				+ complementoNatureza + ", itemAliquotaUF=" + itemAliquotaUF + ", quantidade=" + quantidade
				+ ", valorUnitario=" + valorUnitario + ", valorCusto=" + valorCusto + ", totalProdutoServico="
				+ totalProdutoServico + ", valorDesconto=" + valorDesconto + ", valorOutras=" + valorOutras
				+ ", valorFrete=" + valorFrete + ", valorSeguro=" + valorSeguro + ", valorInss=" + valorInss
				+ ", valorIss=" + valorIss + ", valorIrrf=" + valorIrrf + ", valorCssl=" + valorCssl + ", valorPis="
				+ valorPis + ", valorCofins=" + valorCofins + ", percentualIpi=" + percentualIpi + ", valorIpi="
				+ valorIpi + ", baseIcms=" + baseIcms + ", aliquotaReducaoIcms=" + aliquotaReducaoIcms
				+ ", aliquotaIcms=" + aliquotaIcms + ", aliquotaDiferimentoIcms=" + aliquotaDiferimentoIcms
				+ ", valorIcms=" + valorIcms + ", valortotal=" + valortotal + "]";
	}

}
