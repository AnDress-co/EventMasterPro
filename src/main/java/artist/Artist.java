package artist;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;



public class Artist{
    private static int idCounter = 1;
    private int id;
    private String name;
    private String description;
    private String contact;
    private String itemHistory;
    private String typeArtist;
    private final ArrayList<String> history;         
    
    /*Contructor*/
    
    public Artist() {        
        this.history = new ArrayList<>();
    }
    
    public Artist(String name, String description, String contact, String itemHistory, String typeArtist) {        
        this.id = idCounter++;
        this.name = name;
        this.description = description;
        this.contact = contact;
        this.itemHistory = itemHistory;
        this.typeArtist = typeArtist;        
        this.history = new ArrayList<>();
    }        

    /*Getters and Setters*/
    
    public int getId() {
        return id;
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

    public String getTypeArtist() {
        return typeArtist;
    }

    public void setTypeArtist(String typeArtist) {
        this.typeArtist = typeArtist;
    }

    /*Methods*/
    
    public void register(String name, String description, String contact, String itemHistory, String typeArtist) {
        Artist newArtist = new Artist(name, description, contact, itemHistory, typeArtist);
        history.add(itemHistory);
        states.AppState.listArtists.add(newArtist);
        System.out.println("Registering artist");                
    }
    
    public void artistList() {
        System.out.println("List of Registered artist category: ");
        if(states.AppState.listArtists.isEmpty()){
            System.out.println("No category have been redistered yet.");
        } else {
            for (Artist artist : states.AppState.listArtists) {
                System.out.println(artist.getName());
            }
        }
    }

    public void addEventHistory() {
        history.add(this.itemHistory);
        System.out.println("New event added to the artist's history!");
    }
    
    public void artistListTable(DefaultTableModel model, ArrayList<Artist> list) {  
        model.setRowCount(0);
        for(Artist artist : list) {
            if(artist != null) {
                System.out.println("Añadiendo a la tabla: " + artist.getName());
                model.addRow(new Object[] {
                    artist.getId(),
                    artist.getName(),
                    artist.getContact(),
                    artist.getTypeArtist(),
                    artist.getDescription()
                });
            }            
        }
    }
}
