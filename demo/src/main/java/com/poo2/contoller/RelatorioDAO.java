package com.poo2.contoller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.poo2.model.Produtos;
import com.poo2.model.Relatorio;

public class RelatorioDAO extends GenericDAO<Relatorio> {

	public static boolean buscarproduto;

	public Produtos Buscarproduto(long idEmpresa) {

		Produtos user = new Produtos();

		Connection conn = null;
		Statement consulta = null;
		ResultSet tabela = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/trabalho_poo2?verifyServerCertificate=false&useSSL=true", "root", "");
			consulta = conn.createStatement();

			tabela = consulta.executeQuery("SELECT * FROM produtos WHERE idEmpresa ='" + idEmpresa + "'");

			if (tabela.next()) {
				user.setIdProduto(tabela.getLong("idProduto"));
				user.setNomeProduto(tabela.getString("nomeProduto"));
				user.setCategoriaProduto(tabela.getString("categoriaProduto"));
				user.setEstoqueProduto(tabela.getInt("estoqueProduto"));
				user.setValorProduto(tabela.getFloat("valorProduto"));
				buscarproduto = true;
			} else {
				buscarproduto = false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		}
		return user;

	}

	public RelatorioDAO() {
		super(Relatorio.class);
	}

}
