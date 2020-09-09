package com.evolution.model.adm;

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
import com.evolution.model.adm.Almoxarifado;
import com.evolution.model.adm.enumerador.SituacaoPedido;
import com.evolution.model.adm.enumerador.TipoEntrada;
import com.evolution.model.cadastro.Cadastro;
import com.evolution.model.cadastro.Endereco;

import com.evolution.model.livro.Finalidade;
import com.evolution.model.seguranca.Usuario;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "ADMPEDID")
@SuppressWarnings("deprecation")
public class PedidoAdm {

	@Id
	@Column(name = "NCODIPEDID", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADM_SADMPEDID")
	@SequenceGenerator(sequenceName = "ADM_SADMPEDID", allocationSize = 1, name = "ADM_SADMPEDID")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMPEDID_SEGUSUAR")
	@JoinColumn(name = "NCODIUSUAR", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMPEDID_ADMALMOX")
	@JoinColumn(name = "NCODIALMOX", nullable = false)
	private Almoxarifado almoxarifado;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMPEDID_CADGERAL")
	@JoinColumn(name = "NCODIGERAL", nullable = false)
	private Cadastro cadastro;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMPEDID_CADENDER")
	@JoinColumn(name = "NCODIENDER", nullable = false)
	private Endereco endereco;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMPEDID_LIVFINAL")
	@JoinColumn(name = "NCODIFINAL", nullable = false)
	private Finalidade finalidade;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSITUPEDID", nullable = false)
	private SituacaoPedido situacao = SituacaoPedido.ABERTO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CTIPOPEDID", nullable = false)
	private TipoEntrada tipoEntrada;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDATAPEDID", nullable = false)
	private Date data = new Date();

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDOCUPEDID", nullable = false, length = 25)
	private String documento;

	@Column(name = "CDESCPEDID", nullable = true, length = 255)
	private String descricao;

	@NotNull(message = "é obrigatório")
	@Column(name = "NDESCPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalDesconto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NOUTRPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalOutras = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NPRODPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal totalProdutoServico = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NTOTAPEDID", nullable = false, precision = 19, scale = 2)
	private BigDecimal total = BigDecimal.ZERO;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DCADAPEDID", nullable = false)
	private Date dataCadastro = new Date();

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

	public Finalidade getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(Finalidade finalidade) {
		this.finalidade = finalidade;
	}

	public SituacaoPedido getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoPedido situacao) {
		this.situacao = situacao;
	}

	public TipoEntrada getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(TipoEntrada tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getTotalDesconto() {
		return totalDesconto;
	}

	public void setTotalDesconto(BigDecimal totalDesconto) {
		this.totalDesconto = totalDesconto;
	}

	public BigDecimal getTotalOutras() {
		return totalOutras;
	}

	public void setTotalOutras(BigDecimal totalOutras) {
		this.totalOutras = totalOutras;
	}

	public BigDecimal getTotalProdutoServico() {
		return totalProdutoServico;
	}

	public void setTotalProdutoServico(BigDecimal totalProdutoServico) {
		this.totalProdutoServico = totalProdutoServico;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
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
		PedidoAdm other = (PedidoAdm) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", usuario=" + usuario + ", almoxarifado=" + almoxarifado + ", cadastro=" + cadastro
				+ ", endereco=" + endereco + ", finalidade=" + finalidade + ", situacao=" + situacao + ", tipoEntrada="
				+ tipoEntrada + ", data=" + data + ", documento=" + documento + ", descricao=" + descricao
				+ ", totalDesconto=" + totalDesconto + ", totalOutras=" + totalOutras + ", totalProdutoServico="
				+ totalProdutoServico + ", total=" + total + ", dataCadastro=" + dataCadastro + "]";
	}
}
