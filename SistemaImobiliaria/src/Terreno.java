/**Terreno - essa classe representa a estrutura de um terreno: 
 * os atributos relevantes para um cliente que deseja um terreno
 * */
public class Terreno extends Imovel{
	private double areaTerreno;
	//atributo que representa se o terreno � de esquina
	private boolean esquina;
	

	public Terreno( Endereco endereco, Condominio condominio, Proprietario proprietario,
			Corretor corretorResponsavel, String descricao, double preco, double iptu, boolean aluguel,
			TipoImovel tipoImovel, double areaTerreno, boolean esquina) {
		super(endereco, condominio, proprietario, corretorResponsavel, descricao, preco, iptu, aluguel, tipoImovel);
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
	
	//Chama o metodo toString da classe superclasse com a adi��o dos atributos especificos
	@Override
	public String toString() {
		return "Terreno ["+super.toString()+", AreaTerreno= " + getAreaTerreno() + ", Esquina()= " + isEsquina() + "]";
	}
	
	
}
