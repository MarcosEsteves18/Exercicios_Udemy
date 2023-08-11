import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int [] notas = {100, 50, 20, 10, 5 ,2};
		int [] cont = new int [notas.length];
		//int resto = 0;
		int valor = 0;

		System.out.println("Digite um Valor para Sacar: ");
		valor = sc.nextInt();
		
		for(int i = 0; i < notas.length; i++) {
			cont[i] = valor / notas[i];
			valor = valor - (notas[i] * cont[i]);
			
		}
				
		for(int i = 0; i < cont.length; i++) {
			if(cont[i] > 0) {
				System.out.println("Entrege " + cont[i] + " notas de R$" + notas[i] +"." );
			}	
		}
		
		if(valor < 2) {
			System.out.println("1 real nao é possivel sacar");
		}
	}

}
