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
 *
 */
public class TextBook extends Book {

    final String NEW = "new";
    final String OLD = "old";

    final float RATE = 0.5f;

    private String state;

    public TextBook() {
    }

    public TextBook(String state, String id, String name, String date, double price, int number, String manufacturer) {
        super(id, name, date, price, number, manufacturer);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /*
     * This method input information a textbook
     * Input not
     * Output: not
     */
    @Override
    public void inputInformation() throws IOException {
        super.inputInformation();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter state of book: <NEW><OLD>");
            state = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
        
        if (!state.equalsIgnoreCase(NEW) && !state.equalsIgnoreCase(OLD)) {
            throw new ArithmeticException("Please only enter NEW or OLD");
        }
    }

    /*
     * This method calculate price a textbook
     * Input: not
     * Output: the 'totalprice' variable has double type, which contains price's textbook value
     */
    public double calPriceTextBook() {
        double totalprice = 0;

        if (state.equalsIgnoreCase(NEW)) {
            totalprice = number * price;
        } else if (state.equalsIgnoreCase(OLD)) {
            totalprice = number * price * RATE;
        }

        return totalprice;
    }

    /*
     * This method return information of a textbook
     * Input: not
     * Output: return informaion value of a textbook has String type
     */
    @Override
    public String printInformation() {
        return super.printInformation() + "| State book: " + state;
    }

}
