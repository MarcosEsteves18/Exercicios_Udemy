package Condicional05;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod;
		double qnt, total;
		System.out.printf("Digite o Codigo do produto: ");
		cod = sc.nextInt();
		System.out.printf("Digite a quantidade do produto: ");
		qnt = sc.nextInt();
		
		total = 0;
		
		if(cod == 1){
			total = qnt * 4.00;
		}
		else if(cod == 2){
			total = qnt * 4.50;
		}
		else if(cod == 3){
			total = qnt * 5.0;
		}
		else if(cod == 4){
			total = qnt * 2.0;
		}
		else if(cod == 5){
			total = qnt * 1.50;
		}
		
		System.out.printf("Total: %.2f", total);
		
		sc.close();
	}

}
