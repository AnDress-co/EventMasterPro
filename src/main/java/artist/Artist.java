/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artist;

/**
 *
 * @author MarlonG
 */
public class Artist {
    protected int id;
    protected String name;
    protected String description;
    protected String contact;
    protected String history;

    public Artist(int id, String name, String description, String contact, String history) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.contact = contact;
        this.history = history;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
    
    public void registry(){
        System.out.println("Beggining Registry");
    
    }
    public void assingEvent(){
        System.out.println("Assignnng Event");
    };
    
    public void listHistory(){
        System.out.println("Searching for the artist's history of events ");
    };
    
    
}
