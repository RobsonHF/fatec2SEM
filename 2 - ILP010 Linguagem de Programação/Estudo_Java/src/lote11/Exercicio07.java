package lote11;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		double comprimento;
		double largura;
		double altura;
		double volume;

		comprimento = Integer.parseInt(JOptionPane.showInputDialog("Coloque o Comprimento: "));
		largura = Integer.parseInt(JOptionPane.showInputDialog("Coloque a Largura: "));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Coloque a Altura: "));
		volume = comprimento * largura * altura;

		JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é: " + volume);

	}

}
