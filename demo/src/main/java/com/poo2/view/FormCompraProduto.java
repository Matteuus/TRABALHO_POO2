package com.poo2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class FormCompraProduto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCompraProduto frame = new FormCompraProduto();
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
	public FormCompraProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(12, 425, 97, 25);
		contentPane.add(btnVoltar);
		
		JButton btnComprar = new JButton("Categoria A");
		btnComprar.setBounds(12, 13, 109, 25);
		contentPane.add(btnComprar);
		
		JButton btnCategoriaB = new JButton("Categoria B");
		btnCategoriaB.setBounds(133, 13, 109, 25);
		contentPane.add(btnCategoriaB);
		
		JButton btnCategoriaC = new JButton("Categoria C");
		btnCategoriaC.setBounds(254, 13, 109, 25);
		contentPane.add(btnCategoriaC);
		
		JButton btnCategoriaD = new JButton("Categoria D");
		btnCategoriaD.setBounds(375, 13, 109, 25);
		contentPane.add(btnCategoriaD);
		
		JButton btnCategoriaE = new JButton("Categoria E");
		btnCategoriaE.setBounds(496, 13, 109, 25);
		contentPane.add(btnCategoriaE);
		
		JButton btnCategoriaF = new JButton("Categoria F");
		btnCategoriaF.setBounds(617, 13, 109, 25);
		contentPane.add(btnCategoriaF);
	}

}
