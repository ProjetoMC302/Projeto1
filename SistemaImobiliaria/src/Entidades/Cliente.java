package Entidades;

import java.util.ArrayList;

public class Cliente extends Pessoa {

	/*
	 * private RegiaoProcurada regiao Procurada;  
	 * Ficamos de implementar regiao procurada na proxima etapa ?
	 */

	private double precoMax;
	private ArrayList <FormaPagamento> formasPagamentoDesejadas;
	private ArrayList <Preferencia> preferencias;


	public Cliente(String nome, String telefone, String email, double precoMax, Preferencia preferencia) {
		super(nome, telefone, email);
		this.precoMax = precoMax;
		formasPagamentoDesejadas = new ArrayList<FormaPagamento>();
		preferencias = new ArrayList<Preferencia>();
		preferencias.add(preferencia);
	}

	public Cliente(String nome, String telefone,String documento, Endereco endereco, String email,
				   double precoMax, Preferencia preferencia) {
		super(nome, telefone,documento,endereco, email);
		this.precoMax = precoMax;
		formasPagamentoDesejadas = new ArrayList<FormaPagamento>();
		preferencias = new ArrayList<Preferencia>();
		preferencias.add(preferencia);
	}

	public double getPrecoMax() {
		return precoMax;
	}

	public void setPrecoMax(double precoMax) {
		this.precoMax = precoMax;
	}

	public ArrayList<FormaPagamento> getFormasPagamentoDesejadas() {
		return formasPagamentoDesejadas;
	}

	public ArrayList<Preferencia> getPreferencias() {
		return preferencias;
	}

	public boolean adicionarFormaPagamentoDesejada(FormaPagamento f) {
		if (!formasPagamentoDesejadas.contains(f)) {
			return formasPagamentoDesejadas.add(f);
		}
		
		return false;
	}


	public boolean adicionarPreferencia(Preferencia p) {
		if (preferencias.contains(p))
			return false;
		return preferencias.add(p);
	}

	public boolean removerFormaPagamentoDesejada(FormaPagamento f) {
		if (formasPagamentoDesejadas.contains(f)) {
			return formasPagamentoDesejadas.remove(f);
		}
		
		return false;
	}


	public boolean removerPreferencia(Preferencia p) {
		if(preferencias.contains(p))
			return preferencias.remove(p);
		return false;
	}



	public String toString() {
		String cliente = "DADOS CLIENTE:\n" + super.toString();
		cliente = cliente + "Preco maximo: " + getPrecoMax() + "\n";
		cliente = cliente + "Formas de Pagamento desejadas: ";

		for (int i = 0; i < formasPagamentoDesejadas.size(); i++) {
			// Lógica simples para formatação no console
			if (i != 0)
				cliente = cliente + "," + formasPagamentoDesejadas.get(i);
			else
				cliente = cliente + formasPagamentoDesejadas.get(i);
		}

		cliente = cliente + "\nPREFERÊNCIAS DO CLIENTE: " + "\n";

		for (int i = 0; i < this.preferencias.size(); i++) {
			cliente = cliente + "Imovel " + i+1 + " :\n";
			cliente = cliente + preferencias.get(i).toString();
		}
	
		return cliente;
	}  
	
}