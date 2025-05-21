package sales;

import java.util.ArrayList;


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
    
    public void registerSale(int quantitySold, String saleDate, double valueEntrySold) {
        Sales newSale = new Sales(quantitySold, saleDate, valueEntrySold);
        states.AppState.salesList.add(newSale);
        System.out.println("Registered sale." + states.AppState.salesList);
    }
    
    public void salesList() {
        if (states.AppState.salesList.isEmpty()) {
            System.out.println("No sales have been redistered yet.");
        } else {
            System.out.println("List of Registered sales: ");
            for (Sales sale: states.AppState.salesList) {
                System.out.println("ID: " + sale.getIdSale() + 
                        "\nQuantity: " + sale.getQuantitySold() + 
                        "\nSale date: " + sale.getSaleDate() + 
                        "\nPurchase value: " + (sale.getValueEntrySold()*sale.getQuantitySold())); 
            }
        }
    }
}
