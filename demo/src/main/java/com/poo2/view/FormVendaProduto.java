package com.poo2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class FormVendaProduto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JLabel lblPreounidade;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormVendaProduto frame = new FormVendaProduto();
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
	public FormVendaProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBanco = new JLabel("Nome");
		lblBanco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBanco.setBounds(10, 11, 46, 22);
		contentPane.add(lblBanco);

		JLabel lblAgncia = new JLabel("Categoria");
		lblAgncia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAgncia.setBounds(10, 69, 92, 20);
		contentPane.add(lblAgncia);

		JLabel lblContaCorrente = new JLabel("Quantidade");
		lblContaCorrente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContaCorrente.setBounds(10, 137, 110, 20);
		contentPane.add(lblContaCorrente);

		textField = new JTextField();
		textField.setBounds(10, 36, 390, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(10, 170, 102, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblPreounidade = new JLabel("Valor R$");
		lblPreounidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreounidade.setBounds(10, 203, 110, 20);
		contentPane.add(lblPreounidade);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 236, 102, 20);
		contentPane.add(textField_3);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Selecione");
		comboBox.addItem("Item 1");
		comboBox.addItem("Item 2");
		comboBox.addItem("Item 3");
		comboBox.setBounds(10, 102, 102, 22);
		contentPane.add(comboBox);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(12, 425, 97, 25);
		contentPane.add(btnVoltar);
		
		JButton btnSalvarProduto = new JButton("Salvar Produto");
		btnSalvarProduto.setBounds(660, 425, 120, 25);
		contentPane.add(btnSalvarProduto);
	}
}
