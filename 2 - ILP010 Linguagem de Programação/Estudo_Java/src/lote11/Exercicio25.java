package lote11;

import javax.swing.JOptionPane;

public class Exercicio25 {

	public static void main (String Args[])
    { 
        int HI, HF, MI, MF, HJ, MJ;
               
        HI = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial"));
        MI = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial"));
        HF = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final"));
        MF = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final"));  
  
        
        if ((HF > HI) & (MF > MI))
            {
                HJ = HF - HI;
                MJ = MF - MI;
                JOptionPane.showMessageDialog(null, "A duração do jogo foi "+HJ+":"+MJ+"h");
            }      
        else
        {
            if ((HF > HI) & (MF < MI))
            {
                HJ = (HF - HI) - 1;
                MJ = (60 - MI) + MF;
                JOptionPane.showMessageDialog(null, "A duração do jogo foi "+HJ+":"+MJ+"h");
            }
            else
            {
                if ((HI > HF) & (MF > MI))
                {
                    HJ = (HI - HF) + 24;
                    MJ = MF - MI;
                    JOptionPane.showMessageDialog(null, "A duração do jogo foi "+HJ+":"+MJ+"h");
                }
                else 
                {
                    if ((HI > HF) & (MI > MF))
                    {
                        HJ = (HI - HF) + 24;
                        MJ = (60 - MI) + MF;
                        JOptionPane.showMessageDialog(null, "A duração do jogo foi "+HJ+":"+MJ+"h");
                    }
                }
                        
               
            }
        }
           
        
    }
    
}
