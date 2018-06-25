package InterfaceGrafica;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import Entidades.Cliente;
import Entidades.Corretor;
import Entidades.FormaPagamento;
import Entidades.Imovel;
import Entidades.Pagamento;
import Excecoes.InvalidInputException;
import Interface.Limpavel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FormProposta extends JPanel implements Limpavel{
	private static final long serialVersionUID = 1555L;
	private JTextField textClienteId;
	private JTextField textImovelId;
	private JTextField textPropostaPreco;

	/**
	 * Create the panel.
	 */
	public FormProposta(CardLayout card,JPanel p) {
		setBorder(new TitledBorder(null, "NOVA PROPOSTA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(null);
		
		JLabel lblClienteid = new JLabel("Cliente (id) :");
		lblClienteid.setBounds(10, 22, 105, 14);
		add(lblClienteid);
		
		JLabel lblImovelid = new JLabel("Imovel (id) :");
		lblImovelid.setBounds(10, 47, 105, 14);
		add(lblImovelid);
		
		JLabel lblPreoPropostar = new JLabel("Proposta (R$) :");
		lblPreoPropostar.setBounds(10, 72, 105, 14);
		add(lblPreoPropostar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 97, 312, 105);
		add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnFinanciamento = new JRadioButton("Financiamento");
		rdbtnFinanciamento.setBounds(6, 19, 109, 23);
		panel.add(rdbtnFinanciamento);
		
		JRadioButton rdbtnPermuta = new JRadioButton("Permuta");
		rdbtnPermuta.setBounds(6, 45, 109, 23);
		panel.add(rdbtnPermuta);
		
		JRadioButton rdbtnAvista = new JRadioButton("\u00C0 vista");
		rdbtnAvista.setBounds(6, 71, 109, 23);
		panel.add(rdbtnAvista);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.setBounds(135, 213, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(p, "home");
			}
		});
		btnNewButton_1.setBounds(234, 213, 89, 23);
		add(btnNewButton_1);
		
		textClienteId = new JTextField();
		textClienteId.setBounds(147, 19, 175, 20);
		add(textClienteId);
		textClienteId.setColumns(10);
		
		textImovelId = new JTextField();
		textImovelId.setBounds(147, 44, 175, 20);
		add(textImovelId);
		textImovelId.setColumns(10);
		
		textPropostaPreco = new JTextField();
		textPropostaPreco.setBounds(147, 69, 175, 20);
		add(textPropostaPreco);
		textPropostaPreco.setColumns(10);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnFinanciamento);
		bg.add(rdbtnPermuta);
		bg.add(rdbtnAvista);
		
		rdbtnFinanciamento.setSelected(true);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int imovelId = Integer.parseInt(textImovelId.getText());
					String clienteDocumento = textClienteId.getText();
					double valor = Double.parseDouble(textPropostaPreco.getText());
					
					if(clienteDocumento.isEmpty()) {
						throw new InvalidInputException("Existem campos obrigatorios que nao foram preenchidos");
					}
					
					
					Corretor c = (Corretor)Telas.getUser();
					Imovel i = Main.imobiliaria.buscarImovel(imovelId);
					Cliente cl = Main.imobiliaria.buscarCliente(clienteDocumento);
					
					if(c==null||i==null||cl==null) {
						throw new InvalidInputException("Corretor, Imovel ou Cliente nao encontrado");
					}
					
					Pagamento pag=null;
					if (rdbtnFinanciamento.isSelected()) {
						pag = new Pagamento(valor,FormaPagamento.FINANCIAMENTO);				  
					} else if (rdbtnPermuta.isSelected()){
				  		pag = new Pagamento( valor,FormaPagamento.PERMUTA );
				  	}else if (rdbtnAvista.isSelected()){
				  		pag = new Pagamento( valor,FormaPagamento.AVISTA );
					}
					
					if(pag==null) {
						throw new InvalidInputException("Por favor selecione um tipo de pagamento");
					}
					
					c.criarProposta(cl, i, valor);
					c.getPropostasEmAberto().get(c.getPropostasEmAberto().size()-1).adicionarPagamento(pag);
					
					JOptionPane.showMessageDialog(null,"Proposta criada com sucesso",null,JOptionPane.INFORMATION_MESSAGE);
					card.show(p, "home");
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Existem campos invalidos ! ",null,JOptionPane.ERROR_MESSAGE);
				}catch(InvalidInputException e) {
					JOptionPane.showMessageDialog(null,e.getUserMessage(),null,JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
	}

	@Override
	public void LimparTodosOsCampos() {
		// TODO Auto-generated method stub
		
	}
}
