public class Proposta {
	
	//Atributos
	private final int idImovel;
	private final Cliente comprador;
	private final Proprietario vendedor;
	private final Corretor corretorResponsavel;
	private ArrayList<Pagamento> formaDePagamento;
	private double precoProposta;
	
	//Construtores
	public Proposta(int idImovel, Cliente comprador, Proprietario vendedor, Corretor corretorResponsavel) {
		formaDePagamento = new ArrayList<Pagamento>();
		this.idImovel = idImovel;
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.corretorResponsavel = corretorResponsavel;
	}
	
	public Proposta(int idImovel, Cliente comprador, Proprietario vendedor, Corretor corretorResponsavel,
			ArrayList<Pagamento> formaDePagamento, double precoProposta) {
		formaDePagamento = new ArrayList<Pagamento>();
		this.idImovel = idImovel;
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.corretorResponsavel = corretorResponsavel;
		this.formaDePagamento = formaDePagamento;
		this.precoProposta = precoProposta;
	}
	
	//Metodos
	public ArrayList<Pagamento> getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(ArrayList<Pagamento> formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public double getPrecoProposta() {
		return precoProposta;
	}

	public void setPrecoProposta(double precoProposta) {
		this.precoProposta = precoProposta;
	}

	public int getIdImovel() {
		return idImovel;
	}

	public Cliente getComprador() {
		return comprador;
	}

	public Proprietario getVendedor() {
		return vendedor;
	}

	public Corretor getCorretorResponsavel() {
		return corretorResponsavel;
	}
	
	private boolean verificarExistenciaPagamento(Pagamento p) { //Verifica se a forma de pagamento existe no arrayList
		int i;
		int flag = 0; // flag = 0 não há a forma de pagamento; flag = 1 há a forma de pagamento
		for (i = 0; i < formaDePagamento.size(); i++) {
			if (formaDePagamento.get(i).equals(p)) {
				flag = 1; //Encontramos a forma de pagamento p no nosso arrayList
				i = formaDePagamento.size(); //Para a execução do for
			}
		}
		if (flag == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean adicionarPagamento(Pagamento p) {
		if (verificarExistenciaPagamento(p)) {
			return false;
		}
		else {
			formaDePagamento.add(p);
			return true;
		}
	}
	
	public boolean removerPagamento(Pagamento p) {
		if (verificarExistenciaPagamento(p)) {
			formaDePagamento.remove(p);
			return true;
		}
		else {
			return false;
		}
	}
}
