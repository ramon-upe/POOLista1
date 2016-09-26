package exercicio_314;

import java.util.Scanner;


public class EmployeeTest
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Digite o seu Nome:");
			String nome = scan.nextLine();
		System.out.printf("Digite o seu Sobrenome: ");
			String sobrenome = scan.nextLine();
		System.out.printf("Informe o seu Salario Mensal: ");
			double salarioMensal = scan.nextInt();
			
		scan.nextLine();
		
		System.out.printf("Digite o seu Nome: ");
			String nome1 = scan.nextLine();
		System.out.printf("Digite o seu Sobrenome: ");
			String sobrenome1 = scan.nextLine();
		System.out.printf("Informe o seu Salario Mensal: ");
			double salarioMensal1 = scan.nextInt();
		scan.nextLine();
		
		
       Employee e1 = new Employee(nome, sobrenome, salarioMensal);
       Employee e2 = new Employee(nome1, sobrenome1, salarioMensal1);
       
       System.out.printf("Salário com aumento de :",(+salarioMensal *12) + "\n");
       
       System.out.printf("Salário com aumento de :"+salarioMensal1 *12);

	}
	
}