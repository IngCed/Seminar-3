//This file by Ingemar Cederholm 2022-06-06
package se.kth.iv1350.processsale.startup;

import se.kth.iv1350.processsale.controller.Controller;
import se.kth.iv1350.processsale.integration.*;
import se.kth.iv1350.processsale.view.View;

/**
 * This is the Main class that contains the main method to start the application.
 * 
 * 
 */
public class Main {
    /**
     * The main method used to start the application. Several external applications are created but some
     * are not used.
     * 
     * @param args The application does not take any command line parameters
     */
    public static void main(String[] args){
    System.out.println("Starting up...");
    Printer printer = new Printer();
    DiscountDatabase db = new DiscountDatabase();
    ExternalInventorySystem externalInventorySystem = new ExternalInventorySystem();
    ExternalAccountingSystem externalAccountingSystem = new ExternalAccountingSystem();
    Controller contr = new Controller(printer, externalInventorySystem,externalAccountingSystem);
    View view = new View(contr);
    view.runFakeExecution();
    System.out.println("Shutting down...");
    }
}
