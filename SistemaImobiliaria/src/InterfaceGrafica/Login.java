package InterfaceGrafica;

import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

import javax.swing.JTextField;
import Entidades.Pessoa;
import Interface.Limpavel;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Insets;
import java.awt.Dimension;


public class Login extends JPanel implements Limpavel{
	private static final long serialVersionUID = 5000L;
	private JTextField field_email;
	private JPasswordField field_senha;

	/**
	 * Create the panel.
	 */
	protected Pessoa user;
	
	public Login(CardLayout cardLayout,JPanel painel,Telas telas) {
		
		
		setBackground(new Color(255, 255, 204));
		setLayout(null);
		
		JLabel email_lable = new JLabel("Email:");
		email_lable.setFont(new Font("Cambria", Font.BOLD, 15));
		email_lable.setBounds(32, 120, 73, 24);
		add(email_lable);
		
		field_email = new JTextField();
		field_email.setFont(new Font("Arial", Font.PLAIN, 15));
		field_email.setBounds(97, 117, 327, 27);
		add(field_email);
		field_email.setColumns(10);
		
		JLabel lable_Senha = new JLabel("Senha:");
		lable_Senha.setFont(new Font("Cambria", Font.BOLD, 15));
		lable_Senha.setBounds(32, 166, 46, 14);
		add(lable_Senha);
		
		field_senha = new JPasswordField();
		field_senha.setBounds(97, 162, 327, 27);
		add(field_senha);
		
	
		JRadioButton botaoGerente = new JRadioButton("Gerente");
		botaoGerente.setBackground(new Color(255, 255, 204));
		botaoGerente.setFont(new Font("Cambria", Font.BOLD, 15));
		botaoGerente.setBounds(32, 198, 109, 14);
		add(botaoGerente);
		
		JRadioButton botaoCorretor = new JRadioButton("Corretor");
		botaoCorretor.setBackground(new Color(255, 255, 204));
		botaoCorretor.setFont(new Font("Cambria", Font.BOLD, 15));
		botaoCorretor.setBounds(32, 215, 109, 23);
		add(botaoCorretor);
		
		 ButtonGroup group = new ButtonGroup();
		 group.add(botaoCorretor);
		 group.add(botaoGerente);
		
		JButton botao_concluido = new JButton("Concluido");
		botao_concluido.setFont(new Font("Cambria", Font.BOLD, 15));
		botao_concluido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
						try {
							
							String email = field_email.getText();
							String senha = new String(field_senha.getPassword());
							
							if(botaoGerente.isSelected())
							{
								/**BUSCA NO BANCO DE DADOS PELO GERENTE COM ESSE EMAIL E SENHA*/
								
								//Simulando banco de dados
								user=Main.imobiliaria.verificarLoginGerente(email, senha);
								if(user==null)
									throw new Exception();
								telas.setUserCompleto(user);
								cardLayout.show(painel, "home2");
							}
							
							if(botaoCorretor.isSelected())
							{
								/**BUSCA NO BANCO DE DADOS PELO CORRETOR COM ESSE EMAIL E SENHA*/
								
								//Simulando banco de dados
								user=Main.imobiliaria.verificarLoginCorretor(email, senha);
								if(user==null)
									throw new Exception();
								telas.setUserCompleto(user);
								cardLayout.show(painel, "home");
								
							}
							
						}catch(Exception cardLayout){
							
							JOptionPane.showMessageDialog(null,"Usu�rio inv�lido !",null,JOptionPane.ERROR_MESSAGE);
						}
						
					
					
			}			
				
				
		});
		botao_concluido.setBackground(Color.WHITE);
		botao_concluido.setBounds(164, 252, 116, 23);
		add(botao_concluido);
		
		JButton logo = new JButton("");
		logo.setBorder(null);
		logo.setIconTextGap(0);
		logo.setHideActionText(true);
		logo.setInheritsPopupMenu(true);
		logo.setIgnoreRepaint(true);
		logo.setMinimumSize(new Dimension(0, 0));
		logo.setMargin(new Insets(0, 0, 0, 0));
		logo.setBackground(new Color(255, 255, 204));
		logo.setIcon(new ImageIcon(Login.class.getResource("/InterfaceGrafica/logotipo-da-casa-limpa-para-empresa-imobiliaria_1017-6878.gif")));
		logo.setBounds(170, 11, 137, 95);
		add(logo);

	}
	
	public Pessoa getUser() {
		return user;
	}

	@Override
	public void LimparTodosOsCampos() {
		// TODO Auto-generated method stub
		
	}
}
