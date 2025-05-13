package artist;

import java.util.ArrayList;

/**
 *
 * @author MarlonG
 */
public class TypeArtist {
    private ArrayList<String> artistsCategory;        

    public TypeArtist() {
        this.artistsCategory = new ArrayList<>();
        this.artistsCategory.add("Singer");
        this.artistsCategory.add("Comedian");
        this.artistsCategory.add("Podcaster");
    }

    public ArrayList<String> getArtistsCategory() {
        return artistsCategory;
    }

    public void setArtistsCategory(ArrayList<String> artistsCategory) {
        this.artistsCategory = artistsCategory;
    }
    
    public void registerCategory(String newCategory) {
        artistsCategory.add(newCategory);
        System.out.println("New artist category added!");
    }
    
    public void categoeyList() {
        System.out.println("List of Registered artist category: ");        
        for (String typeArtist : artistsCategory) {
            System.out.println(typeArtist);        
        }
    }
}
