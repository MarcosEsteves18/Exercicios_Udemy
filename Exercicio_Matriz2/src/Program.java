import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qauntas linhas e colunas teram sua matrix: ");
		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] matriz = new int [l][c]; 
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Qual numero quer visualizar dentro da matriz: ");
		int numero = sc.nextInt();
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				if(matriz[i][j] == numero) {
					System.out.println("Posição " + i + "," + j + ":" );
					if(j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if(j < matriz[i].length -1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i < matriz.length-1) {
						System.out.println("Left: " + matriz[i+1][j]);
					}
				}
				
			}
		}
		
		
		
		sc.close();
	}

}
