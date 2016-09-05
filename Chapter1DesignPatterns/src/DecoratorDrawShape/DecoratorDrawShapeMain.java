/**
 * 
 */
package DecoratorDrawShape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hv
 * @version 1.0
 * @since 5/9/2016
 */
public class DecoratorDrawShapeMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String optionShape = "";
        int choice = 0;

        System.out.println("Please enter a shape: <Circle or Rectangle>: ");

        try {
            optionShape = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println();
        }

        if (optionShape.equalsIgnoreCase("circle")) {

            Circle circle = new Circle();

            System.out.println("Do you decorate the shape? Please choose: <1 (Yes) / 0 (No)>");

            try {
                choice = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (choice != 1 && choice != 0) {
                throw new ArithmeticException("Please only enter 1 or 0.");
            } else if (choice == 1) {
                RedShapeDecorator redShape = new RedShapeDecorator(circle);
                System.out.println(redShape.draw());
            } else {
                System.out.println(circle.draw() + " with normal border.");
            }

        } else if (optionShape.equalsIgnoreCase("rectangle")) {

            Rectangle rectangle = new Rectangle();
            System.out.println("Do you decorate the shape? Please choose: <1 (Yes) / 0 (No)>");

            try {
                choice = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (choice != 1 && choice != 0) {
                throw new ArithmeticException("Please only enter 1 or 0.");
            } else if (choice == 1) {
                RedShapeDecorator redShape = new RedShapeDecorator(rectangle);
                System.out.println(redShape.draw());
            } else {
                System.out.println(rectangle.draw() + " with normal border.");
            }
            
        } else {
            throw new ArithmeticException("Please only enter circle or rectangle.");
        }
    }   
}
