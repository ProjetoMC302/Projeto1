package InterfaceGrafica;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JList;

import Entidades.Condominio;
import Entidades.Corretor;
import Entidades.Endereco;
import Entidades.Imobiliaria;
import Entidades.Imovel;
import Entidades.Proprietario;
import Entidades.TipoImovel;
import javax.swing.JButton;

public class Imoveis extends JFrame {
	private static final long serialVersionUID = 1L;

	Imobiliaria imobiliaria = new Imobiliaria();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imoveis frame = new Imoveis();
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
	public Imoveis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImoveis = new JLabel("Imoveis");
		lblImoveis.setFont(new Font("Dialog", Font.BOLD, 23));
		lblImoveis.setBounds(30, 27, 108, 28);
		contentPane.add(lblImoveis);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(35, 223, 117, 25);
		contentPane.add(btnAdicionar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(164, 223, 117, 25);
		contentPane.add(btnAtualizar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(297, 223, 117, 25);
		contentPane.add(btnRemover);
		
		/*
		JList listImoveis = new JList();
		listImoveis.setBounds(275, 155, 1, 1);
		contentPane.add(listImoveis);
		DefaultListModel DLM = new DefaultListModel();
		
		for (int i = 0; i < 10; ++i) {
			imobiliaria.adicionarImovel(new Imovel(new Endereco(), new Condominio(), 
					new Proprietario("Bla" + i, "blabla"+i, "blabla"), new Corretor("BlaBla", "Blaa", "bla"),
					"Bla", 50000, 4, false, TipoImovel.APARTAMENTO));
		}
		
		imobiliaria.getImoveis().forEach((imovel)->System.out.println(imovel));
		
		// Adicionando os imoveis para o DLM
		for (Imovel imovel : imobiliaria.getImoveis())
			DLM.addElement(imovel);
		
		// Adicionando os imoveis para a JList
		listImoveis.setModel(DLM);
		*/

	}
}
