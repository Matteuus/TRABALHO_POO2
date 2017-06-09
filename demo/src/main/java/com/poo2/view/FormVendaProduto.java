package com.poo2.view;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo2.contoller.VendaProduto;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class FormVendaProduto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7;
	protected static final String String = null;
	protected static final long Long = 0;
	private JPanel contentPane;
	private JTextField ctNomeProduto;
	private JTextField ctQtdProduto;
	private JLabel lbValor;
	private JTextField ctValorProduto;
	private JTextField ctCategoria;
	private JLabel lblProdutoVenda;
	private JLabel lblFundo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormVendaProduto frame = new FormVendaProduto(String, Long);
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
	public FormVendaProduto(String categoria, long id) {
		setTitle("Venda");
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
		
		lblProdutoVenda = new JLabel("Produto a Venda");
		lblProdutoVenda.setHorizontalAlignment(SwingConstants.CENTER);
		lblProdutoVenda.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lblProdutoVenda.setBounds(12, 10, 768, 30);
		contentPane.add(lblProdutoVenda);

		JLabel lbCategoria = new JLabel("Categoria");
		lbCategoria.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lbCategoria.setBounds(12, 40, 378, 30);
		contentPane.add(lbCategoria);
		
		ctCategoria = new JTextField(categoria);
		ctCategoria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctCategoria.setBackground(new Color(255, 250, 205));
		ctCategoria.setEditable(false);
		ctCategoria.setBounds(12, 70, 378, 30);
		contentPane.add(ctCategoria);
		ctCategoria.setColumns(10);

		JLabel lbNomeProduto = new JLabel("Nome");
		lbNomeProduto.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lbNomeProduto.setBounds(12, 100, 378, 30);
		contentPane.add(lbNomeProduto);

		ctNomeProduto = new JTextField();
		ctNomeProduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctNomeProduto.setBounds(12, 130, 378, 30);
		contentPane.add(ctNomeProduto);
		ctNomeProduto.setColumns(10);

		JLabel lbQtd = new JLabel("Quantidade");
		lbQtd.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lbQtd.setBounds(12, 160, 378, 30);
		contentPane.add(lbQtd);

		ctQtdProduto = new JTextField();
		ctQtdProduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ctQtdProduto.setBounds(12, 190, 378, 30);
		contentPane.add(ctQtdProduto);
		ctQtdProduto.setColumns(10);

		lbValor = new JLabel("Valor R$");
		lbValor.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		lbValor.setBounds(12, 220, 378, 30);
		contentPane.add(lbValor);

		ctValorProduto = new JTextField();
		ctValorProduto.setColumns(10);
		ctValorProduto.setBounds(12, 250, 378, 30);
		contentPane.add(ctValorProduto);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVoltar.setBackground(SystemColor.control);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CategoriaProduto fcp = new CategoriaProduto(id);
				fcp.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(12, 421, 116, 30);
		contentPane.add(btnVoltar);

		JButton btnSalvarProduto = new JButton("Salvar");
		btnSalvarProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalvarProduto.setBackground(SystemColor.control);
		btnSalvarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VendaProduto vd = new VendaProduto();
				String valorAux = ctValorProduto.getText();
				float valor = Float.valueOf(valorAux).floatValue();
				String qtdAux = ctQtdProduto.getText();
				int qtd = Integer.valueOf(qtdAux).intValue();
				int resultado = vd.addDados(id, ctNomeProduto.getText(), categoria, valor, qtd);
				if (resultado == 1) {
					TelaPrincipal tl = new TelaPrincipal(id);
					tl.setVisible(true);
					dispose();
				}
			}
		});
		btnSalvarProduto.setBounds(660, 421, 116, 30);
		contentPane.add(btnSalvarProduto);
		
		lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon(FormVendaProduto.class.getResource("/com/poo2/img/fundo1.jpeg")));
		lblFundo.setBounds(0, 0, 792, 463);
		contentPane.add(lblFundo);
	}
}
