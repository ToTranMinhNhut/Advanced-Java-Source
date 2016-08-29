import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author hv
 * @version 1.0
 * @created 29-Aug-2016 8:39:03 AM
 */
public abstract class Card implements Payment {

    protected String idCard;

    public Card(){
    }

    public Card(String idCard) {
        super();
        this.idCard = idCard;
    }


    /**
     * @return the idCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * @param idCard the idCard to set
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /*
     * This method input information card
     * Input not
     * Output not
     */
    public void inputInformation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Please enter id card: ");
            idCard = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /* (non-Javadoc)
     * @see Payment#pay()
     */
    @Override
    public abstract void pay();
    
}