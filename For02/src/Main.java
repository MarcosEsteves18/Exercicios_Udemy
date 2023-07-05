import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0, in = 0, out = 0;
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			num = sc.nextInt();
			if(num >= 10 && num <= 20) {
				in = in +1;
			}else {
				out = out + 1;
			}
			
		}
		System.out.println(in + "in");
		System.out.println(out + "out");
		
		sc.close();
	}

}
