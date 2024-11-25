package application_ex_fixacao;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int mat[][] = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (x == mat[i][j]) {
					System.out.println("Posicao " + i + "," + j + ":");
					if (j-1 != -1) System.out.println("Esquerda: " + mat[i][j-1]);
					if (i-1 != -1) System.out.println("Acima: " + mat[i-1][j]);
					if (j+1 != mat[i].length) System.out.println("Direita: " + mat[i][j+1]);
					if (i+1 != mat.length) System.out.println("Abaixo: " + mat[i+1][j]);
				}
			}
		}

		sc.close();
	}

}
