package Condicional04;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal;
		System.out.printf("Digite a Hora Inicial: ");
		horaInicial = sc.nextInt();
		System.out.printf("Digite a Hora Final: ");
		horaFinal = sc.nextInt();
		
		int tempo;
		if(horaInicial < horaFinal) {
			tempo = horaFinal - horaInicial;
		}
		else {
			tempo = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O Jogo Durou %d Horas ",tempo);
		sc.close();
	}

}
