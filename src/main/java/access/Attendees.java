package access;

import java.util.ArrayList;
import sales.Sales;

public class Attendees {    
    private String id;
    private String name;
    private String contact;    
    private ArrayList<Sales> purchasedEntrys = new ArrayList<>();
    
    /*Contructor*/
    
    public Attendees() {
        
    }
    
    public Attendees(String id, String name, String contact, Sales purchasedEntrys) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.purchasedEntrys.add(purchasedEntrys);
    }
       
    /*Getters and Setters*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public ArrayList<Sales> getPurchasedEntrys() {
        return purchasedEntrys;
    }

    public void setPurchasedEntrys(ArrayList<Sales> purchasedEntrys) {
        this.purchasedEntrys = purchasedEntrys;
    }
                
    /*Methods*/
    
    public void registry(String id, String name, String contact, Sales purchasedEntrys) {
        Attendees newAttendees = new Attendees(id, name, contact, purchasedEntrys);
        states.AppState.listAttendees.add(newAttendees);
        System.out.println("Registering attendee!" + states.AppState.listAttendees);
    }

    public void showInfoAttendees() {
        System.out.println("ID: " + id + " | Name: " + name + " | Contact: " + contact);
    }
    
}