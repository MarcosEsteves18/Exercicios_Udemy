
import java.util.Locale;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta cliente1 = new Conta();
		
		System.out.println("Enter account number: ");
		cliente1.setNumeroConta(sc.nextInt());
		System.out.println("Enter account holder: ");
		sc.nextLine();
		cliente1.setNomeTitular(sc.nextLine());
			
		System.out.println("Is there na initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);

		if(resposta == 'y') {
			System.out.println("Enter initial deposit value: ");
			cliente1.setValorConta(sc.nextDouble());
		}else {
			cliente1.setValorConta(0);
		}
		System.out.println();
		
		System.out.println("Accont data: ");
		System.out.println(cliente1.toString());
		System.out.println();
		
		System.out.println("Enter a deposit valeu: ");
		double deposito = sc.nextDouble();
		cliente1.deposito(deposito);
		System.out.println("Update Accont data: ");
		System.out.println(cliente1.toString());
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		cliente1.saque(saque);
		System.out.println(cliente1.toString());
	
		
		sc.close();
	}

}

