import java.util.ArrayList;

public class Corretor extends Pessoa {
	private String senha;
	private String creci;
	private ArrayList<Imovel> imoveis;
	private ArrayList<Cliente> clientes;
	private ArrayList<Proposta> propostasEmAberto;
	private ArrayList<Proposta> propostasFinalizadas;
// retirar proposta aberta e fechada e juntar tudo
	public Corretor(String nome, String telefone, String email) {
		super(nome, telefone, email);
		
	}

	public Corretor(String nome, String telefone, String email, String senha, String creci, ArrayList<Imovel> imoveis, ArrayList<Cliente> clientes,
			ArrayList<Proposta> propostasEmAberto, ArrayList<Proposta> propostasFinalizadas) {
		super(nome, telefone, email);
		this.senha = senha;
		this.creci = creci;
		this.imoveis = imoveis;
		this.clientes = clientes;
		this.propostasEmAberto = propostasEmAberto;
		this.propostasFinalizadas = propostasFinalizadas;
	}
	//criar construtor que não recebe o array list ou seja um construtor inicializando o array

	public Corretor(String nome, String telefone, String email, String senha, String creci) {
		super(nome, telefone, email);
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
	//remover com id
	
	public Proposta criarProposta(Imovel imovel, Cliente comprador, Proprietario vendedor, Corretor corretorResponsavel, double precoProposta) {
		
		return new Proposta(imovel, comprador, vendedor, this,precoProposta);
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

	//criar função que leva a proposta de aberta para fechada 
	
	
	@Override
	public String toString() {
		return "Corretor ["+super.toString()+"numeroDeImoveis= " + numeroDeImoveis() + ", Creci= "
				+ getCreci() + ", Imoveis= " + getImoveis() + ", Clientes= " + getClientes()
				+ ", PropostasEmAberto= " + getPropostasEmAberto() + ", PropostasFinalizadas= "
				+ getPropostasFinalizadas() + "]";
	}	
}
