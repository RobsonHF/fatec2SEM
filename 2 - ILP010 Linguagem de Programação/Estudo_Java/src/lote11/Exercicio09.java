package lote11;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Coloque um n�mero x: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Coloque um n�mero y: "));
		
		JOptionPane.showMessageDialog(null, "A soma dos quadrados �: "+(x*x+y*y));


	}

}
