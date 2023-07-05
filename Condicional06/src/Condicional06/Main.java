package Condicional06;
import java.util.Scanner;
import java.util.Locale ;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num;
		System.out.printf("Digite um Número: ");
		num = sc.nextDouble(); 
		
		if(num < 0.0 || num > 100.0){
			System.out.printf("Fora de Intervalo");
		}
		else if(num <= 25.0){
			System.out.printf("Intervalo[0,25]");
		}
		else if(num <= 50.0){
			System.out.printf("Intervalo[25,50]");
		}
		else if(num <= 75.0){
			System.out.printf("Intervalo[50,75]");
		}
		else {
			System.out.printf("Intervalo[75,100]");
		}
		
		
		sc.close();
	}

}
