package ex_fixacao_services;

import ex_fixacao_entities.Contract;
import ex_fixacao_entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		// método responsável por gerar as parcelas do contrato
		double basicQuota = contract.getTotalValue() / months; // valor inicial da parcela
		
		for (int i = 1 ; i <= months ; i++) {
			double interest = onlinePaymentService.interest(basicQuota, i); // recebe juros simples
			double paymentFee = onlinePaymentService.paymentFee(basicQuota + interest); // recebe taxa da plataforma
			
			double quota = basicQuota + interest + paymentFee;
			
			contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), quota));
		}
	}
}
