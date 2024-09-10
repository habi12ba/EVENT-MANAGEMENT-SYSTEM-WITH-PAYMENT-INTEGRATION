public class Payment {
    private double amount;
    private int eventID;
    private int userID;

    public Payment(double amount, int eventID, int userID) {
        this.amount = amount;
        this.eventID = eventID;
        this.userID = userID;
    }

    public boolean processPayment(PaymentMethod paymentMethod) {
        System.out.println("Processing payment of " + amount + " for event ID " + eventID);
        return paymentMethod.pay();
    }
}
