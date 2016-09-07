package ClassManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * This class is used for processing businesses of instance active score
 * 
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:45 PM
 */
public class ActiveScore {

    private double activeScore;

    public ActiveScore(){
    }
    
    
    public ActiveScore(double activeScore) {
        super();
        this.activeScore = activeScore;
    }


    /**
     * @return the activeScore
     */
    public double getActiveScore() {
        return activeScore;
    }


    /**
     * @param activeScore the activeScore to set
     */
    public void setActiveScore(double activeScore) {
        this.activeScore = activeScore;
    }


    /*
     * This method is used for input active score
     * Input: nothing
     * Output: nothing
     */
    void inputScore() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter active score:");

        try {
            activeScore = Double.parseDouble(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    /*
     * This method is used for printing active score
     * Input: nothing
     * Output: nothing
     */
    void println() {
        System.out.println("Active score: " + activeScore);
    }
}