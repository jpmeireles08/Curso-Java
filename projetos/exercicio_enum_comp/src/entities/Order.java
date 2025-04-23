package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
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
		double soma = 0;
		for (OrderItem oi : items) {
			soma += oi.subTotal();
		}
		return soma;
	}
	
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMARY:" + "\n");
		sb.append("Order moment: " + moment.format(formatter) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " + client.getName() + " " + client.getBirthDate() + " - " + client.getEmail() + "\n");
		sb.append("Order items: " + "\n");
		for (OrderItem oi : items) {
			sb.append(oi + "\n");
		}
		sb.append("Total Price: " + total());
		
		return sb.toString();
	}
}
