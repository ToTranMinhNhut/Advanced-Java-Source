package SaleProduct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author hv
 * @version 1.0
 * @date 29/8/2016
 */
public class Store {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		 * The statement codes below is used describe business of sale product.
		 * Firstly, to enter product that want to buy.
		 * Secondly,to make order.
		 * Thirdly, if making order, programming will print order
		 * Fourthly, to choose method payment
		 * Fifthly, to enter information card
		 * Lastly, to pay order
		 */
		
		Order order = new Order();
		
		System.out.println("Please enter product that you would to buy.");
		System.out.println("--------------------------------------------------");

		order.inputOrder();
		
		boolean make = order.order();
		
		if (make) {
			order.printOrder();
		} else {
			System.out.println("Thanks you. See you later");
		}

		int methodPayment = 0;
		System.out.println("Please choose method payment: ");
		System.out.println("1 - Payment with ATM card.");
		System.out.println("2 - Payment with credit card.");
		System.out.println("3 - Payment after delivery.");

		try {
			methodPayment = Integer.parseInt(input.readLine());
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.toString());
		}

		if (methodPayment != 1 && methodPayment != 2 && methodPayment != 3){
			throw new ArithmeticException("Please only enter 1 or 2 or 3.");

		} else if (methodPayment == 1) {
			ATM atm = new ATM();
			atm.inputInformation();
			atm.pay(order);

		} else if (methodPayment == 2) {
			CreditCard creditcard = new CreditCard();
			creditcard.inputInformation();
			creditcard.pay(order);
		}
		
		System.out.println("Thanks you. See you later");
	}

}
