package application_ex_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double media = 0;
		
		for (int i = 0 ; i < vect.length ; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			media += vect[i];
		}
		
		media /= vect.length;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i = 0 ; i < vect.length ; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
