package ex3_application;

import java.util.Locale;
import java.util.Scanner;
import ex3_entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student estudante = new Student();
		estudante.name = sc.nextLine();
		estudante.n1 = sc.nextDouble();
		estudante.n2 = sc.nextDouble();
		estudante.n3 = sc.nextDouble();

		System.out.println("FINAL GRADE = " + String.format("%.2f", estudante.finalGrade()));
		System.out.println(estudante.pass());

		sc.close();
	}

}
