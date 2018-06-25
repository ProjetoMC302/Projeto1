package InterfaceGrafica;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import Entidades.Endereco;
import Entidades.Proprietario;
import Excecoes.InvalidInputException;
import Interface.Limpavel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class FormProprietario extends JPanel implements Limpavel{
	private static final long serialVersionUID = 12L;
	private JTextField textNome;
	private JTextField textTelefone;
	private JTextField textDocumento;
	private JTextField textCEP;
	private JTextField textEstado;
	private JTextField textCidade;
	private JTextField textBairro;
	private JTextField textRua;
	private JTextField textNumero;
	private JTextField textComplemento;
	private JTextField textEmail;

	
	/**
	 * Create the panel.
	 */
	public FormProprietario(CardLayout card,JPanel p) {
		
		setBorder(new TitledBorder(null, "PROPRIETARIO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(null);
		setBounds(0, 0, 413, 448);
		JLabel label = new JLabel("Nome :");
		label.setBounds(22, 32, 46, 14);
		add(label);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(117, 29, 230, 20);
		add(textNome);
		
		JLabel label_1 = new JLabel("Telefone :");
		label_1.setBounds(22, 57, 66, 14);
		add(label_1);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(117, 54, 230, 20);
		add(textTelefone);
		
		JLabel label_2 = new JLabel("Documento :");
		label_2.setBounds(22, 82, 66, 14);
		add(label_2);
		
		textDocumento = new JTextField();
		textDocumento.setColumns(10);
		textDocumento.setBounds(117, 79, 230, 20);
		add(textDocumento);
		
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
		
		JLabel label_9 = new JLabel("Complemento:");
		label_9.setBounds(10, 171, 96, 14);
		panel.add(label_9);
		
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
		
		JLabel label_10 = new JLabel("Email :");
		label_10.setBounds(22, 328, 66, 14);
		add(label_10);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(117, 325, 230, 20);
		add(textEmail);
		
		JCheckBox chckbxEmpresa = new JCheckBox("Empresa");
		chckbxEmpresa.setBounds(22, 357, 97, 23);
		add(chckbxEmpresa);
		
		JButton btnNewButton = new JButton("Criar");
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
					String nome = textNome.getText();
					String telefone = textTelefone.getText();
					String documento = textDocumento.getText();
					String email = textEmail.getText();
					boolean empresa = chckbxEmpresa.isSelected();
				
					if(estado.isEmpty()||cidade.isEmpty()||rua.isEmpty()||bairro.isEmpty()||nome.isEmpty()||telefone.isEmpty()
							||documento.isEmpty()) {
						throw new InvalidInputException("Existem campos obrigatorios que nao foram preenchidos");
					}
					
					Proprietario proprietario = new Proprietario(nome, telefone, documento, 
							new Endereco(cep,estado,cidade,rua,bairro,numero,complemento), email, empresa);
					
					/*TODO: ADICONAR PROPRIETARIO NO BANCO DE DADOS*/
					Main.imobiliaria.adicionarProprietario(proprietario);
					JOptionPane.showMessageDialog(null,"Proprietario cadastrado com sucesso",null,JOptionPane.INFORMATION_MESSAGE);
					card.show(p, "home");
					
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Existem campos invalidos ! ",null,JOptionPane.ERROR_MESSAGE);
				}catch(InvalidInputException e) {
					JOptionPane.showMessageDialog(null,e.getUserMessage(),null,JOptionPane.ERROR_MESSAGE);
				}		
			}
		});
		btnNewButton.setBounds(22, 398, 89, 23);
		add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				limparTodosCampos();
				card.show(p, "home");
			}
		});
		btnCancelar.setBounds(117, 398, 89, 23);
		add(btnCancelar);
		
		

	}


	@Override
	public void LimparTodosOsCampos() {
		textNome.setText("");
		textTelefone.setText("");
		textDocumento.setText("");
		textCEP.setText("");
		textEstado.setText("");
		textCidade.setText("");
		textBairro.setText("");
		textRua.setText("");
		textNumero.setText("");
		textComplemento.setText("");
		textEmail.setText("");
	}
}
