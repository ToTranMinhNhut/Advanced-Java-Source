/**
 * 
 */
package Shape;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 */

public class Cirlce extends Shape{
	
	public double r;
	
	public Cirlce(){
		
	}
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	/*
	 * (non-Javadoc)
	 * This method calculate perimeter of Circle
	 * Input: not
	 * Output: return perimeter value has double type
	 * @see Shape.Shape#perimeter()
	 */
	@Override
	public double perimeter() {
		return 2 * Math.PI *r;
	}
	
	
	/*
	 * (non-Javadoc)
	 * This method calculate area of Circle
	 * Input: not
	 * Output: return area value has double type
	 * @see Shape.Shape#area()
	 */
	@Override
	public double area() {
		return Math.PI * Math.pow(r, 2);
	}
	
}
