package ex_fixacao_entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Client {
	private String name;
	private String email;
	private Instant birthDate;
	
	public Client() {
	}
	
	public Client(String name, String email, Instant birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}
	
	public String toString() {
		return getName() +
				" (" +
				DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault()).format(getBirthDate())
				+ ") - " + getEmail();
	}
	
}
