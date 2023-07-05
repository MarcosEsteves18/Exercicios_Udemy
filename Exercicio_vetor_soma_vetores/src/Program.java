<<<<<<< HEAD
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];
		
		System.out.println("Digite os valores do Vetor A ");
		for(int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do Vetor B ");
		for(int i = 0; i < vetorB.length; i++) {
			
			vetorB[i] = sc.nextInt();
		}
		
		for(int i = 0; i < vetorC.length; i++) {
				vetorC[i] = vetorA[i] + vetorB[i]; 	
		}
		
		System.out.print("VETOR RESULTANTE: ");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);	
		}
		
		sc.close();
	}

}
=======
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];
		
		System.out.println("Digite os valores do Vetor A ");
		for(int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do Vetor B ");
		for(int i = 0; i < vetorB.length; i++) {
			
			vetorB[i] = sc.nextInt();
		}
		
		for(int i = 0; i < vetorC.length; i++) {
				vetorC[i] = vetorA[i] + vetorB[i]; 	
		}
		
		System.out.print("VETOR RESULTANTE: ");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);	
		}
		
		sc.close();
	}

}
>>>>>>> 84a319cdd3912c2b87fe1e51c3209d3110cd5c85
