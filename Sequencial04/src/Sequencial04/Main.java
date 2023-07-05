package Sequencial04;
import java.util.Locale;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		double horas, porHora, salario; 
		
		numero = sc.nextInt();
		horas = sc.nextDouble();
		porHora = sc.nextDouble();
		
		salario = horas * porHora;
		
		System.out.printf("NUMBER = %d%n", numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		
		sc.close();

	}

}
