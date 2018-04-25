package Entidades;
/**
 * Representa os tipos que um imovel pode assumir.
 */
public enum TipoImovel {
	CASA, APARTAMENTO, TERRENO;
	
	@Override
	public String toString() {
		String out = "";
		
		switch (this) {
			
			case CASA:
				out = "Casa";
				break;
				
			case APARTAMENTO:
				out = "Apartamento";
				break;
				
			case TERRENO:
				out = "Terreno";
				break;
		}
		
		return out;
	}
}
