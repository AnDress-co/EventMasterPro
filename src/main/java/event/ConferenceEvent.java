/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event;

import artist.Artist;
import java.time.LocalDateTime;
import location.Location;

/**
 *
 */
public class ConferenceEvent extends Event {
    
    /*Constructors*/
    public ConferenceEvent(String name, LocalDateTime date, Location location, String description) {
        super(name, date, location, description);
    }

    public ConferenceEvent(String name, String eventType, String description) {
        super(name, eventType, description);
    }
    
    /*Methods*/
    @Override
    public void showDetails() {
        System.out.println("Event ID: " + this.getIdEvent() +"\n"
        + "Name: " + this.getName() +"\n"
        + "Date: " + this.getDate()+"\n"
        + "Location: " + this.getLocation() +"\n"
        + "Description: " + this.getDescription()+"\n"
        + "---------------------------");
    }
    
}
