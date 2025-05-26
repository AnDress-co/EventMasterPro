package artist;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Artist{
    private static int idCounter = 1;
    private int id;
    private String name;
    private String description;
    private String contact;
    private String itemHistory;
    private String typeArtist;
    private ArrayList<String> artistHistory  = new ArrayList<>();
    
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
        this.artistHistory.add(itemHistory);
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

    public String getTypeArtist() {
        return typeArtist;
    }

    public void setTypeArtist(String typeArtist) {
        this.typeArtist = typeArtist;
    }

    public ArrayList<String> getArtistHistory() {
        return artistHistory;
    }

    public void setArtistHistory(ArrayList<String> artistHistory) {
        this.artistHistory = artistHistory;
    }        

    /*Methods*/
    
    public void register(String name, String description, String contact, String itemHistory, String typeArtist) {
        Artist newArtist = new Artist(name, description, contact, itemHistory, typeArtist);        
        states.AppState.listArtists.add(newArtist);
        System.out.println("Registering artist");                
    }
       
    public void searchArtistToAddHistory(Component frameComponent,int id, JLabel artistNameJLabel, JList<String> listArtistJList) {
        for(Artist artist: states.AppState.listArtists) {
            if(artist.getId() == id) {
                artistNameJLabel.setText(artist.getName());                
                artist.updateArtistHistory(listArtistJList, artist.getArtistHistory());
                JOptionPane.showMessageDialog(frameComponent, "Artist found!");
                break;
            }
        }        
    }
    
    public void addHistory(String newArtistHistoy) {
        this.artistHistory.add(newArtistHistoy);
    }
    
    
    public void addHistoryToArtist(int id, String newArtistHistoy, JList<String> listArtistJList) {
        for(Artist artist: states.AppState.listArtists) {
            if(artist.getId() == id) {
                artist.addHistory(newArtistHistoy);
                artist.updateArtistHistory(listArtistJList, artist.getArtistHistory());
            }
        }                
    }
    
    public void updateArtistHistory(JList<String> listArtistJList, ArrayList<String> history) {
        DefaultListModel<String> model = new DefaultListModel<>();        
        for(String historyArtist : history) {
            model.addElement(historyArtist);
        }        
        listArtistJList.setModel(model);        
    }
    
    public void artistListTable(DefaultTableModel model, ArrayList<Artist> list) {  
        model.setRowCount(0);
        for(Artist artist : list) {
            if(artist != null) {                
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
