package lote11;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {

		int nascimento;
		int atual;
		int idade;
		
		nascimento = Integer.parseInt(JOptionPane.showInputDialog("Coloque o ano de nascimento: "));
		atual = Integer.parseInt(JOptionPane.showInputDialog("Coloque o ano atual: "));
		idade = atual - nascimento;
		
		JOptionPane.showMessageDialog(null, "A idade é: "+idade+ " e daqui 17 anos terá: "+(idade+17));

	}

}
