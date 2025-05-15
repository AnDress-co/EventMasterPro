package event;

import java.time.*;
import location.Location;
import artist.Artist;

public abstract class Event {
    private int idEvent = 0;
    private String name;
    private LocalDateTime date;
    private Location location;
    private String description;
    
    /*Constructors*/
    public Event(String name, LocalDateTime date, Location location, String description) {
        this.idEvent += 1;
        this.name = name;
        this.date = date;
        this.location = location;
        this.description = description;
    }
    
    public Event(String name, String eventType, String description) {
        this.idEvent += 1;
        this.name = name;
        this.description = description;
    }
    
    /*Getters and Setters*/
    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Location getLocation() {
        return location;
    }

    public void assignLocation(Location location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    /*Methods*/
    public void assignDate (LocalDateTime date) {
        this.date = date;
        System.out.println("The date " + date + " was added to the " + this.name + " event!");
    }
    
    public abstract void showDetails();
}
