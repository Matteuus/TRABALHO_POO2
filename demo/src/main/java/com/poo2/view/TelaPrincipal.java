package com.poo2.view;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;

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
		setTitle("Gerenciamento");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.control);
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.setBounds(0, 0, 792, 26);
		contentPane.add(menuBar);

		JMenu mnNova = new JMenu("Nova");
		mnNova.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNova);

		JMenuItem mntmCompra = new JMenuItem("Compra");
		mntmCompra.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListaCompras lp = new ListaCompras(id);
				lp.setVisible(true);
				dispose();
			}
		});
		mnNova.add(mntmCompra);

		JMenuItem mntmVenda = new JMenuItem("Venda");
		mntmVenda.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmVenda.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				CategoriaProduto fcp = new CategoriaProduto(id);
				fcp.setVisible(true);
				dispose();
			}
		});
		mnNova.add(mntmVenda);

		JMenu mnRelatrio = new JMenu("Relatório");
		mnRelatrio.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnRelatrio);

		JMenuItem mntmCompra_1 = new JMenuItem("Compra");
		mntmCompra_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RelatorioCompras rc = new RelatorioCompras(id);
				rc.setVisible(true);
				dispose();
				
			}
		});
		mntmCompra_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		mnRelatrio.add(mntmCompra_1);

		JMenuItem mntmVenda_1 = new JMenuItem("Venda");
		mntmVenda_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RelatorioVendas rv = new RelatorioVendas(id);
				rv.setVisible(true);
				dispose();
			}
		});
		mntmVenda_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnRelatrio.add(mntmVenda_1);

		JMenu mnLista = new JMenu("Lista");
		mnLista.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnLista);

		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		mntmProdutos.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaProdutos lp = new ListaProdutos(id);
				lp.setVisible(true);
				dispose();
			}
		});
		mnLista.add(mntmProdutos);

		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(SystemColor.control);
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin tl = new TelaLogin();
				tl.setVisible(true);
				dispose();
			}
		});
		btnSair.setBounds(664, 421, 116, 30);
		contentPane.add(btnSair);

		JButton btnConfiguracoes = new JButton("");
		btnConfiguracoes.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/com/poo2/icones/setting.png")));
		btnConfiguracoes.setBackground(SystemColor.control);
		btnConfiguracoes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnConfiguracoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormConfiguracoes fc = new FormConfiguracoes(id);
				fc.setVisible(true);
				dispose();
			}
		});
		btnConfiguracoes.setBounds(750, 39, 30, 30);
		contentPane.add(btnConfiguracoes);

		JLabel lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/com/poo2/img/fundo4.jpeg")));
		lblFundo.setBounds(0, 0, 792, 463);
		contentPane.add(lblFundo);
	}
}
