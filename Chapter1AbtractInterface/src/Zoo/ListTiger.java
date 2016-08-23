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
public class ListTiger {

	public ListTiger() {
	}

	/*
	 * This method add a tiger to list
	 * Input: the 'listT' variable has Tiger array type and 'index' variable has int type
	 * Output: the 'listT' variable has Tiger array type, which contains Tiger object
	 */
	public Tiger[] addTigertoList(Tiger[] listT, int index) throws IOException {

		if (index > 50) {
			throw new ArithmeticException("the number tiger higher default number");
		} else {
			Tiger t = new Tiger();
			t.inputInformation();
			listT[index] = t;
		}

		return listT;
	}

	/*
	 * This method print information of list tiger
	 * Input: not
	 * Output: not
	 */
	public void printListTiger(Tiger[] listT, int numOfTigers) {

		for (int i = 0; i < numOfTigers; i++) {
			System.out.println("------Information-Tiger-" + (i + 1) + "---------");
			listT[i].printInformation();
		}
	}
}
