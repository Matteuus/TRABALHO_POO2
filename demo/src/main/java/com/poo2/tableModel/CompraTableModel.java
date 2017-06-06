/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo2.tableModel;

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
	private String nomeColunas[] = { "ID", "Produto", "Empresa", "Quantidade", "Total" };
	private List<Relatorio> compras;

	public CompraTableModel(List<Relatorio> compras) {
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
		Relatorio compra = compras.get(rowIndex);

		switch (columnIndex) {

		case 0:
			return compra.getIdRelatorio();
		case 1:
			return compra.getIdProduto();
		case 2:
			return compra.getIdEmpresaVenda();
		case 3:
			return compra.getQtdProduto();
		case 4:
			return compra.getValorTotal();
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