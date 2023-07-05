package Condiciona01;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.printf("Digite um Numero: ");
		num = sc.nextInt();
		
		if(num >= 0) {
			System.out.printf("Nao Negativo");
		}
		else {
			System.out.printf("Negativo");
		}
		sc.close();
	}

}
