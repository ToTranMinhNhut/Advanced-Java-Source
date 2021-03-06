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
public class Fish extends Animal implements Swing, Growth, ResidentWater{

	public Fish(){
	}

	@Override
	public String residentWater() {
		return "Live under water.";
	}

	@Override
	public String growth() {
		return "Growth normally.";
	}

	@Override
	public String swing() {
		return "Swing.";
	}
	
	/*
	 * This method input information of fish
	 * Input: not
	 * Output: not
	 */
	@Override
	public void inputInformation() throws IOException {
		super.inputInformation();
	}
}
