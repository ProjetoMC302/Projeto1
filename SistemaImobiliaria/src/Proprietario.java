import java.util.ArrayList;

public class Proprietario extends Pessoa{
	
	//Atributos
	private boolean empresa; //O proprietaro e uma empresa
	private ArrayList<Imovel> imoveis;
	
	//Construtores
	public Proprietario(String nome, String telefone, String email) {
		super(nome, telefone, email);
		imoveis = new ArrayList<Imovel>();
	}
	
	public Proprietario(String nome, String telefone, String email, boolean empresa) {
		super(nome, telefone, email);
		this.empresa = empresa;
	}
	
	public Proprietario(String nome, String telefone, String email, ArrayList<Imovel> im) {
		super(nome, telefone, email);
		imoveis = new ArrayList<Imovel>();
	}
	
	public Proprietario(String nome, String telefone, String email, ArrayList<Imovel> im, boolean empresa) {
		super(nome, telefone, email);
		this.empresa = empresa;
		imoveis = im;
	}

	public Proprietario(String nome, String telefone, String documento, Endereco endereco, String email, boolean empresa) {
		super(nome, telefone, documento, endereco, email);
		this.empresa = empresa;
	}

	//Metodos
	public boolean getEmpresa() {
		return empresa;
	}

	public void setEmpresa(boolean empresa) {
		this.empresa = empresa;
	}

	public ArrayList<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(ArrayList<Imovel> imoveis) {
		this.imoveis = imoveis;
	}
}
