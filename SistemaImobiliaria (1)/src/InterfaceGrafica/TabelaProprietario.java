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

import Entidades.Proprietario;

import java.awt.FlowLayout;

public class TabelaProprietario extends JPanel {
	private static final long serialVersionUID = 789L;
	private JTable table;
	private DefaultTableModel model;
	private ArrayList<Proprietario> proprietarios;
	/**
	 * Create the panel.
	 */
	public TabelaProprietario(CardLayout card,JPanel p) {
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
					for (i=0;i<=proprietarios.size();i++) {	
						if(proprietarios.get(i).getId() == id) {
							break;
						}
					}
					Main.imobiliaria.removerProprietario(proprietarios.get(i).getId());
					model.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null,"Proprietario removido com sucesso",null,JOptionPane.INFORMATION_MESSAGE);
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
		
		String[] columnNames = {"ID","Nome","Telefone","Documento","Email","CEP","Numero","Complemento","Empresa"};

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
	
	public void setProprietario(ArrayList<Proprietario> proprietarios) {
		this.proprietarios = proprietarios;
		
		for (Proprietario proprietario : proprietarios) {
			model.addRow(new Object[]{proprietario.getId(), proprietario.getNome(), proprietario.getTelefone(),
					proprietario.getDocumento(), proprietario.getEmail(), proprietario.getEndereco().getCep(),
					proprietario.getEndereco().getNumero(),proprietario.getEndereco().getComplemento(),proprietario.isEmpresa()});
		}
		
	}
}
