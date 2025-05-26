/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package location;

import java.time.*;
import java.util.*;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

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
            }
        }      
    }
    
    public List<Location> getLocations() {
        return locations;
    }
    
    public void locationsListTable(DefaultTableModel model) {  
        model.setRowCount(0);
        for(Location location : this.locations) {
            if(location != null) {                
                model.addRow(new Object[] {
                    location.getId(),
                    location.getName(),
                    location.getAddress(),
                    location.getCapacity(),
                    location.getTechnicalSpecifications(),
                    location.getAvailableDates()
                });
            }            
        }
    }
    
    public void locationsFilteredListTable(DefaultTableModel model, List<Location> locations) {  
        model.setRowCount(0);
        for(Location location : locations) {
            if(location != null) {                
                model.addRow(new Object[] {
                    location.getId(),
                    location.getName(),
                    location.getAddress(),
                    location.getCapacity(),
                    location.getTechnicalSpecifications(),
                    location.getAvailableDates()
                });
            }            
        }
    }
    
    public void locationListBox(JComboBox<String> eventLocationSelect) {
        eventLocationSelect.removeAllItems();
        String showLocation;
        for (Location location : this.locations) {
            showLocation = location.getId() + " - " + location.getName();
            eventLocationSelect.addItem(showLocation);
        }
    }
}
