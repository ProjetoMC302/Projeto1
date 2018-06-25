package telasTestSrc;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class novoProprietario extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Create the panel.
	 */
	public novoProprietario() {
		setBorder(new TitledBorder(null, "NOVO PROPRIETARIO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(null);
		setBounds(0, 0, 413, 402);
		JLabel label = new JLabel("Nome :");
		label.setBounds(22, 32, 46, 14);
		add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(117, 29, 230, 20);
		add(textField);
		
		JLabel label_1 = new JLabel("Telefone :");
		label_1.setBounds(22, 57, 66, 14);
		add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(117, 54, 230, 20);
		add(textField_1);
		
		JLabel label_2 = new JLabel("Documento :");
		label_2.setBounds(22, 82, 66, 14);
		add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(117, 79, 230, 20);
		add(textField_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(32, 107, 301, 204);
		add(panel);
		
		JLabel label_3 = new JLabel("CEP :");
		label_3.setBounds(10, 21, 96, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Estado :");
		label_4.setBounds(10, 46, 96, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Cidade");
		label_5.setBounds(10, 71, 96, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Rua :");
		label_6.setBounds(10, 121, 96, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Bairro :");
		label_7.setBounds(10, 96, 96, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Numero :");
		label_8.setBounds(10, 146, 96, 14);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Complementop :");
		label_9.setBounds(10, 171, 96, 14);
		panel.add(label_9);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 18, 144, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 43, 144, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(130, 68, 144, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(130, 93, 144, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(130, 118, 144, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(130, 143, 144, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(130, 168, 144, 20);
		panel.add(textField_9);
		
		JLabel label_10 = new JLabel("Email :");
		label_10.setBounds(22, 328, 66, 14);
		add(label_10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(117, 325, 230, 20);
		add(textField_10);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*Endereco e = new Endereco(...)*/
				/*Proprietario p = new Corretor(...)*/
			}
		});
		btnNewButton.setBounds(22, 353, 89, 23);
		add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(117, 353, 89, 23);
		add(btnCancelar);

	}
}
