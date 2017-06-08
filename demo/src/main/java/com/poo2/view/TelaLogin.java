package com.poo2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo2.contoller.Empresa;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ctLogin;
	private JPasswordField ctSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLogin.setBounds(275, 226, 64, 22);
		contentPane.add(lblLogin);

		ctLogin = new JTextField();
		ctLogin.setBounds(340, 226, 116, 22);
		contentPane.add(ctLogin);
		ctLogin.setColumns(10);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setBounds(275, 269, 67, 22);
		contentPane.add(lblSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Empresa e = new Empresa();
				@SuppressWarnings("deprecation")
				long id = e.verificarLogin(ctLogin.getText(), ctSenha.getText());
				TelaPrincipal tp = new TelaPrincipal(id);
				tp.setVisible(true);
				dispose();
				
			}
		});
		btnEntrar.setBounds(340, 325, 97, 25);
		contentPane.add(btnEntrar);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				FormCadEmpresa fce = new FormCadEmpresa();
				fce.setVisible(true);
				dispose();

			}
		});
		btnCadastrar.setBounds(340, 361, 97, 25);
		contentPane.add(btnCadastrar);
		
		ctSenha = new JPasswordField();
		ctSenha.setBounds(340, 271, 116, 22);
		contentPane.add(ctSenha);
	}
}
