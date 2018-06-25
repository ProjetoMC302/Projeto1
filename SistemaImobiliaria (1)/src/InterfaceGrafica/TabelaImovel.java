package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Entidades.Cliente;
import Entidades.Imovel;
import Entidades.Preferencia;
import Entidades.TipoImovel;
import Excecoes.InvalidInputException;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TabelaImovel extends JPanel {
	private static final long serialVersionUID = 825L;
	private JTable table;
	private DefaultTableModel model;
	private ArrayList<Imovel> imovels;
	private JTextField textClienteDoc;
	/**
	 * Create the panel.
	 */
	public TabelaImovel(CardLayout card,JPanel p) {
		setBorder(new TitledBorder(null, "Corretor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(0, 0, 726, 687);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnDetalhes = new JButton("Remover");
		btnDetalhes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(table.getModel().getValueAt(table.getSelectedRow(), 0).toString());
					int i=0;
					for (i=0;i<=imovels.size();i++) {	
						if(imovels.get(i).getId() == id) {
							break;
						}
					}
					Main.imobiliaria.removerImovel(imovels.get(i).getId());
					model.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null,"Imovel removimo com sucesso",null,JOptionPane.INFORMATION_MESSAGE);
				}catch(ArrayIndexOutOfBoundsException e1) {
					JOptionPane.showMessageDialog(null,"Selecione uma linha ",null,JOptionPane.INFORMATION_MESSAGE);
				}	
			}
		});
		panel.add(btnDetalhes);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(p, "home");
				model.setRowCount(0);
			}
		});
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Documento do Cliente:");
		panel.add(lblNewLabel);
		
		textClienteDoc = new JTextField();
		textClienteDoc.setToolTipText("hgfh");
		textClienteDoc.setColumns(10);
		panel.add(textClienteDoc);
		
		JButton buttonBuscar = new JButton("Buscar");
		buttonBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//busca por imovel com preferencias do cliente
				try {
					String documento = textClienteDoc.getText();
					Cliente cliente= Main.imobiliaria.buscarCliente(documento);
					
					if(cliente == null) {
						throw new InvalidInputException("Cliente nao encontrado por favor digite um documeto de algum cliente");
					}
					int i = cliente.getPreferencias().size();
					if(i==0) {
						throw new InvalidInputException("Cliente escolhido nao tem preferencias");
					}
					
					Preferencia preferencia = cliente.getPreferencias().get(cliente.getPreferencias().size()-1);
					TipoImovel tipoImovel = preferencia.getTipoImovel();
					ArrayList<Imovel> imovels=null;
					if(tipoImovel == TipoImovel.APARTAMENTO) {
						imovels = Main.imobiliaria.buscarApartamento(preferencia);
					}else if(tipoImovel == TipoImovel.CASA) {
						imovels = Main.imobiliaria.buscarCasa(preferencia);
					}else if(tipoImovel == TipoImovel.TERRENO) {
						imovels = Main.imobiliaria.buscarTerreno(preferencia);
					}
					if(imovels.isEmpty()) {
						throw new InvalidInputException("Nenhum imovel encontrado com essa preferencias");
					}
					setImovel(imovels);
				}catch(InvalidInputException e) {
					JOptionPane.showMessageDialog(null,e.getUserMessage(),null,JOptionPane.INFORMATION_MESSAGE);
				}
				
				
				
			}
		});
		panel.add(buttonBuscar);
		
		JButton btnLimparPesquisa = new JButton("Limpar Pesquisa");
		btnLimparPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textClienteDoc.setText("");
				setImovel(imovels);
			}
		});
		panel.add(btnLimparPesquisa);
		
		String[] columnNames = {"ID","Cep","Numero","Complemento","Preco","Aluguel","TipoImovel"};

		table = new JTable(new DefaultTableModel(columnNames,0)) {
			private static final long serialVersionUID = 1002L;

			@Override
			public boolean isCellEditable(int arg0, int arg1) {
				return false;
			}
		};
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(27);
		model = (DefaultTableModel) table.getModel();
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
		add(table.getTableHeader(),BorderLayout.PAGE_START);
		
	}
	
	public void setImovel(ArrayList<Imovel> imovels) {
		this.imovels = imovels;
		model.setRowCount(0);
		for (Imovel imovel : imovels) {
			model.addRow(new Object[]{imovel.getId(),imovel.getEndereco().getCep(),imovel.getEndereco().getNumero(),
					imovel.getEndereco().getComplemento(),imovel.getPreco(),imovel.isAluguel(),imovel.getTipoImovel()});
		}
		
	}
}
