package lote11;

import javax.swing.JOptionPane;

public class Exercicio24 {

	public static void main(String[] args) {

		int x;

		x = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro: "));

		if (x % 2 == 0 && x % 3 == 0) {
			JOptionPane.showMessageDialog(null, "O valor inserido é divisível por 2 e por 3.");

		} else {
			JOptionPane.showMessageDialog(null, "O valor inserido não é divisível por 2 e por 3.");
		}

	}

}
