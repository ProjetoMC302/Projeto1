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
		if (imoveis.contains(imovel)) {
			return false;
		} else {
			return imoveis.add(imovel);
		}
	}

	public boolean removerImovel(int idImovel) {
		for (Imovel i : imoveis) {
			if(i.getId() == idImovel) { 
				return imoveis.remove(i);
			}
		}
		return false;
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

	public boolean removerCliente(int idCliente) {
		for(Cliente cli : clientes) {
			if (cli.getId() == idCliente) {
				return clientes.remove(cli);
			}
		}
		return false;
	}
	
	public boolean removerCliente(Cliente cli) {
		return clientes.remove(cli);
	}
	
	public boolean adicionarCorretor(Corretor corretor) {
		if (corretores.contains(corretor)) {
			//corretor ja existe no sistema
			return false;
		} else {
		return corretores.add(corretor);
		}
	}

	/* Este metodo se mostrou necessario pois o corretor eh a unica classe com referencia para suas propostas,
	 * e nao eh desejavel que as propostas se percam na remocao de um corretor*/
	private void copiarPropostasCorretor(Corretor corretor) {
		for (Proposta proposta : corretor.getPropostasEmAberto()) {
			propostasEmAbertoSemCorretor.add(proposta);
		}
		for (Proposta proposta : corretor.getPropostasFinalizadas()) {
			propostasFinalizadasSemCorretor.add(proposta);
		}
	}
	
	public boolean removerCorretor(int idCorretor) {
		for (Corretor cor : corretores) {
			if (cor.getId() == idCorretor) {
				copiarPropostasCorretor(cor);
				return corretores.remove(cor);
			}
		}
		return false;
	}
	
	public boolean removerCorretor(Corretor corretor) {
		if (corretores.contains(corretor)) {
			copiarPropostasCorretor(corretor);
		}
		return corretores.remove(corretor);
	}
	
	public boolean adicionarProprietario(Proprietario proprietario) {
		if (proprietarios.contains(proprietario)) {
				return false;
		} else {
			return proprietarios.add(proprietario);
		}
	}

	public boolean removerProprietario(int idProprietario) {
		for(Proprietario pro : proprietarios) {
			if(pro.getId() == idProprietario) {
				return proprietarios.remove(pro);
			}
		}
		return false;
	}
	
	public boolean designarPropostaCorretor(Corretor corretor,
										    Proposta propostaEmAberto) {
		if (propostasEmAbertoSemCorretor.contains(propostaEmAberto)) {
			Proposta proposta = propostaEmAberto;
			proposta.setCorretorResponsavel(corretor);
			corretor.getPropostasEmAberto().add(proposta);
			return propostasEmAbertoSemCorretor.remove(propostaEmAberto);
		} else {
			return false;
		}
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
	
	public Proposta buscarProposta(Proposta proposta) {
		for (Corretor cor : corretores) {
			
			if (cor.getPropostasEmAberto().contains(proposta)) {
				return cor.getPropostasEmAberto()
						  .get(cor.getPropostasEmAberto().indexOf(proposta));
				
			} if (cor.getPropostasFinalizadas().contains(proposta)) {
				return cor.getPropostasFinalizadas()
						  .get(cor.getPropostasFinalizadas().indexOf(proposta));
			}
		}
		
		return null;
	}
	
	public Proposta buscarProposta(int idProposta) {
		for (Corretor cor : corretores) {
			
			for (Proposta pro : cor.getPropostasEmAberto()) {
				if (pro.getId() == idProposta) {
					return pro;
				}
			}
			
			for (Proposta pro : cor.getPropostasFinalizadas()) {
				if (pro.getId() == idProposta) {
					return pro;
				}
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