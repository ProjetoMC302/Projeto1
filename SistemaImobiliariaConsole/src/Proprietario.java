import java.util.ArrayList;

public class Proprietario extends Pessoa{
	
	//Atributos
	private boolean empresa; //O proprietaro e uma empresa
	private ArrayList<Imovel> imoveis;
	
	//Construtores
	public Proprietario(String nome, String telefone, String email) {
		super(nome, telefone, email);
		empresa=false;
		imoveis = new ArrayList<Imovel>();
	}
	
	public Proprietario(String nome, String telefone, String email, boolean empresa) {
		super(nome, telefone, email);
		this.empresa = empresa;
		imoveis = new ArrayList<Imovel>();
	}
	
	public Proprietario(String nome, String telefone, String email, ArrayList<Imovel> im) {
		super(nome, telefone, email);
		empresa = false;
		imoveis = im;
	}
	
	public Proprietario(String nome, String telefone, String email, ArrayList<Imovel> im, boolean empresa) {
		super(nome, telefone, email);
		this.empresa = empresa;
		imoveis = im;
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

	@Override
	public String toString() {
		return "Proprietario ["+super.toString()+"Empresa= " + getEmpresa() + "]";
	}
}
