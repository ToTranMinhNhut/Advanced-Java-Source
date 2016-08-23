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

		ListBirth listB = new ListBirth();
		ListTiger listT = new ListTiger();
		ListFist listF = new ListFist();
		ListBoa listBo = new ListBoa();

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

				listBirth = listB.addBirthtoList(listBirth, indexB);
				int numOfBirths = indexB + 1;
				listB.printListBirth(listBirth, numOfBirths);

			} else if (opt == 2) {

				listTiger = listT.addTigertoList(listTiger, indexT);
				int numOfTigers = indexT + 1;
				listT.printListTiger(listTiger, numOfTigers);

			} else if (opt ==3) {

				listFish = listF.addFishttoList(listFish, indexF);
				int numOfFishes = indexF + 1;
				listF.printListFish(listFish, numOfFishes);

			} else if (opt == 4){
				
				listBoa = listBo.addBoatoList(listBoa, indexBoa);
				int numOfBoas = indexBoa + 1;
				listBo.printListBoa(listBoa, numOfBoas);
				
			} else {
				throw new ArithmeticException("Please enter 1 or 2 or 3");
			}

			try {
				System.out.println("Do you continue? Please choose <1 (Yes) / 0 (No)>:");
				nextStep = Integer.parseInt(input.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Error: " + e.toString());
			}

			if (nextStep != 0 && nextStep != 1) {
				throw new ArithmeticException("Please only enter 1 or 0");
			} else if (nextStep == 1) {

				if (opt == 1) {
					indexB++;
				} else if (opt == 2) {
					indexT++;
				} else if (opt == 3) {
					indexF++;
				} else if (opt == 4) {
					indexBoa++;
				}
			}
		}
	}

}
