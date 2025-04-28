package com.mycompany.eventmasterpro;

import event.Event;
import event.EventManager;
import finance.Finance;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import location.Location;
import location.LocationManager;
import sales.Sales;
import sales.TypeEntry;
/**
 *
 * @author Marlon Gomez, Yermy Sotelo, Sergio Motato
 * 
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Locations 
        List<Location> locations = new ArrayList<>();
        LocationManager locationManager = new LocationManager(locations);
        //Events
        List<Event> events = new ArrayList<>();
        EventManager eventManager = new EventManager(events);
        //Finance
        Finance finance = new Finance();
        TypeEntry typeEntry = new TypeEntry();
        Sales sale = new Sales();
        
        int option;
        
        do {            
            System.out.println("##### EventMaster Pro || Menu #####");
            System.out.println("1. Locations Management");
            System.out.println("2. Events Management");
            System.out.println("3. Artist/Participant Management");
            System.out.println("4. Sales and Ticket Management");
            System.out.println("5. Access Control");
            System.out.println("6. Financial Management");
            System.out.println("0. Exit");
            System.out.print("Select option: ");
            
            option = scanner.nextInt();
            
            switch (option) {
                case 1:                    
                    int locationOption;
                    do {
                        System.out.print("""
                                         ##### Locations || Menu ##### 
                                         1. Create location
                                         2. Add available date to location
                                         3. List by available dates
                                         4. List all locations
                                         0. Exit
                                         Select option: 
                                        """);
                        locationOption = scanner.nextInt();
                        switch (locationOption) {
                            case 1:
                                System.out.println("Location ID:");
                                int locationId = scanner.nextInt();
                                
                                Location locationSelected = locationManager.getLocationById(locationId);
                                if (locationSelected != null) {
                                    System.out.println("The location with ID " + locationId + " already exists!");
                                } else {
                                    scanner.nextLine();
                                    System.out.println("Name:");
                                    String name = scanner.nextLine();
                                    System.out.println("Address:");
                                    String address = scanner.nextLine();
                                    System.out.println("Capacity:");
                                    int capacity = scanner.nextInt();
                                    System.out.println("Technical specifications:");
                                    scanner.nextLine();
                                    String techSpec = scanner.nextLine();

                                    Location newLocation = new Location(locationId, name, address, capacity, techSpec);
                                    locations.add(newLocation);
                                    System.out.println("The Location: " + newLocation.getName() + " was added successfully!");
                                }            
                                break;
                            case 2:
                                System.out.println("Location ID:");
                                locationId = scanner.nextInt();
                                locationSelected = locationManager.getLocationById(locationId);
                                
                                if (locationSelected != null) {
                                    scanner.nextLine();
                                    System.out.println("Date and time {yyyy-MM-dd}:");
                                    LocalDate date = LocalDate.parse(scanner.nextLine());
                                    locationSelected.addAvailableDate(date);
                                } else {
                                    System.out.println("The location was not found");
                                }
                                break;
                            case 3:
                                scanner.nextLine();
                                System.out.println("Date and time {yyyy-MM-dd}:");
                                LocalDate date = LocalDate.parse(scanner.nextLine());
                                locations = locationManager.getAvailableLocationsByDate(date);
                                if (locations.isEmpty()) {
                                    System.out.println("No available locations found");
                                } else {
                                    for (Location loc : locations) {
                                    System.out.println("Location ID: " + loc.getId() +"\n"
                                            + "Name: " + loc.getName() +"\n"
                                            + "Address: " + loc.getAddress() +"\n"
                                            + "Capacity: " + loc.getCapacity() +"\n"
                                            + "Technical specifications: " + loc.getTechnicalSpecifications() +"\n"
                                            + "Available dates: " + loc.getAvailableDates() +"\n"
                                            + "---------------------------");
                                    }
                                }
                                break;
                            case 4:
                                locations = locationManager.getLocations();
                                if (locations.isEmpty()) {
                                    System.out.println("No locations found");
                                } else {
                                   for (Location loc : locations) {
                                    System.out.println("Location ID: " + loc.getId() +"\n"
                                            + "Name: " + loc.getName() +"\n"
                                            + "Address: " + loc.getAddress() +"\n"
                                            + "Capacity: " + loc.getCapacity() +"\n"
                                            + "Technical specifications: " + loc.getTechnicalSpecifications() +"\n"
                                            + "Available dates: " + loc.getAvailableDates() +"\n"
                                            + "---------------------------");
                                    } 
                                }
                                break;
                            case 0:
                                System.out.println("Returning to main menu...");
                                break;
                            default:
                                System.out.println("Invalid Option!");
                        }
                    } while (locationOption != 0);                    
                    break;
                case 2:
                    int eventOption;
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                    do {
                        System.out.print("""
                                         ##### Events || Menu ##### 
                                         1. Create event
                                         2. Modify event
                                         3. Assign date to an event
                                         4. Assign location to an event
                                         5. List all events
                                         6. List events by category
                                         7. Delete event
                                         0. Exit
                                         Select option: 
                                        """);
                        eventOption = scanner.nextInt();
                        switch (eventOption) {
                            case 1:
                                System.out.println("1. Create with date and location");
                                System.out.println("2. Create without date and location");
                                System.out.println("Select an option:");
                                int createEventOption = scanner.nextInt();
                                if (createEventOption != 1 && createEventOption != 2) { System.out.println("Invalid option!"); break; }
                                
                                System.out.println("Event ID:");
                                int eventId = scanner.nextInt();
                                scanner.nextLine();
                                Event event = eventManager.getEventById(eventId);
                                if (event != null) {
                                    System.out.println("The event with ID " + eventId + " already exists!");
                                } else {
                                    System.out.println("Name:");
                                    String name = scanner.nextLine();
                                    System.out.println("Event category:");
                                    String category = scanner.nextLine();
                                    System.out.println("Description:");
                                    String description = scanner.nextLine();
                                    if (createEventOption == 1){
                                        System.out.println("Date and time {yyyy-MM-dd HH:mm}:");
                                        String inputDate = scanner.nextLine();
                                        LocalDateTime date = LocalDateTime.parse(inputDate, formatter);
                                        System.out.println("Location ID:");
                                        int locationId = scanner.nextInt();
                                        scanner.nextLine();
                                        Location locationSelected = locationManager.getLocationById(locationId);
                                        if (locationSelected != null) {
                                            locationManager.deleteAvailableDate(date.toLocalDate(), locationSelected);
                                        }
                                        
                                        Event newEvent = new Event(eventId, name, category, date, locationSelected, description);
                                        events.add(newEvent);
                                        System.out.println("The event: " + newEvent.getName() + " was added successfully!");
                                    } else {
                                        Event newEvent = new Event(eventId, name, category, description);
                                        events.add(newEvent);
                                        System.out.println("The event: " + newEvent.getName() + " was added successfully!");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Event ID:");
                                eventId = scanner.nextInt();
                                
                                event = eventManager.getEventById(eventId);
                                if (event == null){
                                    System.out.println("The event was not found!");
                                } else {
                                    scanner.nextLine();
                                    System.out.println("Name:");
                                    String name = scanner.nextLine();
                                    System.out.println("Event category:");
                                    String category = scanner.nextLine();
                                    System.out.println("Date and time {yyyy-MM-dd HH:mm}:");
                                    String inputDate = scanner.nextLine();
                                    LocalDateTime date = LocalDateTime.parse(inputDate, formatter);
                                    
                                    System.out.println("Location ID:");
                                    int locationId = scanner.nextInt();
                                    scanner.nextLine();
                                    Location locationSelected = locationManager.getLocationById(locationId);
                                    if (locationSelected != null) {
                                        locationManager.deleteAvailableDate(date.toLocalDate(), locationSelected);
                                    }
                                    
                                    scanner.nextLine();
                                    System.out.println("Description:");
                                    String description = scanner.nextLine();
                                    eventManager.updateEvent(eventId, name, category, date, locationSelected, description);
                                }
                                break;
                            case 3:
                                System.out.println("Event ID:");
                                eventId = scanner.nextInt();
                                
                                event = eventManager.getEventById(eventId);
                                if (event == null) {
                                    System.out.println("The event was not found!");
                                } else {
                                    if (event.getDate() != null) {
                                        System.out.println("The event already has a date");
                                    } else {
                                        scanner.nextLine();
                                        System.out.println("Date and time {yyyy-MM-dd HH:mm}:");
                                        String inputDate = scanner.nextLine();
                                        LocalDateTime date = LocalDateTime.parse(inputDate, formatter);

                                        event.assignDate(date);
                                        if (event.getLocation() != null) {
                                            locationManager.deleteAvailableDate(date.toLocalDate(), event.getLocation());
                                        }
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Event ID:");
                                eventId = scanner.nextInt();
                                event = eventManager.getEventById(eventId);
                                if (event == null) {
                                    System.out.println("The event was not found!");
                                } else {
                                    if (event.getLocation() != null) {
                                        System.out.println("The event already has a location");
                                    } else {
                                        System.out.println("Location ID:");
                                        int locationId = scanner.nextInt();

                                        event = eventManager.getEventById(eventId);
                                        Location locationSelected = locationManager.getLocationById(locationId);
                                        
                                        if (locationSelected == null) {
                                            System.out.println("The location was not found!");
                                        } else {
                                            event.assignLocation(locationSelected);
                                            System.out.println("The location " + locationSelected.getName() + " was added to the " + event.getName() + " event!");
                                            
                                            if (event.getDate() != null) {
                                                locationManager.deleteAvailableDate(event.getDate().toLocalDate(), locationSelected);
                                            }
                                        }
                                    }
                                }
                                break;
                            case 5:
                                events = eventManager.getEvents();
                                if (events.isEmpty()) {
                                    System.out.println("No events found");
                                } else {
                                    for (Event e : events) {
                                        String locationName;
                                        if(e.getLocation() == null){ locationName = "Empty"; } else { locationName = e.getLocation().getName(); }
                                        System.out.println("Event ID: " + e.getIdEvent()+"\n"
                                                + "Name: " + e.getName() +"\n"
                                                + "Category: " + e.getEventType()+"\n"
                                                + "Date: " + e.getDate()+"\n"
                                                + "Location: " + locationName +"\n"
                                                + "Description: " + e.getDescription()+"\n"
                                                + "---------------------------");
                                    } 
                                }
                                break;
                            case 6:
                                scanner.nextLine();
                                
                                System.out.println("Type/Category event: ");
                                String category = scanner.nextLine();
                                events = eventManager.getEventsByType(category);
                                if (events.isEmpty()) {
                                    System.out.println("No events found");
                                } else {
                                   for (Event e : events) {
                                        String locationName;
                                        if(e.getLocation() == null){ locationName = "Empty"; } else { locationName = e.getLocation().getName(); }
                                        System.out.println("Event ID: " + e.getIdEvent()+"\n"
                                            + "Name: " + e.getName() +"\n"
                                            + "Category: " + e.getEventType()+"\n"
                                            + "Date: " + e.getDate()+"\n"
                                            + "Location: " + locationName+"\n"
                                            + "Description: " + e.getDescription()+"\n"
                                            + "---------------------------");
                                    } 
                                }
                                break;
                            case 7:
                                System.out.println("Event ID: ");
                                eventId = scanner.nextInt();
                                eventManager.deleteEvent(eventId);
                                break;
                            case 0:
                                System.out.println("Returning to main menu...");
                                break;
                            default:
                                System.out.println("Invalid Option!");
                        }
                    } while (eventOption != 0);  
                    break;
                case 3:
                    System.out.println("1.Register an artist");
                    System.out.println("2.Artist information");
                    System.out.println("3.Artist history");
                    System.out.println("Select option: ");
                    break;
                case 4:
                    int ticketsSalesOption;
                    do {
                        System.out.print("""
                                         ##### Sales and Ticket Management || Menu ##### 
                                         1. Create ticket type
                                         2. See ticket types
                                         3. Register ticket sales
                                         4. See ticket sales
                                         0. Exit
                                         Select option: 
                                        """);
                        ticketsSalesOption = scanner.nextInt();
                        switch (ticketsSalesOption) {
                            case 1:
                                scanner.nextLine();
                                System.out.print("Enter the name of the new entry type: ");
                                String newEntryName = scanner.nextLine().toLowerCase();                                
                                typeEntry.setName(newEntryName);                                
                                System.out.print("Enter the price of the new entry type: ");
                                double newEntryPrice = scanner.nextDouble();
                                typeEntry.setPrice(newEntryPrice);
                                typeEntry.addEntryType();
                                break;
                            case 2:
                                typeEntry.entrysList();
                                break;
                            case 3:
                                scanner.nextLine();
                                System.out.println("Select the entry type: ");
                                typeEntry.entrysList();
                                System.out.print("Enter the name of the entry you want: ");
                                String entryName = scanner.nextLine().toLowerCase();                                
                                if(typeEntry.getTypeEntry().containsKey(entryName)) {
                                   sale.setEntrySale(typeEntry.getTypeEntry().get(entryName));
                                   System.out.print("Enter quantity sold: ");
                                    int quantity = scanner.nextInt();
                                    scanner.nextLine();
                                    sale.setQuantitySold(quantity);                                    
                                    System.out.print("Enter sale date (DD-MM-YYYY): ");
                                    String saleDate = scanner.nextLine();
                                    sale.setSaleDate(saleDate);
                                    sale.registerSale();
                                } else {
                                    System.out.println("ERROR: The entry name you entered does not exist.");
                                }                                
                                break;
                            case 4:
                                sale.salesList();
                                break;
                            case 0:
                                System.out.println("Returning to main menu...");
                                break;
                            default:
                                System.out.println("Incorrect Selection!");
                        }
                    } while (ticketsSalesOption != 0);                    
                    break;
                case 5:
                    System.out.println("1.Validate entry");
                    System.out.println("2.Register attendee");
                    System.out.println("3.Attendance statistics");
                    System.out.println("Select option: ");
                    break;
                case 6:
                    int financialOption;
                    do {                        
                        System.out.print("""
                                         ##### Financial Management || Menu #####
                                         1. Add event budget
                                         2. See event budget
                                         3. Add income
                                         4. See income
                                         5. Add expenses 
                                         6. See expenses
                                         0. Exit
                                         Select option: 
                                        """);
                        financialOption = scanner.nextInt();
                        switch (financialOption) {
                            case 1:
                                System.out.print("Enter the event budget: ");
                                double eventBudget = scanner.nextDouble();
                                finance.setEventBudget(eventBudget);
                                System.out.println("Registered budget.");
                                break;
                            case 2:
                                System.out.println("Event budget: " + finance.getEventBudget());
                                break;
                            case 3:                                
                                System.out.print("Enter income: ");
                                double income = scanner.nextDouble();
                                finance.setIncome(income);
                                finance.registerIncome();
                                break;
                            case 4:
                                finance.incomeHistory();
                                break;
                            case 5:
                                System.out.print("Enter income: ");
                                double expenses = scanner.nextDouble();
                                finance.setExpenses(expenses);
                                finance.registerExpenses();
                                break;                                
                            case 6:
                                finance.expensesHistory();
                                break;
                            case 0:
                                System.out.println("Returning to main menu...");
                                break;
                            default:
                                System.out.println("Incorrect Selection!");
                        }
                    } while (financialOption != 0);                    
                    break;
                case 0:
                    System.out.println("Leaving the program, Goodbye.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
        
    }
}
