package lote11;

import javax.swing.JOptionPane;

public class Exercicio18 {

	public static void main(String[] args) {

		int x;
		int y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor x: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor y: "));

		if (x > y) {
			JOptionPane.showMessageDialog(null, "A diferen�a do maior pelo menor �: " + (x - y));
		} else {
			JOptionPane.showMessageDialog(null, "A diferen�a do maior pelo menor �: " + (y - x));
		}

	}

}
