/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementComputer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 * @version 1.0
 * @date 22/8/2016
 *
 */
public class ManagementComputerMain {

    public static final int max = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Desktop[] dt = new Desktop[max];
        Laptop[] lt = new Laptop[max];

        ListComputer listDT = new ListComputer();
        ListComputer listLT = new ListComputer();

        int nextStep = 1;
        int indexDT = 0;
        int indexLT = 0;

        while (nextStep == 1) {
            int opt = 0;

            try {
                System.out.println("Please choose: <1 (Desktop)/ 2 (Laptop)>");
                opt = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (opt == 1) {
                dt = listDT.addDesktop(dt, indexDT);

                int numOfDesktop = indexDT + 1;
                listDT.printListDesktop(dt, numOfDesktop);

                double priceListDT = listDT.calPriceDesktop(dt, numOfDesktop);
                System.out.println("Price list desktop: " + priceListDT);
                System.out.println("-----------------------------------");

            } else if (opt == 2) {
                lt = listLT.addLaptop(lt, indexLT);

                int numOfLaptop = indexLT + 1;
                listLT.printListLaptop(lt, numOfLaptop);

                double priceListLT = listLT.calPriceLaptop(lt, numOfLaptop);
                System.out.println("Price list laptop: " + priceListLT);
                System.out.println("-----------------------------------");

            } else {
                throw new ArithmeticException("Please enter 1 or 2");
            }

            try {
                System.out.println("Do you continue to input computer: <1 (Yes) / 0 (No)>");
                nextStep = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (nextStep != 0 && nextStep != 1) {
                throw new ArithmeticException("Please enter 1 or 0.");
            } else if (nextStep == 1) {
                
                if (opt == 1) {
                    indexDT++;
                } else if (opt == 2) {
                    indexLT++;
                }
            }

        }
    }

}
