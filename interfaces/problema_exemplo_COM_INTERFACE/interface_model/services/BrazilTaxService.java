package interface_model.services;

public class BrazilTaxService implements TaxService {
	
	public Double tax(Double amount) {
		return amount <= 100.00 ? amount * 0.2 : amount * 0.15;
	}
}
