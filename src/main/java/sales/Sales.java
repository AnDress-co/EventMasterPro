package sales;

public class Sales{
    private static int idCounter = 1;
    private int idSale;
    private int quantitySold;
    private String saleDate;
    private double valueEntrySold;
    private String nameEntrySold;
        
    
    /*Contructor*/
    
    public Sales() {
        
    }

    public Sales(int quantitySold, String saleDate, double valueEntrySold, String nameEntrySold) {
        this.idSale = idCounter++;
        this.quantitySold = quantitySold;
        this.saleDate = saleDate;
        this.valueEntrySold = valueEntrySold;
        this.nameEntrySold = nameEntrySold;
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

    public String getNameEntrySold() {
        return nameEntrySold;
    }

    public void setNameEntrySold(String nameEntrySold) {
        this.nameEntrySold = nameEntrySold;
    }        
        
    /*Methods*/
    
    public void registerSale(Sales newSale) {        
        states.AppState.salesList.add(newSale);
        System.out.println("Registered sale.");          
    }
        
}
