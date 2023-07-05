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
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] soma = new double[n];
		
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Nota 1: ");
			nota1[i] = sc.nextDouble();
			System.out.print("Nota 2: ");
			nota2[i] = sc.nextDouble();
			
			soma[i] = (nota1[i] + nota2[i]) / 2; 
		}
		
		String index ;
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < n; i++) {
			if(soma[i] >= 6.0) {
				index = nome[i];
				System.out.println(nome[i]);
			}
		}
		

	}

}
