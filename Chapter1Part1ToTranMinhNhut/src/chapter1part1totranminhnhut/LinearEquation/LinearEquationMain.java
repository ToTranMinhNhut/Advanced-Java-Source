/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1totranminhnhut.LinearEquation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 * @date: 19/8/2016
 * @version: 1.0
 */
public class LinearEquationMain {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double b = 0;
        
        try {
            System.out.println("Please enter a: ");
            a = Double.parseDouble(input.readLine());

            System.out.println("Please enter b:");
            b = Double.parseDouble(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
        
        LinearEquation linEq =  new LinearEquation(a,b);
        double[] root = new double[3];
        root = linEq.evalueteRoot();
        
        if (root[0] == 1) {
            System.out.println("The Linear Equation do not has root");
        } else if (root[1] == 1) {
            System.out.println("The Linear Equation has infinitive roots");
        } else {
            System.out.println("The Linear Equation has a root: " + root[2]);
        }
    }

}
