package com.poo2.view;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;

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
		setTitle("Categoria");
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

		JButton btnCategoriaA = new JButton("<html>Ferramentas<br>Manuais</html>");
		btnCategoriaA.setIcon(new ImageIcon(CategoriaProduto.class.getResource("/com/poo2/icones/tools.png")));
		btnCategoriaA.setForeground(Color.WHITE);
		btnCategoriaA.setBackground(new Color(119, 136, 153));
		btnCategoriaA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCategoriaA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "Ferramentas Manuais";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaA.setBounds(12, 12, 248, 124);
		contentPane.add(btnCategoriaA);

		JButton btnCategoriaB = new JButton("EPI'S");
		btnCategoriaB.setIcon(new ImageIcon(CategoriaProduto.class.getResource("/com/poo2/icones/helmet.png")));
		btnCategoriaB.setForeground(Color.WHITE);
		btnCategoriaB.setBackground(new Color(218, 165, 32));
		btnCategoriaB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCategoriaB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "EPI'S";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaB.setBounds(272, 12, 248, 124);
		contentPane.add(btnCategoriaB);

		JButton btnCategoriaC = new JButton("Medição e Teste");
		btnCategoriaC.setIcon(new ImageIcon(CategoriaProduto.class.getResource("/com/poo2/icones/tape.png")));
		btnCategoriaC.setForeground(Color.WHITE);
		btnCategoriaC.setBackground(new Color(46, 139, 87));
		btnCategoriaC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCategoriaC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "Medição e Teste";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaC.setBounds(532, 12, 248, 124);
		contentPane.add(btnCategoriaC);

		JButton btnCategoriaD = new JButton("<html>Parafusos e<br>Fixadores</html>");
		btnCategoriaD.setIcon(new ImageIcon(CategoriaProduto.class.getResource("/com/poo2/icones/nut.png")));
		btnCategoriaD.setForeground(Color.WHITE);
		btnCategoriaD.setBackground(new Color(65, 105, 225));
		btnCategoriaD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCategoriaD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "Parafusos e Fixadores";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaD.setBounds(12, 148, 248, 124);
		contentPane.add(btnCategoriaD);

		JButton btnCategoriaE = new JButton("<html>Ferramentas<br>Elétricas</html>");
		btnCategoriaE.setIcon(new ImageIcon(CategoriaProduto.class.getResource("/com/poo2/icones/drill.png")));
		btnCategoriaE.setForeground(Color.WHITE);
		btnCategoriaE.setBackground(new Color(165, 42, 42));
		btnCategoriaE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCategoriaE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "Ferramentas Elétricas";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaE.setBounds(272, 148, 248, 124);
		contentPane.add(btnCategoriaE);

		JButton btnCategoriaF = new JButton("<html>Máquinas e<br>Compressores</html>");
		btnCategoriaF.setIcon(new ImageIcon(CategoriaProduto.class.getResource("/com/poo2/icones/compressor.png")));
		btnCategoriaF.setForeground(Color.WHITE);
		btnCategoriaF.setBackground(new Color(255, 215, 0));
		btnCategoriaF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCategoriaF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "Máquinas e Compressores";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaF.setBounds(532, 148, 248, 124);
		contentPane.add(btnCategoriaF);

		JButton btnCategoriaG = new JButton("<html>Conexões e<br>Vedação</html>");
		btnCategoriaG.setIcon(new ImageIcon(CategoriaProduto.class.getResource("/com/poo2/icones/pipe.png")));
		btnCategoriaG.setForeground(Color.WHITE);
		btnCategoriaG.setBackground(new Color(128, 128, 0));
		btnCategoriaG.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCategoriaG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "Conexões e Vedação";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaG.setBounds(12, 284, 248, 124);
		contentPane.add(btnCategoriaG);

		JButton btnCategoriaH = new JButton("<html>Correias e<br>Rolamentos</html>");
		btnCategoriaH.setIcon(new ImageIcon(CategoriaProduto.class.getResource("/com/poo2/icones/roll.png")));
		btnCategoriaH.setForeground(Color.WHITE);
		btnCategoriaH.setBackground(new Color(75, 0, 130));
		btnCategoriaH.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCategoriaH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "Correias e Rolamentos";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaH.setBounds(272, 284, 248, 124);
		contentPane.add(btnCategoriaH);

		JButton btnCategoriaI = new JButton("Outros Produtos");
		btnCategoriaI.setIcon(new ImageIcon(CategoriaProduto.class.getResource("/com/poo2/icones/clip.png")));
		btnCategoriaI.setForeground(Color.WHITE);
		btnCategoriaI.setBackground(new Color(0, 0, 0));
		btnCategoriaI.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCategoriaI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String categoria = "Outros";
				FormVendaProduto fvp = new FormVendaProduto(categoria, id);
				fvp.setVisible(true);
				dispose();
			}
		});
		btnCategoriaI.setBounds(532, 284, 248, 124);
		contentPane.add(btnCategoriaI);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(SystemColor.control);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal tl = new TelaPrincipal(id);
				tl.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(12, 421, 116, 30);
		contentPane.add(btnVoltar);
	}
}
