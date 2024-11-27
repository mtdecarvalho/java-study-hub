package ex_fixacao_entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	private Instant manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Instant manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Instant getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Instant manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return name 
				+ " (used) $ "
				+ String.format("%.2f", price)
				+ " (Manufacture date: "
				+ DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault()).format(manufactureDate)
				+ ")";
	}
}
