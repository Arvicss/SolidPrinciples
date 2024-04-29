package orderaction;

public class OrderAction implements OrderPlacer, TotalCalculator {
    @Override
    public void placeOrder(String customerName, String address) {
        // Simulate placing order in a system
        System.out.println("Order placed for " + customerName + " at " + address);
    }

    @Override
    public void calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }
}