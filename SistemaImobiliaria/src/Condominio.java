/**
 * Esta classe armazena informacoes referentes a um condominio
 * 	em que um imovel pode fazer parte.
 */
import java.util.ArrayList;

public class Condominio {
	private static int geradorId; /* sera utilizado
	   							   * para definir o id
	   							   * de cada objeto instanciado.
	   							   * Nao decresce, mesmo na exclusao
	   							   * de uma das instancias */
	
	private final int id;
	private double valorCondominio;
	private ArrayList<Lazer> lazer;
	
	public Condominio(){
		id = ++geradorId;
		valorCondominio = 0.0;
		lazer = new ArrayList<Lazer>();
	}
	
	public Condominio(double valorCondominio){
		this();
		this.valorCondominio = valorCondominio;
	}
	
	public Condominio(double valorCondominio, Lazer lazer){
		this(valorCondominio);
		this.lazer.add(lazer);
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
			return this.lazer.add(lazer);
		}
		
		return false;
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
			return this.lazer.remove(lazer);
		}
		
		return false;
	}
	
	/**
	 * Os metodos abaixo checam se uma determinada opcao de
	 * 	lazer esta presente no condominio.
	 * @return - true se a opcao estiver presente.
	 * 		   - false se nao estiver presente.
	 */
	public boolean contemAcademia(){
		return lazer.contains(Lazer.ACADEMIA);
	}
	
	public boolean contemLago(){
		return lazer.contains(Lazer.LAGO);
	}
	
	public boolean contemPiscina(){
		return lazer.contains(Lazer.PISCINA);
	}
	
	public boolean contemQuadraDeEsportes(){
		return lazer.contains(Lazer.QUADRADEESPORTES);
	}
	
	public boolean contemSalaoDeJogos(){
		return lazer.contains(Lazer.SALAODEJOGOS);
	}
	
	public boolean contemSalaoDeFesta(){
		return lazer.contains(Lazer.SALAODEFESTA);
	}
	
	public boolean contemChurrasqueira(){
		return lazer.contains(Lazer.CHURRASQUEIRA);
	}
	
	public boolean contemSauna(){
		return lazer.contains(Lazer.SAUNA);
	}
	
	public boolean contemParquinho(){
		return lazer.contains(Lazer.PARQUINHO);
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

	public static int getGeradorId() {
		return geradorId;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString(){
		String out;
		out = "id do condominio: " + id + "\nValor: " +  valorCondominio +
				"\nOpcoes de lazer: ";
		if (lazer.isEmpty()){
			out += "VAZIO\n";
		} else {
			for (int i = 0; i < lazer.size(); i++) {
				out += lazer.get(i) + "\n";
			}
		}
		
		return out;
	}
}
