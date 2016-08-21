/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementCD;

/**
 *
 * @author minhnhutvaio
 * @version 1.0
 * @date 21/8/2016
 * 
 */
public class CD {
    
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
    public void printInformationCD () {
        
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Singer: " + singer);
        System.out.println("Num of song: " + numOfSong);
        System.out.println("Price of CD: " + price);
    }
    
}
