
package se.kth.iv1350.processsale.view;

import se.kth.iv1350.processsale.controller.Controller;

/**
 * This is a placeholder for the real view. It contains a hard coded execution with calls to all
 * system operations in the controller. 
 * @author ingem
 */
public class View {
    private final Controller contr; 
    
    /**
     * A constructor for the view class. Creates an instance of the controller for calls to other layers. 
     * @param contr The controller to use for all calls to other layers. 
     */
    public View(Controller contr){
        this.contr = contr; 
    }
    
    /**
     * Runs an hard coded execution of the program in order to show that the code runs. 
     * 
     */
    public void runFakeExecution(){
        contr.startSale();
        System.out.println("A new sale has been started");
        contr.scanItem(100010, 1);
        System.out.println("A item has been scanned");
        contr.scanItem(110010, 1);
        System.out.println("A item has been scanned");
        contr.scanItem(100010, 5);
        System.out.println("A item has been scanned");
        contr.endSale();
        System.out.println("The sale has ended");
        double exampleAmountThatCustomerGives = contr.endSale().getTotalPrice() + 10;
        contr.enterPayment(exampleAmountThatCustomerGives);
        System.out.println("The payment has been processed");

        
    }
}
