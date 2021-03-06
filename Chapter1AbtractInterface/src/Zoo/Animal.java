/**
 * 
 */
package Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 */
public abstract class Animal {

	protected String name;
	protected String food;

	public Animal() {
		super();
	}

	public Animal(String name, String food) {
		super();
		this.name = name;
		this.food = food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	/*
	 * This method input information of animal
	 * Input: not
	 * Output: not
	 */
	public void inputInformation() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Please enter name: ");
			name = input.readLine();

			System.out.println("Please enter food: ");
			food = input.readLine();
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.toString());
		}
	}
	
	/* 
	 * This method print information of a animal
	 * Input: not
	 * Output: not
	 */
	public void printInformation() {
		System.out.println("Name: " + name);
		System.out.println("Food: " + food);
	}
}
