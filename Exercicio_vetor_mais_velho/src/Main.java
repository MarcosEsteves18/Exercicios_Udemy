import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i =0; i < n; i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
		}
		
		int maior =0;
		String nomeMaior = null;
		for(int i = 0; i < n; i++) {
			if(idade[i] > maior) {
				
				maior = idade[i];
				nomeMaior = nome[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nomeMaior);
		

	}

}
