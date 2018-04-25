import java.util.ArrayList;

public class Proprietario extends Pessoa {
	
	//Atributos
	private boolean empresa; //O proprietaro eh uma empresa
	private ArrayList<Imovel> imoveis;
	
	//Construtores
	public Proprietario(String nome, String telefone, String email) {
		super(nome, telefone, email);
		imoveis = new ArrayList<Imovel>();
	}
	
	public Proprietario(String nome, String telefone, String email, boolean empresa) {
		this(nome, telefone, email);
		this.empresa = empresa;
	}

	public Proprietario(String nome, String telefone, String documento, Endereco endereco, String email, boolean empresa) {
		super(nome, telefone, documento, endereco, email);
		imoveis = new ArrayList<Imovel>();
		this.empresa = empresa;
	}
	
	public boolean adicionarImovel(Imovel imovel) {
		if (!imoveis.contains(imovel)) {
			return imoveis.add(imovel);
		}
		
		return false;
	}
	
	public boolean removerImovel(Imovel imovel) {
		return imoveis.remove(imovel);
	}
	
	// Cria instância de Imovel e faz as conexoes necessarias
	public Imovel publicarImovel(Endereco endereco, Condominio condominio, 
								 Corretor corretorResponsavel, String descricao,
								 double preco, double iptu, boolean aluguel,
								 TipoImovel tipoImovel, Imobiliaria imobiliaria) {
		Imovel imovel = new Imovel(endereco, condominio, this, 
								   corretorResponsavel, descricao, 
								   preco, iptu, aluguel, tipoImovel);
		imobiliaria.adicionarImovel(imovel);
		this.adicionarImovel(imovel);
		
		return imovel;
	}

	//Metodos
	public boolean isEmpresa() {
		return empresa;
	}

	public void setEmpresa(boolean empresa) {
		this.empresa = empresa;
	}

	public ArrayList<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(ArrayList<Imovel> imoveis) {
		this.imoveis = imoveis;
	}
	
}
