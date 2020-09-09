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

import com.evolution.model.cadastro.Filial;
import com.evolution.model.seguranca.Usuario;
import com.evolution.model.tesouraria.enumerador.Check;
import com.evolution.model.tesouraria.enumerador.TipoMovimento;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TESMOVIM")
@SuppressWarnings("deprecation")
public class MovimentoTes {

	@Id
	@Column(name = "NCODIMOVIM", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TES_STESMOVIM")
	@SequenceGenerator(sequenceName = "TES_STESMOVIM", allocationSize = 1, name = "TES_STESMOVIM")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESMOVIM_CADFILIA")
	@JoinColumn(name = "NCODIFILIA", nullable = false)
	private Filial filial;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESMOVIM_TESCTFIN")
	@JoinColumn(name = "NCODICTFIN", nullable = false)
	private Conta conta;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESMOVIM_SEGUSUAR")
	@JoinColumn(name = "NCODIUSUAR", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_TESMOVIM_TESHISTB")
	@JoinColumn(name = "NCODIHISTB", nullable = false)
	private HistoricoBancario historicoBancario;

	@ManyToOne
	@ForeignKey(name = "FK_TESMOVIM_TESBAIXA")
	@JoinColumn(name = "NCODIBAIXA", nullable = true)
	private Baixa baixa;

	@ManyToOne
	@ForeignKey(name = "FK_TESMOVIM_TESCHEQU")
	@JoinColumn(name = "NCODICHEQU", nullable = true)
	private Cheque cheque;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CTIPOMOVIM", nullable = false)
	private TipoMovimento tipoMovimento;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDCTOMOVIM", nullable = false, length = 25)
	private String documento;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DDATAMOVIM")
	private Date data;

	@NotNull(message = "é obrigatório")
	@Column(name = "NVALOMOVIM", nullable = false, precision = 19, scale = 2)
	private BigDecimal valor = BigDecimal.ZERO;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CDESCMOVIM", nullable = false, length = 255)
	private String descricao;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CCONCMOVIM", nullable = false)
	private Check conciliado = Check.NÃO;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull(message = "é obrigatório")
	@Column(name = "DLACTMOVIM")
	private Date dataCadastro = new Date();

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

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public HistoricoBancario getHistoricoBancario() {
		return historicoBancario;
	}

	public void setHistoricoBancario(HistoricoBancario historicoBancario) {
		this.historicoBancario = historicoBancario;
	}

	public Baixa getBaixa() {
		return baixa;
	}

	public void setBaixa(Baixa baixa) {
		this.baixa = baixa;
	}

	public Cheque getCheque() {
		return cheque;
	}

	public void setCheque(Cheque cheque) {
		this.cheque = cheque;
	}

	public TipoMovimento getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(TipoMovimento tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Check getConciliado() {
		return conciliado;
	}

	public void setConciliado(Check conciliado) {
		this.conciliado = conciliado;
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
		MovimentoTes other = (MovimentoTes) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Movimento [id=" + id + ", filial=" + filial + ", conta=" + conta + ", usuario=" + usuario
				+ ", historicoBancario=" + historicoBancario + ", baixa=" + baixa + ", cheque=" + cheque
				+ ", tipoMovimento=" + tipoMovimento + ", documento=" + documento + ", data=" + data + ", valor="
				+ valor + ", descricao=" + descricao + ", conciliado=" + conciliado + ", dataCadastro=" + dataCadastro
				+ ", getId()=" + getId() + ", getFilial()=" + getFilial() + ", getConta()=" + getConta()
				+ ", getUsuario()=" + getUsuario() + ", getHistoricoBancario()=" + getHistoricoBancario()
				+ ", getBaixa()=" + getBaixa() + ", getCheque()=" + getCheque() + ", getTipoMovimento()="
				+ getTipoMovimento() + ", getDocumento()=" + getDocumento() + ", getData()=" + getData()
				+ ", getValor()=" + getValor() + ", getDescricao()=" + getDescricao() + ", getConciliado()="
				+ getConciliado() + ", getDataCadastro()=" + getDataCadastro() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
}
