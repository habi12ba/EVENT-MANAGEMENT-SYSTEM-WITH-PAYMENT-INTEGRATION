import java.util.Date;
import java.util.List;
import java.util.Scanner;

// AdminUser Class
class AdminUser extends User {

    public AdminUser(int userID, String username, String password, String email) {
        super(userID, username, password, "Admin", email);
    }

    @Override
    public void login() {
        System.out.println("Admin logged in.");
    }

    @Override
    public void register() {
        // Admins don't register, but this could be implemented if needed
    }

    @Override
    public void updateProfile() {
        System.out.println("Admin profile updated.");
    }

    @Override
    public void deleteAccount() {
        System.out.println("Admin account deleted.");
    }

    public void createEvent(List<Event> events) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Event ID: ");
        int eventID = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Event Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Event Date (yyyy-MM-dd): ");
        String dateString = scanner.nextLine();
        Date date = java.sql.Date.valueOf(dateString);

        System.out.print("Enter Event Location: ");
        String location = scanner.nextLine();

        System.out.print("Enter Event Capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Event Description: ");
        String description = scanner.nextLine();

        Event event = new Event(eventID, name, date, location, capacity, description);
        events.add(event);
        System.out.println("Event created: " + event);
    }

    public void deleteUser(List<User> users) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User ID to delete: ");
        int userID = scanner.nextInt();
        scanner.nextLine(); // consume newline

        User userToRemove = null;
        for (User user : users) {
            if (user.getUserID() == userID) {
                userToRemove = user;
                break;
            }
        }

        if (userToRemove != null) {
            users.remove(userToRemove);
            System.out.println("User deleted: " + userToRemove);
        } else {
            System.out.println("User not found.");
        }
    }
}
