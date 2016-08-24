/**
 * 
 */
package Intrusments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 */
public class InstrumentsMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String name = "";
		String manufacturer = "";

		try {
			System.out.println("Please enter name: ");
			name = input.readLine();

			System.out.println("Please enter manufacturer: ");
			manufacturer = input.readLine();

		} catch(NumberFormatException e) {
			System.out.println("Error: " + e.toString());
		}

		int opt = 0;

		try {
			System.out.println("Please choose: <1 (StringInstrument) / 2 (NonStringInstrument)>:");
			opt = Integer.parseInt(input.readLine());

		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.toString());
		}

		if (opt != 1 && opt != 2) {
			throw new ArithmeticException("Please enter 1 or 2.");
		} else if (opt == 1) {
			int numString = 0;

			try {
				System.out.println("Please enter number string: ");
				numString = Integer.parseInt(input.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Error: " + e.toString());
			}

			StringedIntrusment stringIns = new StringedIntrusment(numString);

			stringIns.setName(name);
			stringIns.setManufacturer(manufacturer);

			System.out.println("Play Instrument: " + stringIns.play());

		} else if (opt == 2) {
			String methodPlay = "";

			try {
				System.out.println("Please enter method play: ");
				methodPlay = input.readLine();

			} catch (NumberFormatException e) {
				System.out.println("Error: " + e.toString());
			}

			NonStringedInstrument nonStringIns = new NonStringedInstrument(methodPlay);
			nonStringIns.setManufacturer(manufacturer);
			nonStringIns.setName(name);

			System.out.println("Play instrument: " + nonStringIns.play());
		}
	}

}
