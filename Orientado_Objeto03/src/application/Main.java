package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas notas = new Notas();
		System.out.println("NOME ALUNO: ");
		notas.name = sc.nextLine();
		sc.reset();
		
		System.out.println("NOTAS PRIMEIRO TRIMESTRE:  ");
		notas.nota1 = sc.nextDouble();
		
		System.out.println("NOTAS SEGUNDO TRIMESTRE:  ");
		notas.nota2 = sc.nextDouble();
		
		System.out.println("NOTAS TERCEIRO TRIMESTRE: ");
		notas.nota3 = sc.nextDouble();
		
		System.out.println("NOTA FINAL: " + notas.notasTotal());
		if(notas.notasTotal() >= 60.00) {
			System.out.println("PASS");
		}else if (notas.notasTotal() < 60.00){
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", notas.missingPoints());
		}
		
		
		sc.close();
	}

}
