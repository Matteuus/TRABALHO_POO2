package com.poo2.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.poo2.contoller.EmpresasDAO;
import com.poo2.model.Empresas;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

public class FormConfiguracoes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected static final long Long = 0;
	private JTextField ctNome;
	private JTextField ctCnpj;
	private JTextField ctBairro;
	private JTextField ctLogradouro;
	private JTextField ctCidade;
	private JTextField ctTel;
	private JTextField ctCep;
	private JPasswordField ctSenha;
	private JTextField ctNumero;
	private JTextField ctComplemento;
	private JTextField ctUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormConfiguracoes frame = new FormConfiguracoes(Long);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormConfiguracoes(long id) {
		setTitle("Configurações");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int WIDTH = 810;
		int HEIGHT = 510;
		int x = (screen.width - WIDTH) / 2;
		int y = (screen.height - HEIGHT) / 2;
		setBounds(x, y, WIDTH, HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Empresas e = new Empresas();
		EmpresasDAO eDAO = new EmpresasDAO();
		e = eDAO.Buscarempresa2(id);
		if (EmpresasDAO.verificaempresa) {

		}

		JLabel lblDados = new JLabel("Dados Cadastrais");
		lblDados.setHorizontalAlignment(SwingConstants.CENTER);
		lblDados.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblDados.setBounds(12, 10, 378, 30);
		contentPane.add(lblDados);

		JLabel lblNomeEmpresa = new JLabel("Nome");
		lblNomeEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblNomeEmpresa.setBounds(12, 40, 378, 30);
		contentPane.add(lblNomeEmpresa);

		ctNome = new JTextField(e.getNomeEmpresa());
		ctNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctNome.setBounds(12, 70, 378, 30);
		contentPane.add(ctNome);
		ctNome.setColumns(10);

		JLabel lblCnpjEmpresa = new JLabel("CNPJ");
		lblCnpjEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblCnpjEmpresa.setBounds(12, 100, 378, 30);
		contentPane.add(lblCnpjEmpresa);

		ctCnpj = new JTextField(e.getCnpjEmpresa());
		ctCnpj.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctCnpj.setBounds(12, 130, 378, 30);
		contentPane.add(ctCnpj);
		ctCnpj.setColumns(10);

		JLabel lblTelEmpresa = new JLabel("Telefone");
		lblTelEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblTelEmpresa.setBounds(12, 160, 378, 30);
		contentPane.add(lblTelEmpresa);

		ctTel = new JTextField(e.getTelEmpresa());
		ctTel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctTel.setBounds(12, 190, 378, 30);
		contentPane.add(ctTel);
		ctTel.setColumns(10);

		JLabel lblUsuarioEmpresa = new JLabel("Usuário");
		lblUsuarioEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblUsuarioEmpresa.setBounds(12, 220, 378, 30);
		contentPane.add(lblUsuarioEmpresa);

		ctUsuario = new JTextField(e.getNomeEmpresa());
		ctUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctUsuario.setBackground(Color.WHITE);
		ctUsuario.setEditable(false);
		ctUsuario.setBounds(12, 250, 378, 30);
		contentPane.add(ctUsuario);
		ctUsuario.setColumns(10);

		JLabel lblSenhaEmpresa = new JLabel("Senha");
		lblSenhaEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblSenhaEmpresa.setBounds(12, 280, 378, 30);
		contentPane.add(lblSenhaEmpresa);

		ctSenha = new JPasswordField(e.getSenhaEmpresa());
		ctSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctSenha.setBounds(12, 310, 378, 30);
		contentPane.add(ctSenha);

		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereco.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblEndereco.setBounds(402, 10, 378, 30);
		contentPane.add(lblEndereco);

		JLabel lblCepEmpresa = new JLabel("CEP");
		lblCepEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblCepEmpresa.setBounds(402, 40, 378, 30);
		contentPane.add(lblCepEmpresa);

		ctCep = new JTextField(e.getCepEmpresa());
		ctCep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctCep.setBounds(402, 70, 378, 30);
		contentPane.add(ctCep);
		ctCep.setColumns(10);

		JLabel lblUfEmpresa = new JLabel("UF");
		lblUfEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblUfEmpresa.setBounds(402, 100, 60, 30);
		contentPane.add(lblUfEmpresa);

		JComboBox<String> ctEstado = new JComboBox<String>();
		ctEstado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctEstado.setBackground(Color.WHITE);
		ctEstado.addItem("AC");
		ctEstado.addItem("AL");
		ctEstado.addItem("AP");
		ctEstado.addItem("AM");
		ctEstado.addItem("BA");
		ctEstado.addItem("CE");
		ctEstado.addItem("DF");
		ctEstado.addItem("ES");
		ctEstado.addItem("GO");
		ctEstado.addItem("MA");
		ctEstado.addItem("MT");
		ctEstado.addItem("MS");
		ctEstado.addItem("MG");
		ctEstado.addItem("PA");
		ctEstado.addItem("PB");
		ctEstado.addItem("PR");
		ctEstado.addItem("PE");
		ctEstado.addItem("PI");
		ctEstado.addItem("RJ");
		ctEstado.addItem("RN");
		ctEstado.addItem("RS");
		ctEstado.addItem("RO");
		ctEstado.addItem("RR");
		ctEstado.addItem("SP");
		ctEstado.addItem("SC");
		ctEstado.addItem("SE");
		ctEstado.addItem("TO");
		ctEstado.setBounds(402, 130, 60, 30);
		contentPane.add(ctEstado);

		JLabel lblCidadeEmpresa = new JLabel("Cidade");
		lblCidadeEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblCidadeEmpresa.setBounds(474, 100, 306, 30);
		contentPane.add(lblCidadeEmpresa);

		ctCidade = new JTextField(e.getCidadeEmpresa());
		ctCidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctCidade.setBounds(474, 130, 306, 30);
		contentPane.add(ctCidade);
		ctCidade.setColumns(10);

		JLabel lblBairroEmpresa = new JLabel("Bairro");
		lblBairroEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblBairroEmpresa.setBounds(402, 160, 378, 30);
		contentPane.add(lblBairroEmpresa);

		ctBairro = new JTextField(e.getBairroEmpresa());
		ctBairro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctBairro.setBounds(402, 190, 378, 30);
		contentPane.add(ctBairro);
		ctBairro.setColumns(10);

		JLabel lblLogradouroEmpresa = new JLabel("Logradouro");
		lblLogradouroEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblLogradouroEmpresa.setBounds(402, 220, 378, 30);
		contentPane.add(lblLogradouroEmpresa);

		ctLogradouro = new JTextField(e.getLogradouroEmpresa());
		ctLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctLogradouro.setBounds(402, 250, 378, 30);
		contentPane.add(ctLogradouro);
		ctLogradouro.setColumns(10);

		JLabel lblNumeroEmpresa = new JLabel("Número");
		lblNumeroEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblNumeroEmpresa.setBounds(402, 280, 378, 30);
		contentPane.add(lblNumeroEmpresa);

		String numeroLogradouro = String.valueOf(e.getNumeroLogradouroEmpresa());

		ctNumero = new JTextField(numeroLogradouro);
		ctNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctNumero.setColumns(10);
		ctNumero.setBounds(402, 310, 183, 30);
		contentPane.add(ctNumero);

		JLabel lblComplementoEmpresa = new JLabel("Complemento");
		lblComplementoEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblComplementoEmpresa.setBounds(595, 280, 183, 30);
		contentPane.add(lblComplementoEmpresa);

		ctComplemento = new JTextField(e.getComplementoEmpresa());
		ctComplemento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctComplemento.setColumns(10);
		ctComplemento.setBounds(595, 310, 183, 30);
		contentPane.add(ctComplemento);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(SystemColor.control);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				TelaPrincipal tp = new TelaPrincipal(id);
				tp.setVisible(true);
				dispose();

			}
		});
		btnVoltar.setBounds(12, 425, 116, 30);
		contentPane.add(btnVoltar);

		JButton btnExcluirConta = new JButton("Excluir Empresa");
		btnExcluirConta.setBackground(SystemColor.control);
		btnExcluirConta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExcluirConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int i = JOptionPane.showConfirmDialog(null, "Deseja Excluir sua Empresa?", "Selecione uma Opção",
						JOptionPane.OK_CANCEL_OPTION);

				if (i == JOptionPane.YES_OPTION) {
					dispose();
					TelaLogin tl = new TelaLogin();
					tl.setVisible(true);
					@SuppressWarnings("unused")
					Empresas empresa = new Empresas();
					EmpresasDAO edao = new EmpresasDAO();
					empresa = edao.Deletarempresa(id);

				} else if (i == JOptionPane.NO_OPTION) {
				}

			}

		});
		btnExcluirConta.setBounds(311, 425, 170, 30);
		contentPane.add(btnExcluirConta);

		JButton btnSalvarDados = new JButton("Alterar");
		btnSalvarDados.setBackground(SystemColor.control);
		btnSalvarDados.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalvarDados.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!, por favor logue-se novamente");

				TelaLogin tl = new TelaLogin();
				tl.setVisible(true);
				dispose();
				@SuppressWarnings("unused")
				Empresas empresas = new Empresas();
				EmpresasDAO e = new EmpresasDAO();
				empresas = e.Buscarempresa2(id);
				if (!ctNome.getText().isEmpty() && !ctCnpj.getText().isEmpty() && !ctTel.getText().isEmpty()
						&& !ctLogradouro.getText().isEmpty() && !ctBairro.getText().isEmpty()
						&& !ctNumero.getText().isEmpty() && !ctCidade.getText().isEmpty()
						&& !ctSenha.getText().isEmpty()) {

					String numAux = ctNumero.getText();
					int numero = Integer.valueOf(numAux).intValue();
					empresas = e.Alterarempresa(ctNome.getText(), ctCnpj.getText(), ctTel.getText(), ctCep.getText(),
							ctLogradouro.getText(), ctBairro.getText(), numero, ctComplemento.getText(),
							ctCidade.getText(), ctEstado.getSelectedItem().toString(), ctUsuario.getText(),
							ctSenha.getText(), id);
					if (EmpresasDAO.alterarempresa) {
						JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Erro ao alterar!");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Falha!",
							JOptionPane.ERROR_MESSAGE);
					ctNome.requestFocus();
				}
				TelaLogin tl1 = new TelaLogin();
				tl1.setVisible(true);
				dispose();
			}
		});
		btnSalvarDados.setBounds(664, 425, 116, 30);
		contentPane.add(btnSalvarDados);

		JLabel lblFundo = new JLabel("New label");
		lblFundo.setIcon(new ImageIcon(FormConfiguracoes.class.getResource("/com/poo2/img/fundo1.jpeg")));
		lblFundo.setBounds(0, 0, 792, 463);
		contentPane.add(lblFundo);

	}
}
