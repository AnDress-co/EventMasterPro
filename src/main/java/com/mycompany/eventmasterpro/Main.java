package com.mycompany.eventmasterpro;

import finance.Finance;
import java.util.Scanner;
import sales.Sales;
import sales.TypeEntry;
import java.util.ArrayList;
import artist.Artist;
import access.Attendees;
import access.Access;

/**
 *
 * @author Marlon Gomez, Yermy Sotelo, Sergio Motato
 *
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Finance finance = new Finance();
        TypeEntry typeEntry = new TypeEntry();
        Sales sale = new Sales();
        ArrayList<Artist> artists = new ArrayList<>();
        ArrayList<Attendees> attendeesList = new ArrayList<>();
        Access accessControl = new Access("Default Event", "");
        int option;

        do {
            System.out.println("##### EventMaster Pro || Menu #####");
            System.out.println("1. Event and Concert Management");
            System.out.println("2. Location Management");
            System.out.println("3. Artist/Participant Management");
            System.out.println("4. Sales and Ticket Management");
            System.out.println("5. Access Control");
            System.out.println("6. Financial Management");
            System.out.println("0. Exit");
            System.out.print("Select option: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("1. Create Event");
                    System.out.println("2. Modify Event");
                    System.out.println("3. Delete Event");
                    System.out.println("Select option: ");
                    break;
                case 2:
                    System.out.println("1.See available locations");
                    System.out.println("2.See availability by date");
                    System.out.println("3.See location features");
                    System.out.println("Select option: ");
                    break;
                case 3:
                    int artistOption;
                    do {
                        System.out.println("""
                            ##### Artist/Participant Management Menu #####
                            1. Register an artist
                            2. Show all artists
                            3. Artist history
                            0. Return to main menu
                            Select option:
                        """);
                        artistOption = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        switch (artistOption) {
                            case 1:
                                System.out.print("Enter artist ID: ");
                                int id = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter artist name: ");
                                String name = scanner.nextLine();
                                System.out.print("Enter artist description: ");
                                String description = scanner.nextLine();
                                System.out.print("Enter artist contact info: ");
                                String contact = scanner.nextLine();
                                System.out.print("Enter artist history: ");
                                String history = scanner.nextLine();
                                Artist newArtist = new Artist(id, name, description, contact, history);
                                artists.add(newArtist);
                                newArtist.register();
                                break;
                            case 2:
                                if (artists.isEmpty()) {
                                    System.out.println("No artists registered yet.");
                                } else {
                                    for (Artist a : artists) {
                                        System.out.println("------------------------------");
                                        a.showInfo();
                                    }
                                }
                                break;
                            case 3:
                                if (artists.isEmpty()) {
                                    System.out.println("No artists registered yet.");
                                } else {
                                    System.out.println("Enter artist ID to view history:");
                                    int searchId = scanner.nextInt();
                                    boolean found = false;
                                    for (Artist a : artists) {
                                        if (a.getId() == searchId) {
                                            a.listHistory();
                                            found = true;
                                            break;
                                        }
                                    }
                                    if (!found) {
                                        System.out.println("Artist not found.");
                                    }
                                }
                                break;
                            case 0:
                                System.out.println("Returning to main menu...");
                                break;
                            default:
                                System.out.println("Incorrect Selection!");
                        }
                    } while (artistOption != 0);
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
                                System.out.println("1.Validate entry");
                                System.out.println("2.Register attendee");
                                System.out.println("3.Attendance statistics");
                                System.out.println("Select option: ");
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
                    int accessOption;
                    do {
                        System.out.println("##### Access Control Menu #####");
                        System.out.println("1. Register attendee");
                        System.out.println("2. Show all attendees");
                        System.out.println("3. Check entry");
                        System.out.println("4. Generate statistics");
                        System.out.println("0. Return to main menu");
                        System.out.print("Select option: ");
                        accessOption = scanner.nextInt();
                        scanner.nextLine(); // Consumir salto de línea

                        switch (accessOption) {
                            case 1:
                                System.out.print("Enter attendee ID: ");
                                int attendeeId = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter attendee name: ");
                                String attendeeName = scanner.nextLine();
                                System.out.print("Enter attendee contact: ");
                                String attendeeContact = scanner.nextLine();
                                Attendees newAttendee = new Attendees(attendeeId, attendeeName, attendeeContact);
                                attendeesList.add(newAttendee);
                                newAttendee.registry();
                                break;
                            case 2:
                                if (attendeesList.isEmpty()) {
                                    System.out.println("No attendees registered yet.");
                                } else {
                                    for (Attendees a : attendeesList) {
                                        System.out.println("------------------------------");
                                        a.showInfo();
                                    }
                                }
                                break;
                            case 3:
                                if (attendeesList.isEmpty()) {
                                    System.out.println("No attendees registered yet.");
                                } else {
                                    System.out.print("Enter attendee ID to check entry: ");
                                    int idToCheck = scanner.nextInt();
                                    scanner.nextLine();
                                    accessControl.checkEntry(idToCheck);
                                }
                                break;
                            case 4:
                                accessControl.genStatistics(attendeesList.size());
                                break;
                            case 0:
                                System.out.println("Returning to main menu...");
                                break;
                            default:
                                System.out.println("Incorrect Selection!");
                        }
                    } while (accessOption != 0);
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
