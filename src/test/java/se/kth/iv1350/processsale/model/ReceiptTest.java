
package se.kth.iv1350.processsale.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ingem
 */
public class ReceiptTest {
    
    public ReceiptTest() {
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
    public void testSetReceiptValues() {
        System.out.println("setReceiptValues");
        Payment paymentInformation = null;
        Receipt instance = new Receipt();
        instance.setReceiptValues(paymentInformation);
    }
    
}
