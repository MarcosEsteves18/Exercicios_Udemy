package Condicional02;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.printf("Digite um numero: ");
		num = sc.nextInt();
		
		
		if(num % 2 == 0){
			System.out.printf("Par");
		}
		else {
			System.out.printf("Impar");
		}
		sc.close();
	}

}
