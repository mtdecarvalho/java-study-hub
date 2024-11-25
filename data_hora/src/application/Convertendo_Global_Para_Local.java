package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Convertendo_Global_Para_Local {

	public static void main(String[] args) {
		// Convertendo data-hora global para local

		/*
		 * Para convertermos uma data-hora global para local, precisamos informar o
		 * timezone a ser utilizado na conversão. Geralmente a timezone utilizada é a
		 * local do sistema, porém há casos em que seja uma outra timezone. Podemos usar
		 * o ZoneId.getAvailableZoneIds(), que retorna uma lista com todos os fuso
		 * horários disponíveis para a conversão.
		 * 
		 * Para essa conversão, podemos usar o método .ofInstant() de
		 * LocalDate/LocalDateTime esse método recebe um Instant e uma zona horária como
		 * sobrecarga ofInstant(<INSTANT>, <ZONA HORARIA>)
		 */
		Instant d13 = Instant.parse("2022-09-04T01:10:12Z");

		LocalDate r1 = LocalDate.ofInstant(d13, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d13, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d13, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d13, ZoneId.of("Portugal"));

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

	}

}
