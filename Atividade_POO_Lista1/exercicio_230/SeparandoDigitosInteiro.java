package exercicio_230;

import java.util.Scanner;

public class SeparandoDigitosInteiro{
	
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		int n;

		System.out.print("Digite um Numero com 5 Digitos:");
		n = a.nextInt();
		

		System.out.print((n/10000)%10+"   ");
		System.out.print((n/1000)%10+"   ");
		System.out.print((n/100)%10+"   ");
		System.out.print((n/10)%10+"   ");
		System.out.print(n%10+"   ");
	}
}