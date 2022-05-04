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
     * Creates new instances of the saleDTO, the receipt and the whole list of all items.
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
     * Adds an item to the itemList. If the list is empty or if the item doesn't exist it will add the item,
     * otherwise it will only increment the quantity of the item. 
     * @param item The identified item to be added. 
     */
    public void addItem(Item item){
        if(itemList.isEmpty()){
            itemList.add(item);
        }
        
        if(checkItemInList(item) == false && item != null){
        itemList.add(item);
        }
        else if(checkItemInList(item) == true && item != null){
            for(Item temporaryItem : itemList){
                if(temporaryItem.equals(item)){
                    temporaryItem.addQuantity(item.getItemDTO().getQuantity());
                }
            }
        }
    }
    
    /**
     * Calculates the total price used at the end of a sale. Adds the total price as well as the VAT.   
     * @return Returns the total price. 
     */
    public double calculateTotalPrice(){ 
        double totalPrice = 0; 
        for(Item temporaryItem : itemList){
            totalPrice += temporaryItem.getItemDTO().getPrice() + 
                    temporaryItem.getItemDTO().getPrice() * temporaryItem.getItemDTO().getVAT();
        }
        saleDTO.changeTotalPrice(totalPrice);
        return totalPrice;
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
