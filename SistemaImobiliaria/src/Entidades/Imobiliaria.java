package Entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BancoDeDados.Banco;

public class Imobiliaria{
	private static Banco banco = new Banco();
	
	private ArrayList<Imovel> imoveis;
	private ArrayList<Cliente> clientes;
	private ArrayList<Corretor> corretores;
	private ArrayList<Proprietario> proprietarios;
	private ArrayList<Gerente> gerentes;
	private ArrayList<Proposta>propostas;
	
	public Imobiliaria(){
		imoveis = new ArrayList<Imovel>();
		clientes = new ArrayList<Cliente>();
		corretores = new ArrayList<Corretor>();
		proprietarios = new ArrayList<Proprietario>();
		propostas = new ArrayList<Proposta>();
		gerentes=new ArrayList<Gerente>();
		Gerente gerente_default= new Gerente("0","0","0","0");
		gerentes.add(gerente_default);
	}
	
	/**Metodos de adicao e remocao de infomacoes do banco de dados simulado*/
	
	public Gerente verificarLoginGerente(String email,String senha)
	{	

		for(int i = 0;i < gerentes.size(); i++)
		{
			if(gerentes.get(i).getEmail().intern() == email.intern())
			{
				if(gerentes.get(i).getSenha().intern() == senha.intern())
				{
					return gerentes.get(i);
				}
			}
		}
		return null;
	}
	
