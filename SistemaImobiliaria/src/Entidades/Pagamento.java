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

	@Override
	public String toString() {
		return "Pagamento []";
	}

	
	
	
}
