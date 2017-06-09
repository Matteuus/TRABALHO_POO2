package com.poo2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CategoriaProduto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final long Long = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CategoriaProduto frame = new CategoriaProduto(Long);
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
	public CategoriaProduto(long id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal tl = new TelaPrincipal(id);
				tl.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(12, 425, 97, 25);
		contentPane.add(btnVoltar);

		JButton btnComprar = new JButton("Categoria A");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "A";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnComprar.setBounds(12, 13, 109, 25);
		contentPane.add(btnComprar);

		JButton btnCategoriaB = new JButton("Categoria B");
		btnCategoriaB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "B";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaB.setBounds(133, 13, 109, 25);
		contentPane.add(btnCategoriaB);

		JButton btnCategoriaC = new JButton("Categoria C");
		btnCategoriaC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "C";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaC.setBounds(254, 13, 109, 25);
		contentPane.add(btnCategoriaC);

		JButton btnCategoriaD = new JButton("Categoria D");
		btnCategoriaD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "D";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaD.setBounds(375, 13, 109, 25);
		contentPane.add(btnCategoriaD);

		JButton btnCategoriaE = new JButton("Categoria E");
		btnCategoriaE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "E";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaE.setBounds(496, 13, 109, 25);
		contentPane.add(btnCategoriaE);

		JButton btnCategoriaF = new JButton("Categoria F");
		btnCategoriaF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "F";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaF.setBounds(617, 13, 109, 25);
		contentPane.add(btnCategoriaF);
	}

}
