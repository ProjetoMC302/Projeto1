package Entidades;

import java.util.ArrayList;

public class Imovel {
	private static int numeroImoveis;
	private static int geradorId;
	
	private final int id;
	private Endereco endereco;
	private ArrayList<Restricao> restricoes;
	private Condominio condominio;
	private final Proprietario proprietario;
	private Corretor corretorResponsavel;
	private String descricao;
	private ArrayList<String> diferenciais;
	private ArrayList<FormaPagamento> formasPagamentoAceitas;
	private double preco;
	private double iptu;
	private boolean aluguel;
	private TipoImovel tipoImovel;
	
	public Imovel(Endereco endereco, Condominio condominio, Proprietario proprietario,
			Corretor corretorResponsavel, String descricao, double preco, double iptu, boolean aluguel,
			TipoImovel tipoImovel) {
		id = ++geradorId;
		formasPagamentoAceitas = new ArrayList<FormaPagamento>();
		restricoes = new ArrayList<Restricao>();
		diferenciais = new ArrayList<String>();
		this.endereco = endereco;
		this.condominio = condominio;
		
		this.proprietario = proprietario;
		proprietario.adicionarImovel(this);
		
		this.corretorResponsavel = corretorResponsavel;
		corretorResponsavel.adicionarImovel(this);
		
		this.descricao = descricao;
		this.preco = preco;
		this.iptu = iptu;
		this.aluguel = aluguel;
		this.tipoImovel = tipoImovel;
	}
	
	public boolean adicionarFormaPagamento(FormaPagamento fp) {
		if (!formasPagamentoAceitas.contains(fp)) {
			return formasPagamentoAceitas.add(fp);
		}
		
		return false;
	}
	
	public boolean removerFormaPagamento(FormaPagamento fp) {
		return formasPagamentoAceitas.remove(fp);
	}
	
	public boolean adicionarRestricao(Restricao restricao) {
		if (!restricoes.contains(restricao)) {
			return restricoes.add(restricao);
		}
		
		return false;
	}
	
	public boolean removerRestricao(Restricao restricao) {
		return restricoes.remove(restricao);
	}
	
	public boolean adicionarDiferencial(String diferencial) {
		if (!diferenciais.contains(diferencial)) {
			return diferenciais.add(diferencial);
		}
		
		return false;
	}
	
	public boolean removerDiferencial(String diferencial) {
		return diferenciais.remove(diferencial);
	}

	public int getId() {
		return id;
	}

	public static int getNumeroImoveis() {
		return numeroImoveis;
	}

	public static void setNumeroImoveis(int numeroImoveis) {
		Imovel.numeroImoveis = numeroImoveis;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Restricao> getRestricoes() {
		return restricoes;
	}

	public void setRestricoes(ArrayList<Restricao> restricoes) {
		this.restricoes = restricoes;
	}

	public Condominio getCondominio() {
		return condominio;
	}

	public void setCondominio(Condominio condominio) {
		this.condominio = condominio;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}


	public Corretor getCorretorResponsavel() {
		return corretorResponsavel;
	}

	public void setCorretorResponsavel(Corretor corretorResponsavel) {
		this.corretorResponsavel = corretorResponsavel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<String> getDiferenciais() {
		return diferenciais;
	}

	public void setDiferenciais(ArrayList<String> diferenciais) {
		this.diferenciais = diferenciais;
	}

	public ArrayList<FormaPagamento> getFormasPagamentoAceitas() {
		return formasPagamentoAceitas;
	}

	public void setFormasPagamentoAceitas(ArrayList<FormaPagamento> formasPagamentoAceitas) {
		this.formasPagamentoAceitas = formasPagamentoAceitas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getIptu() {
		return iptu;
	}

	public void setIptu(double iptu) {
		this.iptu = iptu;
	}

	public boolean isAluguel() {
		return aluguel;
	}

	public void setAluguel(boolean aluguel) {
		this.aluguel = aluguel;
	}

	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	@Override
	public String toString() {
		return "Id= " + getId() + ", Endereco= " + getEndereco() + ", Restricoes= "
				+ getRestricoes() + ", Condominio= " + getCondominio() + ", Proprietario= " + getProprietario()
				+ ", CorretorResponsavel= " + getCorretorResponsavel() + ", Descricao= " + getDescricao()
				+ ", Diferenciais= " + getDiferenciais() + ", FormasPagamentoAceitas= "
				+ getFormasPagamentoAceitas() + ", Preco=" + getPreco() + ", Iptu= " + getIptu()
				+ ", isAluguel= " + isAluguel() + ", TipoImovel= " + getTipoImovel() + "]";
	}
}