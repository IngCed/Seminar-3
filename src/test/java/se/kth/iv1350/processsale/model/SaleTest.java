
package se.kth.iv1350.processsale.model;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.kth.iv1350.processsale.model.dto.SaleDTO;

public class SaleTest {
    Item testItem1;
    Item testItem2;
    
    public SaleTest() {
    }
    
    @BeforeEach
    public void setUp() {
        testItem1 = new Item();
        testItem1.setItemDTO("Item1", 9.99, 0.25, 1, 100010);
        testItem2 = new Item();
        testItem2.setItemDTO("Item2",  19.99, 0.15, 1, 110010);
        
    }
    
    @AfterEach
    public void tearDown() {
        testItem1 = null;
        testItem2 = null;
    }

       @Test
    public void testGetSaleDTO() {
        Sale instance = new Sale();
        SaleDTO result = instance.getSaleDTO();
        assertNotNull(result, "Did not return a saleDTO");
    }

    @Test
    public void testGetReceipt() {
        Sale instance = new Sale();
        Receipt result = instance.getReceipt();
        assertNotNull(result, "Did not return a Receipt");
    }

    @Test
    public void testGetItemList() {
        Sale instance = new Sale();
        ArrayList<Item> result = instance.getItemList();
        assertNotNull(result, "Did not return a ItemList");
    }
    
    @Test
    public void testAddNullItem() {
        Sale instance = new Sale();
        instance.addItem(null);
        boolean result = instance.getItemList().isEmpty();
        assertTrue(result, "Null item was added");
    }
    
    @Test
    public void testAddItem() {
        Sale instance = new Sale();
        instance.addItem(testItem1);
        int expResult1 = 1;
        int result1 = instance.getItemList().size();
        assertEquals(expResult1, result1, "No item was added");
        
        String expResult2 = "Item1";
        String result2 = instance.getItemList().get(0).getItemDTO().getName();
        assertEquals(expResult2, result2, "Wrong name of item");
        
        int expResult3 = 100010;
        int result3 = instance.getItemList().get(0).getItemDTO().getItemIdentifier();
        assertEquals(expResult3, result3, "Wrong identifier of item");
    }
    
    @Test
    public void testAddSeveralItems() {
        Sale instance = new Sale();
        instance.addItem(testItem1);
        instance.addItem(testItem2);
        int expResult1 = 2;
        int result1 = instance.getItemList().size();
        assertEquals(expResult1, result1, "No item was added");
        
        String expResult2 = "Item1";
        String result2 = instance.getItemList().get(0).getItemDTO().getName();
        assertEquals(expResult2, result2, "Wrong name of item");
        
        String expResult3 = "Item2";
        String result3 = instance.getItemList().get(1).getItemDTO().getName();
        assertEquals(expResult3, result3, "Wrong name of item");
        
        int expResult4 = 100010;
        int result4 = instance.getItemList().get(0).getItemDTO().getItemIdentifier();
        assertEquals(expResult4, result4, "Wrong identifier of item");
        
        int expResult5 = 110010;
        int result5 = instance.getItemList().get(1).getItemDTO().getItemIdentifier();
        assertEquals(expResult5, result5, "Wrong identifier of item");
    }

    @Test
    public void setSaleDTOOneItem() {
        Sale instance = new Sale();
        instance.addItem(testItem1);
        instance.setSaleDTO();
        
        double expResult1 = 9.99 + 9.99 * 0.25;
        double result1 = instance.getSaleDTO().getTotalPrice();
        assertEquals(expResult1, result1, "The total price of the sale is wrong");
        
        double expResult2 = 9.99 * 0.25;
        double result2 = instance.getSaleDTO().getTotalVAT();
        assertEquals(expResult2, result2, "The total VAT of the sale is wrong");
    }
    
    @Test
    public void setSaleDTOSeveralItems() {
        Sale instance = new Sale();
        instance.addItem(testItem1);
        instance.addItem(testItem2);
        instance.setSaleDTO();
        
        double expResult1 = ( 9.99 + 9.99 * 0.25 ) + ( 19.99 + 19.99 * 0.15 );
        double result1 = instance.getSaleDTO().getTotalPrice();
        assertEquals(expResult1, result1, "The total price of the sale is wrong");
        
        double expResult2 = 9.99 * 0.25 + 19.99 * 0.15;
        double result2 = instance.getSaleDTO().getTotalVAT();
        assertEquals(expResult2, result2, "The total VAT of the sale is wrong");
    }
    
}
