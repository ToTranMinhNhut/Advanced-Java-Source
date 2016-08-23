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
public class Ship extends Transport implements Speed, ConsumptionFuel {

	private double weight;
	private double capacity;
	private float streamUpSpeed;
	private float streamDownSpeed;
	private float consumptionFuelStart;
	private String typeFuel;

	public Ship(){

	}

	public Ship(double weight, double capacity, float streamUpSpeed, float streamDownSpeed, float consumptionFuelStart,
			String typeFuel) {
		super();
		this.weight = weight;
		this.capacity = capacity;
		this.streamUpSpeed = streamUpSpeed;
		this.streamDownSpeed = streamDownSpeed;
		this.consumptionFuelStart = consumptionFuelStart;
		this.typeFuel = typeFuel;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public float getStreamUpSpeed() {
		return streamUpSpeed;
	}

	public void setStreamUpSpeed(float streamUpSpeed) {
		this.streamUpSpeed = streamUpSpeed;
	}

	public float getStreamDownSpeed() {
		return streamDownSpeed;
	}

	public void setStreamDownSpeed(float streamDownSpeed) {
		this.streamDownSpeed = streamDownSpeed;
	}

	public float getconsumptionFuelStart() {
		return consumptionFuelStart;
	}

	public void setconsumptionFuelStart(float consumptionFuelStart) {
		this.consumptionFuelStart = consumptionFuelStart;
	}

	public String getTypeFuel() {
		return typeFuel;
	}

	public void setTypeFuel(String typeFuel) {
		this.typeFuel = typeFuel;
	}

	/*
	 * (non-Javadoc)
	 * This method input information of a ship
	 * Input not
	 * Output not
	 * @see Transport.Transport#inputInformation()
	 */
	@Override
	public void inputInformation() throws IOException {
		super.inputInformation();

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("Please enter weight: ");
			weight = Double.parseDouble(input.readLine());

			System.out.println("Please enter capacity: ");
			capacity = Double.parseDouble(input.readLine());

			System.out.println("Please enter stream down speed: ");
			streamDownSpeed = Float.parseFloat(input.readLine());

			System.out.println("Please enter stream up speed: ");
			streamUpSpeed = Float.parseFloat(input.readLine());
			
			System.out.println("Please enter comsumption Fuel Start: ");
			consumptionFuelStart = Float.parseFloat(input.readLine());
			
			System.out.println("Please enter capacity: ");
			typeFuel = input.readLine();
			
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.toString());
		}
	}

	/*
	 * (non-Javadoc)
	 * this method print information of ship
	 * input not
	 * output: return information value of ship has String type
	 * @see Transport.Transport#printInformation()
	 */
	@Override
	public String printInformation() {
		return super.printInformation() + "\n| Weight: " + weight + "| Capacity: " + capacity
				+ "Stream down speed: " + streamDownSpeed + "| Stream up speed: " + streamUpSpeed
				+ "| consumption fuel start: " + consumptionFuelStart + "| Type fuel: " + typeFuel;
	}

	/*
	 * (non-Javadoc)
	 * This method calculate litres consumption fuel
	 * Input not
	 * Output return value of consumption fuel has double type
	 * @see Transport.Fuel#calFuel()
	 */
	@Override
	public double calcConsumptionFuel() {
		return distance / (litresFuel - consumptionFuelStart);
	}

	/*
	 * (non-Javadoc)
	 * This method calculate speed of ship
	 * Input not
	 * Output return speed value has double type
	 * @see Transport.Fuel#calFuel()
	 */
	@Override
	public double calSpeed() {
		return distance / time + streamUpSpeed - streamDownSpeed;
	}


}
