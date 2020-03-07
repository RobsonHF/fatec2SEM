package lote11;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		int base;
		int altura;
		double area;

		base = Integer.parseInt(JOptionPane.showInputDialog("Insira a base do triângulo: "));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura do triângulo: "));
		area = base * altura / 2;
		JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area + " centímetros.");

	}

}
