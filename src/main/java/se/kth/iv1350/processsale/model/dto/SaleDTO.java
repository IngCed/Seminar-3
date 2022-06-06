
package se.kth.iv1350.processsale.model.dto;

import java.time.LocalTime;

/**
 * The saleDTO that stores all primitive values and the Local Time of the sale.
 * 
 */
public class SaleDTO {
    private final double totalPrice;
    private final double totalVAT; 
    private final double totalDiscount;
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
     * A getter method to get the total price. 
     * @return Returns the total price
     */
    public double getTotalPrice(){
        return totalPrice;
    }
    
    public double getTotalVAT(){
        return totalVAT;
    }
    
    public LocalTime getLocalTime(){
        return saleTime;
    }
}
