package lote11;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {

		int x;
		int y;
		int c;

		x = Integer.parseInt(JOptionPane.showInputDialog("Coloque o número X: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Coloque o número Y: "));
		c = x;
		x = y;
		y = c;

		JOptionPane.showMessageDialog(null, "Após a troca, X ficou com: " + x + " e y ficou com: " + y);
	}

}
