
package se.kth.iv1350.processsale.model;

/**
 * The payment class responsible for handling the payment and the change to give to  the customer. 
 * 
 */
public class Payment {
    private double amount;
    private double change; 
    /**
     * The payment constructor. Creates instances useful for giving payment information.change is calculated
     * through the amount given minus the total price of the sale. 
     * @param sale The completed sale.
     * @param amount The amount given by the customer to pay. 
     */
    public Payment(Sale sale, double amount){
        this.amount = amount;
        this.change = amount - sale.getSaleDTO().getTotalPrice();
    }
    
    public double getAmount(){
        return amount;
    }
    
    public double getChange(){
        return change;
    }
}
