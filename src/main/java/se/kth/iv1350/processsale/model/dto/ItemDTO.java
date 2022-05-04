
package se.kth.iv1350.processsale.model.dto;

/**
 * The ItemDTO has all the primitive values needed to describe one item. 
 * 
 */
public class ItemDTO {
    private String name; 
    private double price;
    private double VAT; 
    private int quantity;
    private int itemIdentifier; 
    
    /**
     * THe constructor for ItemDTO. Creates all instances needed to describe an item. 
     * @param name The name of a item. 
     * @param price The price of an item. 
     * @param VAT The VAT of an item. 
     * @param quantity The amount of a scanned item.
     * @param itemIdentifier The identifier for the item to be used.
     */
    public ItemDTO(String name, double price, double VAT, int quantity, int itemIdentifier){
        this.name = name;
        this.price = price;
        this.VAT = VAT;
        this.quantity = quantity; 
        this.itemIdentifier = itemIdentifier;
    }
    
    /**
     * A getter method to get the itemIdentifier of an item.
     * @return returns the itemIdentifier.
     */
    public int getItemIdentifier(){
        return itemIdentifier; 
    }
    
    /**
     * A getter method to get the quantity of an item.
     * @return Returns the quantity of an item.
     */
    public int getQuantity(){
        return quantity; 
    }
    
    /**
     * Sets the quantity of an item. 
     * @param newQuantity The new quantity of an item. 
     */
    public void setQuantity(int newQuantity){
        this.quantity = newQuantity; 
    }
    
    /**
     * A getter method that gets the price of an item. 
     * @return Returns the price of the item.
     */
    public double getPrice(){
        return price;
    }
    
    /**
     * A getter method that gets the VAT of an item. 
     * @return Returns the VAT of the item.
     */        
    public double getVAT(){
        return VAT; 
    }       
}
