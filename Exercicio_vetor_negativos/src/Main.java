<<<<<<< HEAD
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Numero Negativos: ");
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] <= 0) {
				System.out.println(vetor[i]);
			}
		}

		
	
		sc.close();
	}

}
=======
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Numero Negativos: ");
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] <= 0) {
				System.out.println(vetor[i]);
			}
		}

		
	
		sc.close();
	}

}
>>>>>>> 84a319cdd3912c2b87fe1e51c3209d3110cd5c85
