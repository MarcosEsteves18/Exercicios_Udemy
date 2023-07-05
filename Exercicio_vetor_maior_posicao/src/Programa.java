
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vetor = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println();
		double maior = 0;
		int posMaior = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posMaior = i;
				
			}
		}
		System.out.println("MAIOR: " + maior);
		System.out.println("POSICAO DO MAIOR VALOR: " + posMaior);
		
		
		sc.close();
	}

}
