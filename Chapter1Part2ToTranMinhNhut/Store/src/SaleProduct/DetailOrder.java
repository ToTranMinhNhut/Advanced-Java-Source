package SaleProduct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author hv
 * @version 1.0
 * @created 29-Aug-2016 8:39:02 AM
 * This class is written for processing businesses of detail Order
 */
public class DetailOrder {

    private int quatity;
    public Books books;

    public DetailOrder(){
        books = new Books();
    }

    public DetailOrder(int quatity, Books books) {
        super();
        this.quatity = quatity;
        this.books = books;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    /*
     * This method input detail order
     * Input not
     * Output not
     */
    public void inputDetailOrder() throws NumberFormatException, IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter quatity' products: ");
            quatity = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }

        // input books;
        books.inputBooks();
    }

    /*
     * This method calculate price of detail order
     * Input not
     * Output" return price' detail order value has double type
     */
    public double calPrice(){

        return quatity * books.getPrice();
    }

    /*
     * This method print information a detail order
     * Input not
     * Output not
     */
    public void printDetailOrder(){
        System.out.println("The Quatity's books: " + quatity);
        books.printBooks();
    }
}