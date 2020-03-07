package lote11;

import javax.swing.JOptionPane;

public class Exercicio15 {
	
	public static void main (String[] args) {
		
		int c1;
		int c2;
		
		c1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor do cateto 1: "));
		c2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor do cateto 2: "));
		
		JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: "+(Math.sqrt(Math.pow(c1, 2)+Math.pow(c2, 2))));
	}

}
