package lote11;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		
		double raio;
		double pi = 3.14;
		double comprimento;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor do raio: "));
		comprimento = 2*pi*raio;
		
		JOptionPane.showMessageDialog(null, "O comprimento da circunferência é: "+String.format("%.2f", comprimento));


	}

}
