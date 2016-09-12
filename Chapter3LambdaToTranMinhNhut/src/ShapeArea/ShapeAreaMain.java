/**
 * 
 */
package ShapeArea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hv
 * @version 1.0
 * @since 9/9/2016
 */
public class ShapeAreaMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Please enter radius: ");
        double r = 0;
        
        try {
            r = Double.parseDouble(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
        
        Area circle = (double x1, double x2) -> x1 * Math.pow(x2, 2);
        System.out.println("S = PI * (r * r) = " + circle.calArea(Math.PI, r));
        
        double l = 0;
        double w = 0;
        
        try {
            System.out.println("Please enter length side: ");
            l = Double.parseDouble(input.readLine());
            
            System.out.println("Please enter weith side: ");
            w = Double.parseDouble(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
        
        Area rectangle = (double x1, double x2) -> x1 * x2;
        System.out.println("S = W x L = " + rectangle.calArea(w, l));
    }

}
