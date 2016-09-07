package ClassManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:39 PM
 */
public class Suject {

	private String endDate;
	private String name;
	private int numOfperiod;
	private String startDate;

	public Suject(){
	}

    public Suject(String endDate, String name, int numOfperiod, String startDate) {
        super();
        this.endDate = endDate;
        this.name = name;
        this.numOfperiod = numOfperiod;
        this.startDate = startDate;
    }
	
    
    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
     * @return the numOfperiod
     */
    public int getNumOfperiod() {
        return numOfperiod;
    }

    /**
     * @param numOfperiod the numOfperiod to set
     */
    public void setNumOfperiod(int numOfperiod) {
        this.numOfperiod = numOfperiod;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /*
     * This method is used for input information of subject
     * Input: nothing
     * Output: nothing
     */
    void inputInformation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter name:");
            name = input.readLine();
            
            System.out.println("Please enter the number of class period: ");
            numOfperiod = Integer.parseInt(input.readLine());
            
            System.out.println("Please enter start of date:");
            startDate = input.readLine();
            
            System.out.println("Please enter end of date:");
            endDate = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    /*
     * This method is used for printing information of subject
     * Input: nothing
     * Output: nothing
     */
    void printInformation() {
        System.out.println("Name: " + name);
        System.out.println("The number of class period: " + numOfperiod);
        System.out.println("Start of date: " + startDate);
        System.out.println("End of date: " + endDate);
    }
}