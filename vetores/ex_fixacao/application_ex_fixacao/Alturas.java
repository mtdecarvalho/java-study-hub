package application_ex_fixacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Person[] vect = new Person[n];
		double avg = 0, menorDeIdade = 0;
		
		for (int i = 0 ; i < vect.length ; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Person(nome, idade, altura);
			
			avg += vect[i].getAltura();
			if (vect[i].getIdade() < 16) {
				menorDeIdade+=1;
			}
		}
		
		System.out.println();		
		System.out.printf("Altura média: %.2f\n", avg / vect.length);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", (menorDeIdade / vect.length) * 100);
		
		for (int i = 0 ; i < vect.length ; i ++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			} 
		}
		
		sc.close();
	}

}
