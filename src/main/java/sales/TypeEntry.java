package sales;

import java.util.HashMap;

/**
 *
 * @author MarlonG
 */

public class TypeEntry {
    private HashMap<String, Double> typeEntry;    
    
    /*Contructor TypeEntry*/

    public TypeEntry(HashMap<String, Double> typeEntry) {
        this.typeEntry = typeEntry;
    }
            
    /*Getters and Setters TypeEntry*/

    public HashMap<String, Double> getTypeEntry() {
        return typeEntry;
    }

    public void setTypeEntry(HashMap<String, Double> typeEntry) {
        this.typeEntry = typeEntry;
    }        
    
    /*Methods TypeEntry*/
    
    public void addEntryType(String name, double price) {
        if(!typeEntry.containsKey(name)) {
            typeEntry.put(name, price);
            System.out.println("Entry type " + name + " added successfully.");
        } else {
            System.out.println("This type entry already exists.");
        }
    }
    
    public void entrysList() {
        if(typeEntry.isEmpty()) {
            System.out.println("There are no entry types registered.");
        } else {
            typeEntry.forEach((name, price) -> System.out.println("Type: " + name + "|| Price: " + price));
        }
    }
}
