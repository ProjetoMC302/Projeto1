package telasTestSrc;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JRadioButton;

public class novoCliente extends JPanel {
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
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;

	/**
	 * Create the panel.
	 */
	public novoCliente() {
		setBorder(new TitledBorder(null, "NOVO CLIENTE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(0, 0, 726, 687);
		setLayout(null);
		
		JButton button = new JButton("Criar");
		button.setBounds(466, 653, 89, 23);
		add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBounds(565, 653, 89, 23);
		add(button_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(116, 324, 230, 20);
		add(textField);
		
		JLabel label = new JLabel("Email :");
		label.setBounds(21, 327, 66, 14);
		add(label);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(31, 106, 301, 204);
		add(panel);
		
		JLabel label_1 = new JLabel("CEP :");
		label_1.setBounds(10, 21, 96, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Estado :");
		label_2.setBounds(10, 46, 96, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Cidade");
		label_3.setBounds(10, 71, 96, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Rua :");
		label_4.setBounds(10, 121, 96, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Bairro :");
		label_5.setBounds(10, 96, 96, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Numero :");
		label_6.setBounds(10, 146, 96, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Complementop :");
		label_7.setBounds(10, 171, 96, 14);
		panel.add(label_7);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 18, 144, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 43, 144, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 68, 144, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 93, 144, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(130, 118, 144, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(130, 143, 144, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(130, 168, 144, 20);
		panel.add(textField_7);
		
		JLabel label_8 = new JLabel("Documento :");
		label_8.setBounds(21, 81, 66, 14);
		add(label_8);
		
		JLabel label_9 = new JLabel("Nome :");
		label_9.setBounds(21, 31, 46, 14);
		add(label_9);
		
		JLabel label_10 = new JLabel("Telefone :");
		label_10.setBounds(21, 56, 66, 14);
		add(label_10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(116, 53, 230, 20);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(116, 28, 230, 20);
		add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(116, 78, 230, 20);
		add(textField_10);
		
		JLabel lblPreoMximo = new JLabel("Pre\u00E7o m\u00E1ximo (R$) :");
		lblPreoMximo.setBounds(21, 352, 121, 14);
		add(lblPreoMximo);
		
		textField_11 = new JTextField();
		textField_11.setBounds(151, 349, 89, 20);
		add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Formas de pagamento desejadas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(20, 377, 312, 107);
		add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Financiamento");
		chckbxNewCheckBox.setBounds(6, 22, 139, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Permuta");
		chckbxNewCheckBox_1.setBounds(6, 48, 139, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("\u00C0 vista");
		chckbxNewCheckBox_2.setBounds(6, 74, 139, 23);
		panel_1.add(chckbxNewCheckBox_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Preferencias", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(356, 31, 338, 601);
		add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox chckbxAluguel = new JCheckBox("Aluguel");
		chckbxAluguel.setBounds(17, 23, 97, 23);
		panel_2.add(chckbxAluguel);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Esquina");
		chckbxNewCheckBox_3.setBounds(17, 49, 97, 23);
		panel_2.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxCondominio = new JCheckBox("Condominio");
		chckbxCondominio.setBounds(17, 75, 97, 23);
		panel_2.add(chckbxCondominio);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Endere\u00E7o de refer\u00EAncia", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(17, 101, 301, 204);
		panel_2.add(panel_3);
		
		JLabel label_11 = new JLabel("CEP :");
		label_11.setBounds(10, 21, 96, 14);
		panel_3.add(label_11);
		
		JLabel label_12 = new JLabel("Estado :");
		label_12.setBounds(10, 46, 96, 14);
		panel_3.add(label_12);
		
		JLabel label_13 = new JLabel("Cidade");
		label_13.setBounds(10, 71, 96, 14);
		panel_3.add(label_13);
		
		JLabel label_14 = new JLabel("Rua :");
		label_14.setBounds(10, 121, 96, 14);
		panel_3.add(label_14);
		
		JLabel label_15 = new JLabel("Bairro :");
		label_15.setBounds(10, 96, 96, 14);
		panel_3.add(label_15);
		
		JLabel label_16 = new JLabel("Numero :");
		label_16.setBounds(10, 146, 96, 14);
		panel_3.add(label_16);
		
		JLabel label_17 = new JLabel("Complementop :");
		label_17.setBounds(10, 171, 96, 14);
		panel_3.add(label_17);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(130, 18, 144, 20);
		panel_3.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(130, 43, 144, 20);
		panel_3.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(130, 68, 144, 20);
		panel_3.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(130, 93, 144, 20);
		panel_3.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(130, 118, 144, 20);
		panel_3.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(130, 143, 144, 20);
		panel_3.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(130, 168, 144, 20);
		panel_3.add(textField_18);
		
		JLabel lblRaioDeBusca = new JLabel("Raio de busca (m)");
		lblRaioDeBusca.setBounds(17, 316, 97, 14);
		panel_2.add(lblRaioDeBusca);
		
		textField_19 = new JTextField();
		textField_19.setBounds(139, 313, 128, 20);
		panel_2.add(textField_19);
		textField_19.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipos de imov\u00E9l desejados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(17, 341, 312, 107);
		panel_2.add(panel_4);
		
		JCheckBox chckbxCasa = new JCheckBox("Casa");
		chckbxCasa.setBounds(6, 22, 139, 23);
		panel_4.add(chckbxCasa);
		
		JCheckBox chckbxApartamento = new JCheckBox("Apartamento");
		chckbxApartamento.setBounds(6, 48, 139, 23);
		panel_4.add(chckbxApartamento);
		
		JCheckBox chckbxTerreno = new JCheckBox("Terreno");
		chckbxTerreno.setBounds(6, 74, 139, 23);
		panel_4.add(chckbxTerreno);
		
		JLabel lblreMnimam = new JLabel("\u00C1re m\u00EDnima (m\u00B2) :");
		lblreMnimam.setBounds(27, 459, 102, 14);
		panel_2.add(lblreMnimam);
		
		textField_20 = new JTextField();
		textField_20.setBounds(139, 456, 71, 20);
		panel_2.add(textField_20);
		textField_20.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Restri\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(17, 484, 312, 107);
		panel_2.add(panel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nenhuma");
		rdbtnNewRadioButton.setBounds(6, 18, 109, 23);
		panel_5.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Comercial");
		rdbtnNewRadioButton_1.setBounds(6, 44, 109, 23);
		panel_5.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Resid\u00EAncial");
		rdbtnNewRadioButton_2.setBounds(6, 70, 109, 23);
		panel_5.add(rdbtnNewRadioButton_2);
		ButtonGroup gp = new ButtonGroup();
		gp.add(rdbtnNewRadioButton);
		gp.add(rdbtnNewRadioButton_1);
		gp.add(rdbtnNewRadioButton_2);
	}
}
