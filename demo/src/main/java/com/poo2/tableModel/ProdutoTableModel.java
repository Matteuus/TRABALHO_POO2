/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo2.tableModel;

import com.poo2.contoller.RelatorioDAO;
import com.poo2.model.*;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Idsoft
 */
public class ProdutoTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomeColunas[] = { "ID", "Produto", "Quantidade", "Valor(Unitário)" };
	private List<Produtos> produtos;

	public ProdutoTableModel(List<Produtos> produtos) {
		this.produtos = produtos;
	}

	@Override
	public int getRowCount() {
		return produtos.size();
	}

	@Override
	public int getColumnCount() {
		return nomeColunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		RelatorioDAO rd = new RelatorioDAO();
		Produtos produto = rd.Buscarproduto(rowIndex);

		switch (columnIndex) {

		case 0:
			return produto.getIdProduto();
		case 1:
			return produto.getNomeProduto();
		case 2:
			return produto.getEstoqueProduto();
		case 3:
			return produto.getValorProduto();
		}
		return null;
	}

	@Override
	public String getColumnName(int column) {

		switch (column) {

		case 0:
			return nomeColunas[0];
		case 1:
			return nomeColunas[1];
		case 2:
			return nomeColunas[2];
		case 3:
			return nomeColunas[3];
		}
		return "";
	}
}
