package exemplo_application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import exemplo_model.entities.Reservation;
import exemplo_model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			sc.nextLine();
			Instant checkin = LocalDate.parse(sc.nextLine(), fmt).atStartOfDay()
					.atZone(ZoneId.systemDefault()).toInstant();
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Instant checkout = LocalDate.parse(sc.nextLine(), fmt).atStartOfDay()
					.atZone(ZoneId.systemDefault()).toInstant();
	
			Reservation reservation = new Reservation(roomNumber, checkin, checkout);
			System.out.println("Reservation: " + reservation);
	
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.nextLine(), fmt).atStartOfDay()
					.atZone(ZoneId.systemDefault()).toInstant();
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.nextLine(), fmt).atStartOfDay()
					.atZone(ZoneId.systemDefault()).toInstant();
			
			reservation.updateDates(checkin, checkout);
			System.out.print("Reservation: " + reservation);
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();

	}

}
