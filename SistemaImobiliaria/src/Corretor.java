import java.util.ArrayList;

public class Corretor {
	private String senha;
	private String creci;
	private ArrayList<Imovel> imoveis;
	private ArrayList<Cliente> clientes;
	private ArrayList<Proposta> propostasEmAberto;
	private ArrayList<Proposta> propostasFinalizadas;
	
	public Corretor() { }

	public Corretor(String senha, String creci, ArrayList<Imovel> imoveis, ArrayList<Cliente> clientes,
			ArrayList<Proposta> propostasEmAberto, ArrayList<Proposta> propostasFinalizadas) {
		super();
		this.senha = senha;
		this.creci = creci;
		this.imoveis = imoveis;
		this.clientes = clientes;
		this.propostasEmAberto = propostasEmAberto;
		this.propostasFinalizadas = propostasFinalizadas;
	}

	public Corretor(String senha, String creci) {
		super();
		this.senha = senha;
		this.creci = creci;
	}
	
	public int numeroDeImoveis() {
		return imoveis.size();
	}
	
	public boolean adicionarCliente(Cliente cliente) {
		return clientes.add(cliente);
	}
	
	public boolean removerCliente(Cliente cliente) {
		return clientes.remove(cliente);
	}
	
	public Proposta criarProposta(Cliente cliente, Proprietario vendedor, Imovel imovel) {
		return new Proposta(imovel, cliente, vendedor, this);
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
