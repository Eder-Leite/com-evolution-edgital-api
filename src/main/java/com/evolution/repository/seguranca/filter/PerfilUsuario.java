package com.evolution.repository.seguranca.filter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.evolution.model.seguranca.Permissao;
import com.evolution.model.seguranca.Usuario;

public class PerfilUsuario {

	private Long id;
	private String empresa;
	private String filial;
	private String nome;
	private String email;
	private String cpf;
	private Date dataCadastro;
	private String foto;
	private String senhaAntiga;
	private String senhaNova;
	private List<Permissao> permissoes = new ArrayList<>();

	public PerfilUsuario() {
		super();
	}

	public PerfilUsuario(Usuario usuario) {

		if (usuario != null) {
			this.id = usuario.getId();
			this.empresa = usuario.getFilial().getEmpresa().getNome();
			this.filial = usuario.getFilial().getNome();
			this.nome = usuario.getNome();
			this.email = usuario.getEmail();
			this.cpf = usuario.getCpf();
			this.senhaAntiga = usuario.getSenha();
			this.senhaNova = usuario.getSenha();
			this.dataCadastro = usuario.getDataCadastro();
			this.foto = usuario.getFoto();
			this.permissoes = usuario.getPermissoes();
		}

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getSenhaAntiga() {
		return senhaAntiga;
	}

	public void setSenhaAntiga(String senhaAntiga) {
		this.senhaAntiga = senhaAntiga;
	}

	public String getSenhaNova() {
		return senhaNova;
	}

	public void setSenhaNova(String senhaNova) {
		this.senhaNova = senhaNova;
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	@Override
	public String toString() {
		return "PerfilUsuario [id=" + id + ", empresa=" + empresa + ", filial=" + filial + ", nome=" + nome + ", email="
				+ email + ", cpf=" + cpf + ", foto=" + foto + ", senhaAntiga=" + senhaAntiga + ", senhaNova="
				+ senhaNova + ", permissoes=" + permissoes + "]";
	}

}
