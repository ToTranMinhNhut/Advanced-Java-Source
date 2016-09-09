/**
 * 
 */
package CalculationBetweenTwoNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hv
 * @version 1.0
 * @since 9/9/2016
 */
public class CalculationMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int num1 = 0;
        int num2 = 0;

        try {
            System.out.println("Please enter first number: ");
            num1 = Integer.parseInt(input.readLine());

            System.out.println("Please enter second number: ");
            num2 = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }

        /*
         * 
         * Sum
         */
        Operator add = (Integer operand1, Integer operand2) -> operand1 + operand2;
        int sum = add.oparate(num1, num2);
        System.out.println("Sum = " + sum);

        /*
         *
         * Minus
         */
        Operator subtract = (Integer operand1, Integer operand2) -> operand1 - operand2;
        int minus = subtract.oparate(num1, num2);
        System.out.println("Minus = " + minus);

        /*
         * Multiplication
         * 
         */
        Operator multiple = (Integer operand1, Integer operand2) -> operand1 * operand2;
        int multiplication = multiple.oparate(num1, num2);
        System.out.println("Multiplication = " + multiplication);

        /*
         * Division = fist number divide to second number;
         */
        Operator divide = (Integer operand1, Integer operand2) -> {
            int div = 0;

            if (operand2 != 0) {
                div = operand1 / operand2;
            } else {
                throw new ArithmeticException("The second number must be higher than 0.");
            }
            return div;
        };
        int division = divide.oparate(num1, num2);
        System.out.println("Division = " + division);
    }

}
