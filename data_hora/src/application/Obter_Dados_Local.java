package application;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Obter_Dados_Local {

	public static void main(String[] args) {
		// Obter dados de uma data-hora local

		/*
		 * Ambas as classes LocalDate e LocalDateTime possuem métodos usados para
		 * retornar atributos específicos Abaixo seguem alguns exemplos
		 */

		LocalDate d04 = LocalDate.parse("2022-09-04");
		LocalDateTime d05 = LocalDateTime.parse("2022-09-04T22:10:12");

		System.out.println(d04.getDayOfMonth());
		System.out.println(d04.getMonthValue());
		System.out.println(d04.getYear());

		System.out.println(d05.getDayOfMonth());
		System.out.println(d05.getMonthValue());
		System.out.println(d05.getYear());

	}

}
