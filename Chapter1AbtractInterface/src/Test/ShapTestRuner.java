/**
 * 
 */
package Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * @author hv
 * @version 1.0
 * @date 24/8/2016
 */
public class ShapTestRuner {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Result result = JUnitCore.runClasses(ShapeTestsuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        
        System.out.println(result.wasSuccessful());    
    }

}
