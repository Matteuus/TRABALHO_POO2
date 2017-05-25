package com.poo2.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;

public class telaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCadastro frame = new telaCadastro();
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
	public telaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRazoSocial = new JLabel("Razão Social:");
		lblRazoSocial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRazoSocial.setBounds(21, 11, 89, 26);
		contentPane.add(lblRazoSocial);
		
		textField = new JTextField();
		textField.setBounds(21, 36, 293, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Endereço:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(21, 67, 89, 26);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(21, 92, 293, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCep.setBounds(21, 123, 46, 14);
		contentPane.add(lblCep);
		
		textField_2 = new JTextField();
		textField_2.setBounds(21, 145, 115, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCnpj.setBounds(21, 176, 46, 14);
		contentPane.add(lblCnpj);
		
		textField_3 = new JTextField();
		textField_3.setBounds(21, 201, 115, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF(Pessoa Fisica):");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(167, 176, 122, 14);
		contentPane.add(lblCpf);
		
		textField_4 = new JTextField();
		textField_4.setBounds(167, 201, 100, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblInscrioMunicipal = new JLabel("Inscrição Municipal:");
		lblInscrioMunicipal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInscrioMunicipal.setBounds(21, 232, 149, 14);
		contentPane.add(lblInscrioMunicipal);
		
		textField_5 = new JTextField();
		textField_5.setBounds(21, 257, 290, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia:");
		lblNomeFantasia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeFantasia.setBounds(391, 17, 100, 14);
		contentPane.add(lblNomeFantasia);
		
		textField_6 = new JTextField();
		textField_6.setBounds(391, 36, 245, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBairro.setBounds(391, 73, 46, 14);
		contentPane.add(lblBairro);
		
		textField_7 = new JTextField();
		textField_7.setBounds(391, 92, 149, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUf.setBounds(391, 125, 46, 14);
		contentPane.add(lblUf);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCidade.setBounds(464, 125, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblInscrioEstadual = new JLabel("Inscrição Estadual:");
		lblInscrioEstadual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInscrioEstadual.setBounds(391, 178, 149, 14);
		contentPane.add(lblInscrioEstadual);
		
		textField_8 = new JTextField();
		textField_8.setBounds(391, 201, 180, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblInssPessoaFisica = new JLabel("INSS Pessoa Fisica:");
		lblInssPessoaFisica.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInssPessoaFisica.setBounds(21, 288, 127, 14);
		contentPane.add(lblInssPessoaFisica);
		
		textField_9 = new JTextField();
		textField_9.setBounds(21, 313, 216, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(391, 145, 28, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(464, 145, 28, 20);
		contentPane.add(comboBox_1);
	}
}
