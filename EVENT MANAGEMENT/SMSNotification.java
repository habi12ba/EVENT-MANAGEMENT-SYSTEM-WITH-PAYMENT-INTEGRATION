// SMSNotification Class
class SMSNotification extends Notification {

    public SMSNotification(int notificationID, String message) {
        super(notificationID, "SMS", message);
    }

    @Override
    public void sendNotification() {
        sendSMS();
    }

    private void sendSMS() {
        System.out.println("Sending SMS: " + getMessage());
    }
}
