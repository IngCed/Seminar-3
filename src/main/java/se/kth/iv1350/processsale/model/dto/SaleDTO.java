
package se.kth.iv1350.processsale.model.dto;

import java.time.LocalTime;
import java.util.ArrayList;
import se.kth.iv1350.processsale.model.Item;

/**
 * The saleDTO that stores all primitive values and the Local Time of the sale.
 * 
 */
public class SaleDTO {
    private double totalPrice;
    private double totalVAT; 
    private double totalDiscount;
    private final LocalTime saleTime; 
    
    /**
     * The constructor of the SaleDTO, where all instances needed for the sale are created. 
     * @param totalPrice The total price of the entire sale.
     * @param totalVAT The total VAT for the entire sale.
     * @param totalDiscount The total Discount for the entire sale, not used in this program
     */
    public SaleDTO(double totalPrice, double totalVAT, double totalDiscount){
        this.totalPrice = totalPrice;
        this.totalVAT = totalVAT;
        this.totalDiscount = totalDiscount;
        this.saleTime = LocalTime.now(); 
    }
    
    /**
     * Updates the total price after it has been calculated. 
     * @param totalPrice THe calculated total price.
     */
    public void changeTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }
    
    /**
     * A getter method to get the total price. 
     * @return Returns the total price
     */
    public double getTotalPrice(){
        return totalPrice;
    }
}
