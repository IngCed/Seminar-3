
package se.kth.iv1350.processsale.model;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.kth.iv1350.processsale.model.dto.ItemDTO;

public class ItemTest {
    
    public ItemTest() {
    }
    Item testItem1;
    
    @BeforeEach
    public void setUp() {
        testItem1 = new Item();
        testItem1.setItemDTO("Item1", 9.99, 0.25, 1, 100010);
    }
    
    @AfterEach
    public void tearDown() {
        testItem1 = null;
    }

    @Test
    public void testGetItemDTO(){
        Item instance = new Item();
        ItemDTO result = instance.getItemDTO();
        assertNotNull(result, "Did not return a ItemDTO");
    }
    
    @Test
    public void testSetItemDTO() {
    
        Item instance = new Item();
        instance.setItemDTO("Item1", 9.99, 0.25, 2, 100010);
        String expResult1 = "Item1";
        String result = instance.getItemDTO().getName();
        assertEquals(expResult1, result, "Did not add name");
        
        double expResult2 = 9.99;
        double result2 = instance.getItemDTO().getPrice();
        assertEquals(expResult2, result2, "Did not add price");
        
        double expResult3 = 0.25;
        double result3 = instance.getItemDTO().getVAT();
        assertEquals(expResult3, result3, "Did not add VAT");
        
        int expResult4 = 2;
        int result4 = instance.getQuantity();
        assertEquals(expResult4, result4, "Did not add quantity");
        
        int expResult5 = 100010;
        int result5 = instance.getItemDTO().getItemIdentifier();
        assertEquals(expResult5, result5, "Did not add item identifier");

    }
    
    @Test
    public void testEqualsNull() {
        Item item = null;
        Item instance = new Item();
        boolean result = instance.equals(item);
        assertFalse(result, "Null item was compared");
    }
    
    @Test
    public void testEqualsFalse() {
        Item item = testItem1;
        Item instance = new Item();
        boolean result = instance.equals(item);
        assertFalse(result, "Items compared as equal when not equal");
    }
    
    @Test
    public void testEqualsTrue() {
        Item item = testItem1;
        Item instance = testItem1;
        boolean result = instance.equals(item);
        assertTrue(result, "Items compared as not equal when they should be equal");
    }

    @Test
    public void testAddQuantityPositiveNumber() {
        int quantity = 5;
        Item instance = new Item();
        instance.addQuantity(quantity);
        int expResult = quantity;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddQuantityNegativeNumber() {
        int quantity = -5;
        Item instance = new Item();
        instance.addQuantity(quantity);
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }
    
}
