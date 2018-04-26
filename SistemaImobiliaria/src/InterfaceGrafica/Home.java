package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnImoveis = new JButton("Imoveis");
		btnImoveis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnImoveis.setBounds(157, 45, 142, 25);
		contentPane.add(btnImoveis);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setBounds(157, 82, 142, 25);
		contentPane.add(btnClientes);
		
		JButton btnCorretores = new JButton("Corretores");
		btnCorretores.setBounds(157, 119, 142, 25);
		contentPane.add(btnCorretores);
		
		JButton btnProprietarios = new JButton("Proprietarios");
		btnProprietarios.setBounds(157, 156, 142, 25);
		contentPane.add(btnProprietarios);
		
		JButton btnPropostas = new JButton("Propostas");
		btnPropostas.setBounds(157, 193, 142, 25);
		contentPane.add(btnPropostas);
	}
}
