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
public class Car extends Transport implements Speed, ConsumptionFuel{

	private String gear;
	private String type;

	public Car(){
	}

	public Car(String gear, String type) {
		super();
		this.gear = gear;
		this.type = type;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * This method input information of a car
	 * Input not
	 * Output not
	 * @see Transport.Transport#inputInformation()
	 */
	@Override
	public void inputInformation() throws IOException {
		super.inputInformation();

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Please enter gear car: ");
			gear = input.readLine();

			System.out.println("Please enter car type: ");
			type = input.readLine();
		} catch (NumberFormatException e) {
			System.out.print("Error: " + e.toString());
		}
	}
	
	/*
	 * (non-Javadoc)
	 * this method print information of car
	 * input not
	 * output: return information value of car has String type
	 * @see Transport.Transport#printInformation()
	 */
	@Override
	public String printInformation() {
		return super.printInformation()
				+ "\n| Gear car: " + gear + "| Type: " + type;
	}

	/*
	 * (non-Javadoc)
	 * This method calculate litres fuel was decreased of car
	 * Input not
	 * Output return value of fuel was decreased has double type
	 * @see Transport.Fuel#calFuel()
	 */
	@Override
	public double calcConsumptionFuel() {
		return distance / litresFuel;
	}

	/*
	 * (non-Javadoc)
	 * This method calculate speed of car
	 * Input not
	 * Output return speed value has double type
	 * @see Transport.Fuel#calFuel()
	 */
	@Override
	public double calSpeed() {
		return distance / time;
	}
}
