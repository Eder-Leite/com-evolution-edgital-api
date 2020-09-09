package com.evolution.model.seguranca;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.NotBlank;

import com.evolution.model.cadastro.Filial;
import com.evolution.model.seguranca.enumerador.Status;
import com.evolution.model.seguranca.enumerador.TipoUsuario;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "SEGUSUAR")
@SuppressWarnings("deprecation")
public class Usuario {

	@Id
	@Column(name = "NCODIUSUAR", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEG_SSEGUSUAR")
	@SequenceGenerator(sequenceName = "SEG_SSEGUSUAR", allocationSize = 1, name = "SEG_SSEGUSUAR")
	private Long id;

	@ManyToOne
	@NotNull(message = "é obrigatório")
	@ForeignKey(name = "FK_SEGUSUAR_CADFILIA")
	@JoinColumn(name = "NCODIFILIA", nullable = false)
	private Filial filial;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CNOMEUSUAR", nullable = false, length = 255)
	private String nome;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CEMAIUSUAR", nullable = false, length = 255)
	private String email;

	@JsonProperty(access = Access.READ_ONLY)
	@Column(name = "CSENHUSUAR", length = 255)
	private String senha;

	@NotBlank(message = "é obrigatório")
	@Column(name = "CNCPFUSUAR", nullable = false, length = 14)
	private String cpf;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CTIPOUSUAR", nullable = false, length = 15)
	private TipoUsuario tipo = TipoUsuario.FUNCIONÁRIO;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DDATAUSUAR")
	private Date dataCadastro = new Date();

	@Column(name = "CFOTOUSUAR")
	private String foto;

	@NotNull(message = "é obrigatório")
	@Enumerated(EnumType.STRING)
	@Column(name = "CSTATUSUAR", nullable = false, length = 15)
	private Status status = Status.ATIVO;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "SEGPERUS", joinColumns = @JoinColumn(name = "NCODIUSUAR"), inverseJoinColumns = @JoinColumn(name = "NCODIPERMI"))
	private List<Permissao> permissoes;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", filial=" + filial + ", nome=" + nome + ", email=" + email + ", senha=" + senha
				+ ", cpf=" + cpf + ", tipo=" + tipo + ", dataCadastro=" + dataCadastro + ", foto=" + foto + ", status="
				+ status + ", permissoes=" + permissoes + "]";
	}

}