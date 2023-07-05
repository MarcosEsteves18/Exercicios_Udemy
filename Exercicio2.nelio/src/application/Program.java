package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee funcionario = new Employee();
		
		System.out.println("Name: ");
		funcionario.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Employee: " + funcionario.toString() );
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		
		System.out.println("Updated data: " + funcionario.toString() );
		
		sc.close();
	}

}
