/**Terreno - essa classe representa a estrutura de um terreno: 
 * os atributos relevantes para um cliente que deseja um terreno
 * */
public class Terreno /*TODO: uncomment this - extends Imovel*/{
	private double areaTerreno;
	//atributo que representa se o terreno é de esquina
	private boolean esquina;
	
	//TODO: add to the constructor the structure of the super class Imovel
	public Terreno(double areaTerreno, boolean esquina) {
		//TODO: uncoment this super(Atibutes of super class Imovel);
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
