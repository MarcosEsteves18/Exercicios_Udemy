import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeiro = 0, segundo = 0, terceiro = 0;
		
		System.out.println("Digite quantas linhas quer o valor de cubo: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			primeiro = i ;
			segundo = i * i;
			terceiro = i * i * i;
			System.out.printf("%d %d %d %n", primeiro, segundo, terceiro);
		}
		
		
		sc.close();
	}

}
