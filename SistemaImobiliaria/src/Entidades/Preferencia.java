package Entidades;

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
	
	public Preferencia(boolean aluguel,boolean esquina, boolean condominio, Endereco endereco, 
					   double raio, TipoImovel tipoImovel, double areaMinimaTerreno,
					   Restricao proposito) {
		this.esquina = esquina;
		this.condominio = condominio;
		this.endereco = endereco;
		this.raio = raio;
		this.tipoImovel = tipoImovel;
		this.areaMinimaTerreno = areaMinimaTerreno;
		this.proposito = proposito;
		this.aluguel = aluguel;
		
	}
	

	public Preferencia(boolean aluguel ,boolean esquina, boolean condominio, 
					   TipoImovel tipoImovel, double areaMinimaTerreno, 
					   Restricao proposito) {
		this.esquina = esquina;
		this.condominio = condominio;
		this.endereco = new Endereco();
		this.raio = 0;
		this.tipoImovel = tipoImovel;
		this.areaMinimaTerreno = areaMinimaTerreno;
		this.proposito = proposito;
		this.aluguel = aluguel;
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

	private String auxiliadorToStringBooleano(boolean b) {
		String out;
		
		if (b) {
			out = "sim";
		} else {
			out = "nao";
		}
		
		return out;
	}

	@Override
	public String toString() {
		String out = "";
		out += "*Aluguel: " + auxiliadorToStringBooleano(aluguel) +"\n";
		out += "*Esquina: " + auxiliadorToStringBooleano(esquina) +"\n";
		out += "*Condominio: " + auxiliadorToStringBooleano(condominio) + "\n";
		out += "*Endereco de Interesse:\n" + endereco + "\n";
		out += "*Raio de Interesse: " + raio + "\n";
		out += "*Tipo de Imovel Procurado: " + tipoImovel + "\n";
		out += "*Area Minima do Terreno: " + areaMinimaTerreno + "\n";
		out += "*Proposito do Imovel: " + proposito + "\n";
		
		return out;
	}

}
