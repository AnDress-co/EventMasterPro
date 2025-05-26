package event;

import java.time.LocalDateTime;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import location.Location;

public class EventManager {
    private List<Event> events;
        
    public EventManager(List<Event> events) {
        this.events = events;
    }
    
    public void updateEvent(int idEvent, String name, LocalDateTime date, Location location, String description, String Type) {
        for (Event e : this.events) {
            if (e.getIdEvent() == idEvent) {
                e.setName(name);
                e.assignDate(date);
                e.assignLocation(location);
                e.setDescription(description);
                e.setTypeEvent(Type);
                return;
            }
        }
    }
    
    public void deleteEvent(int idEvent) {
        for (Event e : this.events){
            if (e.getIdEvent()==idEvent) {
                events.remove(e);
                return;
            }
        }
    }
    
    public List<Event> getEventsByType(String eventType){
        List<Event> eventsByType = new ArrayList<>();
        for (Event e : this.events) {
            if (e.getTypeEvent().toLowerCase().equals(eventType.toLowerCase())) {
                eventsByType.add(e);
            }
        }
        return eventsByType;
    }
    
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
    
    public void eventsListTable(DefaultTableModel model) {
        model.setRowCount(0);
        for (Event event : this.events) {
            if (event != null) {
                model.addRow(new Object[]{
                    event.getIdEvent(),
                    event.getName(),
                    event.getDate(),
                    event.getLocation().getName(),
                    event.getDescription(),
                    event.getTypeEvent()
                });
            }
        }
    }
    
    public void eventsFilteredListTable(DefaultTableModel model, List<Event> events) {  
        model.setRowCount(0);
        for(Event event : events) {
            if(event != null) {                
                model.addRow(new Object[] {
                    event.getIdEvent(),
                    event.getName(),
                    event.getDate(),
                    event.getLocation().getName(),
                    event.getDescription(),
                    event.getTypeEvent()
                });
            }            
        }
    }
    
    public void eventsListBox(JComboBox<String> select) {
        select.removeAllItems();
        String showEvent;
        for (Event event : this.events) {
            showEvent = event.getIdEvent()+ " - " + event.getName();
            select.addItem(showEvent);
        }
    }
    
    public void eventListBox(JComboBox<String> artistHistorySelection) {
        artistHistorySelection.removeAllItems();
        
        for (Event event : events) {
            artistHistorySelection.addItem(event.getName());
        }
    }
}
