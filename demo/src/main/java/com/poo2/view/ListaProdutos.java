package com.poo2.view;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import com.poo2.contoller.ProdutosDAO;
import com.poo2.model.Produtos;
import com.poo2.tableModel.ProdutoTableModel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class ListaProdutos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final long Long = 0;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblFundo;

	private void PreencherTabela(long id) {
		ProdutosDAO pd = new ProdutosDAO();
		ProdutoTableModel ptm = new ProdutoTableModel(pd.listar("idEmpresa", id));
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
	public ListaProdutos(long id) {
		setTitle("Lista de Produtos");
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

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int linha = table.getSelectedRow();

				if (linha < 0) {
					JOptionPane.showMessageDialog(null, "Selecione um Produto!", "Erro!", JOptionPane.ERROR_MESSAGE);
				} else {

					Object o = table.getValueAt(linha, 0);
					ProdutosDAO pd = new ProdutosDAO();
					Produtos p = pd.listar("idProduto", (long) o).get(0);

					UIManager.put("OptionPane.noButtonText", "Não");
					UIManager.put("OptionPane.yesButtonText", "Sim");
					if (JOptionPane.showConfirmDialog(rootPane, "Deseja Excluir?", "Excluir",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)

					{
						JOptionPane.showMessageDialog(rootPane, "Produto excluído com sucesso!");
						pd.remover(p);
						PreencherTabela(id);
					}
				}

			}
		});
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExcluir.setBackground(SystemColor.control);
		btnExcluir.setBounds(664, 421, 116, 30);
		contentPane.add(btnExcluir);

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
