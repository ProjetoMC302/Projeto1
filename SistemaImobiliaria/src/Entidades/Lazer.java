package Entidades;
/**
 * Listagem de opcoes de lazer que um condominio pode oferecer
 * 	a seus residentes.
 */
public enum Lazer {
	ACADEMIA, LAGO, PISCINA, QUADRADEESPORTES, SALAODEJOGOS,
	SALAODEFESTA, CHURRASQUEIRA, SAUNA, PARQUINHO;
	
	@Override
	public String toString() {
		String out = "";
		
		switch (this) {
		
			case ACADEMIA:
				out = "Academia";
				break;
				
			case LAGO:
				out = "Lago";
				break;
				
			case PISCINA:
				out = "Piscina";
				break;
				
			case QUADRADEESPORTES:
				out = "Quadra de Esportes";
				break;
				
			case SALAODEJOGOS:
				out = "Salao de Jogos";
				break;
				
			case SALAODEFESTA:
				out = "Salao de Festa";
				break;
				
			case CHURRASQUEIRA:
				out = "Churrasqueira";
				break;
				
			case SAUNA:
				out = "Sauna";
				break;
				
			case PARQUINHO:
				out = "Parquinho";
				break;
		}
		
		return out;
	}
}
