// EmailNotification Class
class EmailNotification extends Notification {

    public EmailNotification(int notificationID, String message) {
        super(notificationID, "Email", message);
    }

    @Override
    public void sendNotification() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Sending email: " + getMessage());
    }
}
