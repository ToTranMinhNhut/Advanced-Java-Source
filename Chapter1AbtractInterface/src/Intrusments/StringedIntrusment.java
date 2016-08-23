/**
 * 
 */
package Intrusments;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 */
public class StringedIntrusment extends Instruments{

	private int numString;

	public StringedIntrusment() {
		super();
	}

	public StringedIntrusment(int numString) {
		super();
		this.numString = numString;
	}
	
	public int getNumString() {
		return numString;
	}

	public void setNumString(int numString) {
		this.numString = numString;
	}

	/*
	 * (non-Javadoc)
	 * This method show all of information a string instrument
	 * Input: not
	 * Output: return all of information a string instrument
	 * @see Intrusments.Instruments#play()
	 */
	@Override
	public String play() {
		return "Name: " + name + "| Number of string: " + numString;
	}
	
	
}
