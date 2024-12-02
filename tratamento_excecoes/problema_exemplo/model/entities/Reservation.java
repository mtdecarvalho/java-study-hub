package model.entities;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Instant checkin;
	private Instant checkout;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
	
	public Reservation() {
	}
	
	public Reservation(Integer roomNumber, Instant checkin, Instant checkout) throws DomainException {
		if (!checkout.isAfter(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Instant getCheckin() {
		return checkin;
	}

	public Instant getCheckout() {
		return checkout;
	}

	public long duration() {
		return Duration.between(checkin, checkout).toDays();
	}
	
	public void updateDates(Instant checkin, Instant checkout) throws DomainException {
		Instant now = Instant.now();
		if (checkin.isBefore(now) || checkout.isBefore(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkout.isAfter(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: " 
				+ fmt.format(checkin)
				+ ", check-out: "
				+ fmt.format(checkout)
				+ ", "
				+ duration()
				+ " nights";
	}
}
