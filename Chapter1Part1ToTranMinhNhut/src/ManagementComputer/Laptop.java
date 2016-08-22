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
 *
 */
public class Laptop extends Computer {

    private int weight;
    private int timePin;
    private int sizeMinitor;

    public Laptop() {
    }

    public Laptop(int weight, int timePin, int sizeMinitor, String id, double price, String manufacturer, int number) {
        super(id, price, manufacturer, number);
        this.weight = weight;
        this.timePin = timePin;
        this.sizeMinitor = sizeMinitor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTimePin() {
        return timePin;
    }

    public void setTimePin(int timePin) {
        this.timePin = timePin;
    }

    public int getSizeMinitor() {
        return sizeMinitor;
    }

    public void setSizeMinitor(int sizeMinitor) {
        this.sizeMinitor = sizeMinitor;
    }

    /*
     * This method print information a laptop, and it's override printInformation() method in Computer clas
     * Input: not
     * Output: not
     */
    @Override
    public void inputInformation() throws IOException {
        super.inputInformation();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter weigth of laptop: ");
            weight = Integer.parseInt(input.readLine());

            System.out.println("Please enter time for using pin; ");
            timePin = Integer.parseInt(input.readLine());

            System.out.println("Please enter size of minitor: ");
            sizeMinitor = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /*
     * this method print information a desktop
     * Input: not
     * Output: the 'info' variable has String type, which contain information desktop value
     */
    @Override
    public String printInformation() {
        String info = super.printInformation() + ". Weight: " + weight + ". Time for using pin: " + timePin + ". Size of minitor: " + sizeMinitor;
        return info;
    }

}
