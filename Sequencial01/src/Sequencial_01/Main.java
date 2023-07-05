package Sequencial_01;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		System.out.println("Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos. ");
		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		System.out.println("Digite o primeiro numero: ");
		A = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		B = sc.nextInt();
		
		soma = A + B;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
