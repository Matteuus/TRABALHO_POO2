package com.poo2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo2.contoller.Empresa;

import javax.swing.JLabel;
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

		JLabel lblRazoSocial = new JLabel("Nome");
		lblRazoSocial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRazoSocial.setBounds(21, 11, 89, 26);
		contentPane.add(lblRazoSocial);

		ctNome = new JTextField();
		ctNome.setBounds(21, 36, 352, 20);
		contentPane.add(ctNome);
		ctNome.setColumns(10);

		JLabel lblNome = new JLabel("CNPJ");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(21, 67, 89, 26);
		contentPane.add(lblNome);

		ctCnpj = new JTextField();
		ctCnpj.setBounds(21, 92, 352, 20);
		contentPane.add(ctCnpj);
		ctCnpj.setColumns(10);

		JLabel lblCep = new JLabel("Bairro");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCep.setBounds(21, 123, 46, 14);
		contentPane.add(lblCep);

		ctBairro = new JTextField();
		ctBairro.setBounds(21, 145, 173, 20);
		contentPane.add(ctBairro);
		ctBairro.setColumns(10);

		JLabel lblCnpj = new JLabel("Logradouro");
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCnpj.setBounds(206, 120, 115, 20);
		contentPane.add(lblCnpj);

		ctLogradouro = new JTextField();
		ctLogradouro.setBounds(206, 145, 167, 20);
		contentPane.add(ctLogradouro);
		ctLogradouro.setColumns(10);

		JLabel lblInscrioMunicipal = new JLabel("Cidade");
		lblInscrioMunicipal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInscrioMunicipal.setBounds(21, 178, 149, 14);
		contentPane.add(lblInscrioMunicipal);

		ctCidade = new JTextField();
		ctCidade.setBounds(21, 197, 352, 20);
		contentPane.add(ctCidade);
		ctCidade.setColumns(10);

		JLabel lblNomeFantasia = new JLabel("Telefone");
		lblNomeFantasia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeFantasia.setBounds(385, 17, 100, 14);
		contentPane.add(lblNomeFantasia);

		ctTel = new JTextField();
		ctTel.setBounds(385, 36, 395, 20);
		contentPane.add(ctTel);
		ctTel.setColumns(10);

		JLabel lblBairro = new JLabel("CEP");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBairro.setBounds(385, 73, 46, 14);
		contentPane.add(lblBairro);

		ctCep = new JTextField();
		ctCep.setBounds(385, 92, 395, 20);
		contentPane.add(ctCep);
		ctCep.setColumns(10);

		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUf.setBounds(385, 178, 46, 14);
		contentPane.add(lblUf);

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
				String numAux = ctNumero.getText();
				int numero = Integer.valueOf(numAux).intValue();
				e.addDados(ctNome.getText(), ctCnpj.getText(), ctTel.getText(), ctLogradouro.getText(),
						ctBairro.getText(), numero, ctComplemento.getText(), ctCidade.getText(),
						ctEstado.getSelectedItem().toString(), ctUsuario.getText(), ctSenha.getText());
			}
		});
		btnSalvarDados.setBounds(665, 425, 115, 25);
		contentPane.add(btnSalvarDados);

		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setBounds(21, 425, 115, 25);
		contentPane.add(btnNewButton);

		ctUsuario = new JTextField();
		ctUsuario.setColumns(10);
		ctUsuario.setBounds(383, 145, 173, 20);
		contentPane.add(ctUsuario);

		JLabel lblUsurio = new JLabel("Usuário");
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsurio.setBounds(383, 126, 46, 14);
		contentPane.add(lblUsurio);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(568, 123, 115, 20);
		contentPane.add(lblSenha);

		ctSenha = new JPasswordField();
		ctSenha.setBounds(566, 145, 214, 20);
		contentPane.add(ctSenha);

		ctNumero = new JTextField();
		ctNumero.setColumns(10);
		ctNumero.setBounds(465, 197, 149, 20);
		contentPane.add(ctNumero);

		JLabel lblNmero = new JLabel("Número");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNmero.setBounds(465, 178, 76, 14);
		contentPane.add(lblNmero);

		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComplemento.setBounds(631, 175, 115, 20);
		contentPane.add(lblComplemento);

		ctComplemento = new JTextField();
		ctComplemento.setColumns(10);
		ctComplemento.setBounds(631, 197, 149, 20);
		contentPane.add(ctComplemento);
	}
}
