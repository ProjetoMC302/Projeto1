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
		for (Imovel i : imoveis)
			if (i.getId() == imovel.getId())
				return false;
		return imoveis.add(imovel);
	}

	public boolean removerImovel(int idImovel) {
		for (Imovel i : imoveis)
			if(i.getId() == idImovel) 
				return imoveis.remove(i);
		return false;
	}
	
	public boolean adicionarCliente(Cliente cliente) {
		for(int i=0;i<clientes.size();i++) {
			if(clientes.get(i)==cliente) {
				//cliente ja existe no sistema
				return false;
			}
		}
		clientes.add(cliente);
		return true;
	}

	public boolean removerCliente(int idCliente) {
		for(int i=0;i<clientes.size();i++) {
			if(clientes.get(i).getId()==idCliente) {
				clientes.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean adicionarCorretor(Corretor corretor) {
		for(int i=0;i<corretores.size();i++) {
			if(corretores.get(i)==corretor) {
				//corretor ja existe no sistema
				return false;
			}
		}
		corretores.add(corretor);
		return true;
	}

	public boolean removercorretor(int idCorretor) {
		for(int i=0;i<corretores.size();i++) {
			if(corretores.get(i).getId()==idCorretor){
				for (Proposta proposta : corretores.get(i)
										.getPropostasEmAberto()) {
					propostasEmAbertoSemCorretor.add(proposta);
				}
				for (Proposta proposta : corretores.get(i)
										 .getPropostasFinalizadas()) {
					propostasFinalizadasSemCorretor.add(proposta);
				}
				corretores.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean adicionarProprietario(Proprietario proprietario) {
		for(int i=0;i<proprietarios.size();i++) {
			if(proprietarios.get(i)==proprietario) {
				//imovel ja existe no sistema
				return false;
			}
		}
		proprietarios.add(proprietario);
		return true;
	}

	public boolean removerProprietario(int idProprietario) {
		for(int i=0;i<proprietarios.size();i++) {
			if(proprietarios.get(i).getId()==idProprietario) {
				proprietarios.remove(i);
				return true;
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