
public class Pessoa {
	private static int geradorId;
	
	private int id;
	private String nome;
	private String telefone;
	private String documento;
	private Endereco endereco;
	private String email;
	
	public Pessoa(String nome, String telefone, String email) {
		super();
		id = ++geradorId;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Pessoa(String nome, String telefone, String documento, Endereco endereco, String email) {
		this(nome, telefone, email);
		this.documento = documento;
		this.endereco = endereco;
	}
	
	
	
	public static int getGeradorId() {
		return geradorId;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String toString() {
		String pessoa="Nome: "+getNome()+"\n";
		pessoa=pessoa+"Documento:"+getDocumento()+"\n";
		pessoa=pessoa+"Endereco:\n"+getEndereco().toString()+"\n";
		pessoa=pessoa+"Email:"+getEmail()+"\n";
		
		return pessoa;
	}
	
	
	
	

}
