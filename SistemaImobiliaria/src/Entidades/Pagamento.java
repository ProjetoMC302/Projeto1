package Entidades;

public class Pagamento {
	private double valorCombinado;
	private FormaPagamento formaPagamento;

	public Pagamento(double valorCombinado, FormaPagamento formaPagamento) {
		this.valorCombinado = valorCombinado;
		this.formaPagamento = formaPagamento;
	}

	public double getValorCombinado() {
		return valorCombinado;
	}

	public void setValorCombinado(double valorCombinado) {
		this.valorCombinado = valorCombinado;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	private String auxiliarValorCombinado() {
		return "R$" + String.format("%.2f", valorCombinado);
	}

	@Override
	public String toString() {
		String out = "";
		out += "*Valor Combinado: " + auxiliarValorCombinado() + "\n";
		out += "*Forma de Pagamento: " + formaPagamento + "\n";
		
		return out;
	}

	
	
	
}
