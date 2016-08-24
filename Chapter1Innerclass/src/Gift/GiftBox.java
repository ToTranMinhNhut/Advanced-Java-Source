/**
 * 
 */
package Gift;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hv
 * @version 1.0
 * @date 24/8/2016
 */
public class GiftBox {

    public String shape;
    public String color;
    final int price = 10000;

    public GiftBox() {    
    }

    public GiftBox(String shape, String color) {
        super();
        this.shape = shape;
        this.color = color;
    }

    public class Gift {
        
        public String name;
        public double weight;
        final int FEE = 200;

        public Gift() {
            super();
        }

        public Gift(String name, double weight) {
            super();
            this.name = name;
            this.weight = weight;
        }
            
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public int getFEE() {
            return FEE;
        }

        /*
         * This method calculate ship fee
         * Input: not
         * Output: not
         */
        public double calFee() {
            return weight * FEE + GiftBox.this.price;
        }

        /*
         * This method input information a gift
         * Input: not
         * Output: not
         */
        public void inputInformation() throws IOException {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            try {
                System.out.println("Please enter shape: ");
                shape = input.readLine();

                System.out.println("Please enter color");
                color = input.readLine();

                System.out.println("Please enter name: ");
                name = input.readLine();

                System.out.println("Please enter weight: ");
                weight = Double.parseDouble(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }
        }

        /*
         * This method print information a gift
         * Input: not
         * Output: not
         */
        public void printInformation() {

            System.out.println("Name: " + name);
            System.out.println("Weight: " + weight);
            System.out.println("Shape: " + shape);
            System.out.println("Color: " + color);
        }

    }
}
