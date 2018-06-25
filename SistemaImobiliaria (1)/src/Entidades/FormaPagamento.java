package Entidades;
/**
 * Representa as formas de pagamento que podem estar relacionadas
 * 	a compra/alugel de um imovel.
 */
public enum FormaPagamento {
	FINANCIAMENTO, PERMUTA, AVISTA;
	
	@Override
	public String toString() {
		String out = "";
		
		switch (this) {
		
			case FINANCIAMENTO:
				out = "Financiamento";
				break;
				
			case PERMUTA:
				out = "Permuta";
				break;
				
			case AVISTA:
				out = "A Vista";
				break;
		}
		
		return out;
	}
}
