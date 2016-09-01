/**
 * 
 */
package FactoryGarmentShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author hv
 * @version 1.0
 * @since 1/9/2016
 */
public class GarmentShopMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String type = "";
        
        AodaiFactory aodaiFactory = new AodaiFactory();
        
        System.out.println("Please choose aodai type: <traditional / fashion / chinese dress>");
        try {
            type = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
        
        Aodai aodai = aodaiFactory.getAodai(type);
        
        aodai.sew();
    }
}
