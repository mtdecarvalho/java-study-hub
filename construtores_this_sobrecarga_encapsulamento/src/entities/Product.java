package entities;

public class Product {
	public String nome;
	public double preco;
	public int qtd;
	
	public Product() {
	}
	
	public Product(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		//qtd = 0;
	}
	
	public Product(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

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
