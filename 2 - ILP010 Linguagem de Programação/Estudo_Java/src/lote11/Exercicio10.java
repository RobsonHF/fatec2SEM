package lote11;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		int x;
		int y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Coloque um n�mero X: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Coloque um n�mero y: "));

		if (x > y) {
			JOptionPane.showMessageDialog(null, "A diferen�a dos dois n�meros �: " + (x - y));

		} else {	
			JOptionPane.showMessageDialog(null, "A diferen�a dos dois n�meros �: " + (y - x));
		}

	}

}
