import java.awt.EventQueue;

import javax.swing.JFrame;

public class InterfaceGrafica {

	private JFrame frame;

	/*
	 * Essa é a nossa Interface Gráfica. :)
	 *
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGrafica window = new InterfaceGrafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Criando a Aplicação.
	 */
	public InterfaceGrafica() {
		initialize();
	}

	/**
	 * Inicializando o Frame da Aplicação.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
