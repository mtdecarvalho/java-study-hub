package application_ex_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		int p = 0;
		
		for (int i = 0 ; i < nomes.length ; i++) {
			System.out.printf("Dados da %da pessoa:", i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			if (idades[i] > p) p = idades[i];
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", nomes[p]);
		
		sc.close();
	}

}
