import java.util.List;

public abstract class User {
    private int userID;
    private String username;
    private String password;
    private String role;
    private String email;

    public User(int userID, String username, String password, String role, String email) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
    }

    public abstract void login();
    public abstract void register();
    public abstract void updateProfile();
    public abstract void deleteAccount();

    public List<Event> searchEvents(List<Event> events, String criteria) {
        return events.stream().filter(e -> e.matches(criteria)).toList();
    }

    public void viewEvents(List<Event> events) {
        events.forEach(System.out::println);
    }

    public int getUserID() { return userID; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public String getEmail() { return email; }
}

