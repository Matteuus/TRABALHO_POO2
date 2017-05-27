package com.poo2.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class dadosBancarios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dadosBancarios frame = new dadosBancarios();
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
	public dadosBancarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBanco = new JLabel("Banco:");
		lblBanco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBanco.setBounds(10, 11, 46, 14);
		contentPane.add(lblBanco);
		
		JLabel lblAgncia = new JLabel("Agência:");
		lblAgncia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAgncia.setBounds(123, 13, 92, 14);
		contentPane.add(lblAgncia);
		
		JLabel lblContaCorrente = new JLabel("Conta Corrente:");
		lblContaCorrente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContaCorrente.setBounds(247, 13, 110, 14);
		contentPane.add(lblContaCorrente);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 36, 102, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(247, 36, 102, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
