/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author minhnhutvaio
 */
public class ManagementLibraryMain {

    public static final int max = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        TextBook[] listTB = new TextBook[max];
        ReferenceBook[] listRB = new ReferenceBook[max];

        ListBook list = new ListBook();

        int indexTB = 0;
        int indexRB = 0;
        int nextStep = 1;

        while (nextStep == 1) {
            int opt = 0;

            try {
                System.out.println("Please choose: <1 (TextBook) / 2 (ReferenceBook)>:");
                opt = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (opt == 1) {
                listTB = list.addTextBook(listTB, indexTB);

                int numOfTextBook = indexTB + 1;
                list.printListTextBook(listTB, numOfTextBook);

                double totalPriceTB = list.calPriceListTextBook(listTB, numOfTextBook);
                System.out.println("Total price of list textbook: " + totalPriceTB);

            } else if (opt == 2) {
                listRB = list.addReferenceBook(listRB, indexRB);

                int numOfReBook = indexRB + 1;
                list.printListReferenceBook(listRB, numOfReBook);

                double totalPriceRB = list.calPriceListReferenceBook(listRB, numOfReBook);
                System.out.println("Total price of list reference book: " + totalPriceRB);

                double averagePriceRB = list.calAveragePriceListReBook(totalPriceRB, numOfReBook);
                System.out.println("Average price of list reference book: " + averagePriceRB);

            } else {
                throw new ArithmeticException("Please only enter 1 or 2");
            }

            try {
                System.out.println("Do you continue input book: <1 (Yes) / 0 (No)>");
                nextStep = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (nextStep != 1 && nextStep != 0) {
                throw new ArithmeticException("Please only enter 1 or 0");
            } else if (nextStep == 1) {

                if (opt == 1) {
                    indexTB++;
                } else if (opt == 2) {
                    indexRB++;
                }
            }
        }
    }

}
