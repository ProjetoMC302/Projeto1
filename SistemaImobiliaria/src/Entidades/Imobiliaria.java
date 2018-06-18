package Entidades;
import java.util.ArrayList;

public class Imobiliaria{
	
	private ArrayList<Imovel> imoveis;
	private ArrayList<Cliente> clientes;
	private ArrayList<Corretor> corretores;
	private ArrayList<Proprietario> proprietarios;
	private ArrayList<Gerente> gerentes;
	private ArrayList<Proposta>propostas;
	
	public Imobiliaria(Gerente gerenteDefault){
		imoveis = new ArrayList<Imovel>();
		clientes = new ArrayList<Cliente>();
		corretores = new ArrayList<Corretor>();
		proprietarios = new ArrayList<Proprietario>();
		propostas = new ArrayList<Proposta>();
		gerentes=new ArrayList<Gerente>();
		gerentes.add(gerenteDefault);
	}
	
	/**Metodos de adicao e remocao de infomacoes do banco de dados simulado*/
	
	public boolean adicionarImovel(Imovel imovel) {
		if (imoveis.contains(imovel)) {
			return false;
		} else {
			return imoveis.add(imovel);
		}
	}

	public boolean removerImovel(int idImovel,Gerente gerente) {
		for (Imovel i : imoveis) {
			if(i.getId() == idImovel) { 
				i.getCorretorResponsavel().getImoveis().remove(i);
				return imoveis.remove(i);
			}
		}
		return false;
	}
	
	public boolean removerImovel(int idImovel,Corretor corretor) {
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
	
	public boolean removerImovel(Imovel imovel, Gerente gerente) {
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

	public boolean removerCliente(int idCliente,Gerente gerente) {
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
	
	public boolean adicionarCorretor(Corretor corretor,Gerente gerente) {
		if (corretores.contains(corretor)) {
			//corretor ja existe no sistema
			return false;
		} else {
		return corretores.add(corretor);
		}
	}


	
	public boolean removerCorretor(int idCorretor,Gerente gerente) {
		for (Corretor cor : corretores) {
			if (cor.getId() == idCorretor) {
				cor.desativarCorretor();
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
	

	
	public boolean removerProprietario(Proprietario proprietario,Gerente gerente) {
		for(int i=0;i<proprietario.getImoveis().size();i++)
		{
			this.removerImovel(proprietario.getImoveis().get(i), gerente);
		}
		return proprietarios.remove(proprietario);
	}
	
	public boolean removerProprietario(int idProprietario,Gerente gerente) {
		for(Proprietario pro : proprietarios) {
			if(pro.getId() == idProprietario) {
				for(int i=0;i<pro.getImoveis().size();i++)
				{
					this.removerImovel(pro.getImoveis().get(i), gerente);
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
	

	
	@Override
	public String toString() {
		String out = "***Imobiliaria***";
		out += "*Proprietarios Cadastrados:\n" + auxiliadorToStringProprietarios();
		out += "*Clientes Cadastrados:\n" + auxiliadorToStringClientes();
		out += "*Corretores Cadastrados:\n" + auxiliadorToStringCorretores();
		
		
		return out;
	}
	
}