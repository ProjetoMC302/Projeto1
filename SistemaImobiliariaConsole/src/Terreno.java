import java.util.ArrayList;

/**Terreno - essa classe representa a estrutura de um terreno: 
 * os atributos relevantes para um cliente que deseja um terreno
 * */
public class Terreno extends Imovel{
	private double areaTerreno;
	//atributo que representa se o terreno é de esquina
	private boolean esquina;
	
	public Terreno(int id, Endereco endereco, ArrayList<Restricao> restricoes, Condominio condominio,
			Proprietario proprietario, Corretor corretorResponsavel, String descricao, ArrayList<String> diferenciais,
			ArrayList<FormaPagamento> formasPagamentoAceitas, double preco, double iptu, boolean aluguel,
			TipoImovel tipoImovel, double areaTerreno, boolean esquina) {
		super(id, endereco, restricoes, condominio, proprietario, corretorResponsavel, descricao, diferenciais,
				formasPagamentoAceitas, preco, iptu, aluguel, tipoImovel);
		this.areaTerreno = areaTerreno;
		this.esquina = esquina;
	}

	public Terreno(int id, Endereco endereco, Condominio condominio, Proprietario proprietario,
			Corretor corretorResponsavel, String descricao, double preco, double iptu, boolean aluguel,
			TipoImovel tipoImovel, double areaTerreno, boolean esquina) {
		super(id, endereco, condominio, proprietario, corretorResponsavel, descricao, preco, iptu, aluguel, tipoImovel);
		this.areaTerreno = areaTerreno;
		this.esquina = esquina;
	}

	public double getAreaTerreno() {
		return areaTerreno;
	}

	public void setAreaTerreno(double areaTerreno) {
		this.areaTerreno = areaTerreno;
	}

	public boolean isEsquina() {
		return esquina;
	}

	public void setEsquina(boolean esquina) {
		this.esquina = esquina;
	}
	
	//Chama o metodo toString da classe superclasse com a adição dos atributos especificos
	@Override
	public String toString() {
		return "Terreno ["+super.toString()+", AreaTerreno= " + getAreaTerreno() + ", Esquina()= " + isEsquina() + "]";
	}
	
	
}
