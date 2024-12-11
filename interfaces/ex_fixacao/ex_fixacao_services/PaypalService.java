package ex_fixacao_services;

public class PaypalService implements OnlinePaymentService {
	
	public Double paymentFee(Double amount) {
		// cálculo da taxa de pagamento
		return amount * 0.02;
	}
	
	public Double interest(Double amount, Integer months) { 
		// cálculo de juros simples
		return (amount * 0.01) * months;
	}
}
