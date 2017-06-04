package com.poo2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;


public class FormCadEmpresa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JTextField textField_8;
	private JTextField textField_9;

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

		JLabel lblRazoSocial = new JLabel("Nome");
		lblRazoSocial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRazoSocial.setBounds(21, 11, 89, 26);
		contentPane.add(lblRazoSocial);

		textField = new JTextField();
		textField.setBounds(21, 36, 352, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNome = new JLabel("CNPJ");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(21, 67, 89, 26);
		contentPane.add(lblNome);

		textField_1 = new JTextField();
		textField_1.setBounds(21, 92, 352, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblCep = new JLabel("Bairro");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCep.setBounds(21, 123, 46, 14);
		contentPane.add(lblCep);

		textField_2 = new JTextField();
		textField_2.setBounds(21, 145, 173, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblCnpj = new JLabel("Logradouro");
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCnpj.setBounds(206, 120, 115, 20);
		contentPane.add(lblCnpj);

		textField_3 = new JTextField();
		textField_3.setBounds(206, 145, 167, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblInscrioMunicipal = new JLabel("Cidade");
		lblInscrioMunicipal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInscrioMunicipal.setBounds(21, 178, 149, 14);
		contentPane.add(lblInscrioMunicipal);

		textField_5 = new JTextField();
		textField_5.setBounds(21, 197, 352, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNomeFantasia = new JLabel("Telefone");
		lblNomeFantasia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeFantasia.setBounds(385, 17, 100, 14);
		contentPane.add(lblNomeFantasia);

		textField_6 = new JTextField();
		textField_6.setBounds(385, 36, 395, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblBairro = new JLabel("CEP");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBairro.setBounds(385, 73, 46, 14);
		contentPane.add(lblBairro);

		textField_7 = new JTextField();
		textField_7.setBounds(385, 92, 395, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUf.setBounds(385, 178, 46, 14);
		contentPane.add(lblUf);

		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(383, 197, 28, 20);
		contentPane.add(comboBox);
		
		JButton btnSalvarDados = new JButton("Salvar Dados");
		btnSalvarDados.setBounds(665, 425, 115, 25);
		contentPane.add(btnSalvarDados);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setBounds(21, 425, 115, 25);
		contentPane.add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(383, 145, 173, 20);
		contentPane.add(textField_4);
		
		JLabel lblUsurio = new JLabel("Usuário");
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsurio.setBounds(383, 126, 46, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(568, 123, 115, 20);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(566, 145, 214, 20);
		contentPane.add(passwordField);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(421, 197, 173, 20);
		contentPane.add(textField_8);
		
		JLabel lblNmero = new JLabel("Número");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNmero.setBounds(421, 178, 76, 14);
		contentPane.add(lblNmero);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComplemento.setBounds(606, 175, 115, 20);
		contentPane.add(lblComplemento);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(604, 197, 167, 20);
		contentPane.add(textField_9);
	}
}
