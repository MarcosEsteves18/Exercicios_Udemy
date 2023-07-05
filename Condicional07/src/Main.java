import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X, Y;
		System.out.printf("Digite o valor de X: ");
		X = sc.nextDouble();
		System.out.printf("Digite o valor de Y: ");
		Y = sc.nextDouble();
		
		if(X == 0 && Y == 0){
			System.out.printf("ORIGEM");
		}
		else if(X > 0 && Y > 0 ){
			System.out.printf("Q1");
		}
		else if(X < 0 && Y > 0){
			System.out.printf("Q2");
		}
		else if(X < 0 && Y < 0){
			System.out.printf("Q3");
		}
		else if(X > 0 && Y < 0){
			System.out.printf("Q4");
		}
		
		
		
		sc.close();
	}

}
