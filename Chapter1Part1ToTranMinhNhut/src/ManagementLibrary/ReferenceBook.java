/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author minhnhutvaio
 * @version 1.0
 * @date 23/8/2016
 */
public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook() {
    }

    public ReferenceBook(double tax, String id, String name, String date, double price, int number, String manufacturer) {
        super(id, name, date, price, number, manufacturer);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    /*
     * this method calculate price a reference book
     * Input: not
     * Output: the 'totalPrice' variable has double type
    */
    public double calPriceReferenceBook() {
        double totalPrice = number * price + (number * price) * tax;
        return totalPrice;
    }

    /*
     * This method input information a reference book
     * Input not
     * Output: not
     */
    @Override
    public void inputInformation() throws IOException {
        super.inputInformation();
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Please enter tax: ");
            tax = Double.parseDouble(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /*
     * this method return information a reference book
     * Input: not
     * Output: return information value of a reference book has String type
     */
    @Override
    public String printInformation() {
        return super.printInformation() + "| Tax: " + tax;
    }

}
