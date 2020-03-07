package lote11;

import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[] args) {

		int x;
		int y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Coloque o ângulo x: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Coloque o ângulo y: "));

		JOptionPane.showMessageDialog(null, "O valor do terceiro ângulo é: " + (180 - x - y));

	}

}
