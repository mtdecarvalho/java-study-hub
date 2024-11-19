package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double avg = 0;
		
		for (int i = 0 ; i < vect.length ; i++) {
			vect[i] = sc.nextDouble();
			avg += vect[i];
		}
		
		avg /= vect.length;
		
		System.out.printf("AVERAGE HEIGHT = %.2f", avg);
		
		sc.close();
	}

}
