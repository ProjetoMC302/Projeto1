public class Proprietario extends Pessoa{
	
	//Atributos
	private boolean empresa; //O proprietaro e uma empresa
	private ArrayList<Imovel> imoveis;
	
	//Construtores
	public Proprietario() {
		imoveis = new ArrayList<Imovel>();
	}
	
	public Proprietario(boolean empresa) {
		imoveis = new ArrayList<Imovel>();
		this.empresa = empresa;
	}
	
	public Proprietario(ArrayList<Imovel> im) {
		imoveis = new ArrayList<Imovel>();
		imoveis = im;
	}
	
	public Proprietario(ArrayList<Imovel> im, boolean empresa) {
		imoveis = new ArrayList<Imovel>();
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
}
