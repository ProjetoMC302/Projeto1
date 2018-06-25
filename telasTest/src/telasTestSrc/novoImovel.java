package telasTestSrc;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

public class novoImovel extends JPanel {
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
	private JTextField textField_21;
	private JTextField textField_22;

	/**
	 * Create the panel.
	 */
	public novoImovel() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "NOVO IMOVEL", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(null);
		setBounds(0, 0, 892, 686);
		
		JLabel lblNewLabel_8 = new JLabel("Proprietario(id) :");
		lblNewLabel_8.setBounds(30, 245, 99, 14);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Corretor(id) :");
		lblNewLabel_9.setBounds(30, 270, 79, 14);
		add(lblNewLabel_9);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 27, 301, 204);
		panel.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CEP :");
		lblNewLabel_1.setBounds(10, 21, 96, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Estado :");
		lblNewLabel_2.setBounds(10, 46, 96, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cidade");
		lblNewLabel_3.setBounds(10, 71, 96, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rua :");
		lblNewLabel_4.setBounds(10, 121, 96, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Bairro :");
		lblNewLabel_5.setBounds(10, 96, 96, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Numero :");
		lblNewLabel_6.setBounds(10, 146, 96, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Complementop :");
		lblNewLabel_7.setBounds(10, 171, 96, 14);
		panel.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(130, 18, 144, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 43, 144, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 68, 144, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 93, 144, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 118, 144, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(130, 143, 144, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(130, 168, 144, 20);
		panel.add(textField_6);
		
		JLabel lblNewLabel_10 = new JLabel("Descri\u00E7\u00E3o :");
		lblNewLabel_10.setBounds(30, 295, 79, 14);
		add(lblNewLabel_10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(129, 242, 141, 20);
		textField_7.setColumns(10);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(129, 267, 141, 20);
		textField_8.setColumns(10);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(129, 291, 177, 73);
		textField_9.setColumns(10);
		add(textField_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(30, 375, 276, 73);
		panel_1.setBorder(new TitledBorder(null, "Formas de pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Financiamento");
		chckbxNewCheckBox.setBounds(6, 21, 116, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxPermuta = new JCheckBox("Permuta");
		chckbxPermuta.setBounds(124, 21, 128, 23);
		panel_1.add(chckbxPermuta);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("A vista");
		chckbxNewCheckBox_1.setBounds(6, 49, 159, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_11 = new JLabel("Pre\u00E7o :");
		lblNewLabel_11.setBounds(34, 461, 46, 14);
		add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("IPTU :");
		lblNewLabel_12.setBounds(34, 486, 46, 14);
		add(lblNewLabel_12);
		
		JCheckBox rdbtnNewRadioButton = new JCheckBox("Aluguel");
		rdbtnNewRadioButton.setBounds(34, 507, 109, 23);
		add(rdbtnNewRadioButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(24, 559, 223, 103);
		panel_2.setBorder(new TitledBorder(null, "Tipo de imovel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_2);
		panel_2.setLayout(null);
		
		
		JRadioButtonMenuItem rdbtnmntmAprtamento = new JRadioButtonMenuItem("Apartamento");
		rdbtnmntmAprtamento.setBounds(10, 21, 125, 22);
		panel_2.add(rdbtnmntmAprtamento);
		
		JRadioButtonMenuItem rdbtnmntmCasa = new JRadioButtonMenuItem("Casa");
		rdbtnmntmCasa.setBounds(10, 43, 125, 22);
		panel_2.add(rdbtnmntmCasa);
		
		JRadioButtonMenuItem rdbtnmntmTerreno = new JRadioButtonMenuItem("Terreno");
		rdbtnmntmTerreno.setBounds(10, 70, 125, 22);
		panel_2.add(rdbtnmntmTerreno);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnmntmAprtamento);
		bg.add(rdbtnmntmCasa);
		bg.add(rdbtnmntmTerreno);
		
		textField_10 = new JTextField();
		textField_10.setBounds(90, 459, 143, 20);
		add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(90, 483, 140, 20);
		add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.setBounds(670, 639, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(769, 639, 89, 23);
		add(btnNewButton_1);
		
		JCheckBox rdbtnCondominio = new JCheckBox("Condominio");
		rdbtnCondominio.setBounds(34, 529, 109, 23);
		add(rdbtnCondominio);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(331, 27, 236, 362);
		panel_4.setBorder(new TitledBorder(null, "Condominio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblValorDoCondominio = new JLabel("Valor do condominio :");
		lblValorDoCondominio.setBounds(10, 30, 157, 14);
		panel_4.add(lblValorDoCondominio);
		
		textField_12 = new JTextField();
		textField_12.setBounds(10, 55, 120, 20);
		panel_4.add(textField_12);
		textField_12.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 87, 215, 268);
		panel_4.add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "Op\u00E7\u00F5es de lazer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Academia");
		chckbxNewCheckBox_2.setBounds(6, 22, 130, 23);
		panel_3.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxLago = new JCheckBox("Lago");
		chckbxLago.setBounds(6, 48, 130, 23);
		panel_3.add(chckbxLago);
		
		JCheckBox chckbxPiscina = new JCheckBox("Piscina");
		chckbxPiscina.setBounds(6, 74, 97, 23);
		panel_3.add(chckbxPiscina);
		
		JCheckBox chckbxQuadraDeEsportes = new JCheckBox("Quadra de esportes");
		chckbxQuadraDeEsportes.setBounds(6, 100, 149, 23);
		panel_3.add(chckbxQuadraDeEsportes);
		
		JCheckBox chckbxSaloDeJogos = new JCheckBox("Sal\u00E3o de jogos");
		chckbxSaloDeJogos.setBounds(6, 126, 117, 23);
		panel_3.add(chckbxSaloDeJogos);
		
		JCheckBox chckbxSaloDeFesta = new JCheckBox("Sal\u00E3o de festa");
		chckbxSaloDeFesta.setBounds(6, 152, 130, 23);
		panel_3.add(chckbxSaloDeFesta);
		
		JCheckBox chckbxChurrasqueira = new JCheckBox("Churrasqueira");
		chckbxChurrasqueira.setBounds(6, 178, 130, 23);
		panel_3.add(chckbxChurrasqueira);
		
		JCheckBox chckbxSauna = new JCheckBox("Sauna");
		chckbxSauna.setBounds(6, 204, 117, 23);
		panel_3.add(chckbxSauna);
		
		JCheckBox chckbxParquinho = new JCheckBox("Parquinho");
		chckbxParquinho.setBounds(6, 230, 130, 23);
		panel_3.add(chckbxParquinho);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Casa / Apartamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(577, 27, 281, 473);
		add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblVagasDeAutomovel = new JLabel("Vagas de automovel :");
		lblVagasDeAutomovel.setBounds(10, 24, 145, 14);
		panel_5.add(lblVagasDeAutomovel);
		
		JLabel lblNumeroDeBanheiros = new JLabel("Numero de banheiros :");
		lblNumeroDeBanheiros.setBounds(10, 49, 145, 14);
		panel_5.add(lblNumeroDeBanheiros);
		
		JLabel lblNumeroDeQuartos = new JLabel("Numero de quartos");
		lblNumeroDeQuartos.setBounds(10, 74, 145, 14);
		panel_5.add(lblNumeroDeQuartos);
		
		JLabel lblQuantidadeDeAndares = new JLabel("Quantidade de andares :");
		lblQuantidadeDeAndares.setBounds(10, 99, 145, 14);
		panel_5.add(lblQuantidadeDeAndares);
		
		JLabel lblQuantidadeDeSuites = new JLabel("Quantidade de suites :");
		lblQuantidadeDeSuites.setBounds(10, 124, 145, 14);
		panel_5.add(lblQuantidadeDeSuites);
		
		JLabel lblAreaConstruida = new JLabel("Area construida :");
		lblAreaConstruida.setBounds(10, 149, 145, 14);
		panel_5.add(lblAreaConstruida);
		
		textField_13 = new JTextField();
		textField_13.setBounds(165, 18, 86, 20);
		panel_5.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(165, 43, 86, 20);
		panel_5.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(165, 68, 86, 20);
		panel_5.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(165, 93, 86, 20);
		panel_5.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(165, 118, 86, 20);
		panel_5.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(165, 143, 86, 20);
		panel_5.add(textField_18);
		textField_18.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "Casa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(10, 174, 241, 111);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JCheckBox chckbxEsquina = new JCheckBox("Esquina");
		chckbxEsquina.setBounds(6, 19, 97, 23);
		panel_6.add(chckbxEsquina);
		
		JCheckBox chckbxPiscina_1 = new JCheckBox("Piscina");
		chckbxPiscina_1.setBounds(6, 52, 97, 23);
		panel_6.add(chckbxPiscina_1);
		
		JLabel lblAreaTerreno = new JLabel("Area do terreno(m\u00B2) :");
		lblAreaTerreno.setBounds(6, 82, 145, 14);
		panel_6.add(lblAreaTerreno);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(145, 79, 86, 20);
		panel_6.add(textField_19);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "Apartamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(10, 296, 241, 166);
		panel_5.add(panel_7);
		panel_7.setLayout(null);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Cobertura");
		chckbxNewCheckBox_3.setBounds(6, 26, 149, 23);
		panel_7.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Elevador de servi\u00E7o");
		chckbxNewCheckBox_4.setBounds(6, 52, 149, 23);
		panel_7.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Elevador social");
		chckbxNewCheckBox_5.setBounds(6, 78, 149, 23);
		panel_7.add(chckbxNewCheckBox_5);
		
		JLabel lblNewLabel = new JLabel("Quantidade de terra\u00E7os :");
		lblNewLabel.setBounds(6, 108, 149, 14);
		panel_7.add(lblNewLabel);
		
		textField_20 = new JTextField();
		textField_20.setBounds(145, 105, 74, 20);
		panel_7.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Andar :");
		lblNewLabel_13.setBounds(6, 133, 46, 14);
		panel_7.add(lblNewLabel_13);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(145, 130, 74, 20);
		panel_7.add(textField_21);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, "Terreno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(329, 400, 238, 100);
		add(panel_9);
		panel_9.setLayout(null);
		
		JCheckBox chckbxEsquina_1 = new JCheckBox("Esquina");
		chckbxEsquina_1.setBounds(6, 21, 97, 23);
		panel_9.add(chckbxEsquina_1);
		
		JLabel label = new JLabel("Area do terreno(m\u00B2) :");
		label.setBounds(10, 54, 137, 14);
		panel_9.add(label);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(142, 51, 86, 20);
		panel_9.add(textField_22);
		
		rdbtnCondominio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPanelOnOff(panel_4, rdbtnCondominio.isSelected());
			}
		});
		
		rdbtnmntmAprtamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPanelOnOff(panel_5, rdbtnmntmAprtamento.isSelected() || rdbtnmntmCasa.isSelected());
				setPanelOnOff(panel_6, rdbtnmntmCasa.isSelected());
				setPanelOnOff(panel_7, rdbtnmntmAprtamento.isSelected());
				setPanelOnOff(panel_9, rdbtnmntmTerreno.isSelected());
			}
		});
		
		rdbtnmntmCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPanelOnOff(panel_5, rdbtnmntmAprtamento.isSelected() || rdbtnmntmCasa.isSelected());
				setPanelOnOff(panel_6, rdbtnmntmCasa.isSelected());
				setPanelOnOff(panel_7, rdbtnmntmAprtamento.isSelected());
				setPanelOnOff(panel_9, rdbtnmntmTerreno.isSelected());
			}
		});
		
		rdbtnmntmTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPanelOnOff(panel_5, rdbtnmntmAprtamento.isSelected() || rdbtnmntmCasa.isSelected());
				setPanelOnOff(panel_6, rdbtnmntmCasa.isSelected());
				setPanelOnOff(panel_7, rdbtnmntmAprtamento.isSelected());
				setPanelOnOff(panel_9, rdbtnmntmTerreno.isSelected());
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*Endereco e = new Endereco(textField.getText(), textField_1.getText(), textField_2.getText(), textField_4.getText(),);
										textField_3.getText(), textField_5.getText(), textField_6.getText());*/
				//Proprietario p = encontrar proprietario com o id do textField_7
				//Corretor c = encontrar corretor com o id do textField_8
				//Imovel i;
				if (rdbtnCondominio.isEnabled()) {
					//Condominio cond = new Condominio(srry ta tarde...)
					if (rdbtnmntmAprtamento.isSelected()) {
						//Apartamento ap = new Apartamento ...
						//i = new Imovel (e, p, c, ..., cond, ap);
					}
					else if (rdbtnmntmCasa.isSelected()) {
						//Casa ca = new Casa ...
						//i = new Imovel (e, p, c, ..., cond, ca);
					}
					else if (rdbtnmntmTerreno.isSelected()) {
						//Terreno te = new te ...
						//i = new Imovel (e, p, c, ..., cond, te);
					}
				}
				else {
					if (rdbtnmntmAprtamento.isSelected()) {
						//Apartamento ap = new Apartamento ...
						//i = new Imovel (e, p, c, ..., ap);
					}
					else if (rdbtnmntmCasa.isSelected()) {
						//Casa ca = new Casa ...
						//i = new Imovel (e, p, c, ..., ca);
					}
					else if (rdbtnmntmTerreno.isSelected()) {
						//Terreno te = new te ...
						//i = new Imovel (e, p, c, ..., te);
					}
				}
				
			}
		});
		
		rdbtnmntmAprtamento.setSelected(true);
		setPanelOnOff(panel_4, false);
		setPanelOnOff(panel_6, false);
		setPanelOnOff(panel_9, false);
	}
	
	private void setPanelOnOff(JPanel jp, boolean b) {
		jp.setEnabled(b);

	    Component[] components = jp.getComponents();

	    for(int i = 0; i < components.length; i++) {
	        if(components[i].getClass().getName() == "javax.swing.JPanel") {
	            setPanelOnOff((JPanel) components[i], b);
	        }

	        components[i].setEnabled(b);
	    }
	}
}
