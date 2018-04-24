package Sistema;
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
	private boolean status;
	
	//Construtores
	
	public Proposta(Imovel imovel, Cliente comprador, Proprietario vendedor, Corretor corretorResponsavel, double precoProposta) {
		formaDePagamento = new ArrayList<Pagamento>();
		id = ++geradorId;
		this.imovel = imovel;
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.corretorResponsavel = corretorResponsavel;
		this.precoProposta = precoProposta;
		this.status=true;
	}
	
	//Metodos
	
	
	
	public int getId() {
		return id;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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
	
	
	private boolean verificarExistenciaPagamento(Pagamento p) { //Verifica se a forma de pagamento existe no ArrayList
		 return this.formaDePagamento.contains(p);
			
	}
	
	public boolean adicionarPagamento(Pagamento p) {
		if (verificarExistenciaPagamento(p)) {
			return false;
		}
		else {
			this.formaDePagamento.add(p);
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
