import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		String[] genero = new String[n];
		double[] altura = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Altura da "+(i+1)+"a pessoa: ");
			altura[i] = sc.nextInt();
			System.out.println("Genero da "+(i+1)+"a pessoa: ");
			genero[i] = sc.next();
		}
		
		double menor = 10000;
		double maior = 0;
		for(int i = 0; i < n; i++) {
			if(altura[i] < menor) {
				menor = altura[i];
			}
			if(altura[i] > maior) {
				maior = altura[i];
			}
			
		}
		

	}

}
