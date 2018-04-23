import java.util.ArrayList;

public class Proposta {
	private static int geradorId;
	
	//Atributos
	private final int id;
	private final Imovel imovel;
	private final Cliente comprador;
	private final Proprietario vendedor;
	private Corretor corretorResponsavel;
	private ArrayList<Pagamento> formaDePagamento;
	private double precoProposta;
	
	//Construtores
	public Proposta(Imovel imovel, Cliente comprador, Proprietario vendedor, Corretor corretorResponsavel) {
		id = ++geradorId;
		formaDePagamento = new ArrayList<Pagamento>();
		this.imovel = imovel;
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.corretorResponsavel = corretorResponsavel;
	}
	
	public Proposta(Imovel imovel, Cliente comprador, Proprietario vendedor, Corretor corretorResponsavel,
			ArrayList<Pagamento> formaDePagamento, double precoProposta) {
		formaDePagamento = new ArrayList<Pagamento>();
		id = ++geradorId;
		this.imovel = imovel;
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.corretorResponsavel = corretorResponsavel;
		this.formaDePagamento = formaDePagamento;
		this.precoProposta = precoProposta;
	}
	
	//Metodos
	public static int getGeradorId() {
		return geradorId;
	}
	
	public int getId() {
		return id;
	}
	
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

	public Imovel getImovel() {
		return imovel;
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
	
	public void setCorretorResponsavel(Corretor corretor) {
		this.corretorResponsavel = corretor;
	}
	
	private boolean verificarExistenciaPagamento(Pagamento p) { //Verifica se a forma de pagamento existe no ArrayList
		int i;
		int flag = 0; // flag = 0 nao ha a forma de pagamento; flag = 1 ha a forma de pagamento
		for (i = 0; i < formaDePagamento.size(); i++) {
			if (formaDePagamento.get(i).equals(p)) {
				flag = 1; //Encontramos a forma de pagamento p no nosso arrayList
				i = formaDePagamento.size(); //Para a execucao do for
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