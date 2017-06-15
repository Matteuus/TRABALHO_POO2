package com.poo2.view;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import com.poo2.contoller.ProdutosDAO;
import com.poo2.contoller.RelatorioDAO;
import com.poo2.model.Produtos;
import com.poo2.model.Relatorio;
import com.poo2.tableModel.CompraTableModel;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class ListaCompras extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final long Long = 0;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblFundo;
	private JTextField ctPesquisar;

	private void PreencherTabela(long id) {
		ProdutosDAO pd = new ProdutosDAO();
		CompraTableModel ptm = new CompraTableModel(pd.listarE("idEmpresa", id));
		table.setModel(ptm);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					ListaCompras frame = new ListaCompras(Long);
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
	public ListaCompras(long id) {
		setTitle("Lista de Compras");
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int WIDTH = 810;
		int HEIGHT = 510;
		int x = (screen.width - WIDTH) / 2;
		int y = (screen.height - HEIGHT) / 2;
		setBounds(x, y, WIDTH, HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		table = new JTable();
		table.setBounds(1, 30, 768, 64);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {

				String msg = JOptionPane.showInputDialog("Selecione a quantidade:");
				if (msg.equals(null) || msg.equals("")) {
					JOptionPane.showMessageDialog(null, "Digite uma quantidade!");
				} else {

					int qtdselecionada = Integer.valueOf(msg).intValue();

					int linha = table.getSelectedRow();

					Object o = table.getValueAt(linha, 0);
					ProdutosDAO pd = new ProdutosDAO();
					RelatorioDAO rd = new RelatorioDAO();
					Produtos p = pd.listar("idProduto", (long) o).get(0);
					Relatorio p2 = new Relatorio();

					int qtdp = p.getEstoqueProduto();
					int qtdrestante = qtdp - qtdselecionada;

					if (qtdrestante < 0) {
						JOptionPane.showMessageDialog(null, "Quantidade indisponível");
					} else {
						
						float total = qtdselecionada * p.getValorProduto();
						
						p2.setIdProduto(p.getIdProduto());
						p2.setIdEmpresaCompra(id);
						p2.setIdEmpresaVenda(p.getIdEmpresa());
						p2.setQtdProduto(qtdselecionada);
						p2.setValorTotal(total);
						
						p.setEstoqueProduto(qtdrestante);


						pd.alterar(p);
						rd.salvar(p2);
						qtdrestante = 0;
						
						JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso!");
						
						PreencherTabela(id);

					}

				}
			}
		});
		contentPane.setLayout(null);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(table);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 36, 770, 365);
		contentPane.add(scrollPane);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(12, 421, 116, 30);
		btnVoltar.setBackground(SystemColor.control);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaPrincipal tp = new TelaPrincipal(id);
				tp.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnVoltar);
		
		JButton btnRefresh = new JButton("");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRefresh.setIcon(new ImageIcon(ListaCompras.class.getResource("/com/poo2/icones/refresh.png")));
		btnRefresh.setBackground(new Color(172, 222, 219));
		btnRefresh.setBounds(381, 421, 30, 30);
		contentPane.add(btnRefresh);
		
		JLabel lblBusca = new JLabel("Busca: ");
		lblBusca.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBusca.setBounds(561, 421, 60, 30);
		contentPane.add(lblBusca);
		
		ctPesquisar = new JTextField();
		ctPesquisar.setBounds(622, 421, 116, 30);
		contentPane.add(ctPesquisar);
		ctPesquisar.setColumns(10);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisar.setIcon(new ImageIcon(ListaCompras.class.getResource("/com/poo2/icones/search.png")));
		btnPesquisar.setBackground(new Color(172, 222, 219));
		btnPesquisar.setBounds(750, 421, 30, 30);
		contentPane.add(btnPesquisar);

		lblFundo = new JLabel("");
		lblFundo.setBounds(0, 0, 792, 463);
		lblFundo.setIcon(new ImageIcon(ListaCompras.class.getResource("/com/poo2/img/fundo1.jpeg")));
		contentPane.add(lblFundo);
		PreencherTabela(id);
	}
}
