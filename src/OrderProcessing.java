import order.action.EmailNotificationSender;
import order.action.InvoiceGenerator;
import order.action.OrderPlacer;
import order.action.TotalCalculator;

public class OrderProcessing implements OrderPlacer, TotalCalculator, InvoiceGenerator {
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

    @Override
    public void generateInvoice(String fileName) {
        // Simulate generating invoice file
        System.out.println("Invoice generated: " + fileName);
    }
}