package InterfaceGrafica;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import Entidades.Corretor;
import Interface.Limpavel;

public class FormCorretorBuscar extends JPanel implements Limpavel{
	
	private static final long serialVersionUID = 710L;
	private JTextField textNome;
	private JTextField textTelefone;
	private JTextField textDocumento;
	private JTextField textEmail;
	private JTextField textSenha;
	private JTextField textCresi;
	private JTextField textCEP;
	private JTextField textEstado;
	private JTextField textCidade;
	private JTextField textBairro;
	private JTextField textRua;
	private JTextField textNumero;
	private JTextField textComplemento;


	/**
	 * Create the panel.
	 */
	public FormCorretorBuscar(CardLayout card,JPanel p,TabelaCorretor tabelaCorretor) {
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome :");
		lblNewLabel.setBounds(10, 48, 46, 14);
		add(lblNewLabel);
		
		JLabel label = new JLabel("Telefone :");
		label.setBounds(10, 73, 66, 14);
		add(label);
		
		JLabel label_1 = new JLabel("Documento :");
		label_1.setBounds(10, 98, 66, 14);
		add(label_1);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(10, 344, 66, 14);
		add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha :");
		lblSenha.setBounds(10, 369, 46, 14);
		add(lblSenha);
		
		JLabel lblCreci = new JLabel("Creci : ");
		lblCreci.setBounds(10, 394, 46, 14);
		add(lblCreci);
		
		textNome = new JTextField();
		textNome.setBounds(105, 45, 230, 20);
		add(textNome);
		textNome.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(105, 70, 230, 20);
		add(textTelefone);
		
		textDocumento = new JTextField();
		textDocumento.setColumns(10);
		textDocumento.setBounds(105, 95, 230, 20);
		add(textDocumento);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(105, 341, 230, 20);
		add(textEmail);
		
		textSenha = new JTextField();
		textSenha.setColumns(10);
		textSenha.setBounds(105, 366, 230, 20);
		add(textSenha);
		
		textCresi = new JTextField();
		textCresi.setColumns(10);
		textCresi.setBounds(105, 391, 230, 20);
		add(textCresi);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar Corretor");
		lblNewLabel_1.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(150, 11, 103, 14);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(10, 422, 89, 23);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/**
				String nome = textNome.getText();
				String documento = textDocumento.getText();
				String email = textEmail.getText();
				String creci = textCresi.getText();
				
					
				Corretor corretorBusca = new Corretor(nome,null , documento, null,email,null ,creci);
				
				BUSCAR NO BANCO DE DADOS PELO CORRETOR IGNORANDO ATRIBUTOS QUE SAO NULL */

		
				//simulando resultado:
				ArrayList<Corretor> resultadoBusca = Main.imobiliaria.getCorretores();
		
				tabelaCorretor.setCorretores(resultadoBusca);
				card.show(p, "tabelaCorretor");
			}
		});
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(p, "home2");
			}
		});
		btnNewButton_1.setBounds(115, 422, 89, 23);
		add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(20, 123, 301, 204);
		add(panel);
		
		JLabel label_2 = new JLabel("CEP :");
		label_2.setBounds(10, 21, 96, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Estado :");
		label_3.setBounds(10, 46, 96, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Cidade");
		label_4.setBounds(10, 71, 96, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Rua :");
		label_5.setBounds(10, 121, 96, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Bairro :");
		label_6.setBounds(10, 96, 96, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Numero :");
		label_7.setBounds(10, 146, 96, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Complementop :");
		label_8.setBounds(10, 171, 96, 14);
		panel.add(label_8);
		
		textCEP = new JTextField();
		textCEP.setColumns(10);
		textCEP.setBounds(130, 18, 144, 20);
		panel.add(textCEP);
		
		textEstado = new JTextField();
		textEstado.setColumns(10);
		textEstado.setBounds(130, 43, 144, 20);
		panel.add(textEstado);
		
		textCidade = new JTextField();
		textCidade.setColumns(10);
		textCidade.setBounds(130, 68, 144, 20);
		panel.add(textCidade);
		
		textBairro = new JTextField();
		textBairro.setColumns(10);
		textBairro.setBounds(130, 93, 144, 20);
		panel.add(textBairro);
		
		textRua = new JTextField();
		textRua.setColumns(10);
		textRua.setBounds(130, 118, 144, 20);
		panel.add(textRua);
		
		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(130, 143, 144, 20);
		panel.add(textNumero);
		
		textComplemento = new JTextField();
		textComplemento.setColumns(10);
		textComplemento.setBounds(130, 168, 144, 20);
		panel.add(textComplemento);
		
	}


	@Override
	public void LimparTodosOsCampos() {
		// TODO Auto-generated method stub
		
	}
}

