import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char comando;
		//instancia scanner para entrdad de dados
		Scanner scanner = new Scanner(System.in);
		
		//criar banco de dados simulado
		Imobiliaria imobiliaria = new Imobiliaria();
		
		
		
		
		//criar e cadastrar corretores
		Corretor corretor = new Corretor("Sophia", "sophiaCell", "sophiaCorretora@gmail.com"); 
		//coloca corretor no banco de dados simulado
		imobiliaria.adicionarCorretor(corretor);
		
		//cadastrar proprietarios
		Proprietario proprietario = new Proprietario("Bruno", "brunoCell", "BrunoProprietario@gmail.com");
		imobiliaria.adicionarProprietario(proprietario);
		//cadastrar imoveis do proprietario
		//cadastrar cliente
		//buscar pelo imovel desejado pelo cliente
		//criar proposta de negocio
		//fechar proposta de imovel
	}

}
