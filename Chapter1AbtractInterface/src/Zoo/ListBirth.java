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
public class ListBirth {

	public ListBirth() {

	}

	/*
	 * This method add a birth to list
	 * Input: the 'listB' variable has Birth array type and 'index' variable has int type
	 * Output: the 'listB' variable has Birth array type, which contains Birth object
	 */
	public Birth[] addBirthtoList(Birth[] listB, int index) throws IOException {

		if (index > 50) {
			throw new ArithmeticException("the number birth higher default number");
		} else {
			Birth b = new Birth();
			b.inputInformation();
			listB[index] = b;
		}

		return listB;
	}

	/*
	 * This method print information of list birth
	 * Input: not
	 * Output: not
	 */
	public void printListBirth(Birth[] listB, int numOfBirds) {

		for (int i = 0; i < numOfBirds; i++) {
			System.out.println("------Information-Bird-" + (i + 1) + "---------");
			listB[i].printInformation();
		}
	}
}
