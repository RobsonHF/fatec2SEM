package lote11;

import javax.swing.JOptionPane;

public class Exercicio08 {
	
	public static void main (String[] args) {
		
		double deposito;
		double rendimento;
		int meses;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor do dep�sito: "));
		rendimento = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor do rendimento em porcentagem: "))/100;
		meses = Integer.parseInt(JOptionPane.showInputDialog("Coloque a quantidade de meses que o dep�sito rendeu: "));
				
		deposito = (deposito+deposito*rendimento)*meses;
		
		JOptionPane.showMessageDialog(null, "Ao final do per�odo, o valor da poupan�a �: "+deposito);
		
	}

	
}
