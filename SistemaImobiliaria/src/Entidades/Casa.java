package Entidades;
/**Casa - essa classe representa a estrutura de uma casa: 
 * os atributos relevantes para um cliente que deseja uma casa
 * */
public class Casa  extends ImovelConstruido {
	//atributo que representa se a casa eh de esquina
	private boolean esquina;
	//atributo que representa se a casa tem piscina
	private boolean piscina;
	//area do terreno em que a casa se situa
	private double areaTerreno;
	

	public Casa(Endereco endereco, Condominio condominio, Proprietario proprietario,
			Corretor corretorResponsavel, String descricao, double preco, double iptu, 
			boolean aluguel, TipoImovel tipoImovel, int vagasAutomovel, int quantidadeBanheiros, 
			int quantidadeQuartos, int quantidadeAndares, int quantidadeSuites, 
			double areaConstruida, boolean esquina, boolean piscina, double areaTerreno) {
		
		super(endereco, condominio, proprietario, corretorResponsavel, descricao, preco, iptu, aluguel, tipoImovel,
				vagasAutomovel, quantidadeBanheiros, quantidadeQuartos, quantidadeAndares, quantidadeSuites, areaConstruida);
		this.esquina = esquina;
		this.piscina = piscina;
		this.areaTerreno = areaTerreno;
	}

	public boolean isEsquina() {
		return esquina;
	}

	public void setEsquina(boolean esquina) {
		this.esquina = esquina;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public double getAreaTerreno() {
		return areaTerreno;
	}

	public void setAreaTerreno(double areaTerreno) {
		this.areaTerreno = areaTerreno;
	}

	//Calcula a area do quintal da casa fazendo a subtra��o da area do terreno pela area da casa
	public double calculaAreaQuintal() {
		return getAreaTerreno() - getAreaConstruida();
	}
	
	private String auxiliarBooleano(boolean valor) {
		String out;
		
		if (valor) {
			out = "sim";
		} else {
			out = "nao";
		}
		
		return out;
	}

	//Chama o metodo toString da classe superclasse com a adi��o dos atributos especificos
	@Override
	public String toString() {
		String out = super.toString();
		out += "*Esquina: " + auxiliarBooleano(esquina) + "\n";
		out += "*Piscina: " + auxiliarBooleano(piscina) + "\n";
		out += "*Area do Terreno: " + areaTerreno + "\n";
		out += "*Area do Quintal: " + calculaAreaQuintal() + "\n";

		return out;
	}
	
}
