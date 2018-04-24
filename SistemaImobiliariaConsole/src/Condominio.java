/**
 * Esta classe armazena informacoes referentes a um condominio
 * 	em que um imovel pode fazer parte.
 */
import java.util.ArrayList;

public class Condominio {

	private double valorCondominio;
	private ArrayList<Lazer> lazer;
	
	public Condominio(){
		valorCondominio = 0.0;
		lazer = new ArrayList<Lazer>();
	}
	
	public Condominio(double valorCondominio){
		this.valorCondominio = valorCondominio;
		lazer = new ArrayList<Lazer>();
	}
	
	public Condominio(double valorCondominio, ArrayList<Lazer> lazer){
		this.valorCondominio = valorCondominio;
		this.lazer = lazer;
	}
	
	/**
	 * Este metodo adiciona uma opcao de lazer
	 * 	na lista de opcoes que um condominio proporciona.
	 * @param lazer - a opcao de lazer que se quer adicionar.
	 * @return - true caso a opcao nao exista e foi adicionada.
	 * 		   - false se a opcao ja estava na lista.
	 */
	public boolean adicionarLazer(Lazer lazer){
		if (!this.lazer.contains(lazer)) {
			this.lazer.add(lazer);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Este metodo remove uma opcao de lazer
	 * 	na lista de opcoes que um condominio proporciona.
	 * @param lazer - a opcao de lazer que se quer remover.
	 * @return - true caso a opcao exista e foi removida.
	 * 		   - false se a opcao nao existia na lista.
	 */
	public boolean removerLazer(Lazer lazer){
		if (this.lazer.contains(lazer)) {
			this.lazer.remove(lazer);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Os metodos abaixo checam se uma determinada opcao de
	 * 	lazer esta presente no condominio.
	 * @return - true se a opcao estiver presente.
	 * 		   - false se nao estiver presente.
	 */
	public boolean contemLazer(Lazer lazer){
		return this.lazer.contains(lazer);
	}
	
	

	/* bloco de getters e setters. Nao ha setters para atributos
	 * 	referentes a id, pois eles nao devem ser alterados por outras
	 * 	classes */
	public double getValorCondominio() {
		return valorCondominio;
	}

	public void setValorCondominio(double valorCondominio) {
		this.valorCondominio = valorCondominio;
	}

	public ArrayList<Lazer> getLazer() {
		return lazer;
	}

	public void setLazer(ArrayList<Lazer> lazer) {
		this.lazer = lazer;
	}

	
	
	public String toString(){
		String out;
		out = "Id do condominio: " + id + "\nValor: " + 
				String.format("%.2f", valorCondominio) +
				"\nOpcoes de lazer: ";
		if (lazer.isEmpty()){
			out += "VAZIO\n";
		} else {
			out += lazer.toString();
		}
		
		return out;
	}
}
