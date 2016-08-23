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
public class ListFist {

	public ListFist(){
	}

	/*
	 * This method add a fish to list
	 * Input: the 'listF' variable has Fish array type and 'index' variable has int type
	 * Output: the 'listF' variable has Fish array type, which contains Fish object
	 */
	public Fish[] addFishttoList(Fish[] listF, int index) throws IOException {

		if (index > 50) {
			throw new ArithmeticException("the number fish higher default number");
		} else {
			Fish f = new Fish();
			f.inputInformation();
			listF[index] = f;
		}

		return listF;
	}

	/*
	 * This method print information of list fish
	 * Input: not
	 * Output: not
	 */
	public void printListFish(Fish[] listF, int numOfFishes) {

		for (int i = 0; i < numOfFishes; i++) {
			System.out.println("------Information-Fish-" + (i + 1) + "---------");
			listF[i].printInformation();
		}
	}
}
