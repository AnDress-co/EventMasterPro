package location;

import java.time.*;
import java.util.HashSet;

public class Location {
    private int idLocation = 0;
    private String name;
    private String address;
    private int capacity;
    private String technicalSpecifications;
    private HashSet<LocalDate> availableDates;
    
    private static int idCounter = 1;

    // Constructor
    public Location(String name, String address, int capacity, String technicalSpecifications, LocalDate availableDate) {
        this.idLocation = idCounter++;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.technicalSpecifications = technicalSpecifications;
        //Register initial available date
        this.availableDates = new HashSet();
        addAvailableDate(availableDate);
    }

    // Métodos
    public void addAvailableDate(LocalDate date) {
        this.availableDates.add(date);
    }
    
    public void validateAvailableDate(LocalDate date) { 
        if (this.availableDates.contains(date)) {
            System.out.println("Date is available!");
        } else {
            System.out.println("The date is not available!");
        }
    }

    // Getters y setters

    public int getId() {
        return idLocation;
    }

    public void setId(int idLocation) {
        this.idLocation = idLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTechnicalSpecifications() {
        return technicalSpecifications;
    }

    public void setTechnicalSpecifications(String technicalSpecifications) {
        this.technicalSpecifications = technicalSpecifications;
    }

    public HashSet<LocalDate> getAvailableDates() {
        return availableDates;
    }

    /*public void setAvailableDates(List<LocalDate> availableDates) {
        this.availableDates = availableDates;
    }*/
}

