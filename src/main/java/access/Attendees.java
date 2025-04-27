/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package access;

/**
 *
 * @author Yermy
 */
public class Attendees {
    protected int id;
    protected String name;
    protected String contact;

    public Attendees(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
    
    /**/

    /**
     * /
     * @return
     */

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