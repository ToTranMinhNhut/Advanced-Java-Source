/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleLanguagesCDManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

/**
 *
 * @author minhnhutvaio
 * @version 1.0
 * @date 21/8/2016
 * 
 */
public class CD implements Comparable<CD>{

    private String id;
    private String name;
    private String singer;
    private int numOfSong;
    private double price;

    public CD() {
    }

    public CD(String id, String name, String singer, int numOfSong, double price) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.numOfSong = numOfSong;
        this.price = price;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumOfSong() {
        return numOfSong;
    }

    public void setNumOfSong(int numOfSong) {
        this.numOfSong = numOfSong;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*
     * This method print information of CD
     * Input: not
     * Output: not
     */
    public void printInformationCD (ResourceBundle message) {

        System.out.println(message.getString("id") + ": " + id);
        System.out.println(message.getString("name") + ": " + name);
        System.out.println(message.getString("singer") + ": " + singer);
        System.out.println(message.getString("number") + ": " + numOfSong);
        System.out.println(message.getString("price") + ": " + price);
    }

    /*
     * This method is used for inputing information of a cd
     * Input nothing
     * Output nothing
     */
    public void inputInformation(ResourceBundle message) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println(message.getString("id"));
            id = input.readLine();

            System.out.println(message.getString("name"));
            name = input.readLine();

            System.out.println(message.getString("singer"));
            singer = input.readLine();

            System.out.println(message.getString("number"));
            numOfSong = Integer.parseInt(input.readLine());

            System.out.println(message.getString("price"));
            price = Double.parseDouble(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     * 
     * This method is used for comparing two cd with cd name
     * Input nothing
     * Output nothing
     */
    @Override
    public int compareTo(CD o) {
        return (this.name).compareTo(o.name);
    }
    
}
