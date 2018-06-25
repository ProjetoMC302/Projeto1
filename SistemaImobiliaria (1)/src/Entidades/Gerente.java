package Entidades;

public class Gerente extends Pessoa {

	private String senha;

public Gerente(String nome, String telefone, String email, String senha) {
	super(nome, telefone, email);
	this.senha=senha;
}
 
public Gerente(String nome, String telefone, String documento, Endereco endereco, String email, String senha) {
	
	super(nome,telefone,documento,endereco,email);
	this.senha = senha;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}


public Corretor adicionarCorretor(String nome, String telefone, String documento, Endereco endereco, String email, String senha ,String creci)
{
	Corretor novo = new Corretor (nome, telefone, documento, endereco, email, senha, creci);
	return novo;
	
}









}
