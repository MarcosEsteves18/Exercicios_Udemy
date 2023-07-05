<<<<<<< HEAD
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		double[] vetor = new double[n];
	
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double total = 0;
		double media = 0;
		for(int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}
		media = total / vetor.length;
		System.out.println("MEDIA: " + String.format("%.3f", media));
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media){
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
=======
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		double[] vetor = new double[n];
	
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double total = 0;
		double media = 0;
		for(int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}
		media = total / vetor.length;
		System.out.println("MEDIA: " + String.format("%.3f", media));
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media){
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
>>>>>>> 84a319cdd3912c2b87fe1e51c3209d3110cd5c85
