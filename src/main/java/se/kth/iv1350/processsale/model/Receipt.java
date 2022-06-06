
package se.kth.iv1350.processsale.model;

import java.util.ArrayList;
import se.kth.iv1350.processsale.model.dto.SaleDTO;

/**
 * Represents one receipt that proves the payment for one sale. 
 * 
 */
public class Receipt {
    private Payment paymentInformation;
    private SaleDTO saleDTO;
    private ArrayList<Item> itemList;
    
    /**
     * Function that sets the sale information needed for the receipt. 
     * @param paymentInformation The information given from the payment. 
     */
    public void setReceiptValues(Payment paymentInformation, SaleDTO saleDTO, ArrayList<Item> itemList){
        this.paymentInformation = paymentInformation; 
        this.saleDTO = saleDTO;
        this.itemList = itemList;
    }
    /**
     * Puts the entire information receipt has into a String. 
     * @return The string containing all information Receipt has about the sale
     */
    public String toString(){
       String finalSaleOfItems = "\n          RECEIPT\n----------------------------\nTime of Sale: " 
               + saleDTO.getLocalTime() + "\n\nItems Purchased:";
       
       for(Item temporaryItem : itemList){
       finalSaleOfItems += "\n" + temporaryItem.getItemDTO().getName() + ", " + 
               temporaryItem.getQuantity() + "st, " + 
               temporaryItem.getItemDTO().getPrice() + " SEK";
       }
       
       finalSaleOfItems += "\n\nTotal Price: " + saleDTO.getTotalPrice() + "\nTotal VAT: " + 
               saleDTO.getTotalVAT() + "\nAmount paid: " + paymentInformation.getAmount() +
               "\nChange: " + paymentInformation.getChange() + "\n----------------------------\n";
       
       return finalSaleOfItems;
    }
    
}
