package lote11;

import javax.swing.JOptionPane;

public class Exercicio21 {

	public static void main(String[] args) {

		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;

		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 3: "));
		nota4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 4: "));

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "APROVADO");
		} else if (media < 3) {
			JOptionPane.showMessageDialog(null, "RETIDO");
		} else {
			JOptionPane.showMessageDialog(null, "EXAME");
		}

	}

}
