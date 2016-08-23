/**
 * 
 */
package Shape;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 */
public class Square extends Shape{
	
	public double side ;
	
	
	public Square() {
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	/* (non-Javadoc)
	 * This method calculate perimeter of square
	 * Input: not
	 * Output: return perimeter value has double type
	 * @see Shape.Shape#perimeter()
	 */
	@Override
	public double perimeter() {
		return side * 4;
	}

	/* (non-Javadoc)
	 * This method calculate area of square
	 * Input: not
	 * Output: return area value has double type
	 * @see Shape.Shape#area()
	 */
	@Override
	public double area() {
		return side * side;
	}
	
	
}
