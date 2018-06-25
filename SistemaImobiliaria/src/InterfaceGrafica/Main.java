package InterfaceGrafica;

import java.awt.EventQueue;

import Entidades.Imobiliaria;

public class Main {
	/**ESSA LINHA DEVE SER DELETADA ASSIM COMO DEVE SER ALTERADO O CONSTRUTOR DE TELAS PARA NAO RECEBER IMOBILIARIA POIS 
	 * IMOBILIARIA E SO UMA SIMULACAO DO BANCO DE DADOS*/
	public static Imobiliaria imobiliaria = new Imobiliaria();

public static void main(String[] args) { 	
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
						Telas frame = new Telas();
						frame.setVisible(true);
				} catch (Exception e) {
						e.printStackTrace();
				}
			}
		});
}


}
