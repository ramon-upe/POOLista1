package exercicio_216;

import javax.swing.JOptionPane;

public class ComparandoInteiros {

    public static void main(String[] args) {
 
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Numero: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero: "));
        
        if(num1 == num2){
         JOptionPane.showMessageDialog(null,"These numbers are equal");
        }
        if(num1 > num2){
          JOptionPane.showMessageDialog(null,num1+"Is Large!");
        }
        if(num1 < num2){
          JOptionPane.showMessageDialog(null,num2+"Is Large!");
        }
    
    }
}
