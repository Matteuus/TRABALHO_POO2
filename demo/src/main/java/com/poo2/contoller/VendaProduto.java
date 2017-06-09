package com.poo2.contoller;

import javax.swing.JOptionPane;

import com.poo2.model.Produtos;

public class VendaProduto {

	public int addDados(long idEmpresa, String nomeProduto, String categoriaProduto, float valorProduto,
			int estoqueProduto) {

		int resultado = 0;
		Produtos p = new Produtos();

		p.setIdEmpresa(idEmpresa);
		p.setNomeProduto(nomeProduto);
		p.setCategoriaProduto(categoriaProduto);
		p.setValorProduto(valorProduto);
		p.setEstoqueProduto(estoqueProduto);

		DAO<Produtos> dao = new ProdutosDAO();

		if (dao.salvar(p)) {
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
			resultado = 1;
		} else {
			JOptionPane.showMessageDialog(null, "Falha ao cadastrar!", "Falha!", JOptionPane.ERROR_MESSAGE);
			resultado = 0;
		}
		return resultado;
	}

}
