package exercicio_002;

import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args){
        Fatorial a = new Fatorial();
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um Numero: "));

        a.main(numero);
    }
    
}