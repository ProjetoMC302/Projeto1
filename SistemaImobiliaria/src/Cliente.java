import java.util.ArrayList;

public class Cliente extends Pessoa {
/*
 *private Regi�oProcurada regi�o Procurada;  
 * Ficamos de implementar regi�o procurada na proxima etapa ?
 */
  private double precoMax;
  private ArrayList <FormaPagamento> formasPagamentoDesejadas;
  private ArrayList <Preferencia> preferencias;


public Cliente(String nome, String telefone, String email, double precoMax,Preferencia preferencia) {
	super(nome, telefone, email);
	this.precoMax = precoMax;
	this.formasPagamentoDesejadas = new ArrayList<FormaPagamento>();
	this.preferencias = new ArrayList<Preferencia>();
	preferencias.add(preferencia);
}

public Cliente(String nome, String telefone,String documento, Endereco endereco, String email,
		double precoMax, Preferencia preferencia) {
	super(nome, telefone,documento,endereco, email);
	this.precoMax = precoMax;
	this.formasPagamentoDesejadas = new ArrayList<FormaPagamento>();
	this.preferencias = new ArrayList<Preferencia>();
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
	if(!formasPagamentoDesejadas.contains(f))
	{
		this.formasPagamentoDesejadas.add(f);
		return true;
	}
	return false;
}


public boolean adicionarPreferencia(Preferencia p) {
	if(!preferencias.contains(p))
	{
		this.preferencias.add(p);
		return true;
	}
	return false;
}

public boolean removerFormaPagamentoDesejada(FormaPagamento f) {
	if(formasPagamentoDesejadas.contains(f))
	{
		this.formasPagamentoDesejadas.remove(f);
		return true;
	}
	return false;
}


public boolean removerPreferencia(Preferencia p) {
	if(preferencias.contains(p))
	{
		this.preferencias.remove(p);
		return true;
	}
	return false;
}



public String toString()
{
	String cliente="DADOS CLIENTE:\n"+super.toString();
	cliente=cliente+"Pre�o Maximo:"+getPrecoMax()+"\n";
	cliente=cliente+"Formas de Pagamento desejadas: ";
	for(int i=0;i<this.formasPagamentoDesejadas.size();i++)
	{
		if(i!=0)
			cliente=cliente+","+this.formasPagamentoDesejadas.get(i);
		else
			cliente=cliente+this.formasPagamentoDesejadas.get(i);
	}
	cliente=cliente+"\nPREFER�NCIAS DO CLIENTE: "+"\n";
	for(int i=0;i<this.preferencias.size();i++)
	{
		cliente=cliente+"Im�vel "+(i+1)+" :\n";
		cliente=cliente+this.preferencias.get(i).toString();
	}
	 return cliente;
}




  
  
  
  
}
