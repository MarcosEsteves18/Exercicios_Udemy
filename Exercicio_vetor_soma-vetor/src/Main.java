<<<<<<< HEAD
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			
		}
		
		double soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			soma = vetor[i] + soma;
		}
		
		double media = soma / vetor.length;
		System.out.print("VALORES = ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(String.format("%.1f   ", vetor[i]));
		}
		System.out.println();
		System.out.println("SOMA = " + String.format("%.2f", soma));
		
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		
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
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			
		}
		
		double soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			soma = vetor[i] + soma;
		}
		
		double media = soma / vetor.length;
		System.out.print("VALORES = ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(String.format("%.1f   ", vetor[i]));
		}
		System.out.println();
		System.out.println("SOMA = " + String.format("%.2f", soma));
		
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		
		sc.close();
	}

}
>>>>>>> 84a319cdd3912c2b87fe1e51c3209d3110cd5c85
