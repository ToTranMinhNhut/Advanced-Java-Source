/**
 * 
 */
package Zoo;

import java.io.IOException;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 */
public class Birth extends Animal implements Fly, ResidentNest, Growth {
	
	public Birth(){
	}
	

	@Override
	public String growth() {
		return "Growth normally.";
	}

	@Override
	public String residentNest() {
		return "Live in nest.";
	}

	@Override
	public String fly() {
		return "fly";
	}

	
	/*
	 * This method input information of birth
	 * Input: not
	 * Output: not
	 */
	@Override
	public void inputInformation() throws IOException {
		super.inputInformation();
	}

	/* 
	 * This method print information of a animal
	 * Input: not
	 * Output: not
	 */
	@Override
	public void printInformation() {
		super.printInformation();
		
		System.out.println("Method move: " +fly());
		System.out.println("Growth: " + growth());
		System.out.println("Resident: " + residentNest());
		System.out.println("-------------------------------");
	}
	
	
	
	
	
}
