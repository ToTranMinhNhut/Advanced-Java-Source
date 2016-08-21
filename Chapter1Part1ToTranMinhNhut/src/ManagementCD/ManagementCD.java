/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementCD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author minhnhutvaio
 */
public class ManagementCD {

    public static final int maxNumOfCD = 10;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        ListCD list = new ListCD();
        int index = 0;
        CD[] cd = new CD[maxNumOfCD];
        int opt = 1;

        while (opt == 1) {

            cd = list.addCDToList(cd, index);

            int numOfCD = index + 1;

            list.printListCD(cd, numOfCD);

            double priceAllOfCD = list.calPriceOfListCD(cd, numOfCD);
            System.out.println("Price all of cd in list CD: " + priceAllOfCD);

            try {
                System.out.println("Do you add a new CD to list? Enter <1(Yes) / 0(No)>: ");
                opt = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }
            
            if (opt != 0 && opt != 1) {
                throw new ArithmeticException("Please enter only 1 or 0!");
            } else if (opt == 1) {
                index++;
            }
        }

        System.out.println("Program finish! See you later");
    }

}
