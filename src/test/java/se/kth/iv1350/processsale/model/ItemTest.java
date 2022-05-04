
package se.kth.iv1350.processsale.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.kth.iv1350.processsale.model.dto.ItemDTO;

public class ItemTest {
    
    public ItemTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSetItemDTO() {
        System.out.println("setItemDTO");
        String name = "";
        double price = 0.0;
        double VAT = 0.0;
        int quantity = 0;
        int itemIdentifier = 0;
        Item instance = new Item();
        instance.setItemDTO(name, price, VAT, quantity, itemIdentifier);
    }
    
    @Test
    public void testEquals() {
        System.out.println("equals");
        Item item = null;
        Item instance = new Item();
        boolean expResult = false;
        boolean result = instance.equals(item);
        assertEquals(expResult, result);

    }

    @Test
    public void testGetItemDTO() {
        System.out.println("getItemDTO");
        Item instance = new Item();
        ItemDTO expResult = instance.getItemDTO();
        ItemDTO result = instance.getItemDTO();
        assertEquals(expResult, result);
    }


    @Test
    public void testAddQuantity() {
        System.out.println("addQuantity");
        int quantity = 0;
        Item instance = new Item();
        instance.addQuantity(quantity);

    }
    
}
