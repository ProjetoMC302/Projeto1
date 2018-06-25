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

import Entidades.Corretor;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class TabelaCorretor extends JPanel {
	private static final long serialVersionUID = 23L;
	private JTable table;
	private DefaultTableModel model;
	private ArrayList<Corretor> corretores;
	/**
	 * Create the panel.
	 */
	public TabelaCorretor(CardLayout card,JPanel p,FormCorretorAtualizar formCorretorAtualizar) {
		setBorder(new TitledBorder(null, "Corretor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(0, 0, 726, 687);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnDetalhes = new JButton("Detalhes");
		btnDetalhes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(table.getModel().getValueAt(table.getSelectedRow(), 0).toString());
					int i=0;
					for (i=0;i<=corretores.size();i++) {	
						if(corretores.get(i).getId() == id) {
							break;
						}
					}
					formCorretorAtualizar.setCorretor(corretores.get(i));
					card.show(p, "formCorretorAtualizar");
					model.setRowCount(0);
				}catch(ArrayIndexOutOfBoundsException e1) {
					JOptionPane.showMessageDialog(null,"Selecione uma linha ",null,JOptionPane.INFORMATION_MESSAGE);
				}	
			}
		});
		panel.add(btnDetalhes);
		
		JButton btnNewButton = new JButton("Remover");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(table.getModel().getValueAt(table.getSelectedRow(), 0).toString());
					Main.imobiliaria.removerCorretor(id);
					model.removeRow(table.getSelectedRow());
				}catch(ArrayIndexOutOfBoundsException e1) {
					JOptionPane.showMessageDialog(null,"Selecione uma linha ",null,JOptionPane.INFORMATION_MESSAGE);
				}	
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(p, "home2");
				model.setRowCount(0);
			}
		});
		panel.add(btnNewButton_1);
		
		String[] columnNames = {"ID","Nome","Documento","Email","Cresi","Senha"};

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
	
	public void setCorretores(ArrayList<Corretor> corretores) {
		this.corretores = corretores;
		
		for (Corretor corretor : corretores) {
			model.addRow(new Object[]{corretor.getId(), corretor.getNome(), corretor.getDocumento(), corretor.getEmail(), 
					corretor.getCreci(), corretor.getEndereco().getCidade()});
		}
		
	}
}
