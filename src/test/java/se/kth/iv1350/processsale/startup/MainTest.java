/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package se.kth.iv1350.processsale.startup;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import se.kth.iv1350.processsale.controller.Controller;
import se.kth.iv1350.processsale.view.View;

public class MainTest {
    private Main instanceToTest;
    private ByteArrayOutputStream printoutBuffer; 
    private PrintStream originalSysOut; 
    
    @BeforeEach
    public void setUp() {
        instanceToTest = new Main();
        
        printoutBuffer = new ByteArrayOutputStream(); 
        PrintStream inMemSysOut = new PrintStream(printoutBuffer);
        originalSysOut = System.out; 
        System.setOut(inMemSysOut);
    }
    
    @AfterEach
    public void tearDown() {
        instanceToTest = null;
        
        printoutBuffer = null;
        System.setOut(originalSysOut);
    }

    @Test
    public void testThatUIHasStarted() {
        String[] args = null;
        Main.main(args);
        String printout = printoutBuffer.toString();
        String expectedOutput = "started"; 
        assertTrue(printout.contains(expectedOutput), "UI did not start correctly.");
    }
}
