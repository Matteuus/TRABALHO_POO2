package com.poo2.view;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import com.poo2.contoller.ProdutosDAO;
import com.poo2.contoller.RelatorioDAO;
import com.poo2.tableModel.ProdutoTableModel;
import com.poo2.tableModel.RelatorioCompraTableModel;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RelatorioCompras extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final long Longg = 0;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblFundo;

	private void PreencherTabela(long id) {
		RelatorioDAO pd = new RelatorioDAO();
		RelatorioCompraTableModel ptm = new RelatorioCompraTableModel(pd.listar("idEmpresaCompra", id));
		table.setModel(ptm);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RelatorioCompras frame = new RelatorioCompras(Longg);
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
	public RelatorioCompras(long id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int width = 810;
		int height = 510;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2;
		setBounds(x, y, width, height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setBounds(10, 50, 414, 143);
		contentPane.add(table);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 36, 770, 365);
		contentPane.add(scrollPane);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(SystemColor.control);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaPrincipal tp = new TelaPrincipal(id);
				tp.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(12, 421, 116, 30);
		contentPane.add(btnVoltar);

		lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon(ListaProdutos.class.getResource("/com/poo2/img/fundo1.jpeg")));
		lblFundo.setBounds(0, 0, 792, 463);
		contentPane.add(lblFundo);
		ProdutosDAO pd = new ProdutosDAO();
		ProdutoTableModel ptm = new ProdutoTableModel(pd.listar("idEmpresa", id));
		table.setModel(ptm);
		PreencherTabela(id);

	}

}
