package exercicio_225;

import javax.swing.JOptionPane;

public class ImparPar {
	
	private static int impar;

	public static void main(String[] args){
		
		int num1;
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero: "));
		
		if(num1 % 2 == 0 ){
			JOptionPane.showMessageDialog(null,"O número é par!");
		}else{
			impar = num1;
			JOptionPane.showMessageDialog(null,"O número é impar!");
		}
	
		
		
	}

}