package Sistema;
import java.awt.image.DataBufferShort;
import java.util.ArrayList;
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
		
		final String cadastrar = "Cadastrar";
		final String remover = "Remover";
		final String atualizar = "Atualizar";
		final String listarTodos = "Listar Todos";
		final String buscar = "Buscar";
		final String voltar = "Voltar ao menu anterior";
		
		//telaImovel
		TelaConsole imovelTela = new TelaConsole(scanner);
		imovelTela.adicionaComando(1, cadastrar);
		imovelTela.adicionaComando(2, remover);
		imovelTela.adicionaComando(3, atualizar);
		imovelTela.adicionaComando(4, listarTodos);
		imovelTela.adicionaComando(5, buscar);
		imovelTela.adicionaComando(6, voltar);
		
		//telaCliente 
		TelaConsole telaCliente = new TelaConsole(scanner);
		telaCliente.adicionaComando(1, cadastrar);
		telaCliente.adicionaComando(2, remover);
		telaCliente.adicionaComando(3, atualizar);
		telaCliente.adicionaComando(4, listarTodos);
		telaCliente.adicionaComando(5, buscar);
		telaCliente.adicionaComando(6, voltar);
		
		//telaProprietario
		TelaConsole telaProprietario = new TelaConsole(scanner);
		telaProprietario.adicionaComando(1, cadastrar);
		telaProprietario.adicionaComando(2, remover);
		telaProprietario.adicionaComando(3, atualizar);
		telaProprietario.adicionaComando(4, listarTodos);
		telaProprietario.adicionaComando(5, buscar);
		telaProprietario.adicionaComando(6, voltar);
		
		//telaProposta
		TelaConsole telaProposta = new TelaConsole(scanner);
		
		//TODO: create last screen (auxiliar to dashborad)
		
		//cria comando
		int comando; 
		//settando como ativa inicialmente
		telaLogin.setAtiva(true);
		System.out.println("Bem vindo !! \n");
		while(true) {
			if(telaLogin.isAtiva()) {
				System.out.println("*TelaLogin* \n");
				telaLogin.show();
				comando = telaLogin.getInput();
				
				if(comando == telaLogin.getComando(cadastrarComando)) {
					//cadastrar novo corretor
					System.out.println("***************************************************************");
					System.out.print("Digite seu nome: ");
					String nome = scanner.nextLine();
					System.out.print("Digite seu telefone: ");
					String telefone = scanner.nextLine();
					System.out.print("Digite seu CPF: ");
					String documento = scanner.nextLine();
					System.out.print("Digite o estado da sua residencia: ");
					String estado = scanner.nextLine();
					System.out.print("Digite a cidade da sua residencia: ");
					String cidade = scanner.nextLine();
					System.out.print("Digite o bairro da sua residencia: ");
					String bairro = scanner.nextLine();
					System.out.print("Digite a rua da sua residencia: ");
					String rua = scanner.nextLine();
					System.out.print("Digite o numero da sua residencia: ");
					int numero = Integer.parseInt(scanner.nextLine());
					System.out.print("Digite o cep da sua residencia: ");
					int cep = Integer.parseInt(scanner.nextLine());
					System.out.print("Digite o complemento da sua residencia: ");
					String complemento = scanner.nextLine();
					Endereco endereco = new Endereco(cep, estado, cidade, rua, bairro, numero, complemento);
					System.out.print("Digite seu CRECI: ");
					String creci = scanner.nextLine();
					System.out.print("Digite o seu email: ");
					String email = scanner.nextLine();
					System.out.print("Digite a sua senha: ");
					String senha = scanner.nextLine();
					//cria corretor
					Corretor corretor = new Corretor(nome, telefone, documento, endereco, email, senha, creci);
					//adiciona corretor no banco de dados
					imobiliaria.adicionarCorretor(corretor);
					
					System.out.println(corretor);
					System.out.println("***************************************************************");
					//TODO: create method to register a new corretor
				}else if(comando == telaLogin.getComando(loginComando)) {
					//fazer login
					System.out.println("***************************************************************");
					System.out.print("Username(CRECI): ");
					String username = scanner.nextLine();
					System.out.print("Senha: ");
					String senha = scanner.nextLine();
					Corretor c = loginSucesso(username,senha,imobiliaria.getCorretores());
					if(c!=null) {
						System.out.println("Logado com succeso");
						System.out.println("\nBem vindo "+c.getNome());
						TelaConsole.replace(telaLogin, dashboard);
					}else {
						System.out.println("Usuario ou senha incorretos");
					}
					System.out.println("***************************************************************");
				}else if(comando == telaLogin.getComando(sairComando)) {
					System.out.println("Obrigado por usar nosso sistema, Tenha um bom dia");
					break;	
				}
			}
			
			if(dashboard.isAtiva()) {
				System.out.println("*TelaPrincipal* \n");
				dashboard.show();
				comando = dashboard.getInput();
				
				//TODO: create all the methods to show the auxiliar screen and perform the actions  
				if(comando == dashboard.getComando(imovelComando)) {
					//imovel
					System.out.println("***************************************************************");
					System.out.println("Indo para Imovel");
					System.out.println("***************************************************************");
					TelaConsole.replace(dashboard, imovelTela);
				}else if(comando == dashboard.getComando(clienteComando)) {
					//cliente
					System.out.println("***************************************************************");
					System.out.println("Indo para Cliente");
					System.out.println("***************************************************************");
					TelaConsole.replace(dashboard, telaCliente);
				}else if(comando == dashboard.getComando(proprietarioComando)) {
					//proprietario
					System.out.println("***************************************************************");
					System.out.println("Indo para Proprietario");
					System.out.println("***************************************************************");
					TelaConsole.replace(dashboard, telaProprietario);
				}else if(comando == dashboard.getComando(propostaComando)) {
					//propsta
					System.out.println("***************************************************************");
					System.out.println("Proposta");
					System.out.println("***************************************************************");
				}else if(comando == dashboard.getComando(deslogarComando)) {
					//deslogar
					System.out.println("***************************************************************");
					System.out.println("Deslogar");
					TelaConsole.replace(dashboard, telaLogin);
					System.out.println("Deslogado com sucesso");
					System.out.println("***************************************************************");
				}
			}
			
			if(imovelTela.isAtiva()) {
				System.out.println("*TelaImovel* \n");
				imovelTela.show();
				comando = imovelTela.getInput();
				
				//TODO: create all the methods to show the auxiliar screen and perform the actions  
				if (comando == imovelTela.getComando(cadastrar)) {
					//cadastrar imovel
					System.out.println("***************************************************************");
					System.out.println("cadastrar Imovel");
					System.out.println("***************************************************************");
				} else if (comando == imovelTela.getComando(remover)) {
					//remover imovel
					System.out.println("***************************************************************");
					System.out.println("remover imovel");
					System.out.println("***************************************************************");
				}else if(comando == imovelTela.getComando(atualizar)) {
					//atualizar
					System.out.println("***************************************************************");
					System.out.println("atualizar imovel");	
					System.out.println("***************************************************************");
				}else if(comando == imovelTela.getComando(listarTodos)) {
					//listar todos
					System.out.println("***************************************************************");
					System.out.println("lista todos imoveis");
					System.out.println("***************************************************************");
				}else if(comando == imovelTela.getComando(buscar)) {
					//buscar
					System.out.println("***************************************************************");
					System.out.println("buscar imovel");
					System.out.println("***************************************************************");
				}else if(comando == imovelTela.getComando(voltar)) {
					//voltar
					System.out.println("***************************************************************");
					System.out.println("voltando ao menu anterior...");
					TelaConsole.replace(imovelTela, dashboard);
					System.out.println("***************************************************************");
				}
			}
			
			if(telaCliente.isAtiva()) {
				System.out.println("*TelaCliente* \n");
				telaCliente.show();
				comando = telaCliente.getInput();
			
				//TODO: create all the methods to show the auxiliar screen and perform the actions  
				if(comando == telaCliente.getComando(cadastrar)) {
					//cadastrar imovel
					System.out.println("***************************************************************");
					System.out.print("Digite seu nome: ");
					String nome = scanner.nextLine();
					System.out.print("Digite seu telefone: ");
					String telefone = scanner.nextLine();
					System.out.print("Digite o seu email: ");
					String email = scanner.nextLine();
					System.out.print("Digite seu CPF: ");
					String documento = scanner.nextLine();
					System.out.print("Digite o estado da sua residencia: ");
					String estado = scanner.nextLine();
					System.out.print("Digite a cidade da sua residencia: ");
					String cidade = scanner.nextLine();
					System.out.print("Digite o bairro da sua residencia: ");
					String bairro = scanner.nextLine();
					System.out.print("Digite a rua da sua residencia: ");
					String rua = scanner.nextLine();
					System.out.print("Digite o numero da sua residencia: ");
					int numero = Integer.parseInt(scanner.nextLine());
					System.out.print("Digite o cep da sua residencia: ");
					int cep = Integer.parseInt(scanner.nextLine());
					System.out.print("Digite o complemento da sua residencia: ");
					String complemento = scanner.nextLine();
					Endereco endereco = new Endereco(cep, estado, cidade, rua, bairro, numero, complemento);
					
					System.out.println("Em relacao a susa preferencias");
					System.out.print("Voce busca imovel para aluguel ?(1-Sim /0-Não): ");
					boolean aluguel;
					if(Integer.parseInt(scanner.nextLine())==1){
						aluguel =true;
					}else {
						aluguel =false;
					}
					System.out.print("Voce busca imovel em esquina ?(1-Sim /0-Não): ");
					boolean esquina;
					if(Integer.parseInt(scanner.nextLine())==1){
						esquina =true;
					}else {
						esquina =false;
					}
					System.out.print("Qual tipo de imovel voce procura ?(1-Casa /2-Apartamento/ 3-Terreno ): ");
					TipoImovel tipoImovel;
					if(Integer.parseInt(scanner.nextLine())==1){
						tipoImovel=TipoImovel.CASA;
					}else if(Integer.parseInt(scanner.nextLine())==2) {
						tipoImovel=TipoImovel.APARTAMENTO;
					}else if(Integer.parseInt(scanner.nextLine())==3) {
						tipoImovel=TipoImovel.TERRENO;
					}
					System.out.print("Qual a minima area do imovel: ");
					int areaMinimaTerreno = Integer.parseInt(scanner.nextLine());
					
					System.out.print("Qual o Proposito do imovel (1-Residencia/2-Comercial/3-Ambos) ");
					Restricao proposito;
					if(Integer.parseInt(scanner.nextLine())==1){
						proposito=Restricao.COMERCIAL;
					}else if(Integer.parseInt(scanner.nextLine())==2) {
						proposito = Restricao.COMERCIAL;
					}else if(Integer.parseInt(scanner.nextLine())==3) {
						proposito = null;
					}
					
					
					new Preferencia(aluguel, esquina, condominio, endereco, raio, tipoImovel, areaMinimaTerreno, proposito)
					new Cliente(nome, telefone, documento, endereco, email, precoMax, preferencia)
					System.out.println("***************************************************************");
				}else if(comando == telaCliente.getComando(remover)) {
					//remover imovel
					System.out.println("***************************************************************");
					System.out.println("remover Cliente");
					System.out.println("***************************************************************");
				}else if(comando == telaCliente.getComando(atualizar)) {
					//atualizar
					System.out.println("***************************************************************");
					System.out.println("atualizar Cliente");	
					System.out.println("***************************************************************");
				}else if(comando == telaCliente.getComando(listarTodos)) {
					//listar todos
					System.out.println("***************************************************************");
					System.out.println("lista todos Cliente");
					System.out.println("***************************************************************");
				}else if(comando == telaCliente.getComando(buscar)) {
					//buscar
					System.out.println("***************************************************************");
					System.out.println("buscar Cliente");
					System.out.println("***************************************************************");
				}else if(comando == telaCliente.getComando(voltar)) {
					//voltar
					System.out.println("***************************************************************");
					System.out.println("voltando ao menu anterior...");
					TelaConsole.replace(telaCliente, dashboard);
					System.out.println("***************************************************************");
				}
			}
			
			if(telaProprietario.isAtiva()) {
				System.out.println("*TelaProprietario* \n");
				telaProprietario.show();
				comando = telaProprietario.getInput();
			
				//TODO: create all the methods to show the auxiliar screen and perform the actions  
				if(comando == telaProprietario.getComando(cadastrar)) {
					//cadastrar imovel
					System.out.println("***************************************************************");
					System.out.println("cadastrar Proprietario");
					System.out.println("***************************************************************");
				}else if(comando == telaProprietario.getComando(remover)) {
					//remover imovel
					System.out.println("***************************************************************");
					System.out.println("remover Proprietario");
					System.out.println("***************************************************************");
				}else if(comando == telaProprietario.getComando(atualizar)) {
					//atualizar
					System.out.println("***************************************************************");
					System.out.println("atualizar Proprietario");	
					System.out.println("***************************************************************");
				}else if(comando == telaProprietario.getComando(listarTodos)) {
					//listar todos
					System.out.println("***************************************************************");
					System.out.println("lista todos Proprietario");
					System.out.println("***************************************************************");
				}else if(comando == telaProprietario.getComando(buscar)) {
					//buscar
					System.out.println("***************************************************************");
					System.out.println("buscar Proprietario");
					System.out.println("***************************************************************");
				}else if(comando == telaProprietario.getComando(voltar)) {
					//voltar
					System.out.println("***************************************************************");
					System.out.println("voltando ao menu anterior...");
					System.out.println("***************************************************************");
					TelaConsole.replace(telaProprietario, dashboard);
				}
			}
		}	
	}
	
	private static Corretor loginSucesso(String username, String senha , ArrayList<Corretor> corretores) {
		for (Corretor corretor : corretores) {
			if(corretor.getCreci().equals(username)  && corretor.getSenha().equals(senha)) {
				return corretor;
			}
		}
		return null;
	}
}
