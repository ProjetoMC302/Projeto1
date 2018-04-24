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

	public Corretor(String nome, String telefone, String email, String senha, String creci) {
		this(nome, telefone, email);
		this.senha = senha;
		this.creci = creci;
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
		} else {
			return clientes.add(cliente);
		}
	}
	
	public boolean removerCliente(Cliente cliente) {
		return clientes.remove(cliente);
	}
	
	public Proposta criarProposta(Cliente cliente, Proprietario vendedor, Imovel imovel) {
		Proposta proposta = new Proposta(imovel, cliente, vendedor, this);
		propostasEmAberto.add(proposta);
		return proposta;
	}
	
	public boolean finalizarProposta(Proposta proposta) {
		if ((propostasEmAberto.contains(proposta)) && (!propostasFinalizadas.contains(proposta))) {
			propostasFinalizadas.add(proposta);
		}
		
		return propostasEmAberto.remove(proposta);
	}
	
	public boolean removerProposta(Proposta proposta) {
		if (propostasEmAberto.contains(proposta)) {
			return propostasEmAberto.remove(proposta);
		} else if (propostasFinalizadas.contains(proposta)) {
			return propostasFinalizadas.remove(proposta);
		} else {
			return false;
		}
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

	@Override
	public String toString() {
		return "Corretor []";
	}
	
	


}
