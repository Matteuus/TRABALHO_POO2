package com.poo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Empresas {

	@Id
	@GeneratedValue
	private Long idEmpresa;

	@Column(nullable = false, length = 100)
	private String nomeEmpresa;

	@Column(nullable = false, length = 14)
	private String cnpjEmpresa;

	@Column(nullable = false, length = 10)
	private String telEmpresa;

	@Column(nullable = false, length = 8)
	private String cepEmpresa;

	@Column(nullable = false, length = 30)
	private String logradouroEmpresa;

	@Column(nullable = false, length = 20)
	private String bairroEmpresa;

	@Column(nullable = false)
	private int numeroLogradouroEmpresa;

	@Column(nullable = true, length = 10)
	private String complementoEmpresa;

	@Column(nullable = false, length = 20)
	private String cidadeEmpresa;

	@Column(nullable = false, length = 2)
	private String estadoEmpresa;

	@Column(nullable = false, length = 20)
	private String usuarioEmpresa;

	@Column(nullable = false, length = 20)
	private String senhaEmpresa;

	public String getCepEmpresa() {
		return cepEmpresa;
	}

	public void setCepEmpresa(String cepEmpresa) {
		this.cepEmpresa = cepEmpresa;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	public String getTelEmpresa() {
		return telEmpresa;
	}

	public void setTelEmpresa(String telEmpresa) {
		this.telEmpresa = telEmpresa;
	}

	public String getLogradouroEmpresa() {
		return logradouroEmpresa;
	}

	public void setLogradouroEmpresa(String logradouroEmpresa) {
		this.logradouroEmpresa = logradouroEmpresa;
	}

	public String getBairroEmpresa() {
		return bairroEmpresa;
	}

	public void setBairroEmpresa(String bairroEmpresa) {
		this.bairroEmpresa = bairroEmpresa;
	}

	public int getNumeroLogradouroEmpresa() {
		return numeroLogradouroEmpresa;
	}

	public void setNumeroLogradouroEmpresa(int numeroLogradouroEmpresa) {
		this.numeroLogradouroEmpresa = numeroLogradouroEmpresa;
	}

	public String getComplementoEmpresa() {
		return complementoEmpresa;
	}

	public void setComplementoEmpresa(String complementoEmpresa) {
		this.complementoEmpresa = complementoEmpresa;
	}

	public String getCidadeEmpresa() {
		return cidadeEmpresa;
	}

	public void setCidadeEmpresa(String cidadeEmpresa) {
		this.cidadeEmpresa = cidadeEmpresa;
	}

	public String getEstadoEmpresa() {
		return estadoEmpresa;
	}

	public void setEstadoEmpresa(String estadoEmpresa) {
		this.estadoEmpresa = estadoEmpresa;
	}

	public String getUsuarioEmpresa() {
		return usuarioEmpresa;
	}

	public void setUsuarioEmpresa(String usuarioEmpresa) {
		this.usuarioEmpresa = usuarioEmpresa;
	}

	public String getSenhaEmpresa() {
		return senhaEmpresa;
	}

	public void setSenhaEmpresa(String senhaEmpresa) {
		this.senhaEmpresa = senhaEmpresa;
	}

}
