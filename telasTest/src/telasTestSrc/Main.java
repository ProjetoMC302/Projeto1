package telasTestSrc;

import java.awt.*;

import javax.swing.*;

public class Main {
	public static void main (String[] args) {
		JFrame framePrincipal = new JFrame();
		JPanel cards = new JPanel(new CardLayout());
		framePrincipal.getContentPane().add(cards, BorderLayout.CENTER);
		cards.add(new novoCorretor(), "telaNovoCorretor");
		cards.add(new novoImovel(), "i");
		cards.add(new novoCliente(), "cl");
		cards.add(new novoProprietario(), "p");
		CardLayout cl = (CardLayout)(cards.getLayout());
		framePrincipal.setVisible(true);
		framePrincipal.setSize(1000, 1000);
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cl.show(cards, "cl");
	}
}
