package com.poo2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

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
					TelaPrincipal frame = new TelaPrincipal(Long);
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
	public TelaPrincipal(long id) {
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
		mntmCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListaCompras lp = new ListaCompras(id);
				lp.setVisible(true);
				dispose();
			}
		});
		mnNova.add(mntmCompra);

		JMenuItem mntmVenda = new JMenuItem("Venda");
		mntmVenda.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				CategoriaProduto fcp = new CategoriaProduto(id);
				fcp.setVisible(true);
				dispose();
			}
		});
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
		mntmProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaProdutos lp = new ListaProdutos(id);
				lp.setVisible(true);
				dispose();
			}
		});
		mnLista.add(mntmProdutos);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin tl = new TelaLogin();
				tl.setVisible(true);
				dispose();
			}
		});
		btnSair.setBounds(12, 425, 97, 25);
		contentPane.add(btnSair);

		JButton btnConfiguraes = new JButton("Configurações");
		btnConfiguraes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormConfiguracoes fc = new FormConfiguracoes(id);
				fc.setVisible(true);
				dispose();
			}
		});
		btnConfiguraes.setBounds(654, 425, 130, 25);
		contentPane.add(btnConfiguraes);
	}
}
