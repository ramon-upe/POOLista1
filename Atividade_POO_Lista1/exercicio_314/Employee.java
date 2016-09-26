package exercicio_314;

public class Employee
{
	 private String nome;
	 private String sobrenome;
	 private double salarioMensal;
	 private double salarioAnual;
	
	public Employee(String nome, String sobrenome, double salarioMensal)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
		this.salarioAnual = salarioMensal *12;
	
	System.out.printf("Salário com aumento de :"+salarioAnual *0.10);
		
		
		
	}

	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getSobrenome()
	{
		return sobrenome;
	}
	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}
	public double getSalarioMensal()
	{
		return salarioMensal;
	}
	
	public double getSalarioAnual() {
		return salarioAnual;
	}

	public void setSalarioAnual(double salarioAnual) {
		this.salarioAnual = salarioAnual;
	}

	public void setSalarioMensal(double salarioMensal)
	{
		if(salarioMensal >= 0)
			salarioAnual = salarioMensal *12;
	}
	
}
