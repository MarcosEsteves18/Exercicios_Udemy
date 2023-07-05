package Condicional03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		System.out.printf("Digite um número: ");
		num1 = sc.nextInt();
		System.out.printf("Digite outro número: ");
		num2 = sc.nextInt();
		
		if((num1 % num2 == 0)|| (num2 % num1 == 0)) {
			System.out.printf("São Multiplos");
		}
		else {
			System.out.printf("Não Sao Multiplos");
		}
		sc.close();

	}

}
