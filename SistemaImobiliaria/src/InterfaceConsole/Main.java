package InterfaceConsole;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.*;


public class Main {

	private static Scanner scanner;
	
	private static Imobiliaria imobiliaria;

	private static TelaConsole telaLogin;
	private static TelaConsole dashboard;
	private static TelaConsole telaImovel;
	private static TelaConsole telaCliente;
	private static TelaConsole telaProprietario;
	private static TelaConsole telaProposta;

	// Util para a tela de login
	private static final String cadastrarComando = "Cadastrar Novo Corretor";
	private static final String loginComando = "Login";
	private static final String sairComando = "Sair";
	
	// Util para o Dashboard
	private static final String imovelComando = "Imoveis";
	private static final String clienteComando = "Clientes";
	private static final String proprietarioComando = "Proprietario";
	private static final String propostaComando = "Propostas";
	private static final String deletarConta = "Excluir conta";
	private static final String deslogarComando = "Logout";
	
	// Uteis para as proximas telas
	private static final String cadastrar = "Cadastrar";
	private static final String remover = "Remover";
	private static final String atualizar = "Atualizar";
	private static final String listarTodos = "Listar Todos";
	private static final String buscar = "Buscar";
	private static final String buscarParaCliente = "Buscar Para Cliente";
	private static final String voltar = "Voltar ao menu anterior";

	// Util para a tela de proposta	
	private static final String criarProposta = "Criar proposta";
	private static final String listarTodasPropostasAbertas = "Listar todas propostas abertas";
	private static final String listarTodasPropostasFinalizadas = "Listar todas propostas Finalizadas";
	private static final String finalizarProposta = "Finalizar proposta";
	private static final String removerProposta = "Remover proposta";
	
	// cria comando
	private static int comando;
	
