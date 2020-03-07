package lote11;

import javax.swing.JOptionPane;

public class Exercicio20 {
	
	public static void main (String[] args) {
		
		int a;
		int b;
		int c;
		double delta;
		double x1;
		double x2;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor para a: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor para b: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor para c: "));
		
		delta = (Math.pow(b, 2)-4*a*c);
		
		if (delta<0) {
			JOptionPane.showMessageDialog(null, "Nâo há raízes para esta equação, pois o delta é negativo");
		} else {
		
		x1 = ((-b+Math.sqrt(delta))/(2*a));
		x2 = ((-b-Math.sqrt(delta))/(2*a));
		
		JOptionPane.showMessageDialog(null, "As raízes são: "+x1+" e "+x2);
		}
		
	}

}
