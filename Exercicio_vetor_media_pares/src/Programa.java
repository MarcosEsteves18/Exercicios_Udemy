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
		int[] vetor = new int[n];
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");	
			vetor[i] = sc.nextInt();
		}
		
		double total = 0;
		double cont = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 ==0) {
				total += vetor[i];
				cont++;
			}
		}
		
		double media = total / cont;
		if(cont > 1) {
			System.out.print("MEDIA DOS PARES = " + media);	
		}else {
			System.out.print("NENHUM NUMERO PAR");	
		}	
		sc.close();
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
		int[] vetor = new int[n];
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");	
			vetor[i] = sc.nextInt();
		}
		
		double total = 0;
		double cont = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 ==0) {
				total += vetor[i];
				cont++;
			}
		}
		
		double media = total / cont;
		if(cont > 1) {
			System.out.print("MEDIA DOS PARES = " + media);	
		}else {
			System.out.print("NENHUM NUMERO PAR");	
		}	
		sc.close();
	}
>>>>>>> 84a319cdd3912c2b87fe1e51c3209d3110cd5c85
}