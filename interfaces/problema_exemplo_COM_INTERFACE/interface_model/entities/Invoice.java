package interface_model.entities;

public class Invoice {
	private Double basicPayment;
	private Double tax;
	
	public Invoice() {
	}
	
	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FATURA:\n");
		sb.append("Pagamento basico: " + String.format("%.2f", getBasicPayment()) + "\n");
		sb.append("Imposto: " + String.format("%.2f", getTax()) + "\n");
		sb.append("Pagamento total: " + String.format("%.2f", getTotalPayment()) + "\n");
		
		return sb.toString();
	}
}
