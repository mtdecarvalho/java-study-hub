package application_ex_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		int[] vect1 = new int[n];
		int[] vect2 = new int[n];
		int[] vect3 = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0 ; i < vect1.length ; i++) {
			vect1[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0 ; i < vect2.length ; i++) {
			vect2[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0 ; i < vect3.length ; i++) {
			vect3[i] = vect1[i] + vect2[i];
			System.out.println(vect3[i]);
		}
		
		sc.close();
	}

}
