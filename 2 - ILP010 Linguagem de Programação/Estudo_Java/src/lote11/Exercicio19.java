package lote11;

import javax.swing.JOptionPane;

public class Exercicio19 {

	public static void main(String[] args) {

		int x;
		int y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor para x: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor para y: "));

		if (x > y) {
			JOptionPane.showMessageDialog(null, "O maior valor é o " + x);

		} else {
			JOptionPane.showMessageDialog(null, "O maior valor é o " + y);
		}

	}

}
