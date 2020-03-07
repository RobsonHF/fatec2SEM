package lote11;

import javax.swing.JOptionPane;

public class Exercicio17 {

	public static void main(String[] args) {

		int tempo;
		double velocidadeMedia;

		tempo = Integer.parseInt(JOptionPane.showInputDialog("Coloque o tempo da viagem: "));
		velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Coloque a velocidade média da viagem: "));

		JOptionPane.showMessageDialog(null,
				"Nessa viagem o carro gastou " + (velocidadeMedia / tempo / 12) + " Litros de combustível.");

	}

}
