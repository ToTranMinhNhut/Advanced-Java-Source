/**
 * 
 */
package Shape;

/**
 * @author hv
 * @version 1.0
 * @date 23/6/2016
 */
public class Rectangle extends Shape{
	
	public double height;
	public double weight;
	
	public Rectangle() {
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/* (non-Javadoc)
	 * This method calculate perimeter of rectangle
	 * Input: not
	 * Output: return perimeter value has double type
	 * @see Shape.Shape#perimeter()
	 */
	@Override
	public double perimeter() {
		return ( height + weight ) * 2;
	}

	
	/* (non-Javadoc)
	 * This method calculate area of rectangle
	 * Input: not
	 * Output: return area value has double type
	 * @see Shape.Shape#area()
	 */
	@Override
	public double area() {
		return height * weight;
	}
		
	
	
	
}
