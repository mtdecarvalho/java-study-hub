package ex_fixacao_entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	private List<Installment> installments;
	// installment -> parcela, installments -> parcelas
	
	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		installments = new ArrayList<>();
	}

	public Integer getNumber() {
		return number;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getTotalValue() {
		return totalValue;
	}
	
	public List<Installment> getInstallments() {
		return installments;
	}
}
