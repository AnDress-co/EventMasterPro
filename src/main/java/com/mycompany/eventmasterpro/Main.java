package com.mycompany.eventmasterpro;

import java.util.Scanner;
/**
 *
 * @author Marlon Gomez, Yermy Sotelo, Sergio Motato
 * 
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
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
                    System.out.println("1.Create ticket type");
                    System.out.println("2.Register ticket sales");
                    System.out.println("Select option: ");
                    break;
                case 5:
                    System.out.println("1.Validate entry");
                    System.out.println("2.Register attendee");
                    System.out.println("3.Attendance statistics");
                    System.out.println("Select option: ");
                    break;
                case 6:
                    System.out.println("1.Event budget");
                    System.out.println("2.Track income and expenses");
                    System.out.println("Select option: ");
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
