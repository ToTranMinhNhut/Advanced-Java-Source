package ClassManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * This class is used for processing businesses of instance roll call
 * 
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:41 PM
 */
public class RollCall {

    private String state;

    final String PRESENT = "present";
    final String ADSENT = "adsent";
    final String LATE = "late";
    final String EARLY = "early";
    
    public RollCall(){
    }
    
    
    public RollCall(String state) {
        super();
        this.state = state;
    }


    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    
    
    /**
     * @return the pRESENT
     */
    public String getPRESENT() {
        return PRESENT;
    }

    /**
     * @return the aDSENT
     */
    public String getADSENT() {
        return ADSENT;
    }

    /**
     * @return the lATE
     */
    public String getLATE() {
        return LATE;
    }

    /**
     * @return the eARLY
     */
    public String getEARLY() {
        return EARLY;
    }

    /*
     * This method is used for inputing a state of roll call
     * Input: nothing
     * Output: nothing
     */
    void inputStateRollCall() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter state of roll call:");

        try {
            state = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }
}