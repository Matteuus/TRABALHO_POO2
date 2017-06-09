package com.poo2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo2.contoller.VendaProduto;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbNomeProduto = new JLabel("Nome");
		lbNomeProduto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbNomeProduto.setBounds(12, 46, 46, 22);
		contentPane.add(lbNomeProduto);

		ctNomeProduto = new JTextField();
		ctNomeProduto.setBounds(12, 70, 390, 20);
		contentPane.add(ctNomeProduto);
		ctNomeProduto.setColumns(10);

		JLabel lbCategoria = new JLabel("Categoria: " + categoria);
		lbCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCategoria.setBounds(12, 13, 390, 20);
		contentPane.add(lbCategoria);

		JLabel lbQtd = new JLabel("Quantidade");
		lbQtd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbQtd.setBounds(12, 103, 110, 20);
		contentPane.add(lbQtd);

		ctQtdProduto = new JTextField();
		ctQtdProduto.setBounds(12, 136, 102, 20);
		contentPane.add(ctQtdProduto);
		ctQtdProduto.setColumns(10);

		lbValor = new JLabel("Valor R$");
		lbValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbValor.setBounds(12, 169, 110, 20);
		contentPane.add(lbValor);

		ctValorProduto = new JTextField();
		ctValorProduto.setColumns(10);
		ctValorProduto.setBounds(12, 202, 102, 20);
		contentPane.add(ctValorProduto);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CategoriaProduto fcp = new CategoriaProduto(id);
				fcp.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(12, 425, 97, 25);
		contentPane.add(btnVoltar);

		JButton btnSalvarProduto = new JButton("Salvar Produto");
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
		btnSalvarProduto.setBounds(660, 425, 120, 25);
		contentPane.add(btnSalvarProduto);
	}
}
