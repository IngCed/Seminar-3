
package se.kth.iv1350.processsale.integration;

/**
 * ExternalAccountingSystem is responsible for the balance of the retail store.
 * 
 */
public class ExternalAccountingSystem {
    private double balance;
    
    /**
     * Updates the balance of the store after a successful sale.
     * @param amount is the amount earned through a payment.
     */
    public void updateAccountingSystem(double amount){
        balance += amount; 
    }
}
