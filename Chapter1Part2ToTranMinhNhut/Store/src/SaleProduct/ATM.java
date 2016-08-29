package SaleProduct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author hv
 * @version 1.0
 * @created 29-Aug-2016 8:39:05 AM
 */
public class ATM extends Card {

    private double balance;
    
    public ATM(){

    }


    public ATM(double balance) {
        super();
        this.balance = balance;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }


    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }


    /* (non-Javadoc)
     * @see Card#inputInformation()
     * This method input information credit card
     * Input not
     * Output not
     */
    @Override
    public void inputInformation() throws IOException {
        super.inputInformation();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter balance card: ");
            balance = Double.parseDouble(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }


    /* (non-Javadoc)
     * @see Card#pay()
     * This method pay a order
     * Input: the 'order' variable has Order type
     * Output: not
     */
    @Override
    public void pay(Order order) {
    	
    	if (balance < order.calPriceOrder()) {
    		System.out.println("The balance is not enough to pay order.");
    	} else {
    		
    		// update state of order
    		order.setState("Was pay");
    		
    		System.out.println("The order was pay");
    	}
    }
    
}