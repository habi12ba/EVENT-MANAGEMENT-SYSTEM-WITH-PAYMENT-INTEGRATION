import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main Class to test the implementation
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create lists to hold users and events
        List<User> users = new ArrayList<>();
        List<Event> events = new ArrayList<>();

        // Create some default users
        AdminUser admin = new AdminUser(1, "admin", "adminpass", "admin@example.com");
        RegularUser user = new RegularUser(2, "user", "userpass", "user@example.com");

        users.add(admin);
        users.add(user);

        boolean running = true;

        while (running) {
            System.out.println("1. Admin Actions");
            System.out.println("2. Regular User Actions");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Admin Menu:");
                    System.out.println("1. Create Event");
                    System.out.println("2. Delete User");
                    System.out.print("Choose an option: ");
                    int adminChoice = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    switch (adminChoice) {
                        case 1:
                            admin.createEvent(events);
                            break;
                        case 2:
                            admin.deleteUser(users);
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;

                case 2:
                    System.out.println("Regular User Menu:");
                    System.out.println("1. Register for Event");
                    System.out.println("2. View Event Details");
                    System.out.print("Choose an option: ");
                    int userChoice = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    switch (userChoice) {
                        case 1:
                            user.registerForEvent(events);

                            // Send notification after registration
                            Notification emailNotification = new EmailNotification(1, "You have successfully registered for the event.");
                            emailNotification.sendNotification();

                            Notification smsNotification = new SMSNotification(2, "Event registration confirmed via SMS.");
                            smsNotification.sendNotification();
                            break;

                        case 2:
                            user.viewEventDetails(events);
                            break;

                        default:
                            System.out.println("Invalid option.");
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
