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
public class Tiger extends Animal implements Run, Growth, ResidentCave {

	public Tiger(){
	}

	@Override
	public String residentCave() {
		return "live in cave.";
	}

	@Override
	public String growth() {
		return "Growth normally.";
	}

	@Override
	public String run() {
		return "Run.";
	}
	
	/*
	 * This method input information of tiger
	 * Input: not
	 * Output: not
	 */
	@Override
	public void inputInformation() throws IOException {
		super.inputInformation();
	}
}
