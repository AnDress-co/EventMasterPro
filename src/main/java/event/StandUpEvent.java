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
 * @author stive
 */
public class StandUpEvent extends Event {

    public StandUpEvent(String name, LocalDateTime date, Location location, String description) {
        super(name, date, location, description);
    }

    public StandUpEvent(String name, String eventType, String description) {
        super(name, eventType, description);
    }

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
