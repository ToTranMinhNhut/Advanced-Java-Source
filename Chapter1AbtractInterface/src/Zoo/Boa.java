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
public class Boa extends Animal implements Run, Molt, ResidentCave{

	public Boa(){
	}

	@Override
	public String residentCave() {
		return "live in cave.";
	}

	@Override
	public String molt() {
		return "Molting.";
	}

	@Override
	public String run() {
		return "Run.";
	}
	
	/*
	 * This method input information of boa
	 * Input: not
	 * Output: not
	 */
	@Override
	public void inputInformation() throws IOException {
		super.inputInformation();
	}
}
