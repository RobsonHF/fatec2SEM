/*
 *************************
Lote 01 - Exercício 28 - Receba o preço atual e a média mensal de vendas de
                        um produto. 
                        Calcule e mostre o novo preço sabendo que:
                        Venda Mensal Preço Atual Preço Novo
                        < 500 < 30 + 10%
                        >= 500 e < 1000 >= 30 e < 80 +15%
                        >= 1000 >= 80 - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.

Programador: Fernanda Pinheiro Reis
Professor: Ricardo Satoshi
 *************************
 */
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Lt01_EstSeq28 {
    private static DecimalFormat casas2 = new DecimalFormat (".##");
    public static void main (String args[]) {
     
        int qtdd;
        double preco;
        

        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto em Reais (R$): "));
        qtdd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos vendidos no mês: "));
        
        if (qtdd < 500 && preco < 30){
            preco = preco * 1.10;
            JOptionPane.showMessageDialog(null,"O valor do produto com reajuste é de R$ " +casas2.format(preco) +".");
        }   else 
                if (qtdd >= 500 && qtdd < 1000 && preco >= 30 && preco < 80) {
                    preco = preco * 1.15;
                    JOptionPane.showMessageDialog(null,"O valor do produto com reajuste é de R$ " +casas2.format(preco) +".");
            }   else 
                    if (qtdd >= 1000 && preco >= 80) {
                        preco = preco * 1.05;
                        JOptionPane.showMessageDialog(null,"O valor do produto com reajuste é de R$ " +casas2.format(preco) +".");
                    }   
        else {
                JOptionPane.showMessageDialog(null,"Não houve ajuste no preço do produto.");
             }
    }       
}
