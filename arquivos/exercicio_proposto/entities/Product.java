package entities;

public class Product {
	private String name;
	private Double unitPrice;
	private Integer quantity;
	
	
	public Product(String name, Double unitPrice, Integer quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	public Double subTotal() {
		return unitPrice * quantity;
	}
}
