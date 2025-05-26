package event;

import java.time.*;
import location.Location;

public abstract class Event {
    private int idEvent;
    private String name;
    private LocalDateTime date;
    private Location location;
    private String description;
    protected String typeEvent;
    
    private static int idCounter = 1;
    
    /*Constructors*/
    public Event(String name, LocalDateTime date, Location location, String description) {
        this.idEvent = idCounter++;
        this.name = name;
        this.date = date;
        this.location = location;
        this.description = description;
    }
    
    public Event(String name, LocalDateTime date, Location location, String description, String typeEvent) {
        this.idEvent = idCounter++;
        this.name = name;
        this.date = date;
        this.location = location;
        this.description = description;
        this.typeEvent = typeEvent;
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
    
    public String getTypeEvent() {
        return typeEvent;
    }
    
    public void setTypeEvent(String typeEvent) {
        this.typeEvent = typeEvent;
    }
    
    /*Methods*/
    public void assignDate (LocalDateTime date) {
        this.date = date;
    }
    
    public abstract void showDetails();
}
