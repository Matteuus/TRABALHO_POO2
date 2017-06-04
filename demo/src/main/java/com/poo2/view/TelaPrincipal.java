package com.poo2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaPrincipal extends JFrame {

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
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 792, 26);
		contentPane.add(menuBar);
		
		JMenu mnNova = new JMenu("Nova");
		menuBar.add(mnNova);
		
		JMenuItem mntmCompra = new JMenuItem("Compra");
		mnNova.add(mntmCompra);
		
		JMenuItem mntmVenda = new JMenuItem("Venda");
		mnNova.add(mntmVenda);
		
		JMenu mnRelatrio = new JMenu("Relatório");
		menuBar.add(mnRelatrio);
		
		JMenuItem mntmCompra_1 = new JMenuItem("Compra");
		mnRelatrio.add(mntmCompra_1);
		
		JMenuItem mntmVenda_1 = new JMenuItem("Venda");
		mnRelatrio.add(mntmVenda_1);
		
		JMenu mnLista = new JMenu("Lista");
		menuBar.add(mnLista);
		
		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		mnLista.add(mntmProdutos);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(12, 425, 97, 25);
		contentPane.add(btnSair);
		
		JButton btnConfiguraes = new JButton("Configurações");
		btnConfiguraes.setBounds(667, 425, 115, 25);
		contentPane.add(btnConfiguraes);
		
		JLabel lblBemVindo = new JLabel("Bem Vindo, ");
		lblBemVindo.setBounds(667, 40, 113, 16);
		contentPane.add(lblBemVindo);
	}
}
