package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double matriz[][] = new double[n][n];
		int qtdNegativos = 0;
		
		for (int i = 0 ; i < matriz.length ; i++) {
			System.out.println("Linha " + i);
			for (int j = 0 ; j < matriz[i].length ; j++) {
				System.out.println("Insira o valor a ser inserido na coluna " + j + " da linha " + i);
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz[i].length ; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Diagonal principal: ");
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz[i].length ; j++) {
				if (i == j) System.out.print(matriz[i][j] + " ");
				if (matriz[i][j] < 0) qtdNegativos++;
			}
		}
		System.out.println();
		System.out.println("Quantidade de numeros negativos na matriz: " + qtdNegativos);
		
		sc.close();
	}

}
