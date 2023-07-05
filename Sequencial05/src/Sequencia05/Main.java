package Sequencia05;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, qnt1, qnt2; 
		float preco1, preco2, valor;
		
		cod1 = sc.nextInt();
		qnt1 = sc.nextInt();
		preco1 = sc.nextFloat();
		
		cod2 = sc.nextInt();
		qnt2 = sc.nextInt();
		preco2 = sc.nextFloat();
		
		valor = (qnt1 * preco1) + (qnt2 * preco2);
		
		System.out.printf("VALOR A PAGAR: %.2f", valor);
		
		
		
		sc.close();
	}

}
