package com.poo2.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.poo2.contoller.Empresa;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;

public class FormCadEmpresa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ctNome;
	private JTextField ctCnpj;
	private JTextField ctBairro;
	private JTextField ctLogradouro;
	private JTextField ctCidade;
	private JTextField ctTel;
	private JTextField ctCep;
	private JTextField ctUsuario;
	private JPasswordField ctSenha;
	private JTextField ctNumero;
	private JTextField ctComplemento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCadEmpresa frame = new FormCadEmpresa();
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
	public FormCadEmpresa() {
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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

		JLabel lblDados = new JLabel("Dados Cadastrais");
		lblDados.setHorizontalAlignment(SwingConstants.CENTER);
		lblDados.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblDados.setBounds(12, 10, 378, 30);
		contentPane.add(lblDados);

		JLabel lblNomeEmpresa = new JLabel("Nome");
		lblNomeEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblNomeEmpresa.setBounds(12, 40, 378, 30);
		contentPane.add(lblNomeEmpresa);

		ctNome = new JTextField();
		ctNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctNome.setBounds(12, 70, 378, 30);
		contentPane.add(ctNome);
		ctNome.setColumns(10);

		JLabel lblCnpjEmpresa = new JLabel("CNPJ");
		lblCnpjEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblCnpjEmpresa.setBounds(12, 100, 378, 30);
		contentPane.add(lblCnpjEmpresa);

		ctCnpj = new JTextField();
		ctCnpj.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctCnpj.setBounds(12, 130, 378, 30);
		contentPane.add(ctCnpj);
		ctCnpj.setColumns(10);

		JLabel lblTelEmpresa = new JLabel("Telefone");
		lblTelEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblTelEmpresa.setBounds(12, 160, 378, 30);
		contentPane.add(lblTelEmpresa);

		ctTel = new JTextField();
		ctTel.setBounds(12, 190, 378, 30);
		contentPane.add(ctTel);
		ctTel.setColumns(10);

		JLabel lblUsuarioEmpresa = new JLabel("Usuário");
		lblUsuarioEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblUsuarioEmpresa.setBounds(12, 220, 378, 30);
		contentPane.add(lblUsuarioEmpresa);

		ctUsuario = new JTextField();
		ctUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctUsuario.setColumns(10);
		ctUsuario.setBounds(12, 250, 378, 30);
		contentPane.add(ctUsuario);

		JLabel lblSenhaEmpresa = new JLabel("Senha");
		lblSenhaEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblSenhaEmpresa.setBounds(12, 280, 378, 30);
		contentPane.add(lblSenhaEmpresa);

		ctSenha = new JPasswordField();
		ctSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctSenha.setBounds(12, 310, 378, 30);
		contentPane.add(ctSenha);

		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblEndereco.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereco.setBounds(402, 10, 378, 30);
		contentPane.add(lblEndereco);

		JLabel lblCepEmpresa = new JLabel("CEP");
		lblCepEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblCepEmpresa.setBounds(402, 40, 378, 30);
		contentPane.add(lblCepEmpresa);

		ctCep = new JTextField();
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

		ctCidade = new JTextField();
		ctCidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctCidade.setBounds(474, 130, 306, 30);
		contentPane.add(ctCidade);
		ctCidade.setColumns(10);

		JLabel lblBairroEmpresa = new JLabel("Bairro");
		lblBairroEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblBairroEmpresa.setBounds(402, 160, 378, 30);
		contentPane.add(lblBairroEmpresa);

		ctBairro = new JTextField();
		ctBairro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctBairro.setBounds(402, 190, 378, 30);
		contentPane.add(ctBairro);
		ctBairro.setColumns(10);

		JLabel lblLogradouroEmpresa = new JLabel("Logradouro");
		lblLogradouroEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblLogradouroEmpresa.setBounds(402, 220, 378, 30);
		contentPane.add(lblLogradouroEmpresa);

		ctLogradouro = new JTextField();
		ctLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctLogradouro.setBounds(402, 250, 378, 30);
		contentPane.add(ctLogradouro);
		ctLogradouro.setColumns(10);

		JButton btnSalvarDados = new JButton("Salvar");
		btnSalvarDados.setBackground(SystemColor.control);
		btnSalvarDados.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalvarDados.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				Empresa e = new Empresa();
				if (!ctNome.getText().isEmpty() && !ctCnpj.getText().isEmpty() && !ctTel.getText().isEmpty()
						&& !ctLogradouro.getText().isEmpty() && !ctBairro.getText().isEmpty()
						&& !ctNumero.getText().isEmpty() && !ctCidade.getText().isEmpty()
						&& !ctUsuario.getText().isEmpty() && !ctSenha.getText().isEmpty()) {

					String numAux = ctNumero.getText();
					int numero = Integer.valueOf(numAux).intValue();
					int resultado = e.addDados(ctNome.getText(), ctCnpj.getText(), ctTel.getText(), ctCep.getText(),
							ctLogradouro.getText(), ctBairro.getText(), numero, ctComplemento.getText(),
							ctCidade.getText(), ctEstado.getSelectedItem().toString(), ctUsuario.getText(),
							ctSenha.getText());
					if (resultado == 1) {
						dispose();
					}

				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Falha!",
							JOptionPane.ERROR_MESSAGE);
					ctNome.requestFocus();
				}

			}
		});

		JLabel lblNumeroEmpresa = new JLabel("Número");
		lblNumeroEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblNumeroEmpresa.setBounds(402, 280, 183, 30);
		contentPane.add(lblNumeroEmpresa);

		ctNumero = new JTextField();
		ctNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctNumero.setColumns(10);
		ctNumero.setBounds(402, 310, 183, 30);
		contentPane.add(ctNumero);

		JLabel lblComplementoEmpresa = new JLabel("Complemento");
		lblComplementoEmpresa.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblComplementoEmpresa.setBounds(597, 280, 183, 30);
		contentPane.add(lblComplementoEmpresa);

		ctComplemento = new JTextField();
		ctComplemento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctComplemento.setColumns(10);
		ctComplemento.setBounds(597, 310, 183, 30);
		contentPane.add(ctComplemento);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(SystemColor.control);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				TelaLogin tl = new TelaLogin();
				tl.setVisible(true);
				dispose();

			}
		});
		btnVoltar.setBounds(12, 421, 116, 30);
		contentPane.add(btnVoltar);
		btnSalvarDados.setBounds(665, 421, 116, 30);
		contentPane.add(btnSalvarDados);

		JLabel lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon(FormCadEmpresa.class.getResource("/com/poo2/img/fundo1.jpeg")));
		lblFundo.setBounds(0, 0, 792, 463);
		contentPane.add(lblFundo);
	}
}
