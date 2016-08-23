/**
 * 
 */
package Zoo;

import java.io.IOException;

/**
 * @author minhnhutvaio
 * @version 1.0
 * @date 23/8/2016
 */
public class ListBoa {

	public ListBoa() {
	}
	
	/*
	 * This method add a birth to boa
	 * Input: the 'listBoa' variable has Boa array type and 'index' variable has int type
	 * Output: the 'listBoa' variable has Boa array type, which contains Boa object
	 */
	public Boa[] addBoatoList(Boa[] listBoa, int index) throws IOException {

		if (index > 50) {
			throw new ArithmeticException("the number boa higher default number");
		} else {
			Boa bo = new Boa();
			bo.inputInformation();
			listBoa[index] = bo;
		}

		return listBoa;
	}

	/*
	 * This method print information of list boa
	 * Input: not
	 * Output: not
	 */
	public void printListBoa(Boa[] listBoa, int numOfBoas) {

		for (int i = 0; i < numOfBoas; i++) {
			System.out.println("------Information-Boa-" + (i + 1) + "---------");
			listBoa[i].printInformation();
		}
	}
}
