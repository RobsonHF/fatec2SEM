package lote11;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		double salario;
		double reajuste;

		salario = Double.parseDouble(JOptionPane.showInputDialog("Coloque o sal�rio do funcion�rio: "));
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor do reajuste em porcentagem: "))
				/ 100;
		salario = salario * reajuste + salario;
		JOptionPane.showMessageDialog(null, "O sal�rio com o reajuste foi para: R$"+ String.format("%.2f", salario));

	}

}
