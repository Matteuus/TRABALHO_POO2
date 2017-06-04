package com.poo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Relatorio {

	@Id
	@GeneratedValue
	private Long idRelatorio;

	@Column(nullable = false)
	private Long idProduto;

	@Column(nullable = false)
	private Long idEmpresaCompra;

	@Column(nullable = false)
	private Long idEmpresaVenda;

	@Column(nullable = false)
	private int qtdProduto;

	@Column(nullable = false)
	private float valorTotal;

	public Long getIdRelatorio() {
		return idRelatorio;
	}

	public void setIdRelatorio(Long idRelatorio) {
		this.idRelatorio = idRelatorio;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public Long getIdEmpresaCompra() {
		return idEmpresaCompra;
	}

	public void setIdEmpresaCompra(Long idEmpresaCompra) {
		this.idEmpresaCompra = idEmpresaCompra;
	}

	public Long getIdEmpresaVenda() {
		return idEmpresaVenda;
	}

	public void setIdEmpresaVenda(Long idEmpresaVenda) {
		this.idEmpresaVenda = idEmpresaVenda;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

}
