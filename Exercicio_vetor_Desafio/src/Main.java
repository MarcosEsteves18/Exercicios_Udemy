import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int rent = sc.nextInt();
		
		for(int i = 0; i < rent; i++) {
			System.out.println();
			System.out.println("Rent #" + (i+1) +":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
		
			
			vect[room] = new Rent (name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0 ; i < 10 ; i++ ) {
			if(vect[i] != null) {
			System.out.println(i + ": " + vect[i]);	
			}
		}
		
		
//		int rent = 0;
//		System.out.print("How many rooms will be rented? ");
//		
//		rent = sc.nextInt();
//		
//		String[] name = new String[rent];
//		String[] email = new String[rent];
//		int[] room = new int[10];
//		
//
//		for(int i = 0; i < rent; i++) {
//			System.out.println("Rent #" + (i+1) +":");
//			System.out.print("Name: ");
//			sc.nextLine();
//			name[i] = sc.nextLine();
//			System.out.print("Email: ");
//			//sc.nextLine();
//			email[i] = sc.nextLine();
//			System.out.print("Room: ");
//			room[i] = sc.nextInt();
//			System.out.println();
//			
//		}
//		
//		System.out.println("Busy rooms: ");
//	
//		for(int i = 0 ; i < rent ; i++ ) {
//			System.out.println(room[i]+": " + name[i] + ", " + email[i]);
//	
//		}
//		
		
		sc.close();
	}

}
