package lote11;

import javax.swing.JOptionPane;

public class Exercicio16 {

	public static void main(String[] args) {

		double horasTrabalhadas;
		double valorHora;
		double percentualDesconto;
		int numeroDescendentes;
		double salario;
		double salarioLiquido;

		horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Coloque o n�mero de horas trabalhadas: "));
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor da hora trabalhada: "));
		percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Coloque o percentual de desconto: "))
				/ 100;
		numeroDescendentes = Integer.parseInt(JOptionPane.showInputDialog("Coloque o n�mer ode descendentes: "));

		salario = horasTrabalhadas * valorHora;
		salarioLiquido = (salario - salario * percentualDesconto) + (double) numeroDescendentes * 100;

		JOptionPane.showMessageDialog(null, "O sal�rio a receber ser� de: " + salarioLiquido);

	}

}
