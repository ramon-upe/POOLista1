package exercicio_215;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        int vari1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Primeiro Numero: "));
        int vari2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Segundo Numero: "));
        
        Aritmetica a = new Aritmetica(vari1, vari2);
        
        a.resultado();
        
    }
}