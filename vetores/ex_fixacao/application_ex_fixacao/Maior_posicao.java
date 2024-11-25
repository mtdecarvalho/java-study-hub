package application_ex_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double maiorValor = 0;
		int posicao = 0;
		
		for (int i = 0 ; i < vect.length ; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0 ; i < vect.length ; i++) {
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicao = i;
			}
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		sc.close();
	}

}
