package entities;

public class Notas {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notasTotal() {
		return nota1 + nota2 + nota3;
	}
	
	public double missingPoints() {
		if(notasTotal() < 60.00) {
			return 60.00 - notasTotal();
		}
		else {
			return 0.0;
		}
	}
	
	
	
	
	
	
}
