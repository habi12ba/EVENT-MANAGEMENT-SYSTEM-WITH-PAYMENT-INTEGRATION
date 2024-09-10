// Notification Class
abstract class Notification {
    private int notificationID;
    private String type;
    private String message;

    // Constructor
    public Notification(int notificationID, String type, String message) {
        this.notificationID = notificationID;
        this.type = type;
        this.message = message;
    }

    // Abstract method
    public abstract void sendNotification();

    // Getters
    public int getNotificationID() { return notificationID; }
    public String getType() { return type; }
    public String getMessage() { return message; }
}
