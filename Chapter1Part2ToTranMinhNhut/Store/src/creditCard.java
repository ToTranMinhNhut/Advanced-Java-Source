import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author hv
 * @version 1.0
 * @created 29-Aug-2016 8:39:04 AM
 */
public class creditCard extends Card {

    private String expiryDate;
    private double maxDebt;
    private String type;

    public creditCard(){

    }

    public creditCard(String expiryDate, double maxDebt, String type) {
        super();
        this.expiryDate = expiryDate;
        this.maxDebt = maxDebt;
        this.type = type;
    }

    /**
     * @return the expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the expiryDate to set
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return the maxDebt
     */
    public double getMaxDebt() {
        return maxDebt;
    }

    /**
     * @param maxDebt the maxDebt to set
     */
    public void setMaxDebt(double maxDebt) {
        this.maxDebt = maxDebt;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }


    /* (non-Javadoc)
     * @see Card#inputInformation()
     * This method input information credit card
     * Input not
     * Output not
     */
    @Override
    public void inputInformation() throws IOException {
        super.inputInformation();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter type card: ");
            type = input.readLine();

            System.out.println("Please enter expriry date: ");
            expiryDate = input.readLine();

            System.out.println("Please enter maximum dept:");
            maxDebt = Double.parseDouble(input.readLine());

        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /* (non-Javadoc)
     * @see Card#pay()
     */
    @Override
    public void pay() {
        
    }
}