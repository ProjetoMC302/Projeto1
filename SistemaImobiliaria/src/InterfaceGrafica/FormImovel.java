package InterfaceGrafica;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.border.TitledBorder;

import Entidades.Apartamento;
import Entidades.Casa;
import Entidades.Condominio;
import Entidades.Corretor;
import Entidades.Endereco;
import Entidades.Lazer;
import Entidades.Proprietario;
import Entidades.Terreno;
import Entidades.TipoImovel;
import Excecoes.InvalidInputException;
import Interface.Limpavel;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.UIManager;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

public class FormImovel extends JPanel implements Limpavel {
	private static final long serialVersionUID = 800L;
	private JTextField textCEP;
	private JTextField textEstado;
	private JTextField textCidade;
	private JTextField textBairro;
	private JTextField textRua;
	private JTextField textNumero;
	private JTextField textComplemento;
	private JTextField textProprietarioId;
	private JTextField textDescricao;
	private JTextField textPreco;
	private JTextField textIPTU;
	private JTextField textValorCondominio;
	private JTextField textVagasAutomovel;
	private JTextField textNumBanheiro;
	private JTextField textNumQuarto;
	private JTextField textNumAndar;
	private JTextField textNumSuite;
	private JTextField textAreaConstruida;
	private JTextField textAreaCasa;
	private JTextField textNumTerraco;
	private JTextField textNumAndarAp;
	private JTextField textAreaTerreno;

