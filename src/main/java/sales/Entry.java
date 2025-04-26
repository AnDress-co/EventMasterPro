package sales;

/**
 *
 * @author MarlonG
 */

public class Entry {    
    private String name;
    private double price;
    
    /*Contructor Entry*/
    
    public Entry() {
        
    }
    
    public Entry(String name, double price) {        
        this.name = name;
        this.price = price;
    }
       
    /*Getters and Setters Entry*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
        
}
