import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipo, alcool = 0, gasolina = 0, diesel = 0;
		
		System.out.printf("Digite o numero do combustivel solicitado: ");
		tipo = sc.nextInt();
		
		while(tipo != 4){
			if(tipo == 1) {
				alcool = alcool + 1;
			}else if(tipo == 2) {
				gasolina = gasolina + 1;
			}else if(tipo == 3 ) {
				diesel = diesel + 1;
			}
			tipo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
