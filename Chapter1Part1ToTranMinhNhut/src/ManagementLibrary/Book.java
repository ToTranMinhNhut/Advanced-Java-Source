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
 */
public class Book {

    protected String id;
    protected String name;
    protected String date;
    protected double price;
    protected int number;
    protected String manufacturer;

    public Book() {
    }

    public Book(String id, String name, String date, double price, int number, String manufacturer) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
        this.number = number;
        this.manufacturer = manufacturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    /*
     * This method input information a book
     * Input not
     * Output: not
    */
    public void inputInformation () throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Please enter id book: ");
            id = input.readLine();
            
            System.out.println("Please enter name book=: ");
            name = input.readLine();
            
            System.out.println("Please enter date: ");
            date = input.readLine();
            
            System.out.println("Please enter price book: ");
            price = Double.parseDouble(input.readLine());
            
            System.out.println("Please enter number book: ");
            number = Integer.parseInt(input.readLine());
            
            System.out.println("Please enter Manufacturer book: ");
            manufacturer = input.readLine();
            
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    
    /*
     * This method return inforamtion a book
     * Input: not
     * Output: return information value of a book has String type
     */
    public String printInformation() {
        return "ID: " + id + "| Name: " + name + "| Date: " + date + "| Price: " + price
                + "| Number: " + number + "| Manufacturer: " + manufacturer;
    }
}
