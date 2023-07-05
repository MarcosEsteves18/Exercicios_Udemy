package entities;

public class CurrencyConverter {

	public static final double IOF = 6;
	
	public double converterReais(double quantity, double price) {
		double reais = quantity * price;
		return (reais * IOF / 100) + reais ;
	}
	
	
}
