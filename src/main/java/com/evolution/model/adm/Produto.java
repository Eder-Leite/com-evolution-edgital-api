package com.evolution.model.adm;

import java.math.BigDecimal;

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
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.NotBlank;

import com.evolution.model.adm.enumerador.Check;
import com.evolution.model.adm.enumerador.Status;
import com.evolution.model.livro.AliquotaIPI;
import com.evolution.model.livro.AliquotaNCM;
import com.evolution.model.livro.CodigoANP;
import com.evolution.model.livro.CodigoCEST;
import com.evolution.model.livro.Origem;
import com.evolution.model.livro.UnidadeProduto;
import com.evolution.model.seguranca.Usuario;

@Entity
@Table(name = "ADMPRODU")
@SuppressWarnings("deprecation")
public class Produto {

	@Id
	@Column(name = "NCODIPRODU", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADM_SADMPRODU")
	@SequenceGenerator(sequenceName = "ADM_SADMPRODU", allocationSize = 1, name = "ADM_SADMPRODU")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMPRODU_SEGUSUAR")
	@JoinColumn(name = "NCODIUSUAR", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMPRODU_LIVORIGE")
	@JoinColumn(name = "NCODIORIGE", nullable = false)
	private Origem origem;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMPRODU_ADMSBCAT")
	@JoinColumn(name = "NCODISBCAT", nullable = false)
	private SubCategoriaProduto subCategoria;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_ADMPRODU_ADMUNIDA")
	@JoinColumn(name = "NCODIUNIDA", nullable = false)
	private UnidadeProduto unidade;

	@ManyToOne
	@ForeignKey(name = "FK_ADMPRODU_ADMALNCM")
	@JoinColumn(name = "NCODIALNCM", nullable = true)
	private AliquotaNCM aliquotaNCM;

	@ManyToOne
	@ForeignKey(name = "FK_ADMPRODU_ADM_CEST")
	@JoinColumn(name = "NCODI_CEST", nullable = true)
	private CodigoCEST codigoCEST;

	@ManyToOne
	@ForeignKey(name = "FK_ADMPRODU_ADMCOANP")
	@JoinColumn(name = "NCODICOANP", nullable = true)
	private CodigoANP codigoANP;

	@ManyToOne
	@ForeignKey(name = "FK_ADMPRODU_LIVALIPI")
	@JoinColumn(name = "NCODIALIPI", nullable = true)
	private AliquotaIPI aliquotaIPI;

	@Column(name = "CCODIPRODU", length = 10)
	private String codigo;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCPRODU", nullable = false, length = 255)
	private String descricao;

	@Column(name = "CCBARPRODU", length = 15)
	private String codigoBarra;

	@NotNull(message = "é obrigatório")
	@Column(name = "NCUSTPRODU", nullable = false, precision = 19, scale = 6)
	private BigDecimal valorCusto = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NCUSRPRODU", nullable = false, precision = 19, scale = 6)
	private BigDecimal valorCustoReal = BigDecimal.ZERO;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVENDPRODU", nullable = false, precision = 19, scale = 3)
	private BigDecimal valorVenda = BigDecimal.ZERO;

	@Column(name = "CFOTOPRODU")
	private String foto;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CCFCPPRODU", nullable = false, length = 10)
	private Check calculaFCP = Check.NÃO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CCOMBPRODU", nullable = false, length = 10)
	private Check combustivel = Check.NÃO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CCENCPRODU", nullable = false, length = 10)
	private Check encerrante = Check.NÃO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CIMPOPRODU", nullable = false, length = 10)
	private Check importado = Check.NÃO;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSTATPRODU", nullable = false, length = 10)
	private Status status = Status.ATIVO;

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

	public Origem getOrigem() {
		return origem;
	}

	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

	public SubCategoriaProduto getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(SubCategoriaProduto subCategoria) {
		this.subCategoria = subCategoria;
	}

	public UnidadeProduto getUnidade() {
		return unidade;
	}

	public void setUnidade(UnidadeProduto unidade) {
		this.unidade = unidade;
	}

	public AliquotaNCM getAliquotaNCM() {
		return aliquotaNCM;
	}

	public void setAliquotaNCM(AliquotaNCM aliquotaNCM) {
		this.aliquotaNCM = aliquotaNCM;
	}

	public CodigoCEST getCodigoCEST() {
		return codigoCEST;
	}

	public void setCodigoCEST(CodigoCEST codigoCEST) {
		this.codigoCEST = codigoCEST;
	}

	public CodigoANP getCodigoANP() {
		return codigoANP;
	}

	public void setCodigoANP(CodigoANP codigoANP) {
		this.codigoANP = codigoANP;
	}

	public AliquotaIPI getAliquotaIPI() {
		return aliquotaIPI;
	}

	public void setAliquotaIPI(AliquotaIPI aliquotaIPI) {
		this.aliquotaIPI = aliquotaIPI;
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

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public BigDecimal getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(BigDecimal valorCusto) {
		this.valorCusto = valorCusto;
	}

	public BigDecimal getValorCustoReal() {
		return valorCustoReal;
	}

	public void setValorCustoReal(BigDecimal valorCustoReal) {
		this.valorCustoReal = valorCustoReal;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Check getCalculaFCP() {
		return calculaFCP;
	}

	public void setCalculaFCP(Check calculaFCP) {
		this.calculaFCP = calculaFCP;
	}

	public Check getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Check combustivel) {
		this.combustivel = combustivel;
	}

	public Check getEncerrante() {
		return encerrante;
	}

	public void setEncerrante(Check encerrante) {
		this.encerrante = encerrante;
	}

	public Check getImportado() {
		return importado;
	}

	public void setImportado(Check importado) {
		this.importado = importado;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", usuario=" + usuario + ", origem=" + origem + ", subCategoria=" + subCategoria
				+ ", unidade=" + unidade + ", aliquotaNCM=" + aliquotaNCM + ", codigoCEST=" + codigoCEST
				+ ", codigoANP=" + codigoANP + ", aliquotaIPI=" + aliquotaIPI + ", codigo=" + codigo + ", descricao="
				+ descricao + ", codigoBarra=" + codigoBarra + ", valorCusto=" + valorCusto + ", valorCustoReal="
				+ valorCustoReal + ", valorVenda=" + valorVenda + ", foto=" + foto + ", calculaFCP=" + calculaFCP
				+ ", combustivel=" + combustivel + ", encerrante=" + encerrante + ", importado=" + importado
				+ ", status=" + status + "]";
	}
}
