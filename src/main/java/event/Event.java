package event;

import java.time.*;
import location.Location;

public class Event {
    private int idEvent;
    private String name;
    private String eventType;
    private LocalDateTime date;
    private Location location;
    private String description;

    public Event(int idEvent, String name, String eventType, LocalDateTime date, Location location, String description) {
        this.idEvent = idEvent;
        this.name = name;
        this.eventType = eventType;
        this.date = date;
        this.location = location;
        this.description = description;
    }
    
    public Event(int idEvent, String name, String eventType, String description) {
        this.idEvent = idEvent;
        this.name = name;
        this.eventType = eventType;
        this.description = description;
    }
    
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

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void assignDate (LocalDateTime date) {
        this.date = date;
        System.out.println("The date " + date + " was added to the " + this.name + " event!");
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
}
