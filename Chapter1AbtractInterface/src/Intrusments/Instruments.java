/**
 * 
 */
package Intrusments;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 */
public abstract class Instruments {

	protected String name;
	protected String manufacturer;

	public Instruments() {
		super();
	}

	public Instruments(String name, String manufacturer) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}	
	
	// This method show information a instrument
	public abstract String play();
}
