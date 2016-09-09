/**
 * 
 */
package MoneyCountingLambla;

import java.util.Arrays;
import java.util.List;

/**
 * @author hv
 * @version 1.0
 * @since 9/9/2016
 */
public class MoneyCountingMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
       
        List<Integer> amounts = Arrays.asList(new Integer[] {2,3,5,7});
        int price = 5200;
        amounts.forEach(element -> {
            System.out.println("Money = " + price * element + " vnd.");
        });
    }
}
