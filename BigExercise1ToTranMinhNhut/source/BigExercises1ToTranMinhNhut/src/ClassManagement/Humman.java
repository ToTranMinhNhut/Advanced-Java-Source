package ClassManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:37 PM
 */
public abstract class Humman {

    protected String birthOfDate;
    protected String email;
    protected String name;
    protected String phoneNumber;
    
    public Humman(){
    }

    /*
     * This method is used for input information of human
     * Input: nothing
     * Output: nothing
     */
    void inputInformation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter name:");
            name = input.readLine();
            
            System.out.println("Please enter birth of date:");
            birthOfDate = input.readLine();
            
            System.out.println("Please enter email:");
            email = input.readLine();
            
            System.out.println("Please enter phone number:");
            phoneNumber = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    /*
     * This method is used for printing information of human
     * Input: nothing
     * Output: nothing
     */
    void printInformation() {
        System.out.println("Name: " + name);
        System.out.println("Birth of date: " + birthOfDate);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}