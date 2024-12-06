package model.services;

public class BrazilTaxService {
	
	public Double tax(Double amount) {
		return amount <= 100.00 ? amount * 0.2 : amount * 0.15;
	}
}
