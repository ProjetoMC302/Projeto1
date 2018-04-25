package InterfaceConsole;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import Entidades.*;

/**
 * TelaConsole - Representa uma tela no console
 * IMPORTANTE: A classe so funciona para um programa rodando com interface no console  
 *
 */

public class TelaConsole {
	private boolean ativa;
	private Scanner scanner;
	
	private static int COMANDO_INVALIDO = -1;
	
	/*comandos - ArrayList de comandos aceito pela tela*/
	private ArrayList<Integer> idComandos;
	
	/*mensagenss - ArrayList de mensagem que ser�o apresentadas na tela explicando a 
	 * funcionalidade de cada comando.
	 * mensagens.get(i) - string explicando a funcionalidade do comando em comando.get(i) */
	private ArrayList<String> comandos;
	
	public TelaConsole(Scanner scanner) {
		this.scanner = scanner;
		idComandos = new ArrayList<>();
		comandos = new ArrayList<>();
	}
	
	public static void replace(TelaConsole antiga, TelaConsole nova) {
		antiga.hide();
		nova.setAtiva(true);
	}
	
	public static int COMANDO_INVALIDO() {
		return COMANDO_INVALIDO;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public int getComando(String comando) {
		if(comandos.contains(comando)&&idComandos.size()==comandos.size()) {
			return idComandos.get(comandos.indexOf(comando));
		}
		 return COMANDO_INVALIDO;
	}

	/**
	 * show - metodo que mostra no console a tela criada. Mostra os comandos e suas funcionalidades
	 * 
	 * @return boolean se conseguiu ou nao mostrar a tela no console
	 * */
	public boolean show() {
		//mostra no console a tela
		if(idComandos.size()!=comandos.size()) {
			//numero diferente de mensagem e comando erro
			return false;
		}
		for (int i = 0; i < idComandos.size(); i++) {
			//Apresenta na tela o comando e sua respectiva funcionalidade
			System.out.println(idComandos.get(i) + " - "+ comandos.get(i));
		}
		System.out.print("\nDigite seu comando: ");
		ativa = true;
		return true;
	}
	
	public void hide() {
		ativa = false;
	}
	
	public boolean adicionaComando(int comando,String mensagem) {
		if(idComandos.add(comando) && comandos.add(mensagem)) {
			return true;
		}
		return false;
	}
	
	/**
	 * getComando - metodo que le um comando do teclado
	 * 
	 * @return -1(menos 1) caso o comando seja invalido
	 * */
	public int getInput() {
		boolean erro = true;
		int comando=COMANDO_INVALIDO; 
		while(erro) {
			try{
				erro =false;
				comando = Integer.parseInt(scanner.nextLine());		
				if(!idComandos.contains(comando)) {
					erro = true;
					System.out.println("Comando invalido");
					System.out.print("Tente Novamente: ");
				}
			}catch (Exception e) {
				erro = true;
				System.out.println("Comando invalido");
				System.out.print("Tente Novamente: ");
			}
		}
		
		return comando;
	}
}
