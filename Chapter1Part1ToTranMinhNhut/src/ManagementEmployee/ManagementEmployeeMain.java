/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementEmployee;

import ManagementComputer.Desktop;
import ManagementComputer.Laptop;
import ManagementComputer.ListComputer;
import static ManagementComputer.ManagementComputerMain.max;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author minhnhutvaio
 */
public class ManagementEmployeeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        TradeEmployee[] listTE = new TradeEmployee[max];
        ProductionEmployee[] listPE= new ProductionEmployee[max];
        
        ListEmployee list= new ListEmployee();

        int nextStep = 1;
        int indexTE = 0;
        int indexPE = 0;

        while (nextStep == 1) {
            int opt = 0;

            try {
                System.out.println("Please choose: <1 (Trade Employee)/ 2 (Production Employee)>");
                opt = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (opt == 1) {
                listTE = list.addTradeEmployee(listTE, indexTE);
                
                int numOfTradeE = indexTE + 1;
                list.printListTradeE(listTE, numOfTradeE);
                System.out.println("-----------------------------------");

            } else if (opt == 2) {
                listPE = list.addProductionEmployee(listPE, indexPE);
                
                int numOfProE = indexPE + 1;
                list.printListProductionE(listPE, numOfProE);
                System.out.println("-----------------------------------");

            } else {
                throw new ArithmeticException("Please enter 1 or 2");
            }

            try {
                System.out.println("Do you continue to calculate: <1 (Yes) / 0 (No)>");
                nextStep = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (nextStep != 0 && nextStep != 1) {
                throw new ArithmeticException("Please enter 1 or 0.");
            } else if (nextStep == 1) {

                if (opt == 1) {
                    indexTE++;
                } else if (opt == 2) {
                    indexPE++;
                }
            }

        }
    }
}


