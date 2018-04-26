package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class NovoImovel extends JFrame {

	private JPanel contentPane;
	private final JLabel lblEndereco = new JLabel("Endereço");
	private JTextField textFieldEndereco;
	private JTextField textFieldPreco;
	private JTextField textFieldIPTU;
	private JTextField textFieldAluguel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovoImovel frame = new NovoImovel();
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
	public NovoImovel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblEndereco.setBounds(22, 44, 72, 33);
		contentPane.add(lblEndereco);
		
		JLabel lblNovoImovel = new JLabel("Novo Imovel");
		lblNovoImovel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNovoImovel.setBounds(12, 3, 173, 43);
		contentPane.add(lblNovoImovel);
		
		JLabel lblCondominio = new JLabel("Condominio");
		lblCondominio.setBounds(22, 89, 88, 15);
		contentPane.add(lblCondominio);
		
		JLabel lblProprietario = new JLabel("Proprietario");
		lblProprietario.setBounds(22, 116, 93, 15);
		contentPane.add(lblProprietario);
		
		JLabel lblCorretor = new JLabel("Corretor");
		lblCorretor.setBounds(22, 157, 70, 15);
		contentPane.add(lblCorretor);
		
		JLabel lblDescricao = new JLabel("Descrição");
		lblDescricao.setBounds(24, 184, 70, 15);
		contentPane.add(lblDescricao);
		
		JTextPane textPaneDescricao = new JTextPane();
		textPaneDescricao.setBounds(22, 211, 402, 67);
		contentPane.add(textPaneDescricao);
		
		JLabel lblFormasDePagamento = new JLabel("Formas de Pagamento");
		lblFormasDePagamento.setBounds(22, 317, 163, 15);
		contentPane.add(lblFormasDePagamento);
		
		JCheckBox chckbxFinanciamento = new JCheckBox("Financiamento");
		chckbxFinanciamento.setBounds(199, 313, 129, 23);
		contentPane.add(chckbxFinanciamento);
		
		JCheckBox chckbxPermuta = new JCheckBox("Permuta");
		chckbxPermuta.setBounds(199, 334, 129, 23);
		contentPane.add(chckbxPermuta);
		
		JCheckBox chckbxAVista = new JCheckBox("A Vista");
		chckbxAVista.setBounds(199, 356, 129, 23);
		contentPane.add(chckbxAVista);
		
		JLabel lblPreco = new JLabel("Preço");
		lblPreco.setBounds(24, 418, 70, 15);
		contentPane.add(lblPreco);
		
		JLabel lblIPTU = new JLabel("IPTU");
		lblIPTU.setBounds(22, 450, 70, 15);
		contentPane.add(lblIPTU);
		
		JLabel lblAluguel = new JLabel("Aluguel");
		lblAluguel.setBounds(22, 477, 70, 15);
		contentPane.add(lblAluguel);
		
		JLabel lblTipoImovel = new JLabel("Tipo Imovel");
		lblTipoImovel.setBounds(22, 510, 88, 15);
		contentPane.add(lblTipoImovel);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setBounds(134, 51, 290, 19);
		contentPane.add(textFieldEndereco);
		textFieldEndereco.setColumns(10);
		
		JButton btnProcurarCondominio = new JButton("Procurar");
		btnProcurarCondominio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnProcurarCondominio.setBounds(154, 84, 117, 25);
		contentPane.add(btnProcurarCondominio);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(154, 115, 117, 25);
		contentPane.add(btnProcurar);
		
		JLabel lblRestricao = new JLabel("Restrição");
		lblRestricao.setBounds(22, 391, 70, 15);
		contentPane.add(lblRestricao);
		
		JCheckBox chckbxResidencial = new JCheckBox("Residencial");
		chckbxResidencial.setBounds(124, 387, 129, 23);
		contentPane.add(chckbxResidencial);
		
		JCheckBox chckbxComercial = new JCheckBox("Comercial");
		chckbxComercial.setBounds(257, 387, 129, 23);
		contentPane.add(chckbxComercial);
		
		textFieldPreco = new JTextField();
		textFieldPreco.setBounds(124, 416, 114, 19);
		contentPane.add(textFieldPreco);
		textFieldPreco.setColumns(10);
		
		textFieldIPTU = new JTextField();
		textFieldIPTU.setBounds(124, 448, 114, 19);
		contentPane.add(textFieldIPTU);
		textFieldIPTU.setColumns(10);
		
		textFieldAluguel = new JTextField();
		textFieldAluguel.setBounds(124, 477, 114, 19);
		contentPane.add(textFieldAluguel);
		textFieldAluguel.setColumns(10);
		
		JButton btnProcurarCorretor = new JButton("Procurar");
		btnProcurarCorretor.setBounds(154, 152, 117, 25);
		contentPane.add(btnProcurarCorretor);
		
		JRadioButton rdbtnApartamento = new JRadioButton("Apartamento");
		rdbtnApartamento.setBounds(124, 506, 129, 23);
		contentPane.add(rdbtnApartamento);
		
		JRadioButton rdbtnCasa = new JRadioButton("Casa");
		rdbtnCasa.setBounds(124, 533, 149, 23);
		contentPane.add(rdbtnCasa);
		
		JRadioButton rdbtnTerreno = new JRadioButton("Terreno");
		rdbtnTerreno.setBounds(268, 506, 149, 23);
		contentPane.add(rdbtnTerreno);
	}
}
