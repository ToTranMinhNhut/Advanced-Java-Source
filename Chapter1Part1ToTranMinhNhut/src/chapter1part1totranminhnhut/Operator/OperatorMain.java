/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1totranminhnhut.Operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class OperatorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double firstNumber = 0;
        double secondNumber = 0;
        Operator Operation = new Operator();

        try {
            System.out.println("Please enter a first number: ");
            firstNumber = Double.parseDouble(input.readLine());

            System.out.println("Please enter a second number: ");
            secondNumber = Double.parseDouble(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
        
        Operation.setFirstNumber(firstNumber);
        Operation.setSecondNumber(secondNumber);
        
        double sum = Operation.plus();
        System.out.println("Sum = " + sum);

        double sub = Operation.minus();
        System.out.println("Subtraction = " + sub);

        double pro = Operation.product();
        System.out.println("product = " + pro);

        double dev = Operation.devide();
        System.out.println("devidion = " + dev);
    }

}
