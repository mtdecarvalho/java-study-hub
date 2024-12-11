package ex_fixacao_entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	// installment -> parcela, installments -> parcelas
	private LocalDate dueDate;
	private Double amount;
	
	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate; // data de vencimento
		this.amount = amount; // valor da parcela
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public Double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return dueDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ " - "
				+ String.format("%.2f", amount);
	}
}
