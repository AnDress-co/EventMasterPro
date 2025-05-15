/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event;

import java.time.LocalDateTime;
import location.Location;
import artist.Artist;

/**
 *
 */
public class ConcertEvent extends Event {
    
    /*Constructors*/
    public ConcertEvent(String name, LocalDateTime date, Location location, String description, Artist artist) {
        super(name, date, location, description, artist);
    }

    public ConcertEvent(String name, String eventType, String description) {
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
        + "Artis: " + this.getArtist()+"\n"
        + "---------------------------");
    }
    
}
