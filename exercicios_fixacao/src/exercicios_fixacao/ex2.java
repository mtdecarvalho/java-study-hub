package exercicios_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		/*
		int x = sc.nextInt();
		if (x >= 0) {
			System.out.println("NAO NEGATIVO");
		} else System.out.println("NEGATIVO");
		*/
		
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		/*
		int x = sc.nextInt();
		if (x % 2 == 0) System.out.println("PAR");
		else System.out.println("IMPAR");
		*/
		
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		// ordem crescente ou decrescente.
		/*
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		if (x > y) {
			if (x % y == 0) System.out.println("Sao Multiplos");
			else System.out.println("Nao sao Multiplos");
		} else {
			if (y % x == 0) System.out.println("Sao Multiplos");
			else System.out.println("Nao sao Multiplos");
		}
		*/
		
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
		/*
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x >= y) System.out.printf("O JOGO DUROU %d HORA(S)", (24 - x) + y);
		else System.out.printf("O JOGO DUROU %d HORA(S)", y - x);
		*/
		
		// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		// seguir, calcule e mostre o valor da conta a pagar
		// CODIGO	ESPECIFICACAO	PRECO
		// 1		Cachorro Quente	R$ 4.00
		// 2		X-Salada		R$ 4.50
		// 3		X-Bacon			R$ 5.00
		// 4		Torrada Simples	R$ 2.00
		// 5		Refrigerante	R$ 1.50
		/*
		int x, y;
		double res = 0.0;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		switch (x) {
		case 1:
			res = 4.00 * y;
			break;
		case 2:
			res = 4.50 * y;
			break;
		case 3:
			res = 5.00 * y;
			break;
		case 4:
			res = 2.00 * y;
			break;
		case 5:
			res = 1.50 * y;
			break;
		}
		
		System.out.printf("Total: R$ %.2f", res);
		*/
		
		// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		// seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		// nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		/*
		double x;
		x = sc.nextDouble();
		
		if (0 <= x && x <= 25) System.out.println("Intervalo [0,25]");
		else if (25 < x && x <= 50) System.out.println("Intervalo (25,50]");
		else if (50 < x && x <= 75) System.out.println("Intervalo (50,75]");
		else if (75 < x && x <= 100) System.out.println("Intervalo (75,100]");
		else System.out.println("Fora de intervalo");
		*/
		
		// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		// de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		// ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		// Se o ponto estiver na origem, escreva a mensagem “Origem”.
		// Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		// situação
		/*
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) System.out.println("Origem");
		else if (x == 0) System.out.println("Eixo X");
		else if (y == 0) System.out.println("Eixo Y");
		else if (x > 0 && y > 0) System.out.println("Q1");
		else if (x > 0 && y < 0) System.out.println("Q4");
		else if (x < 0 && y > 0) System.out.println("Q2");
		else if (x < 0 && y < 0) System.out.println("Q3");
		*/
		
		// Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		// que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
		// qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		// Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		// mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

		// RENDA					IMPOSTO DE RENDA
		// de 0.00 a 2000.00		Isento
		// de 2000.01 ate 3000.00	8 %
		// de 3000.01 ate 4500.00	18 %
		// acima de 4500.00			28 %
		
		// Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
		// salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
		// de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
		// duas casas decimais.
		
		double x, total = 0.0;
		x = sc.nextDouble();
		
		if (x > 4500) {
			x -= 2000; // faixa isenta
			total += 999.99 * 0.08; // faixa entre 2000,01 e 3000,00
			x -= 999.99;
			total += 1499.99 * 0.18; // faixa entre 3000,01 e 4500,00
			x -= 1499.99;
			total += x * 0.28; // faixa acima de 4500
			System.out.printf("R$ %.2f", total);
		} else if (x > 3000.01) {
			x -= 2000; // faixa isenta
			total += 999.99 * 0.08; // faixa entre 2000,01 e 3000,00
			x -= 999.99;
			total += x * 0.18; // faixa entre 3000,01 e 4500,00
			System.out.printf("R$ %.2f", total);
		} else if (x > 2000.01) {
			x -= 2000; // faixa isenta
			total += x * 0.08; // faixa entre 2000,01 e 3000,00
			System.out.printf("R$ %.2f", total);
		} else System.out.println("Isento");
		
		sc.close();
	}

}
