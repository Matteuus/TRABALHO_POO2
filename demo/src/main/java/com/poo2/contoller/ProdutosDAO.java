package com.poo2.contoller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.poo2.model.Produtos;

public class ProdutosDAO extends GenericDAO<Produtos> {

	public static boolean buscarproduto;

	public String Buscarproduto(long idProduto) {

		String nome = "";

		Connection conn = null;
		Statement consulta = null;
		ResultSet tabela = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/trabalho_poo2?verifyServerCertificate=false&useSSL=true", "root", "");
			consulta = conn.createStatement();

			tabela = consulta.executeQuery("SELECT * FROM produtos WHERE idProduto ='" + idProduto + "'");

			if (tabela.next()) {

				nome = tabela.getString("nomeProduto");
				buscarproduto = true;
			} else {
				buscarproduto = false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		}
		return nome;

	}

	
	public ProdutosDAO() {
		super(Produtos.class);
	}

}
