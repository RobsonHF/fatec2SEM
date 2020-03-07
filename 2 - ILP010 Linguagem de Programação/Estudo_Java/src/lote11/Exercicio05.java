package lote11;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;
		double raiz1 = 0;
		double raiz2 = 0;
		double delta = 0;

		a = Double.parseDouble(JOptionPane.showInputDialog("Coloque o coeficiente A: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Coloque o coeficiente B: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Coloque o coeficiente C; "));

		delta = ((b * b) - (4 * a * c));
		raiz1 = ((-b + Math.sqrt(delta)) / (2 * a));
		raiz2 = ((-b - Math.sqrt(delta)) / (2 * a));

		JOptionPane.showMessageDialog(null, "As raízes da equação de 2º grau são: " + raiz1 + " e " + raiz2);

	}

}
