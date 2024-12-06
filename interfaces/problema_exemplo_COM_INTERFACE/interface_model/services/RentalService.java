package interface_model.services;

import java.time.Duration;

import interface_model.entities.CarRental;
import interface_model.entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}
	
	public void processInvoice(CarRental cr) {
		double minutes = Duration.between(cr.getStart(), cr.getFinish()).toMinutes();
		double hours = minutes / 60;
		
		double basicPayment = 0;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}

		cr.setInvoice(new Invoice(basicPayment, taxService.tax(basicPayment)));
	}
}
