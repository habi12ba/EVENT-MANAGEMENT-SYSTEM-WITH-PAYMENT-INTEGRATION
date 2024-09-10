import java.util.List;
import java.util.Scanner;

public class RegularUser extends User {

    public RegularUser(int userID, String username, String password, String email) {
        super(userID, username, password, "Regular", email);
    }

    @Override
    public void login() {
        System.out.println("Regular user logged in.");
    }

    @Override
    public void register() {
        System.out.println("Regular user registered.");
    }

    @Override
    public void updateProfile() {
        System.out.println("Regular user profile updated.");
    }

    @Override
    public void deleteAccount() {
        System.out.println("Regular user account deleted.");
    }

    public void registerForEvent(List<Event> events) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Event ID to register for: ");
        int eventID = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Event event = null;
        for (Event e : events) {
            if (e.getEventID() == eventID) {
                event = e;
                break;
            }
        }

        if (event != null) {
            if (event.isCapacityAvailable()) {
                System.out.println("Enter amount for event registration: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // consume newline

                System.out.println("Choose Payment Method: 1. Credit Card  2. PayPal");
                int paymentChoice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                Payment payment = new Payment(amount, eventID, getUserID());
                PaymentMethod paymentMethod;

                switch (paymentChoice) {
                    case 1:
                        // Credit Card Payment
                        System.out.print("Enter Card Number: ");
                        String cardNumber = scanner.nextLine();
                        System.out.print("Enter Card Holder Name: ");
                        String cardHolderName = scanner.nextLine();
                        System.out.print("Enter Expiry Date (MM/YY): ");
                        String expiryDate = scanner.nextLine();
                        System.out.print("Enter CVV: ");
                        String cvv = scanner.nextLine();
                        paymentMethod = new CreditCardPayment(cardNumber, cardHolderName, expiryDate, cvv);
                        break;
                    case 2:
                        // PayPal Payment
                        System.out.print("Enter PayPal Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter PayPal Password: ");
                        String password = scanner.nextLine();
                        paymentMethod = new PayPalPayment(email, password);
                        break;
                    default:
                        System.out.println("Invalid payment method.");
                        return;
                }

                if (payment.processPayment(paymentMethod)) {
                    event.registerUser();
                    System.out.println("Registered for event: " + event);
                } else {
                    System.out.println("Payment failed.");
                }
            } else {
                System.out.println("Event is full: " + event);
            }
        } else {
            System.out.println("Event not found.");
        }
    }

    public void viewEventDetails(List<Event> events) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Event ID to view details: ");
        int eventID = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Event event = null;
        for (Event e : events) {
            if (e.getEventID() == eventID) {
                event = e;
                break;
            }
        }

        if (event != null) {
            System.out.println("Event details: " + event);
        } else {
            System.out.println("Event not found.");
        }
    }
}

