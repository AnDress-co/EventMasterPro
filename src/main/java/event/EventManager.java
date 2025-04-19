/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import location.Location;

/**
 *
 * @author stive
 */
public class EventManager {
    private List<Event> events;

    public EventManager(List<Event> events) {
        this.events = events;
    }
    
    public void addEvent(Event event) {
        this.events.add(event);
        System.out.println("The event: " + event.getName() + " was added successfully!");
    }
    
    public void updateEvent(int idEvent, String name, String eventType, LocalDateTime date, Location location, String description) {
        for (Event e : this.events) {
            if (e.getIdEvent()== idEvent) {
                e.setName(name);
                e.setEventType(eventType);
                e.assignDate(date);
                e.assignLocation(location);
                e.setDescription(description);
                System.out.println("The event: " + name + " was updated!");
                return;
            }
        }
        System.out.println("The event with the ID: " + idEvent + " was not found.");
    }
    
    public void deleteEvent(int idEvent) {
        for (Event e : this.events){
            if (e.getIdEvent()==idEvent) {
                events.remove(e);
                System.out.println("The event " + e.getName() + " was removed!");
                return;
            }
        }
        System.out.println("The event with the ID: " + idEvent + " was not found.");
    }
    
    public List<Event> getEventsByType(String eventType){
        List<Event> eventsByType = new ArrayList<>();
        for (Event e : this.events) {
            if (e.getEventType().toLowerCase().equals(eventType.toLowerCase())) {
                eventsByType.add(e);
            }
        }
        return eventsByType;
    }
}
