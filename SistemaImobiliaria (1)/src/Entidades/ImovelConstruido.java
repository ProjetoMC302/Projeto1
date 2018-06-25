package Entidades;
/**ImovelConstruido - essa classe representa a estrutura de um imovel: imovel que tem em seu terreno alguma construcao habitavel*/
public class ImovelConstruido extends Imovel {
	//numero de vagas para automoveis ou motocicletas
	private int vagasAutomovel;
	private int quantidadeBanheiros;
	private int quantidadeQuartos;
	private int quantidadeAndares;
	private int quantidadeSuites;
	private double areaConstruida;
	

	public ImovelConstruido(Endereco endereco, Condominio condominio, Proprietario proprietario,
							Corretor corretorResponsavel, String descricao, 
							double preco, double iptu, boolean aluguel,
							TipoImovel tipoImovel, int vagasAutomovel, int quantidadeBanheiros, 
							int quantidadeQuartos, int quantidadeAndares,
							int quantidadeSuites, double areaConstruida) {
		super(endereco, condominio, proprietario, corretorResponsavel,
			  descricao, preco, iptu, aluguel, tipoImovel);
		this.vagasAutomovel = vagasAutomovel;
		this.quantidadeBanheiros = quantidadeBanheiros;
		this.quantidadeQuartos = quantidadeQuartos;
		this.quantidadeAndares = quantidadeAndares;
		this.quantidadeSuites = quantidadeSuites;
		this.areaConstruida = areaConstruida;
	}

	public int getVagasAutomovel() {
		return vagasAutomovel;
	}

	public void setVagasAutomovel(int vagasAutomovel) {
		this.vagasAutomovel = vagasAutomovel;
	}

	public int getQuantidadeBanheiros() {
		return quantidadeBanheiros;
	}

	public void setQuantidadeBanheiros(int quantidadeBanheiros) {
		this.quantidadeBanheiros = quantidadeBanheiros;
	}

	public int getQuantidadeQuartos() {
		return quantidadeQuartos;
	}

	public void setQuantidadeQuartos(int quantidadeQuartos) {
		this.quantidadeQuartos = quantidadeQuartos;
	}

	public int getQuantidadeAndares() {
		return quantidadeAndares;
	}

	public void setQuantidadeAndares(int quantidadeAndares) {
		this.quantidadeAndares = quantidadeAndares;
	}

	public int getQuantidadeSuites() {
		return quantidadeSuites;
	}

	public void setQuantidadeSuites(int quantidadeSuites) {
		this.quantidadeSuites = quantidadeSuites;
	}

	public double getAreaConstruida() {
		return areaConstruida;
	}

	public void setAreaConstruida(double areaConstruida) {
		this.areaConstruida = areaConstruida;
	}

	@Override
	public String toString() {
		String out = super.toString();
		out += "*Vagas para Automoveis: " + vagasAutomovel + "\n";
		out += "*Quantidade de Banheiros: " + quantidadeBanheiros + "\n";
		out += "*Quantidade de Quartos: " + quantidadeQuartos + "\n";
		out += "*Quantidade de Andares: " + quantidadeAndares + "\n";
		out += "*Quantidade de Suites: " + quantidadeSuites + "\n";
		out += "*Area Construida: " + areaConstruida + "\n";
		
		return out;
	}
	
	
}