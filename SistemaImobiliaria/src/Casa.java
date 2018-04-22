
public class Casa  extends ImovelConstruido {
	private boolean esquina;
	private boolean piscina;
	private double areaTerreno;
	
	public Casa(int vagasAutomovel, int quantidadeBanheiros, int quantidadeQuartos, int quantidadeAndares,
			int quantidadeSuites, double areaConstruida, boolean esquina, boolean piscina, double areaTerreno) {
		super(vagasAutomovel, quantidadeBanheiros, quantidadeQuartos, quantidadeAndares, quantidadeSuites, areaConstruida);
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

	public double calculaAreaQuintal() {
		return getAreaTerreno() - getAreaConstruida();
	}

	@Override
	public String toString() {
		return "Casa [ "+ super.toString() + "Esquina= " + isEsquina() + ", Piscina= " + isPiscina() + ", AreaTerreno= "
				+ getAreaTerreno() + ", calculaAreaQuintal= " + calculaAreaQuintal() + "]";
	}
	
	

	
	
}
