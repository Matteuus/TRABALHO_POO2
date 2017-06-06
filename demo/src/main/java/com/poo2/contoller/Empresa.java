package com.poo2.contoller;

import javax.swing.JOptionPane;
import com.poo2.model.Empresas;

public class Empresa {

	public void addDados(String nomeEmpresa, String cnpjEmpresa, String telEmpresa, String logradouroEmpresa,
			String bairroEmpresa, int numeroLogradouroEmpresa, String complementoEmpresa, String cidadeEmpresa,
			String estadoEmpresa, String usuarioEmpresa, String senhaEmpresa) {

		@SuppressWarnings("unused")
		Empresas e = new Empresas();
		EmpresasDAO eDAO = new EmpresasDAO();
		e = eDAO.Verificempresa(usuarioEmpresa);
		if (EmpresasDAO.verificaempresa) {
			JOptionPane.showMessageDialog(null, "Nome de usuário já existente, por favor, altere seu nome de usuário!");
		} else {
			Empresas empresa = new Empresas();

			empresa.setNomeEmpresa(nomeEmpresa);
			empresa.setCnpjEmpresa(cnpjEmpresa);
			empresa.setTelEmpresa(telEmpresa);
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
			} else {
				JOptionPane.showMessageDialog(null, "Falha ao cadastrar!", "Falha!", JOptionPane.ERROR_MESSAGE);
			}

		}
	}

}
