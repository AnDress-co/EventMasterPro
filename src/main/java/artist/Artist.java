package artist;

import java.util.ArrayList;



public class Artist{
    private static int idCounter = 1;
    private int id;
    private String name;
    private String description;
    private String contact;
    private String itemHistory;
    private String typeArtist;
    private ArrayList<Artist> lisArtists;
    private ArrayList<String> history;        
    
    /*Contructor*/
    
    public Artist() {
        
    }
    
    public Artist(String name, String description, String contact, String itemHistory, String typeArtist) {        
        this.id = idCounter++;
        this.name = name;
        this.description = description;
        this.contact = contact;
        this.itemHistory = itemHistory;
        this.typeArtist = typeArtist;
        this.lisArtists = new ArrayList<>();
        this.history = new ArrayList<>();
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

    public String getItemHistory() {
        return itemHistory;
    }

    public void setItemHistory(String itemHistory) {
        this.itemHistory = itemHistory;
    }

    public ArrayList<String> getHistory() {
        return history;
    }        

    /*Methods*/
    
    public void register() {
        Artist newArtist = new Artist(this.name, this.description, this.contact, this.itemHistory, this.typeArtist);
        history.add(itemHistory);
        lisArtists.add(newArtist);
        System.out.println("Registering artist: " + this.name);
    }
    
    public void artistList() {
        System.out.println("List of Registered artist category: ");
        if(lisArtists.isEmpty()){
            System.out.println("No category have been redistered yet.");
        } else {
            for (Artist artist : lisArtists) {
                System.out.println(artist.getName());
            }
        }
    }

    public void addEventHistory() {
        history.add(this.itemHistory);
        System.out.println("New event added to the artist's history!");
    }   
}
