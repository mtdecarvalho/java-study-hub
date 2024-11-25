package application_ex_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
			sum+=vect[i];
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f\n", sum);
		System.out.printf("MEDIA = %.2f\n", sum / vect.length);
		
		sc.close();
	}

}
