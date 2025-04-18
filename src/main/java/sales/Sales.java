package sales;

import java.util.ArrayList;

/**
 *
 * @author MarlonG
 */

public class Sales extends Entry{
    private int idSale = 0;
    private int quantitySold;
    private String saleDate;    
    
    private static ArrayList<Sales> salesList = new ArrayList<>();
    
    /*Contructor Sales*/

    public Sales(int quantitySold, String saleDate, TypeEntry typeEntry) {
        super(typeEntry);
        this.idSale += 1;
        this.quantitySold = quantitySold;
        this.saleDate = saleDate;
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
    
    /*Methods Sales*/
    
    public void registerSale(int quantitySold, String saleDate, TypeEntry typeEntry) {
        Sales newSale = new Sales(quantitySold, saleDate, typeEntry);
        salesList.add(newSale);
        System.out.println("Registered sale.");
    }
}
