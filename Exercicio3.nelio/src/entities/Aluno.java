package entities;

public class Aluno {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double sePassou(){
		if(notaFinal() < 60.00) {
			return 60.00 - notaFinal();
		}else {
			return 0.0;
		}
	}
}
