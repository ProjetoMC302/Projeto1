package Sistema;
import java.util.ArrayList;

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
	
	public Apartamento(int id, Endereco endereco, ArrayList<Restricao> restricoes, Condominio condominio,
			Proprietario proprietario, Corretor corretorResponsavel, String descricao, ArrayList<String> diferenciais,
			ArrayList<FormaPagamento> formasPagamentoAceitas, double preco, double iptu, boolean aluguel,
			TipoImovel tipoImovel, int vagasAutomovel, int quantidadeBanheiros, int quantidadeQuartos,
			int quantidadeAndares, int quantidadeSuites, double areaConstruida, boolean cobertura, int quantidadeTerraco, 
			int quantidadeQuarto, int andar, boolean elevadorServico, boolean elevadorSocial) {
		
		super(id, endereco, restricoes, condominio, proprietario, corretorResponsavel, descricao, diferenciais,
				formasPagamentoAceitas, preco, iptu, aluguel, tipoImovel, vagasAutomovel, quantidadeBanheiros,
				quantidadeQuartos, quantidadeAndares, quantidadeSuites, areaConstruida);
		
		this.cobertura = cobertura;
		this.quantidadeTerraco = quantidadeTerraco;
		this.andar = andar;
		this.elevadorServico = elevadorServico;
		this.elevadorSocial = elevadorSocial;
	}

	public Apartamento(int id, Endereco endereco, Condominio condominio, Proprietario proprietario,
			Corretor corretorResponsavel, String descricao, double preco, double iptu, boolean aluguel,
			TipoImovel tipoImovel, int vagasAutomovel, int quantidadeBanheiros, int quantidadeQuartos,
			int quantidadeAndares, int quantidadeSuites, double areaConstruida, boolean cobertura, int quantidadeTerraco, 
			int quantidadeQuarto, int andar, boolean elevadorServico, boolean elevadorSocial) {
		
		super(id, endereco, condominio, proprietario, corretorResponsavel, descricao, preco, iptu, aluguel, tipoImovel,
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
	
	//Chama o metodo toString da classe superclasse com a adição dos atributos especificos
	@Override
	public String toString() {
		return "APARTAMENTO:\n"+super.toString()+", Cobertura= " + isCobertura() + ", QuantidadeTerraco= " + getQuantidadeTerraco()
				+ ", Andar= " + getAndar() + ", ElevadorServico= " + isElevadorServico()
				+ ", ElevadorSocial= " + isElevadorSocial() + "]";
	}
}
