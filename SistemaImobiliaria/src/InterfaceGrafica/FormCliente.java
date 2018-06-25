package InterfaceGrafica;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import Entidades.Cliente;
import Entidades.Corretor;
import Entidades.Endereco;
import Entidades.Preferencia;
import Entidades.Restricao;
import Entidades.TipoImovel;
import Excecoes.InvalidInputException;
import Interface.Limpavel;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;
import javax.swing.UIManager;

import java.awt.CardLayout;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import javax.swing.JRadioButton;

public class FormCliente extends JPanel implements Limpavel {
	private static final long serialVersionUID = 31L;
	private JTextField textEmail;
	private JTextField textCEP;
	private JTextField textEstado;
	private JTextField textCidade;
	private JTextField textBairro;
	private JTextField textRua;
	private JTextField textNumero;
	private JTextField textComplemento;
	private JTextField textTelefone;
	private JTextField textNome;
	private JTextField textDocumento;
	private JTextField textPrecoMAX;
	private JTextField textAreaMinima;
	
	/**
	 * Create the panel.
	 */
	public FormCliente(CardLayout card,JPanel p) {

		
		setBorder(new TitledBorder(null, "CLIENTE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(0, 0, 726, 687);
		setLayout(null);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { }
		});
		button_1.setBounds(565, 653, 89, 23);
		add(button_1);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(116, 324, 230, 20);
		add(textEmail);
		
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
		
		JLabel label_8 = new JLabel("Documento :");
		label_8.setBounds(21, 81, 66, 14);
		add(label_8);
		
		JLabel label_9 = new JLabel("Nome :");
		label_9.setBounds(21, 31, 46, 14);
		add(label_9);
		
		JLabel label_10 = new JLabel("Telefone :");
		label_10.setBounds(21, 56, 66, 14);
		add(label_10);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(116, 53, 230, 20);
		add(textTelefone);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(116, 28, 230, 20);
		add(textNome);
		
		textDocumento = new JTextField();
		textDocumento.setColumns(10);
		textDocumento.setBounds(116, 78, 230, 20);
		add(textDocumento);
		
		JLabel lblPreoMximo = new JLabel("Pre\u00E7o m\u00E1ximo (R$) :");
		lblPreoMximo.setBounds(21, 352, 121, 14);
		add(lblPreoMximo);
		
		textPrecoMAX = new JTextField();
		textPrecoMAX.setBounds(151, 349, 89, 20);
		add(textPrecoMAX);
		textPrecoMAX.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Formas de pagamento desejadas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(20, 377, 312, 107);
		add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxFinanciamento = new JCheckBox("Financiamento");
		chckbxFinanciamento.setBounds(6, 22, 139, 23);
		panel_1.add(chckbxFinanciamento);
		
		JCheckBox chckbxPermuta = new JCheckBox("Permuta");
		chckbxPermuta.setBounds(6, 48, 139, 23);
		panel_1.add(chckbxPermuta);
		
		JCheckBox chckbxAvista = new JCheckBox("\u00C0 vista");
		chckbxAvista.setBounds(6, 74, 139, 23);
		panel_1.add(chckbxAvista);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Preferencias", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(356, 31, 338, 376);
		add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox chckbxAluguel = new JCheckBox("Aluguel");
		chckbxAluguel.setBounds(17, 23, 97, 23);
		panel_2.add(chckbxAluguel);
		
		JCheckBox chckbxEsquina = new JCheckBox("Esquina");
		chckbxEsquina.setBounds(17, 49, 97, 23);
		panel_2.add(chckbxEsquina);
		
		JCheckBox chckbxCondominio = new JCheckBox("Condominio");
		chckbxCondominio.setBounds(17, 75, 97, 23);
		panel_2.add(chckbxCondominio);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipos de imov\u00E9l desejados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(17, 105, 312, 107);
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
		lblreMnimam.setBounds(17, 233, 102, 14);
		panel_2.add(lblreMnimam);
		
		textAreaMinima = new JTextField();
		textAreaMinima.setBounds(116, 230, 71, 20);
		panel_2.add(textAreaMinima);
		textAreaMinima.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Restri\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(10, 258, 312, 107);
		panel_2.add(panel_5);
		
		JRadioButton rdbtnComercialResisdencial = new JRadioButton("Nenhuma");
		rdbtnComercialResisdencial.setBounds(6, 18, 109, 23);
		panel_5.add(rdbtnComercialResisdencial);
		rdbtnComercialResisdencial.setSelected(true);
		
		JRadioButton rdbtnComercial = new JRadioButton("Comercial");
		rdbtnComercial.setBounds(6, 44, 109, 23);
		panel_5.add(rdbtnComercial);
		
		JRadioButton rdbtnResidencial = new JRadioButton("Resid\u00EAncial");
		rdbtnResidencial.setBounds(6, 70, 109, 23);
		panel_5.add(rdbtnResidencial);
		ButtonGroup gp = new ButtonGroup();
		gp.add(rdbtnComercialResisdencial);
		gp.add(rdbtnComercial);
		gp.add(rdbtnResidencial);
		
		JButton button = new JButton("Criar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int cep = Integer.parseInt(textCEP.getText());
					String estado = textEstado.getText();
					String cidade = textCidade.getText();
					String rua = textRua.getText();
					String bairro = textBairro.getText();
					int numero = Integer.parseInt(textNumero.getText());
					String complemento = textComplemento.getText();
					String nome = textNome.getText();
					String telefone = textTelefone.getText();
					String documento = textDocumento.getText();
					String email = textEmail.getText();
					boolean aluguel = chckbxAluguel.isSelected();
					boolean esquina = chckbxEsquina.isSelected();
					boolean condominio = chckbxCondominio.isSelected();
					double precoMax = Double.parseDouble(textPrecoMAX.getText());
					double areaMinimaTerreno = Double.parseDouble(textAreaMinima.getText());
					
					

					Restricao proposito = null;
					if(rdbtnComercialResisdencial.isSelected()) {
						proposito = null;
					}else if(rdbtnComercial.isSelected()) {
						proposito = Restricao.COMERCIAL;
					}else if (rdbtnResidencial.isSelected()) {
						proposito = Restricao.RESIDENCIAL;
					}
					
					ArrayList<Integer> tipos = new ArrayList<Integer>();
					TipoImovel tipoImovel = null;
					if(chckbxCasa.isSelected()) {
						tipoImovel=TipoImovel.CASA;
						tipos.add(1);
					}else if(chckbxApartamento.isSelected()) {
						tipoImovel=TipoImovel.APARTAMENTO;
						tipos.add(2);
					}else if (chckbxTerreno.isSelected()) {
						tipoImovel=TipoImovel.TERRENO;
						tipos.add(3);
					}
					
					if((estado.isEmpty()||cidade.isEmpty()||rua.isEmpty()||bairro.isEmpty()||nome.isEmpty()||telefone.isEmpty()
							||documento.isEmpty()) || (!(chckbxCasa.isSelected()) && !(chckbxApartamento.isSelected()) && !(chckbxTerreno.isSelected()))) {
						throw new InvalidInputException("Existem campos obrigatorios que nao foram preenchidos");
					}
					Corretor corretor = (Corretor)Telas.getUser();
					Cliente cliente = new Cliente(nome, telefone, documento, 
							new Endereco(cep, estado, cidade, rua, bairro, numero, complemento), email, precoMax, 
							new Preferencia(aluguel, esquina, condominio, tipoImovel, areaMinimaTerreno, proposito), 
							corretor);
					
					/*TODO: ADICONAR CLIENTE NO BANCO DE DADOS*/
					
					PreparedStatement psEndereco = Main.imobiliaria.getBanco().getConexao().prepareStatement("INSERT INTO enderecos (endereco_id, cep, estado, "
							   + " cidade, rua, bairro, numero, complemento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

					
					psEndereco.setInt(1, cliente.getEndereco().getId());
					psEndereco.setInt(2, cliente.getEndereco().getCep());
					psEndereco.setString(3, cliente.getEndereco().getEstado());
					psEndereco.setString(4, cliente.getEndereco().getCidade());
					psEndereco.setString(5, cliente.getEndereco().getRua());
					psEndereco.setString(6, cliente.getEndereco().getBairro());
					psEndereco.setInt(7, cliente.getEndereco().getNumero());
					psEndereco.setString(8, cliente.getEndereco().getComplemento());
					
					psEndereco.executeUpdate();
					
					PreparedStatement psPessoa = Main.imobiliaria.getBanco().getConexao().prepareStatement("INSERT INTO pessoas (pessoa_id," 
							   					 + " endereco_id, nome, telefone, documento, email) VALUES (?, ?, ?, ?, ?, ?)");
					
					psPessoa.setInt(1, cliente.getId());
					psPessoa.setInt(2, cliente.getEndereco().getId());
					psPessoa.setString(3, cliente.getNome());
					psPessoa.setString(4, cliente.getTelefone());
					psPessoa.setString(5, cliente.getDocumento());
					psPessoa.setString(6, cliente.getEmail());
					
					psPessoa.executeUpdate();
					
					PreparedStatement psCliente = Main.imobiliaria.getBanco().getConexao().prepareStatement("INSERT INTO clientes (pessoa_id," 
		   					 + " corretor_id, preco_max) VALUES (?, ?, ?)");
					
					psCliente.setInt(1, cliente.getId());
					
					PreparedStatement psCorretor = Main.imobiliaria.getBanco().getConexao().prepareStatement("SELECT "
							+ "corretor_id FROM corretores WHERE corretores.pessoa_id = ?");
					psCorretor.setInt(1, corretor.getId());
					ResultSet corretor_id = psCorretor.executeQuery();
					corretor_id.next();
					
					psCliente.setInt(2, corretor_id.getInt(1));
					psCliente.setDouble(3, cliente.getPrecoMax());

					psCliente.executeUpdate();
					
					PreparedStatement psPreferencia = null;
					for (int i = 0; i < tipos.size(); i++) {
						if (proposito != null) {
							psPreferencia = Main.imobiliaria.getBanco().getConexao()
									.prepareStatement("INSERT INTO preferencias (cliente_id, tipo_imovel_id, restricao_id,"
											+ " endereco_id, aluguel, esquina, condominio, area_minima_terreno) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
							psPreferencia.setInt(1, cliente.getId());
							psPreferencia.setInt(2, tipos.get(i));
						
							if (Restricao.COMERCIAL == proposito)
								psPreferencia.setInt(3, 2);
							if (Restricao.RESIDENCIAL == proposito)
								psPreferencia.setInt(3, 1);
						
							psPreferencia.setInt(4, cliente.getEndereco().getId());				
							psPreferencia.setBoolean(5, aluguel);
							psPreferencia.setBoolean(6, esquina);
							psPreferencia.setBoolean(7, condominio);
							psPreferencia.setDouble(8, precoMax);
						} else {
							psPreferencia = Main.imobiliaria.getBanco().getConexao()
									.prepareStatement("INSERT INTO preferencias (cliente_id, tipo_imovel_id, "
											+ " endereco_id, aluguel, esquina, condominio, area_minima_terreno) VALUES (?, ?, ?, ?, ?, ?, ?");
							psPreferencia.setInt(1, cliente.getId());
							psPreferencia.setInt(2, tipos.get(i));
						
							psPreferencia.setInt(3, cliente.getEndereco().getId());				
							psPreferencia.setBoolean(4, aluguel);
							psPreferencia.setBoolean(5, esquina);
							psPreferencia.setBoolean(6, condominio);
							psPreferencia.setDouble(7, precoMax);
						}
						
						psPreferencia.executeUpdate();
					}
					
					Main.imobiliaria.adicionarCliente(cliente);
					JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
					card.show(p, "home");
					
				} catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Existem campos invalidos ! ", null, JOptionPane.ERROR_MESSAGE);
				} catch(InvalidInputException e1) {
					JOptionPane.showMessageDialog(null,e1.getUserMessage(), null, JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null,  "Erro com o BD", null, JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(466, 653, 89, 23);
		add(button);
	}

	@Override
	public void LimparTodosOsCampos() {
		
		
	}
}
