package lote11;

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {
		
		double alimento;
		double dias;
		
		alimento = Double.parseDouble(JOptionPane.showInputDialog("Coloque a quantidade de quilos de alimento: "));
		dias = (alimento*1000)/50;
		
		JOptionPane.showMessageDialog(null, "O alimento durará "+dias+" dias.");
		
		
	
	}

}
