/**
 * 
 */
package Intrusments;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 */
public class NonStringedInstrument extends Instruments{
	
	private String methodPlay;

	public NonStringedInstrument() {
		super();
	}

	public NonStringedInstrument(String methodPlay) {
		super();
		this.methodPlay = methodPlay;
	}

	public String getMethodPlay() {
		return methodPlay;
	}

	public void setMethodPlay(String methodPlay) {
		this.methodPlay = methodPlay;
	}
	
	/*
	 * (non-Javadoc)
	 * This method show all of information a non-string instrument
	 * Input: not
	 * Output: return all of information a non-string instrument
	 * @see Intrusments.Instruments#play()
	 */
	@Override
	public String play() {
		return "Name: " + name + "| Method play: " + methodPlay;
	}
	
	
}
