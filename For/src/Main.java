import java.util.Scanner;
public class Main {

	public static void main (String [] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de vez a repetir : ");
		int N = sc.nextInt();
		
		int soma = 0;
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.printf("SOMA : %d",soma);
		sc.close();
	}
}
