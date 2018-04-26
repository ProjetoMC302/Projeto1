package InterfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Entidades.*;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class InterfaceGrafica {

	private JFrame frame;
	private JTextField txtLogin;
	private JTextField txtSenha;

	/*
	 * Essa é a nossa Interface Gráfica. :)
	 *
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGrafica window = new InterfaceGrafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Criando a Aplicação.
	 */
	public InterfaceGrafica() {
		initialize();
	}

	/**
	 * Inicializando o Frame da Aplicação.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setText("CRECI");
		txtLogin.setBounds(169, 130, 114, 19);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setText("Senha");
		txtSenha.setBounds(169, 151, 114, 19);
		frame.getContentPane().add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(169, 183, 114, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("");
		Image imagem = new ImageIcon(this.getClass().getResource("Assets/logo.png")).getImage();
		label.setIcon(new ImageIcon(imagem));
		label.setBounds(122, 30, 221, 88);
		frame.getContentPane().add(label);
	}
}
