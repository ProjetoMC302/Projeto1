package InterfaceGrafica;

import java.awt.EventQueue;

import Entidades.Endereco;
import Entidades.Imobiliaria;
import Entidades.Imovel;
import Entidades.Pessoa;
import Entidades.Proposta;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
	/**ESSA LINHA DEVE SER DELETADA ASSIM COMO DEVE SER ALTERADO O CONSTRUTOR DE TELAS PARA NAO RECEBER IMOBILIARIA POIS 
	 * IMOBILIARIA E SO UMA SIMULACAO DO BANCO DE DADOS*/
	public static Imobiliaria imobiliaria = new Imobiliaria();

public static void main(String[] args) { 	
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
						PreparedStatement psPessoa = imobiliaria.getBanco().getConexao().prepareStatement("SELECT "
								+ "pessoa_id FROM pessoas ORDER BY pessoa_id DESC");
						ResultSet pessoas = psPessoa.executeQuery();
						if (pessoas.next())
							Pessoa.setGeradorId(pessoas.getInt(1));
						
						PreparedStatement psEndereco = imobiliaria.getBanco().getConexao().prepareStatement("SELECT "
								+ "endereco_id FROM enderecos ORDER BY endereco_id DESC");
						ResultSet enderecos = psEndereco.executeQuery();
						if (enderecos.next())
							Endereco.setGeradorId(enderecos.getInt(1));
						
						PreparedStatement psProposta = imobiliaria.getBanco().getConexao().prepareStatement("SELECT "
								+ "proposta_id FROM propostas ORDER BY proposta_id DESC");
						ResultSet propostas = psProposta.executeQuery();
						if (propostas.next())
							Proposta.setGeradorId(propostas.getInt(1));
						
						PreparedStatement psImovel = imobiliaria.getBanco().getConexao().prepareStatement("SELECT "
								+ "imovel_id FROM imoveis ORDER BY imovel_id DESC");
						ResultSet imoveis = psImovel.executeQuery();
						if (imoveis.next())
							Imovel.setGeradorId(imoveis.getInt(1));
						
						
						Telas frame = new Telas();
						frame.setVisible(true);
				} catch (Exception e) {
						e.printStackTrace();
				}
			}
		});
}


}