	public static void main(String[] args) {
		// instancia scanner para entrada de dados
		construirMain();

		// Armazenara corretor logado
		Corretor corretor = null;
		
		// criar banco de dados simulado
		imobiliaria = new Imobiliaria();
		
		// criando telas do sistema 
		cadastrarComandosLogin(); // tela login
		cadastrarComandosDashboard(); // telaCadastrar
		cadastrarComandosImovel(); // telaImovel
		cadastrarComandosCliente(); // telaCliente
		cadastrarComandosProprietario(); // telaProprietario
		cadastrarComandosProposta(); // telaProposta
		
		// settando telaLogin como ativa inicialmente
		telaLogin.setAtiva(true);
		System.out.println("Bem vindo !! \n");
		while (true) {
			if (telaLogin.isAtiva()) {
				System.out.println("*TelaLogin* \n");
				telaLogin.show();
				comando = telaLogin.getInput();
				
				if (comando == telaLogin.getComando(cadastrarComando)) {
					// cadastrar novo corretor
					System.out.println("***************************************************************");
					String nome = getStringInput(scanner, "Digite seu nome: ");
					String telefone = getStringInput(scanner, "Digite seu telefone: ");
					String documento = getStringInput(scanner, "Digite seu CPF: ");
					String estado = getStringInput(scanner, "Digite o estado da sua residencia: ");
					String cidade = getStringInput(scanner, "Digite a cidade da sua residencia: ");
					String bairro = getStringInput(scanner, "Digite o bairro da sua residencia: ");
					String rua = getStringInput(scanner, "Digite a rua da sua residencia: ");
					int numero = getIntInput(scanner, "Digite o numero da sua residencia: ");
					int cep = getIntInput(scanner, "Digite o cep da sua residencia: ");
					String complemento = getStringInput(scanner, "Digite o complemento da sua residencia: ");
					String creci = getStringInput(scanner, "Digite seu CRECI: ");
					String email = getStringInput(scanner, "Digite o seu email: ");
					String senha = getStringInput(scanner, "Digite a sua senha: ");
					
					Corretor cadastroCorretor = cadastrarCorretor(nome,
							telefone, documento, estado, cidade, bairro, rua,
							numero, cep, complemento, creci, email, senha);
					
					System.out.println(cadastroCorretor);
					System.out.println("***************************************************************");
				} else if (comando == telaLogin.getComando(loginComando)) {
					// fazer login
					System.out.println("***************************************************************");
					String username = getStringInput(scanner, "Username(CRECI): ");
					String senha = getStringInput(scanner, "Senha: ");
					
					corretor = loginCorretor(username, senha);
				} else if (comando == telaLogin.getComando(sairComando)) {
					System.out.println("Obrigado por usar nosso sistema, Tenha um bom dia");
					break;
				}
			}
			
			if (dashboard.isAtiva()) {
				System.out.println("*TelaPrincipal* \n");
				dashboard.show();
				comando = dashboard.getInput();
				
				// TODO: create all the methods to show the auxiliar screen and perform the actions  
				if (comando == dashboard.getComando(imovelComando)) {
					// imovel
					System.out.println("***************************************************************");
					System.out.println("Indo para Imovel Menu");
					System.out.println("***************************************************************");
					TelaConsole.replace(dashboard, telaImovel);
				} else if (comando == dashboard.getComando(clienteComando)) {
					// cliente
					System.out.println("***************************************************************");
					System.out.println("Indo para Cliente Menu");
					System.out.println("***************************************************************");
					TelaConsole.replace(dashboard, telaCliente);
				} else if (comando == dashboard.getComando(proprietarioComando)) {
					// proprietario
					System.out.println("***************************************************************");
					System.out.println("Indo para Proprietario Menu");
					System.out.println("***************************************************************");
					TelaConsole.replace(dashboard, telaProprietario);
				} else if (comando == dashboard.getComando(propostaComando)) {
					// propsta
					System.out.println("***************************************************************");
					System.out.println("Indo para Proposta Menu");
					System.out.println("***************************************************************");
					TelaConsole.replace(dashboard, telaProposta);
				} else if (comando == dashboard.getComando(deletarConta)) {
					// deletar conta
					System.out.println("***************************************************************");
					if (getBooleanInput(scanner, "Certeza que deseja deletar seu usuario do sistema? (1-Sim/0-Nao): ")) {
						deletarCorretor(corretor);
					}
					System.out.println("***************************************************************");
				} else if (comando == dashboard.getComando(deslogarComando)) {
					// deslogar
					System.out.println("***************************************************************");
					System.out.println("Deslogando...");
					corretor = null;
					TelaConsole.replace(dashboard, telaLogin);
					System.out.println("***************************************************************");
				}
			}
			
			if (telaImovel.isAtiva()) {
				System.out.println("*TelaImovel* \n");
				telaImovel.show();
				comando = telaImovel.getInput();
				
				if (comando == telaImovel.getComando(cadastrar)) {
					// cadastrar imovel
					System.out.println("***************************************************************");
					String documento = getStringInput(scanner, "Digite o CPF/CNPJ do proprietario do imovel: ");
					Proprietario proprietario = buscaProprietario(imobiliaria, documento);
					if (proprietario == null) {
						System.out.println("Proprietrario com documento: "+ documento +" ,nao existe");
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
					
					if (getBooleanInput(scanner, "O imovel se situa dentro de um condominio?(1-Sim /0-Nao): ")){
						double valorCondominio = getDoubleInput(scanner, "Qual o valor do condominio ?: ");
						condominio = new Condominio(valorCondominio);
					} else {
						condominio = new Condominio();
					}
					
					boolean aluguel = getBooleanInput(scanner, "O imovel eh somente para aluguel ?(1-Sim /0-Nao): ");
					String descricao = getStringInput(scanner, "Digite uma descricao do imovel: ");
					

				//TODO Não entendi isso, deve ter sido um debug TipoImovel tipoImovel = TipoImovel.CASA;
					Imovel imovel = null;

					int tipoInput = getIntInput(scanner, "Qual o tipo do imovel ?(1-Casa /2-Apartamento/ 3-Terreno ): ");
					imovel = adicionarImovel(corretor, proprietario, preco,
							iptu, endereco, condominio, aluguel, descricao,
							imovel, tipoInput);
					System.out.println("***************************************************************");
				} else if (comando == telaImovel.getComando(remover)) {
					// remover imovel
					System.out.println("***************************************************************");
					Imovel imovel = buscaImovel(corretor, getIntInput(scanner, "Digite o id do imovel que deseja remover: "));
					removerImovel(corretor, imovel);
					System.out.println("***************************************************************");
				} else if (comando == telaImovel.getComando(atualizar)) {
					// atualizar
					System.out.println("***************************************************************");
					Imovel imovel = buscaImovel(corretor, getIntInput(scanner, "Digite o id do imovel que deseja atualizar: "));
					
					if (imovel != null) {
						atualizarImovel(imovel);
					} else {
						System.out.println("Imovel nao existente ou eh de responsabilidade de outro corretor");
					}
					System.out.println("***************************************************************");
				} else if (comando == telaImovel.getComando(listarTodos)) {
					// listar todos
					System.out.println("***************************************************************");
					for (Imovel imovel : corretor.getImoveis()) {
						System.out.println(imovel);
					}
					System.out.println("***************************************************************");
				} else if (comando == telaImovel.getComando(buscar)) {
					// buscar
					System.out.println("***************************************************************");
					int id = getIntInput(scanner, "Digite o id do imovel que deseja acessar: ");
					Imovel imovel = buscaImovel(corretor, id);
					if (imovel != null) {
						System.out.println(imovel);
					} else {
						System.out.println("Imovel com id: "+id +" nao existe");
					}
					
					System.out.println("***************************************************************");
				} else if (comando == telaImovel.getComando(buscarParaCliente)) {
					// buscar imoveis baseado nas preferencias docliente
					System.out.println("***************************************************************");
					Cliente cliente = buscaCliente(corretor, getStringInput(scanner, "Digite o CPF do cliente: "));
					if (cliente != null) {
						ArrayList<Imovel> imoveis = buscaImovel(corretor, cliente);
						for (Imovel imovel : imoveis) {
							System.out.println(imovel);
						}
					}else {
						System.out.println("Cliente nao existe");
					}
					
					System.out.println("***************************************************************");
				} else if (comando == telaImovel.getComando(voltar)) {
					// voltar
					System.out.println("***************************************************************");
					System.out.println("voltando ao menu anterior...");
					TelaConsole.replace(telaImovel, dashboard);
					System.out.println("***************************************************************");
				}
			}
			
			if (telaCliente.isAtiva()) {
				System.out.println("*TelaCliente* \n");
				telaCliente.show();
				comando = telaCliente.getInput();
			
				if (comando == telaCliente.getComando(cadastrar)) {
					// cadastrar cliente
					System.out.println("***************************************************************");
					String nome = getStringInput(scanner, "Digite seu nome: ");
					String telefone = getStringInput(scanner, "Digite seu telefone: ");
					String documento = getStringInput(scanner, "Digite seu CPF: ");
					String email = getStringInput(scanner, "Digite o seu email: ");
					String estado = getStringInput(scanner, "Digite o estado da sua residencia: ");
					String cidade = getStringInput(scanner, "Digite a cidade da sua residencia: ");
					String bairro = getStringInput(scanner, "Digite o bairro da sua residencia: ");
					String rua = getStringInput(scanner, "Digite a rua da sua residencia: ");
					int numero = getIntInput(scanner, "Digite o numero da sua residencia: ");
					int cep = getIntInput(scanner, "Digite o cep da sua residencia: ");
					String complemento = getStringInput(scanner, "Digite o complemento da sua residencia: ");
				
					System.out.println("Em relacao a suas preferencias");
					
					boolean aluguel = getBooleanInput(scanner, "Voce busca imovel para aluguel ?(1-Sim /0-Nao): ");
					boolean esquina = getBooleanInput(scanner, "Voce busca um imovel em esquina ?(1-Sim /0-Nao): ");
					boolean condominio = getBooleanInput(scanner, "Voce busca um imovel dentro de um condominio ?(1-Sim /0-Nao): ");
					
					TipoImovel tipoImovel = TipoImovel.CASA;
					int input = getIntInput(scanner, "Qual tipo de imovel voce procura ?(1-Casa /2-Apartamento/ 3-Terreno ): ");
					if (input == 1) {
						tipoImovel = TipoImovel.CASA;
					} else if (input==2) {
						tipoImovel=TipoImovel.APARTAMENTO;
					} else if (input == 3) {
						tipoImovel=TipoImovel.TERRENO;
					}
					
					double areaMinimaTerreno = getDoubleInput(scanner, "Qual a minima area do imovel: ");
					
					Restricao proposito = null;
					boolean inputBool = getBooleanInput(scanner, "Qual o Proposito do imovel (1-Residencial/0-Comercial): ");
					
					if (inputBool){
						proposito = Restricao.RESIDENCIAL;
					} else {
						proposito = Restricao.COMERCIAL;
					}
					
					double precoMax = getDoubleInput(scanner, "Qual o preco maximo desejado: ");
							
					adicionarCliente(corretor, nome, telefone, documento,
							email, estado, cidade, bairro, rua, numero, cep,
							complemento, aluguel, esquina, condominio,
							tipoImovel, areaMinimaTerreno, proposito, precoMax);
					System.out.println("***************************************************************");
				} else if (comando == telaCliente.getComando(remover)) {
					// remover cliente
					System.out.println("***************************************************************");
					Cliente clienteRemover = buscaCliente(corretor, getStringInput(scanner, "Digite o CPF do cliente que deseja remover: "));
					removerCliente(corretor, clienteRemover);
					System.out.println("***************************************************************");
				} else if (comando == telaCliente.getComando(atualizar)) {
					// atualizar
					System.out.println("***************************************************************");
					Cliente clienteAtualizar = buscaCliente(corretor, getStringInput(scanner, "Digite o CPF do cliente que deseja atualizar: "));
					if (clienteAtualizar != null) {
						atualizarDadosCliente(clienteAtualizar);
					} else {
						System.out.println("Cliente com este CPF nao existe");
					}
					System.out.println("***************************************************************");
				} else if (comando == telaCliente.getComando(listarTodos)) {
					// listar todos
					System.out.println("***************************************************************");
					for (Cliente cliente : corretor.getClientes()) {
						System.out.println(cliente);
					}
					System.out.println("***************************************************************");
				} else if (comando == telaCliente.getComando(buscar)) {
					// buscar
					System.out.println("***************************************************************");
					String documento = getStringInput(scanner, "Digite o CPF do cliente que deseja pesquisar: ");
					Cliente cliente = buscaCliente(corretor, documento);
					if (cliente != null) {
						System.out.println(cliente);
					}else {
						System.out.println("Cliente com CPF: "+documento+" nao existe");
					}
					
					System.out.println("***************************************************************");
				} else if (comando == telaCliente.getComando(voltar)) {
					// voltar
					System.out.println("***************************************************************");
					System.out.println("voltando ao menu anterior...");
					TelaConsole.replace(telaCliente, dashboard);
					System.out.println("***************************************************************");
				}
			}
			
			if (telaProprietario.isAtiva()) {
				System.out.println("*TelaProprietario* \n");
				telaProprietario.show();
				comando = telaProprietario.getInput();
			
				if (comando == telaProprietario.getComando(cadastrar)) {
					// cadastrar proprietario
					System.out.println("***************************************************************");
					String nome = getStringInput(scanner, "Digite o nome do proprietario: ");
					String telefone = getStringInput(scanner, "Digite o telefone do proprietario: ");
					String documento = getStringInput(scanner, "Digite o CPF do proprietario: ");
					String email = getStringInput(scanner, "Digite o email do proprietario: ");
					String estado = getStringInput(scanner, "Digite o estado do proprietario: ");
					String cidade = getStringInput(scanner, "Digite a cidade do proprietario: ");
					String bairro = getStringInput(scanner, "Digite o bairro do proprietario: ");
					String rua = getStringInput(scanner, "Digite a rua do proprietario: ");
					int numero = getIntInput(scanner, "Digite o numero do proprietario: ");
					int cep = getIntInput(scanner, "Digite o cep do proprietario: ");
					String complemento = getStringInput(scanner, "Digite o complemento do proprietario: ");
					boolean empresa = getBooleanInput(scanner, "O proprietario eh representante de uma empresa ?(1- Sim/ 0-Nao): ");
					
					adicionarProprietario(nome, telefone, documento, email,
							estado, cidade, bairro, rua, numero, cep,
							complemento, empresa);
					System.out.println("***************************************************************");
				} else if (comando == telaProprietario.getComando(remover)) {
					removerProprietario();
					
					System.out.println("***************************************************************");
				} else if (comando == telaProprietario.getComando(atualizar)) {
					// atualizar
					System.out.println("***************************************************************");
					Proprietario proprietario = buscaProprietario(imobiliaria, getStringInput(scanner, "Digite o CPF do proprietario que deseja atualizar: "));
					
					atualizarDadosProprietario(proprietario);
					
					System.out.println("***************************************************************");
				} else if (comando == telaProprietario.getComando(listarTodos)) {
					// listar todos
					System.out.println("***************************************************************");
					for (Proprietario proprietario : imobiliaria.getProprietarios()) {
						System.out.println(proprietario);
					}
					System.out.println("***************************************************************");
				} else if (comando == telaProprietario.getComando(buscar)) {
					// buscar
					System.out.println("***************************************************************");
					Proprietario proprietario = buscaProprietario(imobiliaria, getStringInput(scanner, "Digite o CPF do proprietario que deseja buscar: "));
					if (proprietario != null) {
						System.out.println(proprietario);
					} else {
						System.out.println("Proprietario nao existe");
					}
				
					System.out.println("***************************************************************");
				} else if (comando == telaProprietario.getComando(voltar)) {
					// voltar
					System.out.println("***************************************************************");
					System.out.println("voltando ao menu anterior...");
					System.out.println("***************************************************************");
					TelaConsole.replace(telaProprietario, dashboard);
				}
			}
			
			if (telaProposta.isAtiva()) {
				System.out.println("*TelaProposta* \n");
				telaProposta.show();
				comando = telaProposta.getInput();
				
				if (comando == telaProposta.getComando(criarProposta)) {
					System.out.println("***************************************************************");
					Cliente comprador = buscaCliente(corretor, getStringInput(scanner, "Digite o CPF do comprador: "));
					Imovel imovel = imobiliaria.buscarImovel(getIntInput(scanner, "Digite o Id do imovel: "));
					if(comprador==null || imovel ==null) {
						System.out.println("Erro ao criar a proposta");
					}else {
						Proposta proposta = adicionarProposta(corretor, comprador,imovel);
						System.out.println(proposta);
					}
					System.out.println("***************************************************************");
				} else if (comando == telaProposta.getComando(listarTodasPropostasAbertas)){
					System.out.println("***************************************************************");
					for (Proposta pr : corretor.getPropostasEmAberto()) {
						System.out.println(pr);
					}
					System.out.println("***************************************************************");
				} else if (comando == telaProposta.getComando(listarTodasPropostasFinalizadas)){
					System.out.println("***************************************************************");
					for (Proposta pr : corretor.getPropostasFinalizadas()) {
						System.out.println(pr);
					}
					System.out.println("***************************************************************");
				} else if (comando == telaProposta.getComando(finalizarProposta)){
					System.out.println("***************************************************************");
					Proposta proposta = imobiliaria.buscarProposta(getIntInput(scanner, "Digite o id da Proposta: "));
					corretor.finalizarProposta(proposta);
					System.out.println("***************************************************************");
				} else if (comando == telaProposta.getComando(removerProposta)){
					System.out.println("***************************************************************");
					Proposta proposta = imobiliaria.buscarProposta(getIntInput(scanner, "Digite o id da Proposta: "));
					corretor.removerProposta(proposta);
					System.out.println("***************************************************************");
				} else if (comando == telaProposta.getComando(voltar)){
					System.out.println("***************************************************************");
					TelaConsole.replace(telaProposta, dashboard);
					System.out.println("***************************************************************");
				}
			}
		}
	}

	private static Proposta adicionarProposta(Corretor corretor,
			Cliente comprador, Imovel imovel) {
		Proposta proposta = corretor.criarProposta(comprador, imovel, getDoubleInput(scanner, "Digite o valor da compra: "));
		return proposta;
	}

	private static void atualizarDadosCliente(Cliente clienteAtualizar) {
		FormaPagamento formaPagamento = null;
		int input;
		
		switch (getIntInput(scanner, "O que deseja: "
									+ "\n1 - Adicionar forma de Pagameto"
									+ "\n2 - Remover forma de Pagameto"
									+ "\nDigite o que deseja atualizar: ")) {
		case 1: 
			// adiciona forma de pagamento
			input = getIntInput(scanner, "Qual forma de pagamento deseja adicionar ?(1-AVISTA /2-PERMUTA/ 3-FINANCIAMENTO): ");
			if (input == 1){
				formaPagamento = FormaPagamento.AVISTA;
			} else if (input == 2) {
				formaPagamento=FormaPagamento.PERMUTA;
			} else if (input == 3) {
				formaPagamento = FormaPagamento.FINANCIAMENTO;
			}
			
			clienteAtualizar.adicionarFormaPagamentoDesejada(formaPagamento);
			
		break;
		case 2: 
			// remover forma de pagamento
			input = getIntInput(scanner, "Qual forma de pagamento deseja remover ?(1-AVISTA /2-PERMUTA/ 3-FINANCIAMENTO): ");
			if (input == 1){
				formaPagamento = FormaPagamento.AVISTA;
			} else if (input == 2) {
				formaPagamento = FormaPagamento.PERMUTA;
			} else if (input == 3) {
				formaPagamento = FormaPagamento.FINANCIAMENTO;
			}
			clienteAtualizar.removerFormaPagamentoDesejada(formaPagamento);
			break;
		default:
			System.out.println("Comando invalido");
			break;
		}
	}

	private static void removerCliente(Corretor corretor, Cliente clienteRemover) {
		if (clienteRemover != null) {
			corretor.removerCliente(clienteRemover);
			imobiliaria.removerCliente(clienteRemover);
		} else {
			System.out.println("Cliente nao existe no sistema");
		}
	}

	private static void adicionarCliente(Corretor corretor, String nome,
			String telefone, String documento, String email, String estado,
			String cidade, String bairro, String rua, int numero, int cep,
			String complemento, boolean aluguel, boolean esquina,
			boolean condominio, TipoImovel tipoImovel,
			double areaMinimaTerreno, Restricao proposito, double precoMax) {
		Preferencia preferencia = new Preferencia(aluguel, esquina, condominio, tipoImovel, areaMinimaTerreno, proposito);
		Endereco endereco = new Endereco(cep, estado, cidade, rua, bairro, numero, complemento);
		Cliente cliente = new Cliente(nome, telefone, documento, endereco, email, precoMax, preferencia);
		// adiciona cliente para corretor e para o banco de dados simulado
		corretor.adicionarCliente(cliente);
		imobiliaria.adicionarCliente(cliente);
	}

	private static void atualizarImovel(Imovel imovel) {
		switch (getIntInput(scanner, "Qual atributo deseja atualizar: "
									+ "\n1 - Restricoes"
									+ "\n2 - Forma de PagamentoAceitas"
									+ "\n3 - Diferenciais"
									+ "\nDigite o que deseja atualizar: ")) {
		case 1:
			Restricao restricao;
			if (getBooleanInput(scanner, "Qual restricao deseja adicionar ? (1- Residencial/ 0-Comercial): ")) {
				restricao = Restricao.RESIDENCIAL;
			} else {
				restricao = Restricao.COMERCIAL;
			}
			imovel.adicionarRestricao(restricao);
			break;
		case 2:
			// adiciona forma de pagamento
			FormaPagamento formaPagamento = null;
			int input = getIntInput(scanner, "Qual forma de pagamento deseja adicionar ? (1-AVISTA /2-PERMUTA/ 3-FINANCIAMENTO): ");
			if (input == 1){
				formaPagamento=FormaPagamento.AVISTA;
			} else if (input == 2) {
				formaPagamento=FormaPagamento.PERMUTA;
			} else if (input == 3) {
				formaPagamento=FormaPagamento.FINANCIAMENTO;
			}
			if (formaPagamento != null) {
				imovel.adicionarFormaPagamento(formaPagamento);
			} else {
				System.out.println("Comando invalido");
			}
			
			break;
		case 3:
			// Adiciona diferencias
			imovel.adicionarDiferencial(getStringInput(scanner, "Digite o Diferencial do imovel: "));
			break;
		default:
			break;
		}
	}

	private static void removerImovel(Corretor corretor, Imovel imovel) {
		if (imovel != null) {
			corretor.removerImovel(imovel);
			imobiliaria.removerImovel(imovel);
		} else {
			System.out.println("Imovel nao existe");
		}
	}

	private static Imovel adicionarImovel(Corretor corretor,
			Proprietario proprietario, double preco, double iptu,
			Endereco endereco, Condominio condominio, boolean aluguel,
			String descricao, Imovel imovel, int tipoInput) {
		TipoImovel tipoImovel;
		if (tipoInput == 1) {
			tipoImovel = TipoImovel.CASA;
			double areaConstruida = getDoubleInput(scanner, "Digite a area construida: ");
			int vagasAutomovel = getIntInput(scanner, "Digite o numero de vagas para automovel: ");
			int quantidadeBanheiros = getIntInput(scanner, "Digite a quantidade de banheiros: ");						
			int quantidadeQuartos = getIntInput(scanner, "Digite a quantidade de Quartos: ");
			int quantidadeAndares = getIntInput(scanner, "Digite a quantidade de Andares: ");
			int quantidadeSuites = getIntInput(scanner, "Digite a quantidade de Suites: ");
			boolean esquina = getBooleanInput(scanner, "O imovel eh de esquina ?(1-Sim /0-Nao): ");
			boolean piscina = getBooleanInput(scanner, "O imovel tem piscina ?(1-Sim /0-Nao): ");
			double areaTerreno = getDoubleInput(scanner, "Digite a area do terrono do imovel: ");
			imovel = new Casa(endereco, condominio, proprietario, corretor, descricao, preco, iptu, aluguel, tipoImovel, 
					vagasAutomovel, quantidadeBanheiros, quantidadeQuartos, quantidadeAndares, quantidadeSuites, 
					areaConstruida, esquina, piscina, areaTerreno);
			
		} else if (tipoInput == 2) {
			tipoImovel = TipoImovel.APARTAMENTO;
			double areaConstruida = getDoubleInput(scanner, "Digite a area construida: ");
			int vagasAutomovel = getIntInput(scanner, "Digite o numero de vagas para automovel: ");
			int quantidadeBanheiros = getIntInput(scanner, "Digite a quantidade de banheiros: ");						
			int quantidadeQuartos = getIntInput(scanner, "Digite a quantidade de Quartos: ");
			int quantidadeAndares = getIntInput(scanner, "Digite a quantidade de Andares: ");
			int quantidadeSuites = getIntInput(scanner, "Digite a quantidade de Suites: ");
			int quantidadeTerraco = getIntInput(scanner, "Digite a quantidade de Terracos: ");;
			int andar = getIntInput(scanner, "O andar do Imovel: ");;
			boolean cobertura = getBooleanInput(scanner, "O imovel eh cobertura ?(1-Sim /0-Nao): ");
			boolean elevadorServico = getBooleanInput(scanner, "Tem elevador de servico no predio do imovel ?(1-Sim /0-Nao): ");
			boolean elevadorSocial = getBooleanInput(scanner, "Tem elevador social no predio do imovel ?(1-Sim /0-Nao): ");
			imovel = new Apartamento(endereco, condominio, proprietario, corretor, descricao, preco, iptu,
					aluguel, tipoImovel, vagasAutomovel, quantidadeBanheiros, quantidadeQuartos, quantidadeAndares, 
					quantidadeSuites, areaConstruida, cobertura, quantidadeTerraco, quantidadeQuartos, andar, 
					elevadorServico, elevadorSocial);
		} else if (tipoInput == 3) {
			tipoImovel = TipoImovel.TERRENO;
			boolean esquina = getBooleanInput(scanner, "O imovel eh de esquina ?(1-Sim /0-Nao): ");
			double areaTerreno = getDoubleInput(scanner, "Digite a area do terreno: ");
			imovel = new Terreno(endereco, condominio, proprietario, corretor, descricao, preco, iptu, aluguel, 
					tipoImovel, areaTerreno, esquina);
			
		}
		corretor.adicionarImovel(imovel);
		imobiliaria.adicionarImovel(imovel);
		return imovel;
	}

	private static void atualizarDadosProprietario(Proprietario proprietario) {
		switch (getIntInput(scanner, "O que deseja: "
									+ "\n1 - Atualizar Email"
									+ "\n2 - Atualizar Telefone"
									+ "\n Digite o que deseja atualizar: ")) {
		case 1:
			proprietario.setEmail(getStringInput(scanner, "Qual novo email do proprietario ? "));
			break;
		case 2:
			proprietario.setTelefone(getStringInput(scanner, "Qual novo telefone do Proprietario ? "));
			break;
		default:
			System.out.println("Comando invalido");
			break;
		}
	}

	private static void removerProprietario() {
		// remover proprietario
		System.out.println("***************************************************************");
		Proprietario proprietario = buscaProprietario(imobiliaria, getStringInput(scanner, "Digite o CPFdo proprietario que deseja remover: "));
		if (proprietario != null) {
			imobiliaria.removerProprietario(proprietario);
		} else {
			System.out.println("Proprietario nao existe");
		}
	}

	private static void adicionarProprietario(String nome, String telefone,
			String documento, String email, String estado, String cidade,
			String bairro, String rua, int numero, int cep, String complemento,
			boolean empresa) {
		Endereco endereco = new Endereco(cep, estado, cidade, rua, bairro, numero, complemento);
		Proprietario proprietario = new Proprietario(nome, telefone, documento, endereco, email, empresa);
		
		imobiliaria.adicionarProprietario(proprietario);
	}
	
	private static void deletarCorretor(Corretor corretor) {
		// remove corretor
		imobiliaria.removerCorretor(corretor);
		TelaConsole.replace(dashboard, telaLogin);
	}
	private static Corretor loginCorretor(String username, String senha) {
		Corretor corretor;
		// faz login
		corretor = loginSucesso(username, senha, imobiliaria.getCorretores());
		if (corretor != null) {
			System.out.println("Logado com succeso");
			System.out.println("\nBem vindo "+corretor.getNome());
			TelaConsole.replace(telaLogin, dashboard);
		} else {
			System.out.println("Usuario ou senha incorretos");
		}
		System.out.println("***************************************************************");
		return corretor;
	}
	private static Corretor cadastrarCorretor(String nome, String telefone,
			String documento, String estado, String cidade, String bairro,
			String rua, int numero, int cep, String complemento, String creci,
			String email, String senha) {
		Endereco endereco = new Endereco(cep, estado, cidade, rua, bairro, numero, complemento);
		// cria corretor
		Corretor cadastroCorretor = new Corretor(nome, telefone, documento, endereco, email, senha, creci);
		// adiciona corretor no banco de dados
		imobiliaria.adicionarCorretor(cadastroCorretor);
		return cadastroCorretor;
	}
	private static void cadastrarComandosProposta() {
		telaProposta.adicionaComando(1, criarProposta);
		telaProposta.adicionaComando(2, listarTodasPropostasAbertas);
		telaProposta.adicionaComando(3, listarTodasPropostasFinalizadas);
		telaProposta.adicionaComando(4, finalizarProposta);
		telaProposta.adicionaComando(5, removerProposta);
		telaProposta.adicionaComando(6, voltar);
	}
	private static void cadastrarComandosProprietario() {
		telaProprietario.adicionaComando(1, cadastrar);
		telaProprietario.adicionaComando(2, remover);
		telaProprietario.adicionaComando(3, atualizar);
		telaProprietario.adicionaComando(4, listarTodos);
		telaProprietario.adicionaComando(5, buscar);
		telaProprietario.adicionaComando(6, voltar);
	}
	private static void cadastrarComandosCliente() {
		telaCliente.adicionaComando(1, cadastrar);
		telaCliente.adicionaComando(2, remover);
		telaCliente.adicionaComando(3, atualizar);
		telaCliente.adicionaComando(4, listarTodos);
		telaCliente.adicionaComando(5, buscar);
		telaCliente.adicionaComando(6, voltar);
	}	
	
	private static void cadastrarComandosImovel() {
		telaImovel.adicionaComando(1, cadastrar);
		telaImovel.adicionaComando(2, remover);
		telaImovel.adicionaComando(3, atualizar);
		telaImovel.adicionaComando(4, listarTodos);
		telaImovel.adicionaComando(5, buscar);
		telaImovel.adicionaComando(6, buscarParaCliente);
		telaImovel.adicionaComando(7, voltar);
	}

	private static void cadastrarComandosDashboard() {
		dashboard.adicionaComando(1, imovelComando);
		dashboard.adicionaComando(2, clienteComando);
		dashboard.adicionaComando(3, proprietarioComando);
		dashboard.adicionaComando(4, propostaComando);
		dashboard.adicionaComando(5, deletarConta);
		dashboard.adicionaComando(0, deslogarComando);
	}

	private static void construirMain() {
		scanner = new Scanner(System.in);
		telaLogin = new TelaConsole(scanner);
		dashboard = new TelaConsole(scanner);
		telaImovel = new TelaConsole(scanner);
		telaCliente = new TelaConsole(scanner);
		telaProprietario = new TelaConsole(scanner);
		telaProposta = new TelaConsole(scanner);
	}
	
	private static void cadastrarComandosLogin() {
		telaLogin.adicionaComando(1, cadastrarComando);
		telaLogin.adicionaComando(2, loginComando);
		telaLogin.adicionaComando(0, sairComando);
	}
		
	private static Corretor loginSucesso(String username, String senha , ArrayList<Corretor> corretores) {
		for (Corretor corretor : corretores) {
			if (corretor.getCreci().equals(username)  && corretor.getSenha().equals(senha)) {
				return corretor;
			}
		}
		return null;
	}
	
	private static Cliente buscaCliente(Corretor corretorResponsavel, String documento) {
		for (Cliente cliente : corretorResponsavel.getClientes()) {
			if (cliente.getDocumento().equals(documento)) {
				return cliente;
			}
		}
		return null;
	}
	
	private static Proprietario buscaProprietario(Imobiliaria imobiliaria, String documento) {
		for (Proprietario proprietario : imobiliaria.getProprietarios()) {
			if (proprietario.getDocumento().equals(documento)) {
				return proprietario;
			}
		}
		return null;
	}
	
	private static Imovel buscaImovel(Corretor corretor, int id) {
		for (Imovel imovel : corretor.getImoveis()) {
			if (imovel.getId() == id) {
				return imovel;
			}
		}
		return null;
	}
	
	/*simula de forma simplificada a busca em um banco de dados pelas preferencias do cliente */
	private static ArrayList<Imovel> buscaImovel(Corretor corretor, Cliente cliente) {
		
		ArrayList<Imovel> imoveisProximos = new ArrayList<>(); 
		for (Imovel imovel : corretor.getImoveis()) {
			for (Preferencia preferencia : cliente.getPreferencias()) {
				if (compararPreferenciaPreco(imovel, cliente) ||
					compararPreferenciaCondominio(imovel, preferencia) ||
					compararPreferenciaTipo(imovel, preferencia) ||
					compararPreferenciaAluguel(imovel, preferencia) ||
					compararPreferenciaProposito(imovel, preferencia)) {
					
					imoveisProximos.add(imovel);
				}
			}
		}
		return imoveisProximos;
	}
	
	private static boolean compararPreferenciaPreco(Imovel imovel, Cliente cliente) {
		return imovel.getPreco() <= cliente.getPrecoMax();
	}
	
	private static boolean compararPreferenciaCondominio(Imovel imovel, Preferencia preferencia) {
		return (imovel.getCondominio() != null) && preferencia.isCondominio();
	}
	
	private static boolean compararPreferenciaTipo(Imovel imovel, Preferencia preferencia) {
		return imovel.getTipoImovel() == preferencia.getTipoImovel();
	}
	
	private static boolean compararPreferenciaAluguel(Imovel imovel, Preferencia preferencia) {
		return (imovel.isAluguel() && preferencia.isAluguel());
	}
	
	private static boolean compararPreferenciaProposito(Imovel imovel, Preferencia preferencia) {
		return imovel.getRestricoes().contains(preferencia.getProposito());
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
	private static boolean getBooleanInput(Scanner scanner, String mensagem) {
		System.out.print(mensagem);
		if (Integer.parseInt(scanner.nextLine()) == 1){
			return true;
		} else {
			return false;
		}
	}
	
	private static String getStringInput(Scanner scanner, String mensagem) {
		System.out.print(mensagem);
		return scanner.nextLine();
	}
}
