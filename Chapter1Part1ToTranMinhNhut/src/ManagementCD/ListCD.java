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
 * @version 1.0
 * @date 21/8/2016
 *
 */
public class ListCD {

    /*
     * This method add one cd to list CD
     * Input: The 'list' array has CD type and the variale 'index' has int type
     * Output: The 'list array has CD type 
     */
    public CD[] addCDToList(CD[] list, int index) throws ArrayIndexOutOfBoundsException, IOException {

        if (index >= 10) {
            throw new ArrayIndexOutOfBoundsException("The number cd higher default number!");
        } else {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            String idCD = "";
            String nameCD = "";
            String singerCD = "";
            int numOfSongsCD = 0;
            double priceCD = 0;

            try {
                System.out.println("Please enter id of CD: ");
                idCD = input.readLine();

                System.out.println("Please enter name of CD: ");
                nameCD = input.readLine();

                System.out.println("Please enter singer of CD: ");
                singerCD = input.readLine();

                System.out.println("Please enter number of songs's CD: ");
                numOfSongsCD = Integer.parseInt(input.readLine());

                System.out.println("Please enter price of CD: ");
                priceCD = Double.parseDouble(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            list[index] = new CD(idCD, nameCD, singerCD, numOfSongsCD, priceCD);
        }
        return list;
    }

    /*
     * This method print all of information cd in list cd
     * Input: the 'numOfCD' has int type and 'list' array has CD type
     * Output: not
     */
    public void printListCD(CD[] list, int numOfCD) {
        for (int i = 0; i < numOfCD; i++) {
            System.out.println("-----CD " + (i + 1) + "------");
            list[i].printInformationCD();
        }
    }

    /*
     * This method calculate price all of cd in list cd 
     * Input: the 'numberOfCD' has int type and 'list' array CD type
     * Output: the 'price' variable has double type, which contains price value
     */
    public double calPriceOfListCD(CD[] list, int numberOfCD) {
        double price = 0;

        System.out.println("------------------------------");

        for (int i = 0; i < numberOfCD; i++) {
            price += list[i].getPrice();
        }

        return price;
    }
}
