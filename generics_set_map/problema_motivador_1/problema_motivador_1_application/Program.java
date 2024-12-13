package problema_motivador_1_application;

import java.util.Scanner;

import problema_motivador_1_entities.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			ps.addValue(sc.nextInt());
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}

}
