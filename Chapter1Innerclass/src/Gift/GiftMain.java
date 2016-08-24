/**
 * 
 */
package Gift;

import java.io.IOException;


/**
 * @author hv
 * @version 1.0
 * @date 24/8/2016
 */
public class GiftMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
     
        GiftBox.Gift gift = new GiftBox().new Gift(); 
        
        gift.inputInformation();
        
        gift.printInformation();
     
        double fee = gift.calFee();
        System.out.println("Ship gift fee: " + fee);
    }
}
