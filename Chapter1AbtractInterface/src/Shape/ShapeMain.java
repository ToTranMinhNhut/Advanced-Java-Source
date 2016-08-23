/**
 * 
 */
package Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 */
public class ShapeMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int opt = 0;

		try {
			System.out.println("Please choose: <1 (Circle) / 2 (Rectangle) / 3 (Square)>: ");
			opt = Integer.parseInt(input.readLine());

		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.toString());
		}

		if (opt != 1 && opt != 2 && opt != 3) {
			throw new ArithmeticException("Please only enter 1 or 2 or 3");
		} else {

			if (opt == 1) {
				double r = 0;

				try {
					System.out.println("Please enter radius: ");
					r = Double.parseDouble(input.readLine());
				} catch (NumberFormatException e) {
					System.out.println("Error: " + e.toString());
				}

				Cirlce c = new Cirlce();
				c.setR(r);

				double perCircle = c.perimeter();
				System.out.println("Circle perimeter: " + perCircle);

				double areaCircle = c.area();
				System.out.println("Circle area: " + areaCircle);

			} else if (opt == 2) {
				double height = 0;
				double weight = 0;

				try {
					System.out.println("Please enter height side: ");
					height = Double.parseDouble(input.readLine());

					System.out.println("Please enter weight side: ");
					weight = Double.parseDouble(input.readLine());
				} catch (NumberFormatException e) {
					System.out.println("Error: " + e.toString());
				}

				Rectangle rec = new Rectangle();
				rec.setHeight(height);
				rec.setWeight(weight);

				double perRectangle = rec.perimeter();
				System.out.println("Rectangle perimeter: " + perRectangle);

				double areaRectangle = rec.area();
				System.out.println("Rectangle area: " + areaRectangle);

			} else if (opt == 3) {
				double side = 0;

				try {
					System.out.println("Please enter side: ");
					side = Double.parseDouble(input.readLine());
				} catch (NumberFormatException e) {
					System.out.println("Error: " + e.toString());
				}

				Square sq = new Square();
				sq.setSide(side);

				double perSquare = sq.perimeter();
				System.out.println("Square perimeter: " + perSquare);

				double areaSquare = sq.area();
				System.out.println("Square area: " + areaSquare);
			} 

		}
	}

}
