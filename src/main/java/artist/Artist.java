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
    private int id;
    private String name;
    private String description;
    private String contact;
    private String history;

    public Artist(int id, String name, String description, String contact, String history) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.contact = contact;
        this.history = history;
    }

    // Getters and Setters
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

    // Methods
    public void register() {
        System.out.println("Registering artist: " + this.name);
    }

    public void assignEvent() {
        System.out.println("Assigning event to artist: " + this.name);
    }

    public void listHistory() {
        System.out.println("History of " + this.name + ": " + this.history);
    }

    public void showInfo() {
        System.out.println("Artist ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Contact: " + contact);
        System.out.println("History: " + history);
    }
}
