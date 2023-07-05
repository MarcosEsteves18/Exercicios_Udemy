import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X, Y;
		X = sc.nextInt();
		Y = sc.nextInt();
		
		while(X != 0 && Y !=0) {
			if(X > 0 && Y > 0) {
				System.out.printf("Primeiro");
			}else if(X < 0 && Y > 0){
				System.out.printf("Segundo");
			}else if(X < 0 && Y < 0){
				System.out.printf("Terceiro");
			}else {
				System.out.printf("Quarto");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
			
		}
		
		sc.close();
	}

}
