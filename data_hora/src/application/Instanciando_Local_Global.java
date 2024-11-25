package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciando_Local_Global {

	public static void main(String[] args) {
		// Instanciação

		// Instanciando uma data-hora a partir do momento atual
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();

		// Convertendo uma string no formato ISO 8601 para data-hora
		
		LocalDate d04 = LocalDate.parse("2022-09-04");
		LocalDateTime d05 = LocalDateTime.parse("2022-09-04T22:10:12");
		Instant d06 = Instant.parse("2022-09-04T22:10:12Z");
		Instant d07 = Instant.parse("2022-09-04T22:10:12-03:00");
		// Neste caso, estamos passando uma string da zona horária GMT-3.
		// O Instant armazena os horários na zona horária GMT, então essa string será convertida para GMT
		// Ficando então 01:10:12Z
		
		// Convertendo uma string com formato customizado em data-hora
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("04/09/2022", fmt1);
		// a função parse aceita um objeto DateTimeFormatter na sobrecarga
		// podemos usar isso para especificar o que cada elemento da string representa com base na documentação
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime d09 = LocalDateTime.parse("04/09/2022 22:30:05", fmt2);
		
		// Alternativamente, podemos usar a função diretamente na sobrecarga, sem necessidade de instanciar a classe
		LocalDateTime d10 = LocalDateTime.parse("04/09/2022 22:30:05", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		
		LocalDate d11 = LocalDate.of(2022, 04, 9);
		LocalDateTime d12 = LocalDateTime.of(2022, 04, 9, 11, 23);
		
		System.out.println("D01 = " + d01);
		System.out.println("D02 = " + d02);
		System.out.println("D03 = " + d03);
		System.out.println("D04 = " + d04);
		System.out.println("D05 = " + d05);
		System.out.println("D06 = " + d06);
		System.out.println("D07 = " + d07); // Vai ser impresso com horário 01:10:12Z por estar armazenado em GMT
		System.out.println("D08 = " + d08);
		System.out.println("D09 = " + d09);
		System.out.println("D10 = " + d10);
		System.out.println("D11 = " + d11);
		System.out.println("D12 = " + d12);
		
	}

}
