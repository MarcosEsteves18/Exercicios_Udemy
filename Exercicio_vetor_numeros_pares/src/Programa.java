
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		int[] numero = new int[n];
		
		for(int i = 0; i < numero.length; i++) {
			System.out.print("Digite um numero: ");
			numero[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.print("NUMEROS PARES:");
		
		int cont = 0;
		for(int i = 0; i < n; i++) {
			if(numero[i] % 2 == 0) {
				System.out.print(numero[i] +"\t");
				cont++;
			}
		}
		
		System.out.println("QUANTIDADE DE PARES : " + cont);
		
		sc.close();
	}

}
