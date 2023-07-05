package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno1 = new Aluno();
		
		System.out.println("Name: ");
		aluno1.name = sc.nextLine();
		System.out.println("Nota 1: ");
		aluno1.nota1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		aluno1.nota2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		aluno1.nota3 = sc.nextDouble();
		
		System.out.println("Final Grade = " + String.format("%.2f", aluno1.notaFinal()));
		
		if (aluno1.notaFinal() < 60.0) {
			System.out.println("FAILED \n");
			System.out.println("MISSING "+ String.format("%.2f", aluno1.sePassou())+" POINTS \n");
			}
			else {
			System.out.println("PASS");
			}
		
		sc.close();
	}

}
