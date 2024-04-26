package orderaction;

public interface Order {
    public void placeOrder(String customerName, String address);
    public void calculateTotal(double price, int quantity);
}
