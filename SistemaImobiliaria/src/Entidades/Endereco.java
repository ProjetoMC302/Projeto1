package Entidades;
/**
 * Endereco eh uma classe que armazena informacoes
 * 	de endereco de um imovel.
 */
public class Endereco {
	private static int geradorId; /* sera utilizado
								   * para definir o id
								   * de cada objeto instanciado.
								   * Nao decresce, mesmo na exclusao
								   * de uma das instancias */
	
	private final int id;
	private int cep;
	private String estado;
	private String cidade;
	private String rua;
	private String bairro;
	private int numero;
	private String complemento;
	
	public Endereco() {
		id = ++geradorId; /* define valor de id e atualiza
		 				   * o geradorId para o valor da proxima
		 				   * instancia */
		cep = 0;
		estado = "VAZIO";
		cidade = "VAZIO";
		rua = "VAZIO";
		bairro = "VAZIO";
		numero = 0;
		complemento = "VAZIO";
	}
	
	public Endereco(int cep, String estado, String cidade,
					String rua, String bairro, int numero){
		this();
		this.cep = cep;
		this.estado = estado;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
	}
	
	public Endereco(int cep, String estado, String cidade,
					String rua, String bairro, int numero,
					String complemento){
		this(cep, estado, cidade, rua, bairro, numero);
		this.complemento = complemento;
	}
	
	/* bloco de getters e setters. Nao ha setters para atributos
	 * 	referentes a id, pois eles nao devem ser alterados por outras
	 * 	classes */
	public static int getGeradorId() {
		return geradorId;
	}
	
	public int getId() {
		return id;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	/**
	 * O toString desta classe retorna o endereco num formato
	 * 	semelhante ao de o encontrado em uma carta. 
	 */
	@Override
	public String toString(){
		String out = "";
		out += "*Rua: " + rua + "\n*Numero " + numero + "\n";
		out += "*Complemento: " + complemento + "\n";
		out += "*Cidade: " + cidade + "\n*Estado: " + estado + "\n";
		out += "*Bairro" + bairro + "\n" + "*CEP: " + cep + "\n";

		return out;
	}
	
}