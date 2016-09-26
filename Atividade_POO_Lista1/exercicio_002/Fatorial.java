package exercicio_002;

import javax.swing.JOptionPane;

public class Fatorial {
    public static void main(int numero) {
        int multiplicacao = 1;
        int conta = numero;
        JOptionPane.showMessageDialog(null,numero+"!=");
        while (conta > 1){
            multiplicacao *= conta;
            JOptionPane.showMessageDialog(null,conta +"*");
            conta--;
        }
        JOptionPane.showMessageDialog(null,"1= "+multiplicacao);
        //JOptionPane.showMessageDialog(null, "Resultado: \n != "+nume+ "\n *= "+cont+"\n Multiplicação = "+mult);
    }
    
}
