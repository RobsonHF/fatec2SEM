package lote11;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double celsius;
		double fahrenheit;
		
		celsius = Double.parseDouble(JOptionPane.showInputDialog("Coloque a temperatura em Celsius: "));
		fahrenheit = (9 * celsius + 160) / 5;
		
		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é de: " + fahrenheit+"ºF");


	}

}
