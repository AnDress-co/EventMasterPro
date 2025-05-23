package sales;

import java.util.ArrayList;

/**
 *
 * @author MarlonG
 */

public class Sales{
    private static int idCounter = 1;
    private int idSale;
    private int quantitySold;
    private String saleDate;
    private double valueEntrySold;
    private final ArrayList<Sales> salesList;
    
    /*Contructor Sales*/
    
    public Sales() {
        this.salesList = new ArrayList<>();
    }

    public Sales(int quantitySold, String saleDate, double valueEntrySold) {
        this.idSale = idCounter++;
        this.quantitySold = quantitySold;
        this.saleDate = saleDate;
        this.valueEntrySold = valueEntrySold;
        this.salesList = new ArrayList<>();
    }
    
    /*Getters and Setters Sales*/

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
    
    public ArrayList<Sales> getSalesList() {
        return salesList;
    }
    
    /*Methods Sales*/
    
    public void registerSale() {
        Sales newSale = new Sales(this.quantitySold, this.saleDate, this.valueEntrySold);
        salesList.add(newSale);
        System.out.println("Registered sale.");
    }
    
    public void salesList() {
        if (salesList.isEmpty()) {
            System.out.println("No sales have been redistered yet.");
        } else {
            System.out.println("List of Registered sales: ");
            for (Sales sale: salesList) {
                System.out.println("ID: " + sale.getIdSale() + 
                        "\nQuantity: " + sale.getQuantitySold() + 
                        "\nSale date: " + sale.getSaleDate() + 
                        "\nPurchase value: " + (sale.getValueEntrySold()*sale.getQuantitySold())); 
            }
        }
    }
}
