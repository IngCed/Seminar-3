package se.kth.iv1350.processsale.model;

import java.util.ArrayList;
import se.kth.iv1350.processsale.model.dto.SaleDTO;

/**
 * A sale made by one customer and payed with one payment. 
 * 
 */

public class Sale {
    private SaleDTO saleDTO; 
    private Receipt receipt;
    private ArrayList<Item> itemList; 
    
    /**
     * Creates new instances of the receipt and the whole list of all items.
     * 
     */
    public Sale(){
        this.saleDTO = new SaleDTO(0, 0, 0); 
        this.receipt = new Receipt();
        this.itemList = new ArrayList<>();
    }
    
    /**
     * A getter method to get the SaleDTO.
     * @return returns the instance saleDTO.
     */
    public SaleDTO getSaleDTO(){
        return saleDTO;
    }
    
    /**
     * A getter method to get the receipt.
     * @return returns the instance receipt. 
     */
    public Receipt getReceipt(){
        return receipt;
    }
    
    /**
     * A getter method to get the itemList.
     * @return returns the instance itemList. 
     */
    public ArrayList<Item> getItemList(){
        return itemList;
    }
    
    /**
     * Adds an item to the itemList. If the list is empty or if the item doesn't exist it will add the item,
     * otherwise it will only increment the quantity of the item. 
     * @param item The identified item to be added. 
     */
    public void addItem(Item item){
        if(itemList.isEmpty() && item != null){
            itemList.add(item);
        }
        else if(checkItemInList(item) == false && item != null){
        itemList.add(item);
        }
        else if(checkItemInList(item) == true && item != null){
            for(Item temporaryItem : itemList){
                if(temporaryItem.equals(item)){
                    temporaryItem.addQuantity(item.getQuantity());
                }
            }
        }
    }
    
    /**
     * Creates a saleDTO where the final values of the sales are set.
     */
    public void setSaleDTO(){
        this.saleDTO = new SaleDTO(calculateTotalPrice(), calculateTotalVAT(), 0);
    }
    
    /**
     * Calculates the total price used at the end of a sale.   
     * @return Returns the total price. 
     */
    private double calculateTotalPrice(){ 
        double totalPrice = 0; 
        for(Item temporaryItem : itemList){
            totalPrice += 
                    ( temporaryItem.getItemDTO().getPrice() 
                      + calculateVAT(temporaryItem) )
                    * temporaryItem.getQuantity();
        }
        return totalPrice;
    }
    
    /**
     * Calculates the total VAT of the entire sale.  
     * @return Returns the totalVAT. 
     */
    private double calculateTotalVAT(){
        double totalVAT = 0;
        for(Item temporaryItem : itemList){
            totalVAT += 
                ( calculateVAT(temporaryItem) ) * temporaryItem.getQuantity();
        } 
        return totalVAT;
    }
    
    /**
     * Calculates the VAT of an item.
     * @param item The item to have its VAT calculated.
     * @return Returns the calculated VAT of the item. 
     */
    private double calculateVAT(Item item){
        return item.getItemDTO().getPrice() * item.getItemDTO().getVAT();
    }
    /**
     * Checks if a specified item already exists in a list during a sale. It iterates through the list to 
     * ensure if the same item already exists.
     * @param item The specified item to check.
     * @return Returns either true or false depending if the item exists in the list or not
     */
    private boolean checkItemInList(Item item){
        for(Item temporaryItem : itemList){
            if(temporaryItem.equals(item)){
                return true; 
            }
        }
        return false;
    }
    
}
