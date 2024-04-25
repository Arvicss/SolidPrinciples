public class OrderTest {
    public static void main(String[] args) {
        OrderProcessing orderProcessing = new OrderProcessing();
        orderProcessing.placeOrder("John-Doe", "#9 Central Avenue");
        orderProcessing.calculateTotal(10, 8);
        orderProcessing.generateInvoice("John-Doe-04252024.pdf");

        System.out.println("\n\n");

        EmailNotification emailNotification = new EmailNotification();
        emailNotification.sendEmailNotification("ramosarvyx@gmail.com");
    }
}