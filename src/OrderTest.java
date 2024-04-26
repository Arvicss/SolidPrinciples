import emailnotification.EmailNotification;
import invoicegenerator.Invoice;
import orderaction.OrderAction;

public class OrderTest {
    public static void main(String[] args) {
        OrderAction orderAction = new OrderAction();
        orderAction.placeOrder("John-Doe", "#9 Central Avenue");
        orderAction.calculateTotal(10, 8);

        System.out.println();

        EmailNotification emailNotification = new EmailNotification();
        emailNotification.sendEmailNotification("ramosarvyx@gmail.com");

        System.out.println();

        Invoice invoice = new Invoice();
        invoice.generateInvoice("001-jd-2024-04-26");
    }
}