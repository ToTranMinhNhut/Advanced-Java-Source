/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementComputer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 * @version 1.0
 * @date 22/8/2016
 */
public class Computer {

    protected String id;
    protected double price;
    protected String manufacturer;
    protected int number;

    public Computer() {
    }

    public Computer(String id, double price, String manufacturer, int number) {
        this.id = id;
        this.price = price;
        this.manufacturer = manufacturer;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /*
     * The calculatePrice() method calculate unit price of computer;
     * Input: not
     * Output: 
     */
    public double calculatePrice() {
        double uPrice = price * number;
        return uPrice;
    }

   /*
     * This method print information a computer
     * Input: not
     * Output: not
    */
    public void inputInformation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter id computer: ");
            id = input.readLine();

            System.out.println("Please enter unit price: ");
            price = Double.parseDouble(input.readLine());

            System.out.println("Please enter manufacturer's computer: ");
            manufacturer = input.readLine();

            System.out.println("Please enter number computer: ");
            number = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }
            
    /*
     * This method print information a computer 
     * Input: not
     * Output: the 'info' variable has String type, which contain information computervalue
     */
    public String printInformation() {
        String info = "Information: id:  " + id + ". Unit price: " + price + ". Manufactuer: " + manufacturer;
        return info;
    }
}
