package lote11;

import javax.swing.JOptionPane;

public class Exercicio22 {

	public static void main(String[] args) {

		int x;
		int y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Insira o número x: "));

		do {
			y = Integer.parseInt(JOptionPane.showInputDialog("Insira um número y que seja diferente de x: "));
		} while (y == x);

		if (x > y) {
			JOptionPane.showMessageDialog(null, "Valores em ordem crescente: " + y + ", " + x);
		} else {
			JOptionPane.showMessageDialog(null, "Valores em ordem crescente: " + x + ", " + y);
		}

	}

}
