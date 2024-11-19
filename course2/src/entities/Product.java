package entities;

public class Product {
	public String nome;
	public double preco;
	public int qtd;

	public String toString() {
		return nome
			+ ", $ "
			+ String.format("%.2f", preco)
			+ ", "
			+ qtd
			+ " units, Total: $ "
			+ String.format("%.2f\n", totalValueInStock());
	}

	private double totalValueInStock() {
		return preco * qtd;
	}

	public void addProducts(int qtd) {
		this.qtd += qtd;
	}

	public void removeProducts(int qtd) {
		this.qtd -= qtd;
	}
}
