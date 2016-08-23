/**
 * 
 */
package Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author hv
 * @versionb 1.0
 * @date 23/8/2016
 */
public class ZooMain {

	public static int max = 50;

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		Birth[] listBirth = new Birth[max];
		Tiger[] listTiger = new Tiger[max];
		Fish[] listFish = new Fish[max];
		Boa[] listBoa = new Boa[max];

		ListBirth listA = new ListBirth();

		int indexB = 0;
		int indexT = 0;
		int indexF = 0;
		int indexBoa = 0;

		int nextStep = 1;

		while (nextStep == 1) {
			int opt = 0;

			try {
				System.out.println("Please choose: <1 (Birth / 2 (Tiger) / 3 (First) / 4 (Boa))>: ");
				opt = Integer.parseInt(input.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Error: " + e.toString());
			}
			
			if (opt == 1) {
				listBirth = listA.addBirthtoList(listBirth, indexB);
				
				int numOfBirths = indexB + 1;
				listA.printListBirth(listBirth, numOfBirths);
				indexB++;
			} else if (opt == 2) {
				
			} else if (opt ==3) {
				
			} else {
				throw new ArithmeticException("Please enter 1 or 2 or 3");
			}
		}
	}

}
