/**
 * 
 */
package StoreCDPart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

/**
 * @author hv
 * @version 1.0
 * @since 9/19/2016
 * 
 * This class is used to storage data of a cd
 */
public class CD implements Serializable {

    // The information of cd
    
    private int id;
    private String name;
    private String singer;
    private int numberSongs;
    private double price;

    //--------------------------------------------------------------------
    
    public CD() {
        super();
    }

    public CD(String name, String singer, int numberSongs, double price) {
        super();
        this.name = name;
        this.singer = singer;
        this.numberSongs = numberSongs;
        this.price = price;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the singer
     */
    public String getSinger() {
        return singer;
    }

    /**
     * @param singer the singer to set
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }

    /**
     * @return the numberSongs
     */
    public int getNumberSongs() {
        return numberSongs;
    }

    /**
     * @param numberSongs the numberSongs to set
     */
    public void setNumberSongs(int numberSongs) {
        this.numberSongs = numberSongs;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     * 
     * Thid method is used to return information of a CD
     * Input nothing.
     * Output return a String.
     */
    @Override
    public String toString() {
        return "CD [id=" + id + ", name=" + name + ", singer=" + singer
                + ", numberSongs=" + numberSongs + ", price=" + price + "]";
    }

    /*
     * This method is used to input information of a CD
     * Input nothing
     * Output nothing
     */
    public void inputInformationCD() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Please enter name of CD:");
            name = input.readLine();
            
            System.out.println("Please enter singer of CD:");
            singer = input.readLine();
            
            System.out.println("Please enter number's song of CD:");
            numberSongs = Integer.parseInt(input.readLine());
            
            System.out.println("Please enter price of CD:");
            price = Double.parseDouble(input.readLine());
            
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
