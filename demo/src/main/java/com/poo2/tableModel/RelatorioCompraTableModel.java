/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo2.tableModel;

import com.poo2.contoller.EmpresasDAO;
import com.poo2.contoller.ProdutosDAO;
import com.poo2.model.*;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Idsoft
 */
public class RelatorioCompraTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomeColunas[] = { "ID", "Produto", "Empresa", "Quantidade", "Valor(Total)" };
	private List<Relatorio> relatorios;

	public RelatorioCompraTableModel(List<Relatorio> relatorios) {
		this.relatorios = relatorios;
	}

	@Override
	public int getRowCount() {
		return relatorios.size();
	}

	@Override
	public int getColumnCount() {
		return nomeColunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		Relatorio relatorio = relatorios.get(rowIndex);
		EmpresasDAO ed = new EmpresasDAO();
		ProdutosDAO pd = new ProdutosDAO();
		String nome = ed.Buscarempresa(relatorio.getIdEmpresaVenda());
		String nomep = pd.Buscarproduto(relatorio.getIdProduto());
		
		switch (columnIndex) {

		case 0:
			return relatorio.getIdRelatorio();
		case 1:
			return nomep;
		case 2:
			return nome;
		case 3:
			return relatorio.getQtdProduto();
		case 4:
			return relatorio.getValorTotal();
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
