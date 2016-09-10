package FacadeBooking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author minhnhutvaio
 * @version 1.0
 * @created 05-Sep-2016 8:14:59 PM
 */
public class Main {
	public static void main(String[] args) {
		try {
			
			BookingFacade bookingFacade = new BookingFacade();
			switch (menu()) {
			case 1:
				bookingFacade.searchFightBooker();
				break;
			case 2:
				bookingFacade.searchTrainBooker();
				break;
			case 3:
				bookingFacade.searchHotelBooker();
				break;
			default:
				break;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//to print menu and return a chosen int type.
	private static int menu() throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int temp = 0;
		while (temp < 1 || temp > 3) {
			System.out.println("-----Menu-----");
			System.out.println("1. Fight Booker");
			System.out.println("2. Train Booker");
			System.out.println("3. Hotel Booker");
			System.out.println("Enter a chosen 1->3: ");
			temp = Integer.parseInt(input.readLine());
		}
		return temp;
	}
}
