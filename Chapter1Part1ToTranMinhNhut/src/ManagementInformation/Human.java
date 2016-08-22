/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementInformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 * @version 1.0
 * @date 22/8/2016
 *
 */
public class Human {

    protected String name;
    protected String birthday;
    protected String address;
    protected String phoneNumber;

    public Human() {
    }

    public Human(String name, String birthday, String address, String phoneNumber) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*
     * This method input general information a humman
     * Input: not
     * Output: not
     */
    public void inputInformation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter name: ");
            name = input.readLine();

            System.out.println("Please enter birthday: ");
            birthday = input.readLine();

            System.out.println("Please enter address: ");
            address = input.readLine();

            System.out.println("Please enter phone number: ");
            phoneNumber = input.readLine();
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    /* 
     * This method print genaral information a human
     * Input: not
     * Output: return information value has String type
    */
    public String printInformation() {
        return "Name: " + name + "| Birthday: " + birthday + "| Address: " + address + "| Phone number: " + phoneNumber;
    }
}
