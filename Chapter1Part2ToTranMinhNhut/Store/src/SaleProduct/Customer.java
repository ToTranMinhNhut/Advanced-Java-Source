package SaleProduct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author hv
 * @version 1.0
 * @created 29-Aug-2016 8:38:57 AM
 * This class is written for processing business of customer
 */
public class Customer {

    private String address;
    private String email;
    private String id;
    private String name;
    private String phoneNumber;

    public Customer(){

    }


    public Customer(String address, String email, String id, String name,
            String phoneNumber) {
        super();
        this.address = address;
        this.email = email;
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }



    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
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


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*
     * This method input information a customer
     * Input: not
     * Output: not
     */
    public void inputInformationCustomer() throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter id's customer: ");
            id = input.readLine();

            System.out.println("Please enter name's customer: ");
            name = input.readLine();

            System.out.println("Please enter address's customer: ");
            address = input.readLine();

            System.out.println("Please enter email's customer: ");
            email = input.readLine();

            System.out.println("Please enter phone number' customer:  ");
            phoneNumber = input.readLine();
        } catch (NumberFormatException e) {
        }
    }
}