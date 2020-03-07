package lote11;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {

		int lado;
		int area;

		lado = Integer.parseInt(JOptionPane.showInputDialog("Coloque um valor para o lado do quadrado: "));
		area = lado * 4;

		JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area);

	}

}
