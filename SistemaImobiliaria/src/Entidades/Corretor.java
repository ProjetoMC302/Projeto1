package Entidades;
import java.util.ArrayList;

public class Corretor extends Pessoa {
	private String senha;
	private String creci;
	private ArrayList<Imovel> imoveis;
	private ArrayList<Cliente> clientes;
	private ArrayList<Proposta> propostasEmAberto;
	private ArrayList<Proposta> propostasFinalizadas;

	public Corretor(String nome, String telefone, String email) {
		super(nome, telefone, email);
		imoveis = new ArrayList<Imovel>();
		clientes = new ArrayList<Cliente>();
		propostasEmAberto = new ArrayList<Proposta>();
		propostasFinalizadas = new ArrayList<Proposta>();
	}

	public Corretor(String nome, String telefone, String documento, Endereco endereco, String email, String senha ,String creci) {
		super(nome, telefone, documento, endereco, email);
		this.senha = senha;
		this.creci = creci;
		imoveis = new ArrayList<Imovel>();
		clientes = new ArrayList<Cliente>();
		propostasEmAberto = new ArrayList<Proposta>();
		propostasFinalizadas = new ArrayList<Proposta>();
	}

	public int numeroDeImoveis() {
		return imoveis.size();
	}
	
	public boolean adicionarImovel(Imovel imovel) {
		if ((!imoveis.contains(imovel)) && imovel.getCorretorResponsavel() == this) {
			return imoveis.add(imovel);
		} else {
			return false;
		}
	}
	
	public boolean removerImovel(Imovel imovel) {
		return imoveis.remove(imovel);
	}
	
	public boolean adicionarCliente(Cliente cliente) {
		if (clientes.contains(cliente)) {
			return false;
		}
		
		return clientes.add(cliente);
	}
	
	public boolean removerCliente(Cliente cliente) {
		return clientes.remove(cliente);
	}
	
	public Proposta criarProposta(Cliente cliente, Imovel imovel) {
		Proposta proposta = new Proposta(imovel, cliente, this);
		propostasEmAberto.add(proposta);
		return proposta;
	}
	
	public Proposta criarProposta(Cliente cliente, Imovel imovel, double precoProposta) {
		Proposta proposta = new Proposta(imovel, cliente, this, precoProposta);
		propostasEmAberto.add(proposta);
		return proposta;
	}
	
	public boolean finalizarProposta(Proposta proposta) {
		// caso a proposta exista como propostaEmAberto e não esteja no AL de propostasFinalizadas
		boolean logica = propostasEmAberto.contains(proposta) && !propostasFinalizadas.contains(proposta);
		if (logica) {
			propostasFinalizadas.add(proposta);
		}
		
		return propostasEmAberto.remove(proposta);
	}
	
	public boolean removerProposta(Proposta proposta) {
		if (propostasEmAberto.contains(proposta)) {
			return propostasEmAberto.remove(proposta);
		}
		
		if (propostasFinalizadas.contains(proposta)) {
			return propostasFinalizadas.remove(proposta);
		}
		
		return false;
	}
	
	// Adiciona imovel ao banco de dados
	public Imovel publicarImovel(Imovel imovel, Imobiliaria imobiliaria) {
			imobiliaria.adicionarImovel(imovel);
			this.adicionarImovel(imovel);
			
			return imovel;
	}
	
	public String listarPropostasCorretor() {
		String out = "***Propostas Em Aberto***\n";
		for (Proposta propos : propostasEmAberto) {
			out += "****************";
			out += propos;
		}
		out += "\n***Propostas Finalizadas***\n";
		for (Proposta propos : propostasFinalizadas) {
			out += "****************";
			out += propos;
		}		
		return out;
	}


	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCreci() {
		return creci;
	}

	public void setCreci(String creci) {
		this.creci = creci;
	}

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

	public ArrayList<Proposta> getPropostasEmAberto() {
		return propostasEmAberto;
	}

	public void setPropostasEmAberto(ArrayList<Proposta> propostasEmAberto) {
		this.propostasEmAberto = propostasEmAberto;
	}

	public ArrayList<Proposta> getPropostasFinalizadas() {
		return propostasFinalizadas;
	}

	public void setPropostasFinalizadas(ArrayList<Proposta> propostasFinalizadas) {
		this.propostasFinalizadas = propostasFinalizadas;
	}
	
	private String auxiliadorToStringImoveis() {
		String out = "[ ";
		for (Imovel imv : imoveis) {
			out += imv.getId() + " ";
		}
		out += "]";
		
		return out;
	}
	
	private String auxiliadorToStringClientes() {
		String out = "[ ";
		for (Cliente cli : clientes) {
			out += cli.getId() + " ";
		}
		out += "]";
		
		return out;
	}
	
	private String auxiliadorToStringPropostasEmAberto() {
		String out = "[ ";
		for (Proposta pro : propostasEmAberto) {
			out += pro.getId() + " ";
		}
		out += "]";
		
		return out;
	}
	
	private String auxiliadorToStringPropostasFinalizadas() {
		String out = "[ ";
		for (Proposta pro : propostasFinalizadas) {
			out += pro.getId() + " ";
		}
		out += "]";
		
		return out;
	}
	
	@Override
	public String toString() {
		String out = "";
		out += "**Corretor** \n";
		out += 	super.toString();
		out += "*Creci: "+ creci + "\n";
		out += "*Quantidade de imoveis sob responsabilidade: " + numeroDeImoveis() +"\n"; 
		out += "*Imoveis: " + auxiliadorToStringImoveis() + "\n"; 
		out += "*Clientes: " + auxiliadorToStringClientes() + "\n"; 
		out += "*Propostas Em Aberto: " + auxiliadorToStringPropostasEmAberto() + "\n";
		out += "\n*Propostas Finalizadas: " + auxiliadorToStringPropostasFinalizadas() + "\n";
	
		return out;
	}	
}
