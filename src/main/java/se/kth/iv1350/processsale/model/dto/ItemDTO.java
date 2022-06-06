
package se.kth.iv1350.processsale.model.dto;

/**
 * The ItemDTO has all the primitive values needed to describe one item. 
 * 
 */
public class ItemDTO {
    private final String name; 
    private final double price;
    private final double VAT; 
    private final int itemIdentifier; 
    
    /**
     * The constructor for ItemDTO. Creates all instances needed to describe an item. 
     * @param name The name of a item. 
     * @param price The price of an item. 
     * @param VAT The VAT of an item. 
     * @param itemIdentifier The identifier for the item to be used.
     */
    public ItemDTO(String name, double price, double VAT, int itemIdentifier){
        this.name = name;
        this.price = price;
        this.VAT = VAT;
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
     /**
     * A getter method that gets the name of an item. 
     * @return Returns the name of the item.
     */     
    public String getName(){
        return name;
    }
}
