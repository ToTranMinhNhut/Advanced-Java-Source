import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author hv
 * @version 1.0
 * @created 29-Aug-2016 8:39:03 AM
 * Books class is written for processing business Books
 */
public class Books {

    private String name;
    private double price;

    public Books(){

    }

    public Books(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*
     * This method input information a customer
     * Input: not
     * Output: not
     */

    public void inputBooks() throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Please enter name's books: ");
        name = input.readLine();
        
        System.out.println("Please enter price's books");
        price = Double.parseDouble(input.readLine());
    }
    
    /*
     * This method print information a Books
     * Input not
     * Output not
     */
    public void printBooks(){
        System.out.println("Name's books: " + name);
        System.out.println("Price's a books: " + price);
    }
}