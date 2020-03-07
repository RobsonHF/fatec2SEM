package lote11;

import javax.swing.JOptionPane;

public class Exercicio08 {
	
	public static void main (String[] args) {
		
		double deposito;
		double rendimento;
		int meses;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor do depósito: "));
		rendimento = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor do rendimento em porcentagem: "))/100;
		meses = Integer.parseInt(JOptionPane.showInputDialog("Coloque a quantidade de meses que o depósito rendeu: "));
				
		deposito = (deposito+deposito*rendimento)*meses;
		
		JOptionPane.showMessageDialog(null, "Ao final do período, o valor da poupança é: "+deposito);
		
	}

	
}
