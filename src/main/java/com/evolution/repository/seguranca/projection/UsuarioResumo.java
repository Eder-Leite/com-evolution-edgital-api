package com.evolution.repository.seguranca.projection;

import java.util.Date;

import com.evolution.model.seguranca.enumerador.Status;
import com.evolution.model.seguranca.enumerador.TipoUsuario;

public class UsuarioResumo {

	private Long id;
	private Long empresa;
	private String nomeEmpresa;
	private Long filial;
	private String nomeFilial;
	private String nome;
	private String email;
	private String cpf;
	private TipoUsuario tipo;
	private Date dataCadastro;
	private String foto;
	private Status status;

	public UsuarioResumo() {
		super();
	}

	public UsuarioResumo(Long id, Long empresa, String nomeEmpresa, Long filial, String nomeFilial, String nome,
			String email, String cpf, TipoUsuario tipo, Date dataCadastro, String foto, Status status) {
		super();
		this.id = id;
		this.filial = filial;
		this.empresa = empresa;
		this.nomeEmpresa = nomeEmpresa;
		this.nomeFilial = nomeFilial;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.tipo = tipo;
		this.dataCadastro = dataCadastro;
		this.foto = foto;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Long empresa) {
		this.empresa = empresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Long getFilial() {
		return filial;
	}

	public void setFilial(Long filial) {
		this.filial = filial;
	}

	public String getNomeFilial() {
		return nomeFilial;
	}

	public void setNomeFilial(String nomeFilial) {
		this.nomeFilial = nomeFilial;
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

	@Override
	public String toString() {
		return "UsuarioResumo [id=" + id + ", empresa=" + empresa + ", nomeEmpresa=" + nomeEmpresa + ", filial="
				+ filial + ", nomeFilial=" + nomeFilial + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf
				+ ", tipo=" + tipo + ", dataCadastro=" + dataCadastro + ", foto=" + foto + ", status=" + status + "]";
	}

}
