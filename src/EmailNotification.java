import order.action.EmailNotificationSender;
import order.action.InvoiceGenerator;
import order.action.OrderPlacer;
import order.action.TotalCalculator;

public class EmailNotification implements EmailNotificationSender {
    @Override
    public void sendEmailNotification(String email) {
        // Simulate sending email notification
        System.out.println("Email notification sent to: " + email);
    }
}