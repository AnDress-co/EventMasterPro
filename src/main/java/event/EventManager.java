package event;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import location.Location;

public class EventManager {
    private List<Event> events;

    public EventManager() {
        
    }
        
    public EventManager(List<Event> events) {
        this.events = events;
    }
    
    public void updateEvent(int idEvent, String name, String eventType, LocalDateTime date, Location location, String description) {
        for (Event e : this.events) {
            if (e.getIdEvent()== idEvent) {
                e.setName(name);
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
    
    /*public List<Event> getEventsByType(String eventType){
        List<Event> eventsByType = new ArrayList<>();
        for (Event e : this.events) {
            if (e.getEventType().toLowerCase().equals(eventType.toLowerCase())) {
                eventsByType.add(e);
            }
        }
        return eventsByType;
    }*/
    
    public Event getEventById(int id) {
        for (Event e : this.events) {
            if (e.getIdEvent() == id) {
                return e;
            }
        }
        return null;
    }
     
    public List<Event> getEvents() {
        return this.events;
    }
    
    public void eventListBox(JComboBox<String> artistHistorySelection) {
        artistHistorySelection.removeAllItems();
        
        for (Event event : events) {
            artistHistorySelection.addItem(event.getName());
        }
    }
}
