package Entidades;
public class PreferenciaConstrucao extends Preferencia {
	
	//Atributos
	private double areaMinimaConstruida;
	private int quantidadeBanheiros;
	private int quantidadeQuartos;
	private int quantidadeAndares;
	private int quantidadeSuites;
	
	// Construtores
	public PreferenciaConstrucao(boolean aluguel, boolean esquina, boolean condominio, Endereco endereco, double raio,
			TipoImovel tipoImovel, double areaMinimaTerreno, Restricao proposito) {
		super(aluguel, esquina, condominio, endereco, raio, tipoImovel, areaMinimaTerreno, proposito);
		this.areaMinimaConstruida = 0;
		this.quantidadeBanheiros = 0;
		this.quantidadeQuartos = 0;
		this.quantidadeAndares = 0;
		this.quantidadeSuites = 0;
	}

	public PreferenciaConstrucao(boolean aluguel, boolean esquina, boolean condominio, TipoImovel tipoImovel,
			double areaMinimaTerreno, Restricao proposito) {
		super(aluguel, esquina, condominio, tipoImovel, areaMinimaTerreno, proposito);
		this.areaMinimaConstruida = 0.0;
		this.quantidadeBanheiros = 0;
		this.quantidadeQuartos = 0;
		this.quantidadeAndares = 0;
		this.quantidadeSuites = 0;
	}

	public PreferenciaConstrucao(boolean aluguel, Endereco endereco, double raio, TipoImovel tipoImovel,
			double areaMinimaTerreno, Restricao proposito, double areaMinimaConstruida,
			 int quantidadeBanheiros, int quantidadeQuartos, 
			 int quantidadeAndares, int quantidadeSuites) {
		super(aluguel, endereco, raio, tipoImovel, areaMinimaTerreno, proposito);
		this.areaMinimaConstruida = areaMinimaConstruida;
		this.quantidadeBanheiros = quantidadeBanheiros;
		this.quantidadeQuartos = quantidadeQuartos;
		this.quantidadeAndares = quantidadeAndares;
		this.quantidadeSuites = quantidadeSuites;
	}

	//Metodos
	public double getAreaMinimaConstruida() {
		return areaMinimaConstruida;
	}

	public void setAreaMinimaConstruida(double areaMinimaConstruida) {
		this.areaMinimaConstruida = areaMinimaConstruida;
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
	
	@Override
	public String toString() {
		String out = super.toString();
		out += "*Area Minima Construida: " + areaMinimaConstruida + "\n";
		out += "*Quantidade de Banheiros: " + quantidadeBanheiros + "\n";
		out += "*Quantidade de Quartos: " + quantidadeQuartos + "\n";
		out += "*Quantidade de Suites: " + quantidadeSuites + "\n";
		out += "*Quantidade de andares: " + quantidadeAndares + "\n";
		
		return out;
	}

}