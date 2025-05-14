package access;

import java.util.ArrayList;

public class Attendees {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String contact;
    private ArrayList<Attendees> listAttendees;
    
    /*Contructor*/
    
    public Attendees(String name, String contact) {
        this.id = idCounter++;
        this.name = name;
        this.contact = contact;
        this.listAttendees =  new ArrayList<>();
    }
       
    /*Getters and Setters*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public ArrayList<Attendees> getListAttendees() {
        return listAttendees;
    }

    public void setListAttendees(ArrayList<Attendees> listAttendees) {
        this.listAttendees = listAttendees;
    }        
    
    /*Methods*/
    
    public void registry() {
        System.out.println("Registering attendee: " + this.name);
    }

    public void update(String newContact) {
        this.contact = newContact;
        System.out.println("Attendee updated: " + this.name);
    }

    public void showInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Contact: " + contact);
    }
    
}