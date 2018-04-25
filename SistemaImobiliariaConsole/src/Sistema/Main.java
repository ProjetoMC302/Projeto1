package Sistema;
import java.awt.image.DataBufferShort;
import java.util.ArrayList;
import java.util.Scanner;

import auxiliarInterface.TelaConsole;

public class Main {

	public static void main(String[] args) {
		//instancia scanner para entrada de dados
		Scanner scanner = new Scanner(System.in);
		
		Corretor corretor = null;
		
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
		final String deletarConta = "Excluir conta";
		final String deslogarComando = "Logout";
		dashboard.adicionaComando(1, imovelComando);
		dashboard.adicionaComando(2, clienteComando);
		dashboard.adicionaComando(3, proprietarioComando);
		dashboard.adicionaComando(4, propostaComando);
		dashboard.adicionaComando(5, deletarConta);
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
					String nome = getStringInput(scanner,"Digite seu nome: ");
					String telefone = getStringInput(scanner,"Digite seu telefone: ");
					String documento = getStringInput(scanner,"Digite seu CPF: ");
					String estado = getStringInput(scanner,"Digite o estado da sua residencia: ");
					String cidade = getStringInput(scanner,"Digite a cidade da sua residencia: ");
					String bairro = getStringInput(scanner,"Digite o bairro da sua residencia: ");
					String rua = getStringInput(scanner,"Digite a cidade da sua residencia: ");
					int numero = getIntInput(scanner, "Digite o numero da sua residencia: ");
					int cep = getIntInput(scanner, "Digite o cep da sua residencia: ");
					String complemento = getStringInput(scanner,"Digite o complemento da sua residencia: ");
					String creci = getStringInput(scanner,"Digite seu CRECI: ");
					String email = getStringInput(scanner,"Digite o seu email: ");
					String senha = getStringInput(scanner,"Digite a sua senha: ");
					
					Endereco endereco = new Endereco(cep, estado, cidade, rua, bairro, numero, complemento);
					//cria corretor
					Corretor cadastroCorretor = new Corretor(nome, telefone, documento, endereco, email, senha, creci);
					//adiciona corretor no banco de dados
					imobiliaria.adicionarCorretor(cadastroCorretor );
					
					System.out.println(cadastroCorretor);
					System.out.println("***************************************************************");
					//TODO: create method to register a new corretor
				}else if(comando == telaLogin.getComando(loginComando)) {
					//fazer login
					System.out.println("***************************************************************");
					String username = getStringInput(scanner,"Username(CRECI): ");
					String senha = getStringInput(scanner,"Senha: ");
					
					//faz login
					corretor = loginSucesso(username,senha,imobiliaria.getCorretores());
					if(corretor!=null) {
						System.out.println("Logado com succeso");
						System.out.println("\nBem vindo "+corretor.getNome());
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
					System.out.println("Indo para Imovel Menu");
					System.out.println("***************************************************************");
					TelaConsole.replace(dashboard, imovelTela);
				}else if(comando == dashboard.getComando(clienteComando)) {
					//cliente
					System.out.println("***************************************************************");
					System.out.println("Indo para Cliente Menu");
					System.out.println("***************************************************************");
					TelaConsole.replace(dashboard, telaCliente);
				}else if(comando == dashboard.getComando(proprietarioComando)) {
					//proprietario
					System.out.println("***************************************************************");
					System.out.println("Indo para Proprietario Menu");
					System.out.println("***************************************************************");
					TelaConsole.replace(dashboard, telaProprietario);
				}else if(comando == dashboard.getComando(propostaComando)) {
					//propsta
					System.out.println("***************************************************************");
					System.out.println("Indo para Proposta Menu");
					System.out.println("***************************************************************");
				}else if(comando == dashboard.getComando(deletarConta)) {
					//deletar conta
					System.out.println("***************************************************************");
					if(getBooleanInput(scanner, "Certeza que deseja deletar se usuario do sistema? (1-Sim/0-Nao): ")) {
						//remove corretor
						imobiliaria.getCorretores().remove(corretor);
						TelaConsole.replace(dashboard, telaLogin);
					}
					System.out.println("***************************************************************");
				}else if(comando == dashboard.getComando(deslogarComando)) {
					//deslogar
					System.out.println("***************************************************************");
					System.out.println("Deslogando...");
					TelaConsole.replace(dashboard, telaLogin);
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
					String documento = getStringInput(scanner, "Digite o CPF do proprietario do imovel: ");
					Proprietario proprietario = buscaProprietario(imobiliaria,documento);
					if(proprietario==null) {
						System.out.println("Proprietrario com documento: "+documento+" ,não existe");
						System.out.println("Por favor primeiro cadastre o proprietario dono do imovel na tela: Proprietario.");
						continue;
					}
					double preco = getDoubleInput(scanner, "Digite o preco do imovel: ");
					double iptu = getDoubleInput(scanner, "Digite o valor do iptu do imovel: ");
					String estado = getStringInput(scanner, "Digite o estado do imovel: ");
					String cidade = getStringInput(scanner, "Digite a cidade do imovel: ");
					String bairro = getStringInput(scanner, "Digite o bairro do imovel: ");
					String rua = getStringInput(scanner, "Digite a rua do imovel: ");
					int numero = getIntInput(scanner, "Digite o numero do imovel: ");
					int cep = getIntInput(scanner, "Digite o cep do imovel: ");
					String complemento = getStringInput(scanner, "Digite o complemento do endereco do imovel: ");
					
					Endereco endereco = new Endereco(cep, estado, cidade, rua, bairro, numero, complemento);
					
					Condominio condominio;
					if(getBooleanInput(scanner, "O imovel se situa dentro de um condominio?(1-Sim /0-Nao): ")){
						double valorCondominio = getDoubleInput(scanner, "Qual o valor do condominio ?: ");
						condominio = new Condominio(valorCondominio);
					}else {
						condominio=new Condominio();
					}
					
					boolean aluguel = getBooleanInput(scanner, "O imovel eh somente para aluguel ?(1-Sim /0-Nao): ");
					String descricao = getStringInput(scanner, "Digite uma descricao do imovel: ");
					

					TipoImovel tipoImovel=TipoImovel.CASA;
					Imovel imovel = null;

					int tipoInput = getIntInput(scanner, "Qual o tipo do imovel ?(1-Casa /2-Apartamento/ 3-Terreno ): ");
					if(tipoInput==1){
						tipoImovel=TipoImovel.CASA;
						double areaConstruida = getDoubleInput(scanner, "Digite a area construida: ");
						int vagasAutomovel = getIntInput(scanner, "Digite o numero de vagas para automovel: ");
						int quantidadeBanheiros = getIntInput(scanner, "Digite a quantidade de banheiros: ");						
						int quantidadeQuartos = getIntInput(scanner, "Digite a quantidade de Quartos: ");
						int quantidadeAndares = getIntInput(scanner, "Digite a quantidade de Andares: ");
						int quantidadeSuites = getIntInput(scanner, "Digite a quantidade de Suites: ");
						boolean esquina = getBooleanInput(scanner, "O imovel eh de esquina ?(1-Sim /0-Nao): ");
						boolean piscina= getBooleanInput(scanner, "O imovel tem piscina ?(1-Sim /0-Nao): ");
						double areaTerreno = getDoubleInput(scanner, "Digite a area do terrono do imovel: ");
						imovel = new Casa(endereco, condominio, proprietario, corretor, descricao, preco, iptu, aluguel, tipoImovel, 
								vagasAutomovel, quantidadeBanheiros, quantidadeQuartos, quantidadeAndares, quantidadeSuites, 
								areaConstruida, esquina, piscina, areaTerreno);
						
					}else if(tipoInput==2) {
						tipoImovel=TipoImovel.APARTAMENTO;
						double areaConstruida = getDoubleInput(scanner, "Digite a area construida: ");
						int vagasAutomovel = getIntInput(scanner, "Digite o numero de vagas para automovel: ");
						int quantidadeBanheiros = getIntInput(scanner, "Digite a quantidade de banheiros: ");						
						int quantidadeQuartos = getIntInput(scanner, "Digite a quantidade de Quartos: ");
						int quantidadeAndares = getIntInput(scanner, "Digite a quantidade de Andares: ");
						int quantidadeSuites = getIntInput(scanner, "Digite a quantidade de Suites: ");
						int quantidadeTerraco = getIntInput(scanner, "Digite a quantidade de Terracos: ");;
						int andar=getIntInput(scanner, "O andar do Imovel: ");;
						boolean cobertura = getBooleanInput(scanner, "O imovel eh cobertura ?(1-Sim /0-Nao): ");
						boolean elevadorServico=getBooleanInput(scanner, "Tem elevador de servico no predio do imovel ?(1-Sim /0-Nao): ");
						boolean elevadorSocial=getBooleanInput(scanner, "Tem elevador social no predio do imovel ?(1-Sim /0-Nao): ");;
						imovel = new Apartamento(endereco, condominio, proprietario, corretor, descricao, preco, iptu,
								aluguel, tipoImovel, vagasAutomovel, quantidadeBanheiros, quantidadeQuartos, quantidadeAndares, 
								quantidadeSuites, areaConstruida, cobertura, quantidadeTerraco, quantidadeQuartos, andar, 
								elevadorServico, elevadorSocial);
					}else if(tipoInput==3) {
						tipoImovel=TipoImovel.TERRENO;
						boolean esquina = getBooleanInput(scanner, "O imovel eh de esquina ?(1-Sim /0-Nao): ");
						double areaTerreno = getDoubleInput(scanner, "Digite a area do terreno: ");
						imovel = new Terreno(endereco, condominio, proprietario, corretor, descricao, preco, iptu, aluguel, 
								tipoImovel, areaTerreno, esquina);
						
					}
//					corretor.adicionarImovel(imovel);
					imobiliaria.adicionarImovel(imovel);
					System.out.println("***************************************************************");
				} else if (comando == imovelTela.getComando(remover)) {
					//remover imovel
					System.out.println("***************************************************************");
					Imovel imovel = buscaImovel(imobiliaria,getIntInput(scanner, "Digite o id do imovel que deseja remover: "));
					if(imovel!=null) {
//						corretor.removerImovel(imovel);
						imobiliaria.removerImovel(imovel);
					}else {
						System.out.println("Imovel não existe");
					}
					System.out.println("***************************************************************");
				}else if(comando == imovelTela.getComando(atualizar)) {
					//atualizar
					System.out.println("***************************************************************");
					System.out.println("atualizar imovel");	
					System.out.println("***************************************************************");
				}else if(comando == imovelTela.getComando(listarTodos)) {
					//listar todos
					System.out.println("***************************************************************");
					for (Imovel imovel : imobiliaria.getImoveis()) {
						System.out.println(imovel);
					}
					System.out.println("***************************************************************");
				}else if(comando == imovelTela.getComando(buscar)) {
					//buscar
					System.out.println("***************************************************************");
					Imovel imovel = buscaImovel(imobiliaria,getIntInput(scanner, "Digite o id do imovel que deseja acessar: "));
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
					//cadastrar cliente
					System.out.println("***************************************************************");
					String nome = getStringInput(scanner,"Digite seu nome: ");
					String telefone = getStringInput(scanner,"Digite seu telefone: ");
					String documento = getStringInput(scanner,"Digite seu CPF: ");
					String email = getStringInput(scanner,"Digite o seu email: ");
					String estado = getStringInput(scanner,"Digite o estado da sua residencia: ");
					String cidade = getStringInput(scanner,"Digite a cidade da sua residencia: ");
					String bairro = getStringInput(scanner,"Digite o bairro da sua residencia: ");
					String rua = getStringInput(scanner,"Digite a cidade da sua residencia: ");
					int numero = getIntInput(scanner, "Digite o numero da sua residencia: ");
					int cep = getIntInput(scanner, "Digite o cep da sua residencia: ");
					String complemento = getStringInput(scanner,"Digite o complemento da sua residencia: ");
				
					System.out.println("Em relacao a suas preferencias");
					
					boolean aluguel = getBooleanInput(scanner, "Voce busca imovel para aluguel ?(1-Sim /0-Nao): ");
					boolean esquina = getBooleanInput(scanner, "Voce busca um imovel em esquina ?(1-Sim /0-Nao): ");
					boolean condominio = getBooleanInput(scanner, "Voce busca um imovel dentro de um condominio ?(1-Sim /0-Nao): ");
					
					System.out.print("Qual tipo de imovel voce procura ?(1-Casa /2-Apartamento/ 3-Terreno ): ");
					TipoImovel tipoImovel=TipoImovel.CASA;
					if(Integer.parseInt(scanner.nextLine())==1){
						tipoImovel=TipoImovel.CASA;
					}else if(Integer.parseInt(scanner.nextLine())==2) {
						tipoImovel=TipoImovel.APARTAMENTO;
					}else if(Integer.parseInt(scanner.nextLine())==3) {
						tipoImovel=TipoImovel.TERRENO;
					}
					
					int areaMinimaTerreno = getIntInput(scanner, "Qual a minima area do imovel: ");
					
					System.out.print("Qual o Proposito do imovel (1-Residencial/2-Comercial/3-Ambos) ");
					Restricao proposito = null;
					if(Integer.parseInt(scanner.nextLine())==1){
						proposito=Restricao.COMERCIAL;
					}else if(Integer.parseInt(scanner.nextLine())==2) {
						proposito = Restricao.COMERCIAL;
					}else if(Integer.parseInt(scanner.nextLine())==3) {
						proposito = null;
					}
					double precoMax=getDoubleInput(scanner, "Qual o preco maximo desejado: ");
							
					Preferencia preferencia = new Preferencia(aluguel, esquina, condominio, tipoImovel, areaMinimaTerreno, proposito);
					Endereco endereco = new Endereco(cep, estado, cidade, rua, bairro, numero, complemento);
					Cliente cliente = new Cliente(nome, telefone, documento, endereco, email, precoMax, preferencia);
					
					//adiciona cliente para corretor e para o banco de dados simulado
					corretor.adicionarCliente(cliente);
					imobiliaria.adicionarCliente(cliente);
					System.out.println("***************************************************************");
				}else if(comando == telaCliente.getComando(remover)) {
					//remover cliente
					System.out.println("***************************************************************");
					System.out.println("Digite o CPF do cliente que deseja remover: ");
					String documento = scanner.nextLine();
					Cliente clienteRemover = buscaCliente(corretor,documento);
					if(clienteRemover!=null) {
						corretor.removerCliente(clienteRemover);
						imobiliaria.removerCliente(clienteRemover);
					}else {
						System.out.println("Cliente não existe no sistema");
					}
					System.out.println("***************************************************************");
				}else if(comando == telaCliente.getComando(atualizar)) {
					//atualizar
					System.out.println("***************************************************************");
					System.out.println("atualizar Cliente");	
					System.out.println("***************************************************************");
				}else if(comando == telaCliente.getComando(listarTodos)) {
					//listar todos
					System.out.println("***************************************************************");
					for (Cliente cliente : corretor.getClientes()) {
						System.out.println(cliente);
					}
					System.out.println("***************************************************************");
				}else if(comando == telaCliente.getComando(buscar)) {
					//buscar
					System.out.println("***************************************************************");
					String documento = getStringInput(scanner, "Digite o CPF do cliente que deseja pesquisar: ");
					Cliente cliente = buscaCliente(corretor, documento);
					System.out.println(cliente);
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
					String nome = getStringInput(scanner,"Digite o nome do proprietario: ");
					String telefone = getStringInput(scanner,"Digite o telefone do proprietario: ");
					String documento = getStringInput(scanner,"Digite o CPF do proprietario: ");
					String email = getStringInput(scanner,"Digite o email do proprietario: ");
					String estado = getStringInput(scanner,"Digite o estado do proprietario: ");
					String cidade = getStringInput(scanner,"Digite a cidade do proprietario: ");
					String bairro = getStringInput(scanner,"Digite o bairro do proprietario: ");
					String rua = getStringInput(scanner,"Digite a rua do proprietario: ");
					int numero = getIntInput(scanner, "Digite o numero do proprietario: ");
					int cep = getIntInput(scanner, "Digite o cep do proprietario: ");
					String complemento = getStringInput(scanner,"Digite o complemento do proprietario: ");
					boolean empresa = getBooleanInput(scanner, "do proprietario é uma empresa ? ");
					
					Endereco endereco = new Endereco(cep, estado, cidade, rua, bairro, numero, complemento);
					Proprietario proprietario = new Proprietario(nome, telefone, documento, endereco, email, empresa);
					
					imobiliaria.adicionarProprietario(proprietario);
					System.out.println("***************************************************************");
				}else if(comando == telaProprietario.getComando(remover)) {
					//remover imovel
					System.out.println("***************************************************************");
					Proprietario proprietario = buscaProprietario(imobiliaria, getStringInput(scanner, "Digite o CPFdo proprietario que deseja remover: "));
					if(proprietario!=null) {
						imobiliaria.removerProprietario(proprietario);
					}else {
						System.out.println("Proprietario não existe");
					}
					System.out.println("***************************************************************");
				}else if(comando == telaProprietario.getComando(atualizar)) {
					//atualizar
					System.out.println("***************************************************************");
					System.out.println("atualizar Proprietario");	
					System.out.println("***************************************************************");
				}else if(comando == telaProprietario.getComando(listarTodos)) {
					//listar todos
					System.out.println("***************************************************************");
					for (Proprietario proprietario : imobiliaria.getProprietarios()) {
						System.out.println(proprietario);
					}
					System.out.println("***************************************************************");
				}else if(comando == telaProprietario.getComando(buscar)) {
					//buscar
					System.out.println("***************************************************************");
					System.out.println("***************************************************************");
					Proprietario proprietario = buscaProprietario(imobiliaria, getStringInput(scanner, "Digite o CPFdo proprietario que deseja remover: "));
					if(proprietario!=null) {
						System.out.println(proprietario);
					}else {
						System.out.println("Proprietario não existe");
					}
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
	
	private static Cliente buscaCliente(Corretor corretorResponsavel, String documento) {
		for (Cliente cliente : corretorResponsavel.getClientes()) {
			if(cliente.getDocumento().equals(documento)) {
				return cliente;
			}
		}
		return null;
	}
	
	private static Proprietario buscaProprietario(Imobiliaria imobiliaria, String documento) {
		for (Proprietario proprietario : imobiliaria.getProprietarios()) {
			if(proprietario.getDocumento().equals(documento)) {
				return proprietario;
			}
		}
		return null;
	}
	
	private static Imovel buscaImovel(Imobiliaria imobiliaria, int id) {
		for (Imovel imovel : imobiliaria.getImoveis()) {
			if(imovel.getId() == id) {
				return imovel;
			}
		}
		return null;
	}
	private static int getIntInput(Scanner scanner,String mensagem) {
		System.out.print(mensagem);
		return Integer.parseInt(scanner.nextLine());
	}
	
	private static double getDoubleInput(Scanner scanner,String mensagem) {
		System.out.print(mensagem);
		return Double.parseDouble(scanner.nextLine());
	}
	
	/**1- true 0- false */
	private static boolean getBooleanInput(Scanner scanner,String mensagem) {
		System.out.print(mensagem);
		if(Integer.parseInt(scanner.nextLine())==1){
			return true;
		}else {
			return false;
		}
	}
	
	private static String getStringInput(Scanner scanner,String mensagem) {
		System.out.print(mensagem);
		return scanner.nextLine();
	}
}
