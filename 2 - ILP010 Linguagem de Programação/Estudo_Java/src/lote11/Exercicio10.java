package lote11;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		int x;
		int y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Coloque um número X: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Coloque um número y: "));

		if (x > y) {
			JOptionPane.showMessageDialog(null, "A diferença dos dois números é: " + (x - y));

		} else {	
			JOptionPane.showMessageDialog(null, "A diferença dos dois números é: " + (y - x));
		}

	}

}
