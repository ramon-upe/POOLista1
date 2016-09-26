package exercicio_232;

import javax.swing.JOptionPane;

public class ValoresNegativosPositivosZero {

	public static void main(String[] args) {
		String numero; 
		int num, maior = 0, igual = 0, menor = 0;
		
		for(int i = 0; i < 5; i++) {
			numero = JOptionPane.showInputDialog("Digite um número");
			num = Integer.parseInt(numero);
			if(num > 0) {
				maior++;
			} else if(num == 0) {
				igual++;
			} else if(num < 0) {
				menor++;
			}

		}
		JOptionPane.showMessageDialog(null, maior+" Numero MAIOR que 0\n"+igual+" Numero IGUAL a 0\n"+menor+" Numero MENOR que 0");		
	}
	
}