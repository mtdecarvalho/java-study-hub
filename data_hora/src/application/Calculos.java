package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-09-04");
		LocalDateTime d05 = LocalDateTime.parse("2022-09-04T22:10:12");
		Instant d06 = Instant.parse("2022-09-04T22:10:12Z");
		
		/*
		Em Java, as classes data-hora são imutáveis. Ou seja, todos os cálculos feitos com essas classes
		precisam retornar uma nova classe com os valores correspondentes. 
		Todas as classes de data-hora possuem métodos que podem ser usados para cálculos.
		A sintaxe geralmente é minusDays()/plusDays() minusWeeks()/plusWeeks() e assim vai.
		*/
		
		// Calculos com data-hora local:
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDateTime);
		
		// Calculos com data-hora global:
		
		/*
		 * A data-hora global não possui métodos que nem as locais. Para realizarmos calculos
		 * usamos os metodos minus() ou plus(), informando um int como quantidade seguido de um
		 * identificador temporal.
		 * Como identificador temporal, podemos usar os métodos estáticos presentes em ChronoUnit
		 * 
		 * A sintaxe geralmente é minus/plus(<INT>, <IDENTIFICADOR TEMPORAL>)
		 */
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		// Calculando a duração entre duas data-horas usando Duration
		
		/*
		O cálculo de duração entre duas data-horas é feito usando uma classe chamada Duration.
		Para o cálculo entre dois tipos data-hora, usamos o método between() do Duration.
		
	 	O duration não funciona em comparações entre duas LocalDate, pois é necessário que seja informado um horário
		para a data em questão, para que o período seja calculado.
		Portanto, precisamos converter uma LocalDate para uma LocalDateTime antes de realizar o cálculo.
		Podemos usar a função atTime() para definir um horário especifico, ou atStartOfDay() para definir como 00:00 (meia-noite)
		
		Após o cálculo ter sido feito, podemos usar vários métodos para buscar o dado mais relevante do objeto.
		No exemplo abaixo usamos o método toDays() para pegar a duração em dias entre duas data-horas.
		
		Além disso, o Duration também pode calcular a duração e retornar resultados negativos, como visto no t4.
		*/
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
		
	}

}
