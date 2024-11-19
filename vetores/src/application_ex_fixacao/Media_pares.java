package application_ex_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		double mediaPares = 0;
		int qtdPares = 0;
		
		for (int i = 0 ; i < vect.length ; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		for (int i = 0 ; i < vect.length ; i++) {
			if (vect[i] % 2 == 0) {
				mediaPares += vect[i];
				qtdPares++;
			}
		}
		
		mediaPares /= qtdPares;
		
		if (qtdPares > 0) {
			System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}

}
