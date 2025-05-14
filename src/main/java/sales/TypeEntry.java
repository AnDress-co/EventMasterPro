package sales;

import java.util.HashMap;
import java.util.Map;



public class TypeEntry extends Entry{    
    private HashMap<String, Double> typeEntry;
    
    /*Contructor*/

    public TypeEntry() {
        this.typeEntry = new HashMap<>();
    }        

    public TypeEntry(String name, double price) {
        super(name, price);
        this.typeEntry = new HashMap<>();
    }
            
    /*Getters and Setters*/          

    public HashMap<String, Double> getTypeEntry() {        
        return typeEntry;
    }

    public void setTypeEntry(HashMap<String, Double> typeEntry) {
        this.typeEntry = typeEntry;
    }           
    
    /*Methods*/
    
    public void addEntryType() {        
        if (typeEntry.containsKey(this.getName())) {
            System.out.println("The entry type '" + this.getName() + "' already exists. Updating price...");
        } else {
            System.out.println("Adding entry type '" + this.getName() + "' with price " + this.getPrice() + ".");
        }
        typeEntry.put(this.getName(), this.getPrice());
    }
    
    public void entrysList() {
        if (typeEntry.isEmpty()) {
            System.out.println("There are no entry types registered.");
        } else {
            System.out.println("Registered entry types:");            
            for (Map.Entry<String, Double> entry : typeEntry.entrySet()) {
                System.out.println("Name: " + entry.getKey() + " || " + "Price: " + entry.getValue());
            }
        }                
    }
}
