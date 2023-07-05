package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter converter = new CurrencyConverter();
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", converter.converterReais(price, quantity)));
		
		
		
		
		sc.close();
	}
}
