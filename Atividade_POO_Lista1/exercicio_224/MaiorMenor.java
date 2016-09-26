package exercicio_224;

import javax.swing.JOptionPane;

public class MaiorMenor {
	
	public static void main(String[] args){
		
		int maior = 0;
		int menor = 999;
		
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Numero: "));
		if(number1 > maior){
			maior = number1;
		}
		if (number1 < menor){
			menor = number1;
		}
		
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero: "));
		if(number2 > maior){
			maior = number2;
		}
		if (number2 < menor){
			menor = number2;
		}

		int number3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro Numero: "));
		if(number3 > maior){
			maior = number3;
		}
		if (number3 < menor){
			menor = number3;
		}

		int number4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Quarto Numero: "));
		if(number4 > maior){
			maior = number4;
		}
		if (number4 < menor){
			menor = number4;
		}

		int number5 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Quinto Numero: "));
		if(number5 > maior){
			maior = number5;
		}
		if (number5 < menor){
			menor = number5;
		}
		
		JOptionPane.showMessageDialog(null,"Maior = "+ maior + "\r\nMenor ="+ menor);
		
}
}
