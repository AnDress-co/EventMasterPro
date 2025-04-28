/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package location;

import java.time.*;
import java.util.*;

/**
 *
 * @author stive
 */
public class LocationManager {
    private List<Location> locations;

    public LocationManager(List<Location> locations) {
        this.locations = locations;
    }
    
    public List<Location> getAvailableLocationsByDate(LocalDate date){
        List<Location> availableLocations = new ArrayList<>();
        for (Location loc : this.locations) {
            if (loc.getAvailableDates().contains(date)) {
                availableLocations.add(loc);
            }
        }
        return availableLocations;
    }
    
    public Location getLocationById(int id){
        for (Location loc : this.locations) {
            if (loc.getId() == id) {
                return loc;
            }
        }
        return null;
    }
    
    public void deleteAvailableDate(LocalDate date, Location location) { 
        for (LocalDate d: location.getAvailableDates()){
            if (d.equals(date)) {
                location.getAvailableDates().remove(d); 
                System.out.println("The date " + date + " was removed from available dates for the " + location.getName() + " location.");
            }
        }      
    }
    
    public List<Location> getLocations() {
        return locations;
    }
}
