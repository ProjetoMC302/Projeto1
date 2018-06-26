package Entidades;
import java.util.ArrayList;

public class Proprietario extends Pessoa {
	
	//Atributos
	private boolean empresa; //O proprietaro eh uma empresa
	private ArrayList<Imovel> imoveis;
	
	//Construtores
	public Proprietario(String nome, String telefone, String email) {
		super(nome, telefone, email);
		imoveis = new ArrayList<Imovel>();
	}
	
	public Proprietario(String nome, String telefone, String email, boolean empresa) {
		this(nome, telefone, email);
		this.empresa = empresa;
	}

	public Proprietario(String nome, String telefone, String documento, Endereco endereco, String email, boolean empresa) {
		super(nome, telefone, documento, endereco, email);
		imoveis = new ArrayList<Imovel>();
		this.empresa = empresa;
	}

	public Proprietario(int id, String nome, String telefone, String email, boolean bancoDeDados) {
		super(nome, telefone, email);
		setId(id);
	}
	
	public boolean adicionarImovel(Imovel imovel) {
		if (!imoveis.contains(imovel)) {
			return imoveis.add(imovel);
		}
		
		return false;
	}
	
	public boolean removerImovel(Imovel imovel) {
		return imoveis.remove(imovel);
	}
	
	//Metodos
	public boolean isEmpresa() {
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
	
	private String auxiliadorToStringEmpresa() {
		String out;
		
		if (empresa) {
			out = "sim";
		} else {
			out = "nao";
		}
		
		return out;
	}
	
	private String auxiliadorToStringImoveis() {
		String out = "[ ";
		for (Imovel imv : imoveis) {
			out += imv.getId() + " ";
		}
		out += "]";
		
		return out;
	}
	
	@Override
	public String toString() {
		String out = "***Proprietario***";
		out += super.toString();
		out += "*Empresa: " + auxiliadorToStringEmpresa() + "\n";
		out += "*Imoveis: " + auxiliadorToStringImoveis() + "\n";
		
		return out;
	}
	
}
