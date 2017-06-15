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

	public static boolean buscarProduto2;

	public Produtos Buscarproduto2(long idProduto) {

		Produtos user = new Produtos();

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
				user.setIdProduto(tabela.getLong("idProduto"));
				user.setIdEmpresa(tabela.getLong("idEmpresa"));
				user.setNomeProduto(tabela.getString("nomeProduto"));
				user.setCategoriaProduto(tabela.getString("categoriaProduto"));
				user.setValorProduto(tabela.getFloat("valorProduto"));
				user.setEstoqueProduto(tabela.getInt("estoqueProduto"));

				buscarProduto2 = true;
			} else {
				buscarProduto2 = false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		}
		return user;
	}

	public ProdutosDAO() {
		super(Produtos.class);
	}

	public static boolean alterarproduto;

	public Produtos AlterarProdutos(long idProduto, String nomeProduto, String categoriaProduto, float valor, int qtd) {

		Produtos user = new Produtos();
		Connection conn = null;
		Statement consulta = null;
		Object tabela = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/trabalho_poo2?verifyServerCertificate=false&useSSL=true", "root", "");
			consulta = conn.createStatement();

			tabela = consulta.executeUpdate("UPDATE produtos SET nomeProduto = '" + nomeProduto
					+ "', categoriaProduto = '" + categoriaProduto + "', valorProduto = '" + valor
					+ "', estoqueProduto = '" + qtd + "' WHERE idProduto = '" + idProduto + "'");

			if (((ResultSet) tabela).next()) {

				user.setNomeProduto(((ResultSet) tabela).getString("nomeProduto"));
				user.setCategoriaProduto(((ResultSet) tabela).getString("categoriaProduto"));
				user.setValorProduto(((ResultSet) tabela).getFloat("valorProduto"));
				user.setEstoqueProduto(((ResultSet) tabela).getInt("estoqueProduto"));

				alterarproduto = true;
			} else {
				alterarproduto = false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		}
		return user;

	}

}
