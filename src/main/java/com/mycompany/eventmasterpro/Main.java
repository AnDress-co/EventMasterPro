package com.mycompany.eventmasterpro;

import finance.Finance;
import java.util.Scanner;
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
        
        Finance finance = new Finance();
        TypeEntry typeEntry = new TypeEntry();
        Sales sale = new Sales();
        
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
