package lote11;

import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[] args) {

		int x;
		int y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Coloque o �ngulo x: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Coloque o �ngulo y: "));

		JOptionPane.showMessageDialog(null, "O valor do terceiro �ngulo �: " + (180 - x - y));

	}

}
