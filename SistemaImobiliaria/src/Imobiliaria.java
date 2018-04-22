import java.util.ArrayList;

/**Essa classe simula um banco de dados que será posteriomente implementado*/
public class Imobiliaria {
	
	private ArrayList<Imovel> imoveis;
	private ArrayList<Cliente> clientes;
	private ArrayList<Corretor> corretores;
	private ArrayList<Proprietario> proprietarios;
	
	public Imobiliaria(){}
	
	/**Metodos de adição e remoção de infomações do banco de dados simulado*/
	
	public boolean adicionarImovel(Imovel imovel) {
		for(int i=0;i<imoveis.size();i++) {
			if(imoveis.get(i)==imovel) {
				//imovel ja existe no sistema
				return false;
			}
		}
		imoveis.add(imovel);
		return true;
	}
	public boolean removerImovel(int idImovel) {
		for(int i=0;i<imoveis.size();i++) {
			if(imoveis.get(i).getId()==idImovel) {
				imoveis.remove(i);
				return true;
			}
		}
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
}