package emailnotification;

import emailnotification.EmailNotificationSender;

public class EmailNotification implements EmailNotificationSender {
    @Override
    public void sendEmailNotification(String email) {
        // Simulate sending email notification
        System.out.println("Email notification sent to: " + email);
    }
}