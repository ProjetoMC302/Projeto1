package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entidades.Corretor;
import Entidades.Pessoa;
import Entidades.Proprietario;

public class Banco {
	
	private static Connection conexao;
	
	public Banco() {
		try {
			Class.forName("org.postgresql.Driver");
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConexao() {
		return conexao;
	}
	
	public static Pessoa encontrarPessoa(int id) {
		PreparedStatement ps;
		
		Pessoa pessoa = null;
		
		try {
			ps = conexao.prepareStatement("SELECT nome, telefone, email"
								 + " FROM pessoas WHERE pessoa_id = ?");
		
		
			ps.setInt(1, id);
		
			ResultSet result = ps.executeQuery();
		
			if (result.next()) {
				pessoa = new Pessoa(result.getString(1), result.getString(2), result.getString(3));
				pessoa.setId(id);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return pessoa;
	}
	
	public static Corretor encontrarCorretor(int id) {
		Pessoa pessoa = encontrarPessoa(id);
		
		Corretor corretor = new Corretor(id, pessoa.getNome(), pessoa.getTelefone(), pessoa.getEmail(), true);
		return corretor;
	}
	
	public static Proprietario encontrarProprietario(int id) {
		Pessoa pessoa = encontrarPessoa(id);
		
		Proprietario proprietario = new Proprietario(id, pessoa.getNome(), pessoa.getTelefone(), pessoa.getEmail(), true);
		
		return proprietario;
	}
}
