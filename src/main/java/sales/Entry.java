package sales;

/**
 *
 * @author MarlonG
 */

public class Entry {
    private int idEntry = 0;
    private TypeEntry typeEntry;
    
    /*Contructor Entry*/
    
    public Entry(TypeEntry typeEntry) {
        this.idEntry += 1;
        this.typeEntry = typeEntry;
    }
    
    /*Getters and Setters Entry*/
    
    public int getIdEntry() {
        return idEntry;
    }

    public void setIdEntry(int idEntry) {
        this.idEntry = idEntry;
    }

    public TypeEntry getTypeEntry() {
        return typeEntry;
    }

    public void setTypeEntry(TypeEntry typeEntry) {
        this.typeEntry = typeEntry;
    }          
    
    /*Methods Entry*/
}
