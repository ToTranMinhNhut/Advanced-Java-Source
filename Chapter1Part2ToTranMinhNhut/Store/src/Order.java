import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * @author hv
 * @version 1.0
 * @created 29-Aug-2016 8:39:00 AM
 * This class is written for processing businesses Order
 */
public class Order {

    final float RATETAX = 0.1f;
    final int DETAILORDERMAX = 10;

    private String dateOrder;
    private int invoice;
    private String state;
    public Customer customer;
    public Card card;
    private DetailOrder[] listDetailOrder;
    private int detailOrderNumber;

    public Order(){
        listDetailOrder = new DetailOrder[DETAILORDERMAX];
    }


    public Order(String dateOrder, int invoice, String state,
            Customer customer, Card card, DetailOrder[] listDetailOrder,
            int detailOrderNumber) {
        super();
        this.dateOrder = dateOrder;
        this.invoice = invoice;
        this.state = state;
        this.customer = customer;
        this.card = card;
        this.listDetailOrder = listDetailOrder;
    }



    public String getDateOrder() {
        return dateOrder;
    }



    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }



    public int getInvoice() {
        return invoice;
    }



    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }



    public String getState() {
        return state;
    }



    public void setState(String state) {
        this.state = state;
    }



    public Customer getCustomer() {
        return customer;
    }



    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



    public Card getCard() {
        return card;
    }



    public void setCard(Card card) {
        this.card = card;
    }



    public DetailOrder[] getListDetailOrder() {
        return listDetailOrder;
    }



    public void setListDetailOrder(DetailOrder[] listDetailOrder) {
        this.listDetailOrder = listDetailOrder;
    }


    public float getRATETAX() {
        return RATETAX;
    }

    /*
     * This method input order
     * Input not
     * Output not
     */
    public void inputOrder() throws NumberFormatException, IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {

            // System.out.println("Please enter the number's detail order: ");
            // detailOrderNumber = Integer.parseInt(input.readLine());

            int next = 0;
            // input list detail order
            while (next < DETAILORDERMAX) {
                listDetailOrder[next] = new DetailOrder();
                listDetailOrder[next].inputDetailOrder();
                
                int opt = 1;
                System.out.println("Do you add next product. Please choose: <1 (Yes)/ 0 (No)>:");
                opt = Integer.parseInt(input.readLine());
                
                if (opt != 0 && opt != 1) {
                    throw new ArithmeticException("Please only enter 1 or 0.");
                } else if (opt == 0) {
                    next = 10;
                } else {
                    next++ ;
                }
            }
            
            detailOrderNumber = next;

            System.out.println("Please enter state' order: ");
            state = input.readLine();

            System.out.println("Please choose print invoice: <1 (Yes) / 0 (No)>");
            invoice = Integer.parseInt(input.readLine());

            if (invoice != 1 && invoice != 0) {
                throw new ArithmeticException("Please only enter 1 or 0.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /*
     * This method calculate total price of detail order
     * input not
     * Output return value of total price's list detail order has double type.
     */
    public double calTotalPriceDetailOrder(){

        if (detailOrderNumber <= 0 ) {
            throw new ArrayIndexOutOfBoundsException("The numer detail must be more 0.");
        } else {
            double totalPrice = 0;

            for (int i = 0; i < detailOrderNumber; i++) {
                totalPrice += listDetailOrder[i].calPrice();
            }
            return totalPrice;
        }
    }

    /*
     * This method calculate tax of order
     * input not
     * output return tax value has double type
     */
    public double calTax(){
        double tax = 0;

        if (invoice == 1) {
            tax = RATETAX * calTotalPriceDetailOrder(); 
        }
        return tax;
    }

    /*
     * This method calculate total price order
     * Input not
     * Output not
     */
    public double calPriceOrder() {
        return calTotalPriceDetailOrder() + calTax();
    }

    /*
     * This method make order
     * Input not
     * Output: return true if order or return false do not order  
     */
    public boolean order() throws NumberFormatException, IOException{
        int order = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please choose: <1 (Order)/ 0(Don't Order)>:");
        order = Integer.parseInt(input.readLine());

        if (order == 1) {

            // get date that order
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
            Date date = new Date();
            dateOrder = "";
            dateOrder = dateOrder.concat(dateFormat.format(date));

            return true;
        } else if (order == 0){
            return false;
        } else {
            throw new ArithmeticException("Please only enter 0 or 1.");
        }
    }

    /*
     * This method print information a order
     * Input not
     * Output not
     */
    public void printOrder(){

        if (detailOrderNumber <= 0) {
            throw new ArithmeticException("these is not any order");
        } else {
            System.out.println("----------Order----------");

            System.out.println("The quatity's details order: " + detailOrderNumber);

            for (int i = 0; i < detailOrderNumber; i++) {

                System.out.println("-------Detail-" + (i + 1) + "-------");
                listDetailOrder[i].printDetailOrder();

                System.out.println("Price: " + listDetailOrder[i].calPrice());
                System.out.println("------------------");
            }

            System.out.println("The date order: " + dateOrder);

            System.out.println("The state's order: " + state);

            if (invoice == 1) {
                System.out.println("Print invoice.");
            } else {
                System.out.println("Do not print invoice.");
            }

            System.out.println("Total price of list detail orders: " + calTotalPriceDetailOrder());
            System.out.println("Tax: " + calTax());
            System.out.println("Total price's order:" + calPriceOrder());
        }
    }
}