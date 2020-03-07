package lote11;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exercicio23 {

	public static void main(String[] args) {

		int[] valores = new int[4];
		String texto = "";

		valores[0] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro :"));

		for (int i = 1; i < 3; i++) {
			do {
				valores[i] = Integer.parseInt(JOptionPane.showInputDialog("insira um valor maior que o anterior :"));
			} while (valores[i] <= valores[i - 1]);

		}

		valores[3] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor qualquer :"));

		Arrays.parallelSort(valores);

		for (int i = 0; i < 4; i++) {
			texto = texto + valores[i] + ", ";

		}
		JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " + texto);
	}

}
