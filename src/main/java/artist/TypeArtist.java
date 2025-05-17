package artist;

import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author MarlonG
 */
public class TypeArtist {
    private ArrayList<String> artistsCategory;        
    
    /*Contructor*/
    
    public TypeArtist() {
        this.artistsCategory = new ArrayList<>();
        this.artistsCategory.add("Singer");
        this.artistsCategory.add("Comedian");
        this.artistsCategory.add("Podcaster");
    }

    /*Getters and Setters*/
    
    public ArrayList<String> getArtistsCategory() {
        return artistsCategory;
    }

    public void setArtistsCategory(ArrayList<String> artistsCategory) {
        this.artistsCategory = artistsCategory;
    }
    
    /*Methods*/        
    
    public void categoryListBox(JComboBox<String> typeArtistSelection) {
        typeArtistSelection.removeAllItems();
        
        for (String typeArtist : artistsCategory) {
            typeArtistSelection.addItem(typeArtist);
        }
    }
}
