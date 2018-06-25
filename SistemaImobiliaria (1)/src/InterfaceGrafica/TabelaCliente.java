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
import java.awt.FlowLayout;

public class TabelaCliente extends JPanel {
	private static final long serialVersionUID = 17L;
	private JTable table;
	private DefaultTableModel model;
	private ArrayList<Cliente> clientes;
	/**
	 * Create the panel.
	 */
	public TabelaCliente(CardLayout card,JPanel p) {
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
					for (i=0;i<=clientes.size();i++) {	
						if(clientes.get(i).getId() == id) {
							break;
						}
					}
					Main.imobiliaria.removerCliente(clientes.get(i).getId());
					model.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null,"Cliente removimo com sucesso",null,JOptionPane.INFORMATION_MESSAGE);
				}catch(ArrayIndexOutOfBoundsException e1) {
					JOptionPane.showMessageDialog(null,"Selecione uma linha ",null,JOptionPane.INFORMATION_MESSAGE);
				}	
			}
		});
		panel.add(btnDetalhes);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setRowCount(0);
				card.show(p, "home");
			}
		});
		panel.add(btnNewButton);
	
		String[] columnNames = {"ID","Nome","Telefone","Documento","Email","CEP","Numero","Complemnto"};

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
	
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
		
		for (Cliente cliente : clientes) {
			model.addRow(new Object[]{cliente.getId(), cliente.getNome(), cliente.getTelefone(),cliente.getDocumento(), cliente.getEmail(), 
					cliente.getEndereco().getCep(),cliente.getEndereco().getNumero(),cliente.getEndereco().getComplemento()});
		}
		
	}
}
