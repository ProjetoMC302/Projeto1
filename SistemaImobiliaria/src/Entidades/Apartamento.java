package Entidades;
/**Apartamento - essa classe representa a estrutura de um apartamento: 
 * os atributos relevantes para um cliente que deseja um apartamento
 * */
public class Apartamento extends ImovelConstruido {

	private boolean cobertura;
	private int quantidadeTerraco;
	// atributo que representa em qual andar o apartamento se situa
	private int andar;
	// atributo que representa a existencia de elevador de servicio no predio do apartamento
	private boolean elevadorServico; 
	// atributo que representa a existencia de elevador social no predio do apartamento
	private boolean elevadorSocial;

	public Apartamento( Endereco endereco, Condominio condominio, Proprietario proprietario,
			Corretor corretorResponsavel, String descricao, double preco, double iptu, boolean aluguel,
			TipoImovel tipoImovel, int vagasAutomovel, int quantidadeBanheiros, int quantidadeQuartos,
			int quantidadeAndares, int quantidadeSuites, double areaConstruida, boolean cobertura, int quantidadeTerraco, 
			int quantidadeQuarto, int andar, boolean elevadorServico, boolean elevadorSocial) {
		
		super(endereco, condominio, proprietario, corretorResponsavel, descricao, preco, iptu, aluguel, tipoImovel,
				vagasAutomovel, quantidadeBanheiros, quantidadeQuartos, quantidadeAndares, quantidadeSuites, areaConstruida);
		
		this.cobertura = cobertura;
		this.quantidadeTerraco = quantidadeTerraco;
		this.andar = andar;
		this.elevadorServico = elevadorServico;
		this.elevadorSocial = elevadorSocial;
	}

	public boolean isCobertura() {
		return cobertura;
	}

	public void setCobertura(boolean cobertura) {
		this.cobertura = cobertura;
	}

	public int getQuantidadeTerraco() {
		return quantidadeTerraco;
	}

	public void setQuantidadeTerraco(int quantidadeTerraco) {
		this.quantidadeTerraco = quantidadeTerraco;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public boolean isElevadorServico() {
		return elevadorServico;
		
	}

	public void setElevadorServico(boolean elevadorServico) {
		this.elevadorServico = elevadorServico;
	}

	public boolean isElevadorSocial() {
		return elevadorSocial;
	}

	public void setElevadorSocial(boolean elevadorSocial) {
		this.elevadorSocial = elevadorSocial;
	}
	
	private String auxiliadorToStringBooleano(boolean valor) {
		String out;
		
		if (valor) {
			out = "sim";
		} else {
			out = "nao";
		}
		
		return out;
	}
	
	//Chama o metodo toString da classe superclasse com a adicao dos atributos especificos
	@Override
	public String toString() {
		String out = super.toString();
		out += "*Andar: " + andar + "\n";
		out += "*Cobertura: " + auxiliadorToStringBooleano(cobertura) + "\n";
		out += "*Elevador Social: " + auxiliadorToStringBooleano(elevadorSocial) + "\n";
		out += "*Elevador de Servico: " + auxiliadorToStringBooleano(elevadorServico) + "\n";
		out += "*Quantidade de Terraco(s): " + quantidadeTerraco + "\n";
		
		return out;
	}
}
