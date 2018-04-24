import java.util.ArrayList;

/** Essa classe simula um banco de dados que sera posteriomente implementado*/
public class Imobiliaria {
	
	private ArrayList<Imovel> imoveis;
	private ArrayList<Cliente> clientes;
	private ArrayList<Corretor> corretores;
	private ArrayList<Proprietario> proprietarios;
	/* 
	 * As propostas precisam ser registradas para nao perder
	 * o endereco delas, que sao agregadas ao corretor
	 */ 
	private ArrayList<Proposta> propostasEmAbertoSemCorretor;
	private ArrayList<Proposta> propostasFinalizadasSemCorretor;
	
	public Imobiliaria(){
		imoveis = new ArrayList<Imovel>();
		clientes = new ArrayList<Cliente>();
		corretores = new ArrayList<Corretor>();
		proprietarios = new ArrayList<Proprietario>();
		propostasEmAbertoSemCorretor = new ArrayList<Proposta>();
		propostasFinalizadasSemCorretor = new ArrayList<Proposta>();
	}
	
	/**Metodos de adicao e remocao de infomacoes do banco de dados simulado*/
	
	public boolean adicionarImovel(Imovel imovel) {
		return imoveis.add(imovel);
	}

	public boolean removerImovel(Imovel omovel) {
		return imoveis.remove(imoveis);
	}
	
	public boolean removerImovel(int idImovel) {
		for (Imovel imovel : imoveis) {
			if(imovel.getId()==idImovel) {
				return imoveis.remove(imovel);
			}
		}
		return false;
	}
	
	public boolean adicionarCliente(Cliente cliente) {
		return clientes.add(cliente);
	}

	public boolean removerCliente(Cliente cliente) {
		return clientes.remove(cliente);
	}
	
	public boolean removerCliente(int idCliente) {
		for (Cliente cliente : clientes) {
			if(cliente.getId()==idCliente) {
				return clientes.remove(cliente);
			}
		}
		return false;
	}
	
	public boolean adicionarCorretor(Corretor corretor) {
		return corretores.add(corretor);
	}

	public boolean removercorretor(Corretor corretor) {
		return corretores.remove(corretor);
	}
	
	public boolean removercorretor(int idCorretor) {
		for (Corretor corretor : corretores) {
			if(corretor.getId()==idCorretor) {
				return corretores.remove(corretor);
			}
		}
		return false;
	}
	
	public boolean adicionarProprietario(Proprietario proprietario) {
		return proprietarios.add(proprietario);
	}

	public boolean removerProprietario(Proprietario proprietario) {
		return proprietarios.remove(proprietario);
	}
	
	public boolean removerProprietario(int idProprietario) {
		for (Proprietario proprietario : proprietarios) {
			if(proprietario.getId()==idProprietario) {
				return proprietarios.remove(proprietario);
			}
		}
		return false;
	}
	
	public void designarPropostaCorretor(Corretor corretor,
										 Proposta propostaEmAberto) {
		Proposta proposta = propostaEmAberto;
		proposta.setCorretorResponsavel(corretor);
		corretor.getPropostasEmAberto().add(proposta);
		propostasEmAbertoSemCorretor.remove(propostaEmAberto);
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

	public ArrayList<Proposta> getPropostasEmAbertoSemCorretor() {
		return propostasEmAbertoSemCorretor;
	}

	public void setPropostasEmAbertoSemCorretor(
			ArrayList<Proposta> propostasEmAbertoSemCorretor) {
		this.propostasEmAbertoSemCorretor = propostasEmAbertoSemCorretor;
	}

	public ArrayList<Proposta> getPropostasFinalizadasSemCorretor() {
		return propostasFinalizadasSemCorretor;
	}

	public void setPropostasFinalizadasSemCorretor(
			ArrayList<Proposta> propostasFinalizadasSemCorretor) {
		this.propostasFinalizadasSemCorretor = propostasFinalizadasSemCorretor;
	}
	
}