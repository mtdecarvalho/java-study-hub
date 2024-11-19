package application_ex_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] alturas = new double[n];
		String[] generos = new String[n]; // CM, CF, NB, TM, TF
		double menorAltura = 0;
		double maiorAltura = 0;
		double mediaAlturaTransFem = 0;
		int qtdTransFem = 0;
		int qtdCisMale = 0;
		
		for (int i = 0 ; i < n ; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			sc.nextLine();
			generos[i] = sc.nextLine();
		}
		
		for (int i = 0; i < n ; i++) {
			if (i == 0) menorAltura = alturas[i];
			
			if (alturas[i] > maiorAltura) maiorAltura = alturas[i];
			else if (alturas[i] < menorAltura) menorAltura = alturas[i];
			if (generos[i].equals("TF")) {
				mediaAlturaTransFem += alturas[i];
				qtdTransFem += 1;
			} else if (generos[i].equals("CM")) {
				qtdCisMale += 1;
			}
		}
		
		mediaAlturaTransFem /= qtdTransFem;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres trans = %.2f\n", mediaAlturaTransFem);
		System.out.printf("Numero de homens cis = %d\n", qtdCisMale);
		
		sc.close();
	}

}
