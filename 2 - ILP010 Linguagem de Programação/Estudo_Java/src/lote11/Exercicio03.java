package lote11;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		int base;
		int altura;
		double area;

		base = Integer.parseInt(JOptionPane.showInputDialog("Insira a base do tri�ngulo: "));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura do tri�ngulo: "));
		area = base * altura / 2;
		JOptionPane.showMessageDialog(null, "A �rea do tri�ngulo �: " + area + " cent�metros.");

	}

}
