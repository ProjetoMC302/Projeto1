
public class Preferencia {
	private boolean aluguel;
	private boolean esquina;
	private boolean condominio;
	private Endereco endereco;
	private double raio; // O raio define  a área ao redor do endereco dado que o cliente tem interesse
	private TipoImovel tipoImovel;
	private double areaMinimaTerreno;
	private Restricao proposito;
	
	public Preferencia(boolean aluguel, Endereco endereco, double raio, 
					   TipoImovel tipoImovel, double areaMinimaTerreno,
					   Restricao proposito) {
		this.aluguel = aluguel;
		this.endereco = endereco;
		this.raio = raio;
		this.tipoImovel = tipoImovel;
		this.areaMinimaTerreno = areaMinimaTerreno;
		this.proposito = proposito;

		if (this.tipoImovel == TipoImovel.APARTAMENTO) {
			this.condominio = true;
		}
	}
	
	public Preferencia(boolean esquina, boolean condominio, Endereco endereco, 
					   double raio, TipoImovel tipoImovel, double areaMinimaTerreno,
					   Restricao proposito) {
		this.esquina = esquina;
		this.condominio = condominio;
		this.endereco = endereco;
		this.raio = raio;
		this.tipoImovel = tipoImovel;
		this.areaMinimaTerreno = areaMinimaTerreno;
		this.proposito = proposito;
	}
	
	public Preferencia(boolean aluguel,boolean esquina, boolean condominio, 
					   Endereco endereco, double raio, TipoImovel tipoImovel,
					   double areaMinimaTerreno, Restricao proposito) {
		
		this(esquina, condominio, endereco, raio, tipoImovel, areaMinimaTerreno, proposito);
		this.aluguel = aluguel;
	}

	public Preferencia(boolean aluguel ,boolean esquina, boolean condominio, TipoImovel tipoImovel, double areaMinimaTerreno, Restricao proposito) {
		this.esquina = esquina;
		this.condominio = condominio;
		this.endereco = new Endereco();
		this.raio = 0;
		this.tipoImovel = tipoImovel;
		this.areaMinimaTerreno = areaMinimaTerreno;
		this.proposito = proposito;
	}
	public boolean isEsquina() {
		return esquina;
	}


	public void setEsquina(boolean esquina) {
		this.esquina = esquina;
	}


	public boolean isCondominio() {
		return condominio;
	}


	public void setCondominio(boolean condominio) {
		this.condominio = condominio;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}


	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}


	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}


	public double getAreaMinimaTerreno() {
		return areaMinimaTerreno;
	}


	public void setAreaMinimaTerreno(double areaMinimaTerreno) {
		this.areaMinimaTerreno = areaMinimaTerreno;
	}


	public Restricao getProposito() {
		return proposito;
	}


	public void setProposito(Restricao proposito) {
		this.proposito = proposito;
	}
	
	
	public boolean isAluguel() {
		return aluguel;
	}


	public void setAluguel(boolean aluguel) {
		this.aluguel = aluguel;
	}


	public String toString() {
		String preferencia = "";
		preferencia = preferencia + "*Aluguel: " + isAluguel() +"\n";
		preferencia = preferencia + "*Esquina: " + isEsquina() +"\n";
		preferencia = preferencia + "*Condominio: " + isCondominio() + "\n";
		preferencia = preferencia + "*Endereco de interesse:\n" + getEndereco().toString() + "\n";
		preferencia = preferencia + "*Raio de interesse: " + getRaio() + "\n";
		preferencia = preferencia + "*Tipo de imovel procurado: " + getTipoImovel() + "\n";
		preferencia = preferencia + "*Area minima do terreno: " + getAreaMinimaTerreno() + "\n";
		preferencia = preferencia + "*Proposito do imovel " + getProposito() + "\n";
		return preferencia;
	}

}
