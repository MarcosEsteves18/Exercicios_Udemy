
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) +"a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
		}
		
		int menores = 0;
		double alturaMedia = 0;
		for(int i = 0; i < n; i++) {
			alturaMedia += altura[i];
			if(idade[i] < 16) {
				menores++;
			}
		}
		
		double media = alturaMedia / n;
		double percentualMenores = ((double)menores / n) * 100.0;
		
		
		System.out.println("Altura média: " + media);
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percentualMenores)+"%");
		
		for(int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		
		sc.close();
	}

}
