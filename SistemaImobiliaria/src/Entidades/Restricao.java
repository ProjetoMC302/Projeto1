package Entidades;
/**
 * Representa restricoes de uso para um imovel.
 * Pode ser utilizada tanto para representar a restricao
 * 	legal imposta pela prefeitura sobre o imovel ou
 * 	a restricao na preferencia do cliente. 
 */
public enum Restricao {
	RESIDENCIAL, COMERCIAL;
	
	@Override
	public String toString() {
		String out = "";
		
		switch (this) {
		
			case RESIDENCIAL:
				out = "Residencial";
				break;
			
			case COMERCIAL:
				out = "Comercial";
				break;
		}
		
		return out;
	}
}
