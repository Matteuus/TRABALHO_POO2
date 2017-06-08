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
public class CompraTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomeColunas[] = { "ID", "Produto", "Empresa", "Quantidade", "Valor(Unidade)" };
	private List<Produtos> compras;

	public CompraTableModel(List<Produtos> compras) {
		this.compras = compras;
	}

	@Override
	public int getRowCount() {
		return compras.size();
	}

	@Override
	public int getColumnCount() {
		return nomeColunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Produtos compra = compras.get(rowIndex);
		RelatorioDAO rd = new RelatorioDAO();
		compra = rd.Buscarproduto(rowIndex);

		switch (columnIndex) {

		case 0:
			return compra.getIdProduto();
		case 1:
			return compra.getNomeProduto();
		case 2:
			return compra.getCategoriaProduto();
		case 3:
			return compra.getEstoqueProduto();
		case 4:
			return compra.getValorProduto();
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
		case 4:
			return nomeColunas[4];
		}
		return "";
	}
}
