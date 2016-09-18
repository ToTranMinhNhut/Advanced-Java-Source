/**
 * 
 */
package Transaction;

/**
 * @author minhnhutvaio
 *
 */
public class TransactionMain {

    /**
     * @param args
     */
    public static void main(String[] args) {

        TransactionController transactionController = new TransactionController();

        try {
            System.out.println("-----Transaction 1");
            transactionController.doFirstTransaction();;
        } catch (Exception e) {
            System.out.println("-----Error transaction 1");
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("-----Transaction 2");
            transactionController.doSecondTransaction();;
        } catch (Exception e) {
            System.out.println("-----Error transaction 2");
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("-----Transaction 3");
            transactionController.doThirdTransaction();;
        } catch (Exception e) {
            System.out.println("-----Error transaction 3");
            System.out.println(e.getMessage());
        }
    }

}
