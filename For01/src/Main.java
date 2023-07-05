import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		int num = sc.nextInt();
		
		for(i = 1; i < num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}

}
