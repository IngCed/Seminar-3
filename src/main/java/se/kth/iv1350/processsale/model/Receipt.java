
package se.kth.iv1350.processsale.model;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Represents one receipt that proves the payment for one sale. 
 * 
 */
public class Receipt {
    private Payment paymentInformation;
    
    /**
     * Function that sets the sale information needed for the receipt. 
     * @param paymentInformation The information given from the payment. 
     */
    public void setReceiptValues(Payment paymentInformation){
        this.paymentInformation = paymentInformation; 
    }
    
    
}
