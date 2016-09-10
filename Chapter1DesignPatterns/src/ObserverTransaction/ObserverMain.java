/**
 * 
 */
package ObserverTransaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author minhnhutvaio
 *
 */
public class ObserverMain {

    /**
     * @param args
     * @throws IOException 
     * @throws NumberFormatException 
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        Account account = new Account();
        account.setState(10000000);
        
        EmailObserver emailOb = new EmailObserver(account);
        @SuppressWarnings("unused")
        MobiObserver mobiOb = new MobiObserver(account);

        System.out.println("Enter the amount you want to withdraw: ");
        double state = Double.parseDouble(input.readLine());
        
        if (state > account.getState()) {
            System.out.println("This amount is greater than the amount in your account.");
        } else {
            account.setState((account.getState() - state));
            account.notifyAllObservers();
        }
    }

}
