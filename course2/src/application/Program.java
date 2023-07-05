package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	//public static final double PI = 3.14159;
		
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.println("Circumference: "+ String.format("%.2f", c));
		
		System.out.println("Volume: "+ String.format("%.2f", v));
		
		System.out.println("PI value: "+ String.format("%.2f", Calculator.PI));
		
		sc.close();
	}
//	public static double circumference(double radius) {
//		return 2.0 * PI * radius;
//	}
//	public static double volume(double radius) {
//		return 4.0 * PI * radius * radius * radius / 3.0;
//	}
	
}
