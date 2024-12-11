package default_methods_services;

public class UsaInterestService implements InterestService {
	private Double interestRate;
	
	public UsaInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public Double getInterestRate() {
		return interestRate;
	}
}
