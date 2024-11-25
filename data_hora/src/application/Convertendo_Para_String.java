package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Convertendo_Para_String {

	public static void main(String[] args) {
		// Convertendo data-hora para String

		LocalDate d04 = LocalDate.parse("2022-09-04");
		LocalDateTime d05 = LocalDateTime.parse("2022-09-04T22:10:12");
		Instant d06 = Instant.parse("2022-09-04T22:10:12Z");

		/*
		 * Por padrão, todos os objetos data-hora (LocalDate, LocalDateTime, Instant)
		 * são impressos com o formato ISO 8601 Se quisermos imprimir de uma forma
		 * diferente, precisamos usar o DateTimeFormatter
		 */

		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		/*
		 * Podemos usar a função format() tanto de um objeto LocalDate/LocalDateTime,
		 * passando um DateTimeFormatter como sobrecarga Como diretamente em um
		 * DateTimeFormatter, passando o LocalDate/LocalDateTime como sobrecarga:
		 * 
		 * variáveis sendo utilizadas como exemplo: LocalDate d04 =
		 * LocalDate.parse("2022-09-04"); LocalDateTime d05 =
		 * LocalDateTime.parse("2022-09-04T22:10:12"); Instant d06 =
		 * Instant.parse("2022-09-04T22:10:12Z");
		 * 
		 */

		System.out.println(d04.format(fmt3));
		System.out.println(fmt3.format(d04));
		System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println(d05.format(fmt4));

		/*
		 * Para fazermos essa conversão com um objeto Instant, precisamos entender que o
		 * Instant armazena informações de data e hora globais, e portanto sua zona
		 * horária e data variam de acordo com a zona. Portanto, para convertermos esse
		 * objeto, precisamos especificar qual a zona horária que será utilizada na
		 * formatação. Para isso usamos a função withZone() do DateTimeFormatter:
		 */

		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

		/*
		 * Como o withZone() recebe uma zona horária, podemos usar o método estático
		 * ZoneId.systemDefault() para imprimir a string com a zona horária do PC sendo
		 * usado naquele momento.
		 */

		System.out.println(fmt5.format(d06));

		/*
		 * A classe Instant não possui método format(), então precisamos usar o format()
		 * do próprio DateTimeFormatter No caso, o valor do d06 é 2022-09-04T22:10:12Z,
		 * mas como usamos o formatter fmt5, o mesmo fez a conversão de zonas horárias
		 * automaticamente, e imprimiu o resultado na zona horária local, que é
		 * 04/09/2022 19:10
		 * 
		 * Além disso, conversões de Instant para String PRECISAM de especificação da
		 * zona horária, sem isso o Java gera uma exceção.
		 * 
		 * A documentação do DateTimeFormatter também especifica algumas constantes que
		 * podem ser usadas para formatar Um exemplo é a ISO_DATE_TIME e ISO_INSTANT.
		 */
	}

}
