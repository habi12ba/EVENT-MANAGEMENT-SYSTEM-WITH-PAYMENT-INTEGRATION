import java.util.Date;

// Event Class
class Event {
    private int eventID;
    private String name;
    private Date date;
    private String location;
    private int capacity;
    private String description;
    private int registeredUsers;

    // Constructor
    public Event(int eventID, String name, Date date, String location, int capacity, String description) {
        this.eventID = eventID;
        this.name = name;
        this.date = date;
        this.location = location;
        this.capacity = capacity;
        this.description = description;
        this.registeredUsers = 0;
    }

    // Getters and Setters
    public int getEventID() { return eventID; }
    public String getName() { return name; }
    public Date getDate() { return date; }
    public String getLocation() { return location; }
    public int getCapacity() { return capacity; }
    public String getDescription() { return description; }

    public boolean isCapacityAvailable() {
        return registeredUsers < capacity;
    }

    public void registerUser() {
        if (isCapacityAvailable()) {
            registeredUsers++;
        }
    }

    public boolean matches(String criteria) {
        return name.contains(criteria) || location.contains(criteria);
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventID +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", description='" + description + '\'' +
                '}';
    }
}
