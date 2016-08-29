import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author hv
 * @version 1.0
 * @date 29/8/2016
 */
public class Store {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        
        Order order = new Order();
        // input
        order.inputOrder();
        // order
        boolean make = order.order();
        //
        if (make) {
            order.printOrder();
        } else {
            System.out.println("Thanks you");
        }
    }

}
