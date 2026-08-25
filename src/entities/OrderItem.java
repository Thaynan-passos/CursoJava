package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;

	private Product03 product03;

	public OrderItem(Integer quantity, Double price, Product03 product03) {
		this.quantity = quantity;
		this.price = price;
		this.product03 = product03;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product03 getProduct() {
		return product03;
	}

	public void setProduct(Product03 product03) {
		this.product03 = product03;
	}

	public double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return product03.getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}