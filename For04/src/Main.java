import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0, x1 = 0 , x2 = 0, i= 0;
		double div = 0;
		
		System.out.println("Quantos pares de numeros seram lidos: ");
		n = sc.nextInt();
		
		for(i = 0; i < n; i++) {
			x1 = sc.nextInt();
			x2 = sc.nextInt();
			
			if(x2 == 0) {
				System.out.println("divisao impossivel");
			}else {
				div = (double) x1 / x2;
				System.out.println(div);
			}
			

		}
		
		sc.close();
	}

}
