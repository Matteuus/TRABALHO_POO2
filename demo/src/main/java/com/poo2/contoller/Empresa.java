package com.poo2.contoller;

import javax.swing.JOptionPane;
import com.poo2.model.Empresas;
import com.poo2.view.TelaLogin;
import com.poo2.view.TelaPrincipal;

public class Empresa {

	public int addDados(String nomeEmpresa, String cnpjEmpresa, String telEmpresa, String cepEmpresa,
			String logradouroEmpresa, String bairroEmpresa, int numeroLogradouroEmpresa, String complementoEmpresa,
			String cidadeEmpresa, String estadoEmpresa, String usuarioEmpresa, String senhaEmpresa) {

		@SuppressWarnings("unused")
		Empresas e = new Empresas();
		EmpresasDAO eDAO = new EmpresasDAO();
		e = eDAO.Verificempresa(usuarioEmpresa);
		int resultado = 0;
		if (EmpresasDAO.verificaempresa) {
			JOptionPane.showMessageDialog(null, "Nome de usuário já existente, por favor, altere seu nome de usuário!");
		} else {
			Empresas empresa = new Empresas();

			empresa.setNomeEmpresa(nomeEmpresa);
			empresa.setCnpjEmpresa(cnpjEmpresa);
			empresa.setTelEmpresa(telEmpresa);
			empresa.setCepEmpresa(cepEmpresa);
			empresa.setLogradouroEmpresa(logradouroEmpresa);
			empresa.setBairroEmpresa(bairroEmpresa);
			empresa.setNumeroLogradouroEmpresa(numeroLogradouroEmpresa);
			empresa.setComplementoEmpresa(complementoEmpresa);
			empresa.setCidadeEmpresa(cidadeEmpresa);
			empresa.setEstadoEmpresa(estadoEmpresa);
			empresa.setUsuarioEmpresa(usuarioEmpresa);
			empresa.setSenhaEmpresa(senhaEmpresa);

			DAO<Empresas> dao = new EmpresasDAO();

			if (dao.salvar(empresa)) {
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Sucesso!",
						JOptionPane.INFORMATION_MESSAGE);
				resultado = 1;
				TelaLogin tl = new TelaLogin();
				tl.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Falha ao cadastrar!", "Falha!", JOptionPane.ERROR_MESSAGE);
				resultado = 0;
			}

		}
		return resultado;
	}

	public int verificarLogin(String usuario, String senha) {

		Empresas e = new Empresas();
		EmpresasDAO eDAO = new EmpresasDAO();
		e = eDAO.Acesso(usuario, senha);
		long id = 0;

		if (EmpresasDAO.acesso) {
			JOptionPane.showMessageDialog(null, "Bem Vindo(a), " + e.getNomeEmpresa(), "Logado!",
					JOptionPane.INFORMATION_MESSAGE);
			id = e.getIdEmpresa();
			TelaPrincipal tp = new TelaPrincipal(id);
			tp.setVisible(true);
			return 1;
		} else {
			JOptionPane.showMessageDialog(null, "Login ou Senha Incorretos");
			return 0;
		}
	}

	public int alterarDados(String nomeEmpresa, String cnpjEmpresa, String telEmpresa, String cepEmpresa,
			String logradouroEmpresa, String bairroEmpresa, int numeroLogradouroEmpresa, String complementoEmpresa,
			String cidadeEmpresa, String estadoEmpresa, String usuarioEmpresa, String senhaEmpresa, long id) {

		int resultado = 0;

		Empresas empresa = new Empresas();

		empresa.setNomeEmpresa(nomeEmpresa);
		empresa.setCnpjEmpresa(cnpjEmpresa);
		empresa.setTelEmpresa(telEmpresa);
		empresa.setCepEmpresa(cepEmpresa);
		empresa.setLogradouroEmpresa(logradouroEmpresa);
		empresa.setBairroEmpresa(bairroEmpresa);
		empresa.setNumeroLogradouroEmpresa(numeroLogradouroEmpresa);
		empresa.setComplementoEmpresa(complementoEmpresa);
		empresa.setCidadeEmpresa(cidadeEmpresa);
		empresa.setEstadoEmpresa(estadoEmpresa);
		empresa.setUsuarioEmpresa(usuarioEmpresa);
		empresa.setSenhaEmpresa(senhaEmpresa);
		empresa.setIdEmpresa(id);

		DAO<Empresas> dao = new EmpresasDAO();

		if (dao.alterar(empresa)) {
			JOptionPane.showMessageDialog(null, "Alterado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
			resultado = 1;
			TelaLogin tl = new TelaLogin();
			tl.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "Falha ao Alterar!", "Falha!", JOptionPane.ERROR_MESSAGE);
			resultado = 0;
		}

		return resultado;
	}

}