	/**
	 * Create the panel.
	 */
	public FormImovel(CardLayout card,JPanel p) {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "IMOVEL", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(null);
		setBounds(0, 0, 892, 686);
		
		JLabel lblNewLabel_8 = new JLabel("Proprietario(id) :");
		lblNewLabel_8.setBounds(30, 245, 99, 14);
		add(lblNewLabel_8);
		
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
		
		textCEP = new JTextField();
		textCEP.setBounds(130, 18, 144, 20);
		panel.add(textCEP);
		textCEP.setColumns(10);
		
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
		
		JLabel lblNewLabel_10 = new JLabel("Descri\u00E7\u00E3o :");
		lblNewLabel_10.setBounds(30, 295, 79, 14);
		add(lblNewLabel_10);
		
		textProprietarioId = new JTextField();
		textProprietarioId.setBounds(129, 242, 141, 20);
		textProprietarioId.setColumns(10);
		add(textProprietarioId);
		
		textDescricao = new JTextField();
		textDescricao.setBounds(129, 291, 177, 73);
		textDescricao.setColumns(10);
		add(textDescricao);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(30, 375, 276, 73);
		panel_1.setBorder(new TitledBorder(null, "Formas de pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxFinaciamento = new JCheckBox("Financiamento");
		chckbxFinaciamento.setBounds(6, 21, 116, 23);
		panel_1.add(chckbxFinaciamento);
		
		JCheckBox chckbxPermuta = new JCheckBox("Permuta");
		chckbxPermuta.setBounds(124, 21, 128, 23);
		panel_1.add(chckbxPermuta);
		
		JCheckBox chckbxAvista = new JCheckBox("A vista");
		chckbxAvista.setBounds(6, 49, 159, 23);
		panel_1.add(chckbxAvista);
		
		JLabel lblNewLabel_11 = new JLabel("Pre\u00E7o :");
		lblNewLabel_11.setBounds(34, 461, 46, 14);
		add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("IPTU :");
		lblNewLabel_12.setBounds(34, 486, 46, 14);
		add(lblNewLabel_12);
		
		JCheckBox rdbtnAluguel = new JCheckBox("Aluguel");
		rdbtnAluguel.setBounds(34, 507, 109, 23);
		add(rdbtnAluguel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(24, 559, 223, 103);
		panel_2.setBorder(new TitledBorder(null, "Tipo de imovel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_2);
		panel_2.setLayout(null);
		
		
		JRadioButtonMenuItem rdbApartamento = new JRadioButtonMenuItem("Apartamento");
		rdbApartamento.setBounds(10, 21, 125, 22);
		panel_2.add(rdbApartamento);
		
		JRadioButtonMenuItem rdbCasa = new JRadioButtonMenuItem("Casa");
		rdbCasa.setBounds(10, 43, 125, 22);
		panel_2.add(rdbCasa);
		
		JRadioButtonMenuItem rdbTerreno = new JRadioButtonMenuItem("Terreno");
		rdbTerreno.setBounds(10, 70, 125, 22);
		panel_2.add(rdbTerreno);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbApartamento);
		bg.add(rdbCasa);
		bg.add(rdbTerreno);
		
		textPreco = new JTextField();
		textPreco.setBounds(90, 459, 143, 20);
		add(textPreco);
		textPreco.setColumns(10);
		
		textIPTU = new JTextField();
		textIPTU.setBounds(90, 483, 140, 20);
		add(textIPTU);
		textIPTU.setColumns(10);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.setBounds(670, 639, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(p, "home");
			}
		});
		btnNewButton_1.setBounds(769, 639, 89, 23);
		add(btnNewButton_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(331, 27, 236, 362);
		panel_4.setBorder(new TitledBorder(null, "Condominio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblValorDoCondominio = new JLabel("Valor do condominio :");
		lblValorDoCondominio.setBounds(10, 30, 157, 14);
		panel_4.add(lblValorDoCondominio);
		
		textValorCondominio = new JTextField();
		textValorCondominio.setBounds(10, 55, 120, 20);
		panel_4.add(textValorCondominio);
		textValorCondominio.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 87, 215, 268);
		panel_4.add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "Op\u00E7\u00F5es de lazer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		
		JCheckBox chckbxAcademia = new JCheckBox("Academia");
		chckbxAcademia.setBounds(6, 22, 130, 23);
		panel_3.add(chckbxAcademia);
		
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
		
		textVagasAutomovel = new JTextField();
		textVagasAutomovel.setBounds(165, 18, 86, 20);
		panel_5.add(textVagasAutomovel);
		textVagasAutomovel.setColumns(10);
		
		textNumBanheiro = new JTextField();
		textNumBanheiro.setBounds(165, 43, 86, 20);
		panel_5.add(textNumBanheiro);
		textNumBanheiro.setColumns(10);
		
		textNumQuarto = new JTextField();
		textNumQuarto.setBounds(165, 68, 86, 20);
		panel_5.add(textNumQuarto);
		textNumQuarto.setColumns(10);
		
		textNumAndar = new JTextField();
		textNumAndar.setBounds(165, 93, 86, 20);
		panel_5.add(textNumAndar);
		textNumAndar.setColumns(10);
		
		textNumSuite = new JTextField();
		textNumSuite.setBounds(165, 118, 86, 20);
		panel_5.add(textNumSuite);
		textNumSuite.setColumns(10);
		
		textAreaConstruida = new JTextField();
		textAreaConstruida.setBounds(165, 143, 86, 20);
		panel_5.add(textAreaConstruida);
		textAreaConstruida.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "Casa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(10, 174, 241, 111);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JCheckBox chckbxEsquinaCasa = new JCheckBox("Esquina");
		chckbxEsquinaCasa.setBounds(6, 19, 97, 23);
		panel_6.add(chckbxEsquinaCasa);
		
		JCheckBox chckbxPiscinaCasa = new JCheckBox("Piscina");
		chckbxPiscinaCasa.setBounds(6, 52, 97, 23);
		panel_6.add(chckbxPiscinaCasa);
		
		JLabel lblAreaTerreno = new JLabel("Area do terreno(m\u00B2) :");
		lblAreaTerreno.setBounds(6, 82, 145, 14);
		panel_6.add(lblAreaTerreno);
		
		textAreaCasa = new JTextField();
		textAreaCasa.setColumns(10);
		textAreaCasa.setBounds(145, 79, 86, 20);
		panel_6.add(textAreaCasa);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "Apartamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(10, 296, 241, 166);
		panel_5.add(panel_7);
		panel_7.setLayout(null);
		
		JCheckBox chckbxCobertura = new JCheckBox("Cobertura");
		chckbxCobertura.setBounds(6, 26, 149, 23);
		panel_7.add(chckbxCobertura);
		
		JCheckBox chckbxElevServico = new JCheckBox("Elevador de servi\u00E7o");
		chckbxElevServico.setBounds(6, 52, 149, 23);
		panel_7.add(chckbxElevServico);
		
		JCheckBox chckbxElevSocial = new JCheckBox("Elevador social");
		chckbxElevSocial.setBounds(6, 78, 149, 23);
		panel_7.add(chckbxElevSocial);
		
		JLabel lblNewLabel = new JLabel("Quantidade de terra\u00E7os :");
		lblNewLabel.setBounds(6, 108, 149, 14);
		panel_7.add(lblNewLabel);
		
		textNumTerraco = new JTextField();
		textNumTerraco.setBounds(145, 105, 74, 20);
		panel_7.add(textNumTerraco);
		textNumTerraco.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Andar :");
		lblNewLabel_13.setBounds(6, 133, 46, 14);
		panel_7.add(lblNewLabel_13);
		
		textNumAndarAp = new JTextField();
		textNumAndarAp.setColumns(10);
		textNumAndarAp.setBounds(145, 130, 74, 20);
		panel_7.add(textNumAndarAp);
		
		JCheckBox rdbtnCondominio = new JCheckBox("Condominio");
		rdbtnCondominio.setBounds(34, 533, 97, 23);
		add(rdbtnCondominio);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, "Terreno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(329, 400, 238, 100);
		add(panel_9);
		panel_9.setLayout(null);
		
		JCheckBox chckbxEsquinaTerreno = new JCheckBox("Esquina");
		chckbxEsquinaTerreno.setBounds(6, 21, 97, 23);
		panel_9.add(chckbxEsquinaTerreno);
		
		JLabel label = new JLabel("Area do terreno(m\u00B2) :");
		label.setBounds(10, 54, 137, 14);
		panel_9.add(label);
		
		textAreaTerreno = new JTextField();
		textAreaTerreno.setColumns(10);
		textAreaTerreno.setBounds(142, 51, 86, 20);
		panel_9.add(textAreaTerreno);
		
		rdbApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPanelOnOff(panel_5, rdbApartamento.isSelected() || rdbCasa.isSelected());
				setPanelOnOff(panel_6, rdbCasa.isSelected());
				setPanelOnOff(panel_7, rdbApartamento.isSelected());
				setPanelOnOff(panel_9, rdbTerreno.isSelected());
			}
		});
		
		rdbCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPanelOnOff(panel_5, rdbApartamento.isSelected() || rdbCasa.isSelected());
				setPanelOnOff(panel_6, rdbCasa.isSelected());
				setPanelOnOff(panel_7, rdbApartamento.isSelected());
				setPanelOnOff(panel_9, rdbTerreno.isSelected());
			}
		});
		
		rdbTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPanelOnOff(panel_5, rdbApartamento.isSelected() || rdbCasa.isSelected());
				setPanelOnOff(panel_6, rdbCasa.isSelected());
				setPanelOnOff(panel_7, rdbApartamento.isSelected());
				setPanelOnOff(panel_9, rdbTerreno.isSelected());
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					int cep = Integer.parseInt(textCEP.getText());
					String estado = textEstado.getText();
					String cidade = textCidade.getText();
					String rua = textRua.getText();
					String bairro = textBairro.getText();
					int numero = Integer.parseInt(textNumero.getText());
					String complemento = textComplemento.getText();
					String poroprietarioDocumento = textProprietarioId.getText();
					
					String descricao = textDescricao.getText();
					Double preco = Double.parseDouble(textPreco.getText());
					Double iptu = Double.parseDouble(textIPTU.getText());
					boolean aluguel = rdbtnAluguel.isSelected();
					
					if(estado.isEmpty()||cidade.isEmpty()||rua.isEmpty()||bairro.isEmpty()||poroprietarioDocumento.isEmpty()) {
						throw new InvalidInputException("Existem campos obrigatorios que nao foram preenchidos");
					}
					
					TipoImovel tipoImovel;
					
					Endereco endereco =new Endereco(cep,estado,cidade,rua,bairro,numero,complemento);
					
					/*TODO: BUCAR NO BANCO DE DADOS PROPRIETARIO COM EMAIL FORNECIDA POR: poroprietarioId */
					Proprietario proprietario = Main.imobiliaria.buscaProprietario(poroprietarioDocumento);
					Corretor corretor = (Corretor)Telas.getUser();
					
					if(proprietario==null||corretor==null) {
						throw new InvalidInputException("Proprietario ou Corretor nao encontrados");
					}
					
					Condominio condominio =null;
					if (rdbtnCondominio.isSelected()) {
						try {
							Double valorCondominio = Double.parseDouble(textValorCondominio.getText());
							ArrayList<Lazer> lazeres = new ArrayList<>();
							if(chckbxAcademia.isSelected()) {
								lazeres.add(Lazer.ACADEMIA);
							}if(chckbxLago.isSelected()) {
								lazeres.add(Lazer.LAGO);
							}if(chckbxPiscina.isSelected()) {
								lazeres.add(Lazer.PISCINA);
							}if(chckbxQuadraDeEsportes.isSelected()) {
								lazeres.add(Lazer.QUADRADEESPORTES);
							}if(chckbxSaloDeJogos.isSelected()) {
								lazeres.add(Lazer.SALAODEJOGOS);
							}if(chckbxSaloDeFesta.isSelected()) {
								lazeres.add(Lazer.SALAODEFESTA);
							}if(chckbxChurrasqueira.isSelected()) {
								lazeres.add(Lazer.CHURRASQUEIRA);
							}if(chckbxSauna.isSelected()) {
								lazeres.add(Lazer.SAUNA);
							}if(chckbxParquinho.isSelected()) {
								lazeres.add(Lazer.PARQUINHO);
							}
							condominio = new Condominio(valorCondominio);
							condominio.setLazer(lazeres);
						}catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null,"Existem campos invalidos no condominio! ",null,JOptionPane.ERROR_MESSAGE);
						}
					}
					
					if (rdbApartamento.isSelected()) {
						try {
							int vagasAutomovel = Integer.parseInt(textVagasAutomovel.getText());
							int quantidadeBanheiros = Integer.parseInt(textNumBanheiro.getText());
							int quantidadeQuartos = Integer.parseInt(textNumQuarto.getText());
							int quantidadeAndares = Integer.parseInt(textNumAndar.getText());
							int quantidadeSuites = Integer.parseInt(textNumSuite.getText());
							Double areaConstruida =  Double.parseDouble(textAreaConstruida.getText());
							boolean cobertura = chckbxCobertura.isSelected();
							int quantidadeTerraco = Integer.parseInt(textNumTerraco.getText());
							int andar = Integer.parseInt(textNumAndarAp.getText());
							boolean elevadorServico = chckbxElevServico.isSelected();
							boolean elevadorSocial = chckbxElevSocial.isSelected();
								tipoImovel = TipoImovel.APARTAMENTO;
								Apartamento ap = new Apartamento(endereco, condominio, proprietario, corretor, descricao, preco, iptu, aluguel,
										tipoImovel, vagasAutomovel, quantidadeBanheiros, quantidadeQuartos, quantidadeAndares, quantidadeSuites, 
										areaConstruida, cobertura, quantidadeTerraco, andar, elevadorServico, elevadorSocial);
								
								corretor.publicarImovel(ap, Main.imobiliaria);
								JOptionPane.showMessageDialog(null,"Apartamento cadastrado com sucesso",null,JOptionPane.INFORMATION_MESSAGE);
								card.show(p, "home");
						}catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null,"Existem campos invalidos no apartameto! ",null,JOptionPane.ERROR_MESSAGE);
						}	
					}
					else if (rdbCasa.isSelected()) {
						try {
							int vagasAutomovel = Integer.parseInt(textVagasAutomovel.getText());
							int quantidadeBanheiros = Integer.parseInt(textNumBanheiro.getText());
							int quantidadeQuartos = Integer.parseInt(textNumQuarto.getText());
							int quantidadeAndares = Integer.parseInt(textNumAndar.getText());
							int quantidadeSuites = Integer.parseInt(textNumSuite.getText());
							Double areaConstruida =  Double.parseDouble(textAreaConstruida.getText());
							boolean esquina = chckbxEsquinaCasa.isSelected();
							boolean piscina = chckbxPiscinaCasa.isSelected();
							Double areaTerreno = Double.parseDouble(textAreaCasa.getText());
							tipoImovel = TipoImovel.CASA;
							Casa ca = new Casa(endereco, condominio, proprietario, corretor, descricao, preco, iptu, aluguel, tipoImovel, 
									vagasAutomovel, quantidadeBanheiros, quantidadeQuartos, quantidadeAndares, quantidadeSuites,
									areaConstruida, esquina, piscina, areaTerreno);
							corretor.publicarImovel(ca, Main.imobiliaria);
							JOptionPane.showMessageDialog(null,"Casa cadastrada com sucesso",null,JOptionPane.INFORMATION_MESSAGE);
							card.show(p, "home");
						}catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null,"Existem campos invalidos na casa ! ",null,JOptionPane.ERROR_MESSAGE);
						}
					}
					else if (rdbTerreno.isSelected()) {
						try{
							boolean esquina = chckbxEsquinaTerreno.isSelected();
							Double areaTerreno = Double.parseDouble(textAreaTerreno.getText());
							tipoImovel = TipoImovel.TERRENO;
							Terreno te = new Terreno(endereco, condominio, proprietario, corretor, descricao, preco, iptu, aluguel, tipoImovel, 
									areaTerreno, esquina);
							corretor.publicarImovel(te, Main.imobiliaria);
							JOptionPane.showMessageDialog(null,"Terreno cadastrado com sucesso",null,JOptionPane.INFORMATION_MESSAGE);
							card.show(p, "home");
						}catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null,"Existem campos invalidos no terreno! ",null,JOptionPane.ERROR_MESSAGE);
						}
					}
				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Existem campos invalidos ! ",null,JOptionPane.ERROR_MESSAGE);
				}catch (InvalidInputException e) {
					JOptionPane.showMessageDialog(null,e.getUserMessage(),null,JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		rdbApartamento.setSelected(true);
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

	@Override
	public void LimparTodosOsCampos() {
		// TODO Auto-generated method stub
		
	}
}
