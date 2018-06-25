package telasTestSrc;

import javax.swing.JPanel;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class novoCorretor extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Create the panel.
	 */
	public novoCorretor() {
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
		
		textField = new JTextField();
		textField.setBounds(105, 45, 230, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(105, 70, 230, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(105, 95, 230, 20);
		add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(105, 341, 230, 20);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(105, 366, 230, 20);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(105, 391, 230, 20);
		add(textField_6);
		
		JLabel lblNewLabel_1 = new JLabel("Novo Corretor");
		lblNewLabel_1.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(150, 11, 103, 14);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.setBounds(10, 422, 89, 23);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*Endereco e = new Endereco(textField_7.getText(), textField_8.getText(), textField_9.getText(), textField_11.getText(),
				textField_10.getText(), textField_12.getText(), textField_13.getText()
				/*Corretor c = new Corretor(textField.getText(), textField_1.getText(), textField_2.getText(), e,
				textField_4.getText(), textField_5.getText(), textField_6.getText());*/
			}
		});
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(105, 422, 89, 23);
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
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(130, 18, 144, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(130, 43, 144, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(130, 68, 144, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(130, 93, 144, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(130, 118, 144, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(130, 143, 144, 20);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(130, 168, 144, 20);
		panel.add(textField_13);
		
	}
}

