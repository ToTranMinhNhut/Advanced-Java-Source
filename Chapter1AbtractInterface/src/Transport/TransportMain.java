/**
 * 
 */
package Transport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author minhnhutvaio
 * @version 1.0
 * @date 23/8/2016
 */
public class TransportMain {

	public static int max = 50;

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		Car[] listCar = new Car[max];
		Ship[] listShip = new Ship[max];

		int indexC = 0;
		int indexSh = 0;
		int nextStep = 1;

		while (nextStep == 1) {
			int opt = 0;

			try {
				System.out.println("Please choose: <1 (Car)/ 2 (Ship)>: ");
				opt = Integer.parseInt(input.readLine());
			} catch (Exception e) {
				System.out.println("Error: " + e.toString());
			}

			if (opt != 1 && opt != 2) {
				throw new ArithmeticException("Please only enter 1 or 2.");
			} else if (opt == 1) {

				Car car = new Car();
				car.inputInformation();
				listCar[indexC] = car;

				int numOfCars = indexC + 1;

				for (int i = 0; i < numOfCars; i++ ) {
					System.out.println("----------Car-" + (i + 1) + "--------------");
					System.out.println(listCar[i].printInformation());
					System.out.println("Speed: " +  listCar[i].calSpeed());
					System.out.println("Cosumption fuel: " + listCar[i].calcConsumptionFuel());
				}
			} else if (opt == 2) {

				Ship ship = new Ship();
				ship.inputInformation();
				listShip[indexSh] = ship;

				int numOfShipes = indexSh + 1;

				for (int i = 0; i < numOfShipes; i++ ) {
					System.out.println("----------Car-" + (i + 1) + "--------------");
					System.out.println(listShip[i].printInformation());
					System.out.println("Speed: " +  listShip[i].calSpeed());
					System.out.println("Cosumption fuel: " + listShip[i].calcConsumptionFuel());
				}
			}

			try {
				System.out.println("Do you continue: <1 (Yes) / 0 (No)>");
				nextStep = Integer.parseInt(input.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Error: " + e.toString());
			}

			if (nextStep != 1 && nextStep != 0) {
				throw new ArithmeticException("Please only enter 1 or 0.");
			} else if (nextStep == 1) {

				if (opt == 1) {
					indexC++;
				} else if (opt == 2) {
					indexSh++;
				}
			}
		}
	}

}
