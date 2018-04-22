import java.util.ArrayList;


public class Condominio {
	private static int geradorId;
	
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
	
	public Condominio(double valorCondominio, ArrayList<Lazer> lazer){
		id = ++geradorId;
		this.valorCondominio = valorCondominio;
		this.lazer = lazer;
	}
	
	public boolean adicionarLazer(Lazer lazer){
		if (!this.lazer.contains(lazer)) {
			this.lazer.add(lazer);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean removerLazer(Lazer lazer){
		if (this.lazer.contains(lazer)) {
			this.lazer.remove(lazer);
			return true;
		} else {
			return false;
		}
	}
	
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

	/* bloco de getters e setters */
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
	
	public String toString(){
		String out;
		out = "id do condominio: " + id + "\nValor: " + 
				String.format("%.2f", valorCondominio) +
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
