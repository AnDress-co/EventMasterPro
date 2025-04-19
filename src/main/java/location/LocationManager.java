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

    public void addLocation(Location location) {
        this.locations.add(location);
        System.out.println("The location " + location.getName() + " was added successfully!");
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
    
    /*public Location searchLocationByName(String name) {}*/
}
