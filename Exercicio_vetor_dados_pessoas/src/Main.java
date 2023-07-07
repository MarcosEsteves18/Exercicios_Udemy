import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		char[] genero = new char[n];
		double[] altura = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Altura da "+(i+1)+"a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da "+(i+1)+"a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double menor = 10000;
		double media = 0;
		double mediaF = 0;
		double maior = 0;
		int contM = 0;
		int contF = 0;
		
		for(int i = 0; i < n; i++) {
			if(altura[i] < menor) {
				menor = altura[i];
			}
			if(altura[i] > maior) {
				maior = altura[i];
			}
			
		}
		
		for(int i = 0; i < n; i++) {
			if(genero[i] == 'M') {
				contM++;
			}else{
				media = media + altura[i] ;
				contF++;
			}
			
		}
		
		mediaF = media / contF;
		
		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaF));
		System.out.println("Numero de homens = " + contM);
		
		sc.close();
	}

}
