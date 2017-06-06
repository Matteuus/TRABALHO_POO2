package com.poo2.contoller;

import com.poo2.model.Empresas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpresasDAO extends GenericDAO<Empresas> {

	public static boolean acesso;

	public Empresas Acesso(String usuarioEmpresa, String senhaEmpresa) {

		Empresas user = new Empresas();

		Connection conn = null;
		Statement consulta = null;
		ResultSet tabela = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/trabalho_poo2?verifyServerCertificate=false&useSSL=true", "root", "");
			consulta = conn.createStatement();

			tabela = consulta.executeQuery("SELECT * from empresas WHERE usuarioEmpresa='" + usuarioEmpresa
					+ "'and senhaEmpresa='" + senhaEmpresa + "'");

			if (tabela.next()) {
				user.setIdEmpresa(tabela.getLong("idEmpresa"));
				user.setNomeEmpresa(tabela.getString("nomeEmpresa"));
				user.setCnpjEmpresa(tabela.getString("cnpjEmpresa"));
				user.setTelEmpresa(tabela.getString("telEmpresa"));
				user.setLogradouroEmpresa(tabela.getString("logradouroEmpresa"));
				user.setBairroEmpresa(tabela.getString("bairroEmpresa"));
				user.setNumeroLogradouroEmpresa(tabela.getInt("numeroLogradouroEmpresa"));
				user.setComplementoEmpresa(tabela.getString("complementoEmpresa"));
				user.setCidadeEmpresa(tabela.getString("cidadeEmpresa"));
				user.setEstadoEmpresa(tabela.getString("estadoEmpresa"));
				user.setUsuarioEmpresa(tabela.getString("usuarioEmpresa"));
				user.setSenhaEmpresa(tabela.getString("senhaEmpresa"));

				acesso = true;
			} else {
				acesso = false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		}
		return user;

	}

	public static boolean verificaempresa;

	public Empresas Verificempresa(String usuarioEmpresa) {

		Empresas user = new Empresas();

		Connection conn = null;
		Statement consulta = null;
		ResultSet tabela = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/trabalho_poo2?verifyServerCertificate=false&useSSL=true", "root", "");
			consulta = conn.createStatement();

			tabela = consulta
					.executeQuery("SELECT usuarioEmpresa FROM empresas WHERE usuarioEmpresa ='" + usuarioEmpresa + "'");

			if (tabela.next()) {

				user.setUsuarioEmpresa(tabela.getString("usuarioEmpresa"));

				verificaempresa = true;
			} else {
				verificaempresa = false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		}
		return user;

	}

	public static boolean buscarempresa;

	public Empresas Buscarempresa(long idEmpresa) {

		Empresas user = new Empresas();

		Connection conn = null;
		Statement consulta = null;
		ResultSet tabela = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/trabalho_poo2?verifyServerCertificate=false&useSSL=true", "root", "");
			consulta = conn.createStatement();

			tabela = consulta.executeQuery("SELECT * FROM empresas WHERE idEmpresa ='" + idEmpresa + "'");

			if (tabela.next()) {
				user.setIdEmpresa(tabela.getLong("idEmpresa"));
				user.setNomeEmpresa(tabela.getString("nomeEmpresa"));
				user.setCnpjEmpresa(tabela.getString("cnpjEmpresa"));
				user.setTelEmpresa(tabela.getString("telEmpresa"));
				user.setLogradouroEmpresa(tabela.getString("logradouroEmpresa"));
				user.setBairroEmpresa(tabela.getString("bairroEmpresa"));
				user.setNumeroLogradouroEmpresa(tabela.getInt("numeroLogradouroEmpresa"));
				user.setComplementoEmpresa(tabela.getString("complementoEmpresa"));
				user.setCidadeEmpresa(tabela.getString("cidadeEmpresa"));
				user.setEstadoEmpresa(tabela.getString("estadoEmpresa"));
				user.setUsuarioEmpresa(tabela.getString("usuarioEmpresa"));
				user.setSenhaEmpresa(tabela.getString("senhaEmpresa"));

				buscarempresa = true;
			} else {
				buscarempresa = false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		}
		return user;

	}

	public static boolean alterarempresa;

	public Empresas Alterarempresa(String nomeEmpresa, String cnpjEmpresa, String telEmpresa, String logradouroEmpresa,
			String bairroEmpresa, int numeroLogradouroEmpresa, String complementoEmpresa, String cidadeEmpresa,
			String estadoEmpresa, String usuarioEmpresa, String senhaEmpresa, long idEmpresa) {

		Empresas user = new Empresas();
		Connection conn = null;
		Statement consulta = null;
		Object tabela = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/trabalho_poo2?verifyServerCertificate=false&useSSL=true", "root", "");
			consulta = conn.createStatement();

			tabela = consulta.executeUpdate("UPDATE empresas SET nomeEmpresa = '" + nomeEmpresa + "', cnpjEmpresa = '"
					+ cnpjEmpresa + "', telEmpresa = '" + telEmpresa + "', logradouroEmpresa = '" + logradouroEmpresa
					+ "', bairroEmpresa = '" + bairroEmpresa + "', numeroLogradouroEmpresa = '"
					+ numeroLogradouroEmpresa + "', complementoEmpresa = '" + complementoEmpresa
					+ "', cidadeEmpresa = '" + cidadeEmpresa + "', estadoEmpresa = '" + estadoEmpresa
					+ "', usuarioEmpresa = '" + usuarioEmpresa + "', senhaEmpresa = '" + senhaEmpresa
					+ "' WHERE idEmpresa = '" + idEmpresa + "'");

			if (((ResultSet) tabela).next()) {
				user.setNomeEmpresa(((ResultSet) tabela).getString("nomeEmpresa"));
				user.setCnpjEmpresa(((ResultSet) tabela).getString("cnpjEmpresa"));
				user.setTelEmpresa(((ResultSet) tabela).getString("telEmpresa"));
				user.setLogradouroEmpresa(((ResultSet) tabela).getString("logradouroEmpresa"));
				user.setBairroEmpresa(((ResultSet) tabela).getString("bairroEmpresa"));
				user.setNumeroLogradouroEmpresa(((ResultSet) tabela).getInt("numeroLogradouroEmpresa"));
				user.setComplementoEmpresa(((ResultSet) tabela).getString("complementoEmpresa"));
				user.setCidadeEmpresa(((ResultSet) tabela).getString("cidadeEmpresa"));
				user.setEstadoEmpresa(((ResultSet) tabela).getString("estadoEmpresa"));
				user.setUsuarioEmpresa(((ResultSet) tabela).getString("usuarioEmpresa"));
				user.setSenhaEmpresa(((ResultSet) tabela).getString("senhaEmpresa"));

				alterarempresa = true;
			} else {
				alterarempresa = false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		}
		return user;

	}

	public static boolean deletarempresa;

	public Empresas Deletarempresa(long idEmpresa) {

		Empresas user = new Empresas();
		Connection conn = null;
		Statement consulta = null;
		Object tabela = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/trabalho_poo2?verifyServerCertificate=false&useSSL=true", "root", "");
			consulta = conn.createStatement();

			tabela = consulta.executeUpdate("DELETE FROM empresas WHERE idEmpresa = '" + idEmpresa + "'");

			if (((ResultSet) tabela).next()) {

				user.setIdEmpresa(((ResultSet) tabela).getLong("idEmpresa"));

				deletarempresa = true;
			} else {
				deletarempresa = false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		}
		return user;

	}

	public EmpresasDAO() {
		super(Empresas.class);
	}

}
