package sales;

public class Sales{
    private static int idCounter = 1;
    private int idSale;
    private int quantitySold;
    private String saleDate;
    private double valueEntrySold;
        
    
    /*Contructor*/
    
    public Sales() {
        
    }

    public Sales(int quantitySold, String saleDate, double valueEntrySold) {
        this.idSale = idCounter++;
        this.quantitySold = quantitySold;
        this.saleDate = saleDate;
        this.valueEntrySold = valueEntrySold;                
    }
    
    /*Getters and Setters*/

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }
    
    public double getValueEntrySold() {
        return valueEntrySold;
    }

    public void setEntrySale(double valueEntrySold) {
        this.valueEntrySold = valueEntrySold;
    }                
        
    /*Methods*/
    
    public void registerSale(Sales newSale) {        
        states.AppState.salesList.add(newSale);
        System.out.println("Registered sale.");  
        System.out.println(this.idSale);
    }
        
}
