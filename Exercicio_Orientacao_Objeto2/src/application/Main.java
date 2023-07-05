package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.print("Name : ");	
		funcionario.nome = sc.nextLine();
		sc.reset();
		
		System.out.print("Salario Bruto : ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto : ");
		funcionario.imposto = sc.nextDouble();
		System.out.println();	
		
		System.out.println("Employee : " + funcionario.nome + ", $ " + funcionario.salarioLiquido());	
		
		System.out.println();	
		System.out.print("Qual percentagem o aumento de salário? ");	
		double porcentagem = sc.nextDouble();
		funcionario.aumentoSalario(porcentagem);
		
		System.out.println();	
		System.out.println("Dados Atualizados: " + funcionario);	
		
	
		sc.close();
	}

}
