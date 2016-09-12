/**
 * 
 */
package ArrayPrintingLambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author hv
 * @version 1.0
 * @since 9/9/2016
 */
public class ArrayPrintingMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,6,8,9,7);
        list.forEach(n -> System.out.println(n));
    }
}
