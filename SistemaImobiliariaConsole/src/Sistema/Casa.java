package Sistema;
import java.util.ArrayList;

/**Casa - essa classe representa a estrutura de uma casa: 
 * os atributos relevantes para um cliente que deseja uma casa
 * */
public class Casa  extends ImovelConstruido {
	//atributo que representa se a casa é de esquina
	private boolean esquina;
	//atributo que representa se a casa tem piscina
	private boolean piscina;
	//area do terreno em que a casa se situa
	private double areaTerreno;
	
	public Casa(int id, Endereco endereco, ArrayList<Restricao> restricoes, Condominio condominio,
			Proprietario proprietario, Corretor corretorResponsavel, String descricao, ArrayList<String> diferenciais,
			ArrayList<FormaPagamento> formasPagamentoAceitas, double preco, double iptu, boolean aluguel,
			TipoImovel tipoImovel, int vagasAutomovel, int quantidadeBanheiros, int quantidadeQuartos,
			int quantidadeAndares, int quantidadeSuites, double areaConstruida, boolean esquina, boolean piscina, double areaTerreno) {
		
		super(id, endereco, restricoes, condominio, proprietario, corretorResponsavel, descricao, diferenciais,
				formasPagamentoAceitas, preco, iptu, aluguel, tipoImovel, vagasAutomovel, quantidadeBanheiros,
				quantidadeQuartos, quantidadeAndares, quantidadeSuites, areaConstruida);
		this.esquina = esquina;
		this.piscina = piscina;
		this.areaTerreno = areaTerreno;
	}

	public Casa(int id, Endereco endereco, Condominio condominio, Proprietario proprietario,
			Corretor corretorResponsavel, String descricao, double preco, double iptu, boolean aluguel,
			TipoImovel tipoImovel, int vagasAutomovel, int quantidadeBanheiros, int quantidadeQuartos,
			int quantidadeAndares, int quantidadeSuites, double areaConstruida, boolean esquina, boolean piscina, double areaTerreno) {
		
		super(id, endereco, condominio, proprietario, corretorResponsavel, descricao, preco, iptu, aluguel, tipoImovel,
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

	//Calcula a area do quintal da casa fazendo a subtração da area do terreno pela area da casa
	public double calculaAreaQuintal() {
		return getAreaTerreno() - getAreaConstruida();
	}

	//Chama o metodo toString da classe superclasse com a adição dos atributos especificos
	@Override
	public String toString() {
		return "Casa [ "+ super.toString() + "Esquina= " + isEsquina() + ", Piscina= " + isPiscina() + ", AreaTerreno= "
				+ getAreaTerreno() + ", calculaAreaQuintal= " + calculaAreaQuintal() + "]";
	}
	
	

	
	
}
