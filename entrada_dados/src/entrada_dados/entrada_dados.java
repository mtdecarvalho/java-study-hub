package entrada_dados;

import java.util.Locale;
import java.util.Scanner;

public class entrada_dados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // para considerar o separador de decimais como ponto, é preciso definir o locale para US.
		// essa definição precisa ser feita antes do scanner ser declarado.
		Scanner sc = new Scanner(System.in);
		
		/*
		// Lendo uma string
		String x = sc.next();
		System.out.println("Você digitou: " + x);

		// Lendo um int
		int y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		// Lendo um double
		double z = sc.nextDouble(); // por padrão, usa a locale do sistema
		System.out.println(z);
		
		// Lendo um char
		char c = sc.next().charAt(0); // charAt(0) pega o primeiro char da string que o usuario inserir
		System.out.println(c);
		
		// Lendo varios dados na mesma linha separados por espaço
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: " + x + " " + y + " " + z);
		
		// Lendo um texto ate a quebra de linha:
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		*/
		
		// Em Java, ao usar qualquer comando de linha diferente do nextLine() em conjunto com o mesmo
		// e der uma quebra de linha (ou seja, enter) para ler o dado, a quebra de linha deste input
		// vai ficar pendente, e quando o sc.nextLine() for chamado, o mesmo irá consumir essa quebra de linha pendente.
		// isso pode fazer com que algum input seja "pulado" e fique vazio, somente com essa quebra de linha.
		// exemplo pratico deste comportamento:
		
		/*
		int x = sc.nextInt();
		String s1 = sc.nextLine(); // vai consumir a quebra de linha do nextInt acima e ficará "vazio"
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		*/

		// Para contornar esse comportamento, basta chamarmos um sc.nextLine() antes do sc.nextLine() que será usado
		// para a leitura de dados.
		// Exemplo prático:
		
		int x = sc.nextInt();
		sc.nextLine(); // vai ser responsável por consumir a quebra de linha pendente acima
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
