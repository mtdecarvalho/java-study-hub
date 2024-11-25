package ex_fixacao_entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import ex_fixacao_entities.enums.OrderStatus;

public class Order {
	private Instant moment;
	private OrderStatus status;

	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(OrderStatus status, Client client) {
		moment = Instant.now();
		this.status = status;
		this.client = client;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		for (OrderItem i : items) {
			total += i.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: ");
		sb.append(fmt.format(getMoment()) + "\n");
		sb.append("Order status: " + getStatus().toString() + "\n");
		sb.append("Client: " + getClient() + "\n");
		sb.append("Order items:\n");
		for (OrderItem i : items) {
			sb.append(i.toString() + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()) + "\n");
		
		return sb.toString();
	}
}
