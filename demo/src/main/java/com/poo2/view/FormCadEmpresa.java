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
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNomeEmpresa = new JLabel("Nome");
		lblNomeEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeEmpresa.setBounds(21, 11, 89, 26);
		contentPane.add(lblNomeEmpresa);

		ctNome = new JTextField();
		ctNome.setBounds(21, 36, 352, 20);
		contentPane.add(ctNome);
		ctNome.setColumns(10);

		JLabel lblCnpjEmpresa = new JLabel("CNPJ");
		lblCnpjEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCnpjEmpresa.setBounds(21, 67, 89, 26);
		contentPane.add(lblCnpjEmpresa);

		ctCnpj = new JTextField();
		ctCnpj.setBounds(21, 92, 352, 20);
		contentPane.add(ctCnpj);
		ctCnpj.setColumns(10);

		JLabel lblBairroEmpresa = new JLabel("Bairro");
		lblBairroEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBairroEmpresa.setBounds(21, 123, 46, 14);
		contentPane.add(lblBairroEmpresa);

		ctBairro = new JTextField();
		ctBairro.setBounds(21, 145, 173, 20);
		contentPane.add(ctBairro);
		ctBairro.setColumns(10);

		JLabel lblLogradouroEmpresa = new JLabel("Logradouro");
		lblLogradouroEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogradouroEmpresa.setBounds(206, 120, 115, 20);
		contentPane.add(lblLogradouroEmpresa);

		ctLogradouro = new JTextField();
		ctLogradouro.setBounds(206, 145, 167, 20);
		contentPane.add(ctLogradouro);
		ctLogradouro.setColumns(10);

		JLabel lblCidadeEmpresa = new JLabel("Cidade");
		lblCidadeEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCidadeEmpresa.setBounds(21, 178, 149, 14);
		contentPane.add(lblCidadeEmpresa);

		ctCidade = new JTextField();
		ctCidade.setBounds(21, 197, 352, 20);
		contentPane.add(ctCidade);
		ctCidade.setColumns(10);

		JLabel lblTelEmpresa = new JLabel("Telefone");
		lblTelEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelEmpresa.setBounds(385, 17, 100, 14);
		contentPane.add(lblTelEmpresa);

		ctTel = new JTextField();
		ctTel.setBounds(385, 36, 395, 20);
		contentPane.add(ctTel);
		ctTel.setColumns(10);

		JLabel lblCepEmpresa = new JLabel("CEP");
		lblCepEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCepEmpresa.setBounds(385, 73, 46, 14);
		contentPane.add(lblCepEmpresa);

		ctCep = new JTextField();
		ctCep.setBounds(385, 92, 395, 20);
		contentPane.add(ctCep);
		ctCep.setColumns(10);

		JLabel lblUfEmpresa = new JLabel("UF");
		lblUfEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUfEmpresa.setBounds(385, 178, 46, 14);
		contentPane.add(lblUfEmpresa);

		JComboBox<String> ctEstado = new JComboBox<String>();
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
		ctEstado.setBounds(383, 197, 70, 20);
		contentPane.add(ctEstado);

		JButton btnSalvarDados = new JButton("Salvar Dados");
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
					int resultado = e.addDados(ctNome.getText(), ctCnpj.getText(), ctTel.getText(),
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
		btnSalvarDados.setBounds(665, 425, 115, 25);
		contentPane.add(btnSalvarDados);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				TelaLogin tl = new TelaLogin();
				tl.setVisible(true);
				dispose();

			}
		});
		btnVoltar.setBounds(21, 425, 115, 25);
		contentPane.add(btnVoltar);

		ctUsuario = new JTextField();
		ctUsuario.setColumns(10);
		ctUsuario.setBounds(383, 145, 173, 20);
		contentPane.add(ctUsuario);

		JLabel lblUsuarioEmpresa = new JLabel("Usuário");
		lblUsuarioEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuarioEmpresa.setBounds(385, 123, 46, 14);
		contentPane.add(lblUsuarioEmpresa);

		JLabel lblSenhaEmpresa = new JLabel("Senha");
		lblSenhaEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenhaEmpresa.setBounds(568, 120, 115, 20);
		contentPane.add(lblSenhaEmpresa);

		ctSenha = new JPasswordField();
		ctSenha.setBounds(566, 145, 214, 20);
		contentPane.add(ctSenha);

		ctNumero = new JTextField();
		ctNumero.setColumns(10);
		ctNumero.setBounds(465, 197, 149, 20);
		contentPane.add(ctNumero);

		JLabel lblNmeroEmpresa = new JLabel("Número");
		lblNmeroEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNmeroEmpresa.setBounds(465, 178, 76, 14);
		contentPane.add(lblNmeroEmpresa);

		JLabel lblComplementoEmpresa = new JLabel("Complemento");
		lblComplementoEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComplementoEmpresa.setBounds(631, 175, 115, 20);
		contentPane.add(lblComplementoEmpresa);

		ctComplemento = new JTextField();
		ctComplemento.setColumns(10);
		ctComplemento.setBounds(631, 197, 149, 20);
		contentPane.add(ctComplemento);
	}
}