	public Pessoa verificarLoginCorretor(String email,String senha)
	{
		
		try {
			PreparedStatement query = banco.getConexao().prepareStatement("SELECT corretores.pessoa_id FROM corretores JOIN pessoas ON (pessoas.pessoa_id = corretores.pessoa_id) WHERE pessoas.email = ?"
							 + " AND corretores.senha = ?");
			
			query.setString(1, email);
			query.setString(2, senha);
			
			ResultSet resultado = query.executeQuery();
			
			Pessoa corretor = null;
			
			if(resultado.next())
				corretor = Banco.encontrarCorretor(resultado.getInt(1));
			return corretor;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	/*	for(int i = 0;i< corretores.size();i++)
		{
			if(corretores.get(i).getEmail().intern()==email.intern())
			{
				if(corretores.get(i).getSenha().intern()==senha.intern())
					return corretores.get(i);
			}
		}*/
		return null;
	}
	
	
	public Proprietario buscaProprietario(String documento) {
		for (Proprietario proprietario : getProprietarios()) {
			if (proprietario.getDocumento().equals(documento)) {
				return proprietario;
			}
		}
		return null;
	}
	
	public boolean adicionarImovel(Imovel imovel) {
		if (imoveis.contains(imovel)) {
			return false;
		} else {
			return imoveis.add(imovel);
		}
	}

	public boolean removerImovel(int idImovel) {
		for (Imovel i : imoveis) {
			if(i.getId() == idImovel) { 
				i.getCorretorResponsavel().getImoveis().remove(i);
				return imoveis.remove(i);
			}
		}
		return false;
	}
	
	public boolean removerImovelcorretores(int idImovel,Corretor corretor) {
		for (Imovel i : corretor.getImoveis()) {
			if(i.getId() == idImovel) { 
				if(corretor==i.getCorretorResponsavel())
				{
					imoveis.remove(i);
					return corretor.getImoveis().remove(i);
				}
				
			}
		}
		return false;
	}
	
	public boolean removerImovel(Imovel imovel) {
		imovel.getCorretorResponsavel().getImoveis().remove(imovel);
		return imoveis.remove(imovel);
	}
	
	public boolean removerImovel(Imovel imovel, Corretor corretor) {
		if(imovel.getCorretorResponsavel()==corretor)
		{
			imoveis.remove(imovel);
			return corretor.getImoveis().remove(imovel);
		}
		return false;
		
	}
	
	public boolean adicionarCliente(Cliente cliente) {
		if (clientes.contains(cliente)) {
			return false;
		} else {
			return clientes.add(cliente);
		}
	}

	public boolean removerCliente(int idCliente) {
		for(Cliente cli : clientes) {
			if (cli.getId() == idCliente) {
				cli.getCorretor().getClientes().remove(cli);
				return clientes.remove(cli);
			}
		}
		return false;
	}
	
	public boolean removerCliente(int idCliente,Corretor corretor) {
		for(Cliente cli : corretor.getClientes()) {
			if (cli.getId() == idCliente) {
				if(cli.getCorretor()==corretor)
				{
					corretor.getClientes().remove(cli);
					return clientes.remove(cli);
				}
				
			}
		}
		return false;
	}
	
	public boolean removerCliente(Cliente cli,Gerente gerente) {
		cli.getCorretor().getClientes().remove(cli);
		return clientes.remove(cli);
	}
	
	public boolean removerCliente(Cliente cli,Corretor corretor) {
		if(cli.getCorretor()==corretor)
		{
			cli.getCorretor().getClientes().remove(cli);
			return clientes.remove(cli);
		}
		return false;
		
	}
	
	public boolean adicionarCorretor(Corretor corretor) {
		if (corretores.contains(corretor)) {
			//corretor ja existe no sistema
			return false;
		} else {
			return corretores.add(corretor);
		}
	}


	
	public boolean removerCorretor(int idCorretor) {
		for (Corretor cor : corretores) {
			if (cor.getId() == idCorretor) {
				corretores.remove(corretores.indexOf(cor));
				return true;
			}
		}
		return false;
	}
	
	public boolean removerCorretor(Corretor corretor,Gerente gerente) {
		if (corretores.contains(corretor)) {
			corretor.desativarCorretor();
			return true;
		}
		return false;
	}
	
	public boolean adicionarProprietario(Proprietario proprietario) {
		if (proprietarios.contains(proprietario)) {
				return false;
		} else {
			return proprietarios.add(proprietario);
		}
	}
	

	
	public boolean removerProprietario(Proprietario proprietario) {
		for(int i=0;i<proprietario.getImoveis().size();i++)
		{
			this.removerImovel(proprietario.getImoveis().get(i));
		}
		return proprietarios.remove(proprietario);
	}
	
	public boolean removerProprietario(int idProprietario) {
		for(Proprietario pro : proprietarios) {
			if(pro.getId() == idProprietario) {
				for(int i=0;i<pro.getImoveis().size();i++)
				{
					this.removerImovel(pro.getImoveis().get(i));
				}
				return proprietarios.remove(pro);
			}
		}
		return false;
	}
	
	public Imovel buscarImovel(Imovel imovel) {
		if (imoveis.contains(imovel)) {
			return imoveis.get(imoveis.indexOf(imovel));
		}
		
		return null;
	}
	
	public Imovel buscarImovel(int idImovel) {
		for (Imovel imv : imoveis) {
			if(imv.getId() == idImovel) {
				return imv;
			}
		}

		return null;
	}
	
	public Cliente buscarCliente(String documento) {
		for (Cliente clt : clientes) {
			if(clt.getDocumento().equals(documento)) {
				return clt;
			}
		}

		return null;
	}
	
	public Corretor buscarCorretor(Corretor corretor) {
		if (corretores.contains(corretor)) {
			return corretores.get(corretores.indexOf(corretor));
		}
		
		return null;
	}
	
	public Corretor buscarCorretor(int idCorretor) {
		for (Corretor cor : corretores) {
			if(cor.getId() == idCorretor) {
				return cor;
			}
		}

		return null;
	}
	
	public Corretor buscarCorretor(String creci) {
		for (Corretor cor : corretores) {
			if(cor.getCreci() == creci) {
				return cor;
			}
		}

		return null;
	}
	
	
	
	public Proposta buscarProposta(int idProposta) {

			for (Proposta pro : propostas) {
				if (pro.getId() == idProposta) {
					return pro;
				}
			}
		
		return null;
	}

	/* bloco de getters e setters */
	public ArrayList<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(ArrayList<Imovel> imoveis) {
		this.imoveis = imoveis;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Corretor> getCorretores() {
		return corretores;
	}

	public void setCorretores(ArrayList<Corretor> corretores) {
		this.corretores = corretores;
	}

	public ArrayList<Proprietario> getProprietarios() {
		return proprietarios;
	}
	public ArrayList<Proposta> getPropostas(Corretor corretor) {
		Corretor c = buscarCorretor(corretor);
		if(c!=null) {
			return c.getPropostasEmAberto();
		}else {
			return null;
		}
	}
	public void setProprietarios(ArrayList<Proprietario> proprietarios) {
		this.proprietarios = proprietarios;
	}

	
	private String auxiliadorToStringProprietarios() {
		String out = "";
		
		for (Proprietario pro : proprietarios) {
			out += "****************";
			out += pro;
		}
		
		return out;
	}
	
	private String auxiliadorToStringClientes() {
		String out = "";
		
		for (Cliente cli : clientes) {
			out += "****************";
			out += cli;
		}
		
		return out;	
	}
	
	private String auxiliadorToStringCorretores() {
		String out = "";
		
		for (Corretor cor : corretores) {
			out += "****************";
			out += cor;
		}
		
		return out;
	}

	public Banco getBanco() {
		return banco;
	}
	
	@Override
	public String toString() {
		String out = "***Imobiliaria***";
		out += "*Proprietarios Cadastrados:\n" + auxiliadorToStringProprietarios();
		out += "*Clientes Cadastrados:\n" + auxiliadorToStringClientes();
		out += "*Corretores Cadastrados:\n" + auxiliadorToStringCorretores();
		
		
		return out;
	}
	
}