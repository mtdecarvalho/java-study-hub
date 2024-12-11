package default_methods_services;

import java.security.InvalidParameterException;

public interface InterestService {

	Double getInterestRate();
	
	default Double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100, months);
	}
}
