/**
 * 
 */
package FactoryShap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hv
 * @version 1.0
 * @since 1/9/2016
 */
public class FactoryShapeMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String type = "";
        
        ShapeFactory shapeFactory = new ShapeFactory();
        
        System.out.println("Please choose a shape: <circle / square / rectangle>");
        try {
            type = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
        
        Shape shape = shapeFactory.getShape(type);
        
        shape.draw();
    }

}
