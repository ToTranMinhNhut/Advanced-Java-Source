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
public abstract class Transport extends Move{

	protected String id;
	protected String owner;
	protected String color;
	protected String manufacturer;

	public Transport() {
	}

	public Transport(String id, String owner, String color, String manufacturer) {
		super();
		this.id = id;
		this.owner = owner;
		this.color = color;
		this.manufacturer = manufacturer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/*
	 * This method input information of a transport
	 * Input: not
	 * Output: not
	 */
	@Override
	public void inputInformation() throws IOException {
		super.inputInformation();

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Please enter id: ");
			id = input.readLine();

			System.out.print("Please enter owner: ");
			owner = input.readLine();

			System.out.print("Please enter colorr: ");
			color = input.readLine();

			System.out.print("Please enter manufacturer: ");
			manufacturer = input.readLine();
		} catch ( NumberFormatException e) {
			System.out.println("Error: " + e.toString());
		}
	}

	/*
	 * This method print information of a transport
	 * Input not
	 * Output: return information value of transport has String type
	 */
	public String printInformation(){
		return "ID: " + id + "| Owner: " + owner + "| Color: " + color
				+ "| Manufacturer: " + manufacturer;
	}
}
