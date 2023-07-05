import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0, i = 0;
		
		System.out.println("Digite um número inteiro e veja todos os seus divisores: ");
		n = sc.nextInt();
		
		for(i = 1 ; i <= n; i++){
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		
		sc.close();
	}

}
