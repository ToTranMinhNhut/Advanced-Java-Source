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
public abstract class Move {

	protected double distance;
	protected double time;
	protected double litresFuel;

	public Move(){
	}

	public Move(double distance, double time, double litresFuel) {
		super();
		this.distance = distance;
		this.time = time;
		this.litresFuel = litresFuel;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getLitresFuel() {
		return litresFuel;
	}

	public void setLitresFuel(double litresFuel) {
		this.litresFuel = litresFuel;
	}

	/*
	 * This method input information move
	 * Input: not
	 * Output: not
	 */
	public void inputInformation() throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Please enter distance: ");
			distance = Double.parseDouble(input.readLine());

			System.out.println("Please enter time: ");
			time = Double.parseDouble(input.readLine());

			System.out.println("Please enter litres fuel: ");
			litresFuel = Double.parseDouble(input.readLine());
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.toString());
		}
	}
}
