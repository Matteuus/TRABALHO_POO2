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
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;

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
		setTitle("Login");
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

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblLogin.setBounds(12, 13, 64, 30);
		contentPane.add(lblLogin);

		ctLogin = new JTextField();
		ctLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctLogin.setBounds(83, 13, 160, 30);
		contentPane.add(ctLogin);
		ctLogin.setColumns(10);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblSenha.setBounds(12, 56, 67, 30);
		contentPane.add(lblSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEntrar.setBackground(SystemColor.control);
		btnEntrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {

				Empresa e = new Empresa();
				int num = e.verificarLogin(ctLogin.getText(), ctSenha.getText());
				if (num == 1) {
					dispose();
				}

			}
		});

		ctSenha = new JPasswordField();
		ctSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctSenha.setBounds(83, 56, 160, 30);
		contentPane.add(ctSenha);
		btnEntrar.setBounds(255, 56, 116, 30);
		contentPane.add(btnEntrar);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(SystemColor.control);
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				FormCadEmpresa fce = new FormCadEmpresa();
				fce.setVisible(true);
				dispose();

			}
		});
		btnCadastrar.setBounds(664, 420, 116, 30);
		contentPane.add(btnCadastrar);

		JLabel lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon(TelaLogin.class.getResource("/com/poo2/img/fundo4.jpeg")));
		lblFundo.setBounds(0, 0, 792, 463);
		contentPane.add(lblFundo);
	}
}
