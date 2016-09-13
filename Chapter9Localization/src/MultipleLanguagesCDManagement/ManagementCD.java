/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleLanguagesCDManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

/**
 *
 * @author minhnhutvaio
 * @version 1.0
 * @since 7/9/2016
 */
public class ManagementCD {

    public static final int maxNumOfCD = 10;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        /*
         * Firstly, To enter information of a cd,
         * the program will sort cd list with name's cd,
         * Then, print information of the cd list and total price of cd list.
         * Then, To choose continue to add a new cd or not.
         */
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ListCD listCd = new ListCD();
        
        int opt = 1;
        while (opt == 1) {
            CD cd = new CD();
            cd.inputInformation();
         
            listCd.addCDToList(cd);
            Collections.sort(listCd.getListCD());
            listCd.printListCD();
            
            double totalPrice = listCd.calPriceOfListCD();
            System.out.println("Total Price of cd list: " + totalPrice);
            
            System.out.println("--------------------------");
            
            System.out.println("Do you add a new CD. <1 (Yes)/ 0 (No)>");
            opt = Integer.parseInt(input.readLine());
            
            if (opt != 1 && opt != 0) {
                throw new ArithmeticException("Please only enter 1 or 0.");
            }
        }

        System.out.println("Program finish! See you later");
    }

}
