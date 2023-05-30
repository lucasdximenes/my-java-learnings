package oop.enumerationComposition.exercises.exercise02.entities;

public class OrderItem {
    private Product product;
    private Integer quantity;
    private Double price;

    public OrderItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price = product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
        this.product.setPrice(price);
        this.price = price;
    }

    public Double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f",
                product.getName(), price, quantity, subTotal());
    }
}
