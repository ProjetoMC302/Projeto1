package Sistema;
import java.awt.image.DataBufferShort;
import java.util.Scanner;

import auxiliarInterface.TelaConsole;

public class Main {

	public static void main(String[] args) {
		//instancia scanner para entrada de dados
		Scanner scanner = new Scanner(System.in);
		
		//criar banco de dados simulado
		Imobiliaria imobiliaria = new Imobiliaria();
		
		//criando telas do sistema 
		
		//tela login
		TelaConsole telaLogin = new TelaConsole(scanner);
		final String  cadastrarComando = "Cadastrar Novo Corretor";
		final String loginComando = "Login";
		final String sairComando = "Sair";
		telaLogin.adicionaComando(1,cadastrarComando);
		telaLogin.adicionaComando(2,loginComando);
		telaLogin.adicionaComando(0, sairComando);
		
		//telaCadastrar
		TelaConsole dashboard = new TelaConsole(scanner);
		final String imovelComando = "Imoveis";
		final String clienteComando = "Clientes";
		final String proprietarioComando = "Proprietario";
		final String propostaComando = "Propostas";
		final String deslogarComando = "Logout";
		dashboard.adicionaComando(1, imovelComando);
		dashboard.adicionaComando(2, clienteComando);
		dashboard.adicionaComando(3, proprietarioComando);
		dashboard.adicionaComando(4, propostaComando);
		dashboard.adicionaComando(0, deslogarComando);
		
		//TODO: create last screen (auxiliar to dashborad)
		
		//cria comando
		int comando; 
		//settando como ativa inicialmente
		telaLogin.setAtiva(true);
		
		while(true) {
			if(telaLogin.isAtiva()) {
				telaLogin.show();
				comando = telaLogin.getInput();
				if(comando==TelaConsole.COMANDO_INVALIDO()) {
					System.out.println("Comando Invalido");
					continue;
				}
				
				if(comando == telaLogin.getComando(cadastrarComando)) {
					//cadastrar novo corretor
					System.out.println("cadastrar novo corretor");
					//TODO: create method to register a new corretor
				}else if(comando == telaLogin.getComando(loginComando)) {
					//fazer login
					System.out.println("Fazer Login");
					System.out.println("Logado Com sucesso");
					//TODO; create method to make login 
					TelaConsole.replace(telaLogin, dashboard);
				}else if(comando == telaLogin.getComando(sairComando)) {
					System.out.println("Obrigado por usar nosso sistema, Tenha um bom dia");
					break;	
				}
			}
			
			if(dashboard.isAtiva()) {
				dashboard.show();
				comando = dashboard.getInput();
				if(comando==TelaConsole.COMANDO_INVALIDO()) {
					System.out.println("Comando Invalido");
					continue;
				}
				//TODO: create all the methods to show the auxiliar screen and perform the actions  
				if(comando == dashboard.getComando(imovelComando)) {
					//imovel
					System.out.println("Imovel");
				}else if(comando == dashboard.getComando(clienteComando)) {
					//cliente
					System.out.println("Cliente");
				}else if(comando == dashboard.getComando(proprietarioComando)) {
					//proprietario
					System.out.println("Proprietario");	
				}else if(comando == dashboard.getComando(propostaComando)) {
					//propsta
					System.out.println("Proposta");
				}else if(comando == dashboard.getComando(deslogarComando)) {
					//deslogar
					System.out.println("Deslogar");
					TelaConsole.replace(dashboard, telaLogin);
					System.out.println("Deslogado com sucesso");
				}
			}
			
		}
		
		//criar e cadastrar corretores
		Corretor corretor = new Corretor("Sophia", "sophiaCell", "sophiaCorretora@gmail.com"); 
		//coloca corretor no banco de dados simulado
		imobiliaria.adicionarCorretor(corretor);
		
		//cadastrar proprietarios
		Proprietario proprietario1 = new Proprietario("Bruno", "brunoCell", "BrunoProprietario@gmail.com");
		imobiliaria.adicionarProprietario(proprietario1);
		//cadastrar imoveis do proprietario
		//cadastrar cliente
		//buscar pelo imovel desejado pelo cliente
		//criar proposta de negocio
		//fechar proposta de imovel
	}
}
